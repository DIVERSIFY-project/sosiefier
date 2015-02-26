package fr.inria.diversify.testamplification.harman;

import fr.inria.diversify.buildSystem.AbstractBuilder;
import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.util.DiversifyPrettyPrinter;
import fr.inria.diversify.util.JavaOutputProcessorWithFilter;
import fr.inria.diversify.util.Log;
import org.apache.commons.io.FileUtils;
import spoon.compiler.Environment;
import spoon.processing.AbstractProcessor;
import spoon.processing.ProcessingManager;
import spoon.reflect.code.CtLiteral;
import spoon.reflect.declaration.CtAnnotation;
import spoon.reflect.declaration.CtClass;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.factory.Factory;
import spoon.reflect.visitor.Query;
import spoon.reflect.visitor.filter.TypeFilter;
import spoon.support.QueueProcessingManager;

import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Created by Simon on 19/02/15.
 */
public class Algo {
    protected Result result;
    int cloneCount = 0;
    protected int searchRadius = 10;
    int interactionLevel = 1;
    protected AbstractBuilder builder;
    protected File jacocoDir;
    protected  List<CtClass> applicationClasses;
    protected Map<String, List<Double>> originalTestCoverages;
    protected Map<String, List<Double>> neighboursCoverage;

    protected InputProgram inputProgram;
    protected String tmpDir;
    private Map<CtMethod, List<CtLiteral>> inputVectors;

    public Algo(String tmpDir, InputProgram inputProgram, AbstractBuilder builder, List<CtClass> applicationClasses, Result result) {
        this.result = result;
        this.tmpDir = tmpDir;
        this.inputProgram = inputProgram;
        this.builder = builder;
        this.jacocoDir = new File(tmpDir+"/target/site/junco");
        this.applicationClasses = applicationClasses;
    }

    public void setInteractionLevel(int interactionLevel) {
        this.interactionLevel = interactionLevel;
    }

    public void setSearchRadius(int searchRadius) {
        this.searchRadius = searchRadius;
    }

    protected void initFitnessValue() throws IOException, InterruptedException {
        originalTestCoverages = new HashMap<>();
        initFitnessValue(originalTestCoverages);
    }
    protected void initFitnessValue(Map<String, List<Double>> coverages) throws IOException, InterruptedException {

        builder.runBuilder();
        if(jacocoDir.exists()) {
            for (File file : jacocoDir.listFiles()) {
                if (file.getName().endsWith(".exec")) {
                    String testName = file.getName().substring(0, file.getName().length() - 5);
                    String dir = tmpDir + "/target/classes/";
                    CoverageInfo coverageInfo = new CoverageInfo(dir, file);
                    coverageInfo.create();

                    coverages.put(testName, coverageInfo.branchCoverageInfo(applicationClasses));
                }
            }
        }
    }

    public void testDataRegeneration(Set<CtMethod> testSuite, CtClass testClass) {
        Random r = new Random();
        int i = 0;
        setBuilderGoal(testClass);
        for (CtMethod test : testSuite) {
            i++;
            if(!getNumber(test).isEmpty()) {
                double fitnessCurrentSol = 0;
                CtMethod currentSol = test;
                int count = 0;
                while (count < searchRadius) {
                    Log.info("original method {} ({}/{}), current searchRadius: {}",test.getSimpleName(), i, testSuite.size(), count);
                    CtMethod nextSol = null;
                    try {
                        List<CtMethod> neighbours = generateNeighbours(currentSol, testClass);
                        while (!neighbours.isEmpty()) {
                            CtMethod n = neighbours.remove(r.nextInt(neighbours.size()));
                            if (fitness(test, n) > fitnessCurrentSol) {
                                nextSol = n;
                                break;
                            }
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        Log.info("error during neighbours evaluation");
                    }
                    if (nextSol == null) {
                        break;
                    } else {
                        fitnessCurrentSol = fitness(test, nextSol);
                        currentSol = nextSol;
                        count++;
                    }
                }
                if (currentSol != test) {
                    Log.info("new method add: {}",currentSol.getSimpleName());
                    Log.info("original: {}, new {}", getNumber(test), getNumber(currentSol));

                    result.addNewTest(testClass, test, currentSol, count, cloneCount);
                    cloneCount = 0;
                }
            }
        }
    }

    protected void setBuilderGoal(CtClass testClass) {
        builder.setGoals(new String[]{"-Dtest="+testClass.getSimpleName(),"test"});
    }

    protected double fitness(CtMethod original, CtMethod currentSol) {
        List<CtLiteral> currentSolVector = inputVectors.get(currentSol);
        List<CtLiteral> originalVector = getNumber(original);

        double vectorDistance = euclidienDistance(currentSolVector, originalVector);
        double coverageDistance = coverageDistance(currentSol);

        if(coverageDistance == 0  && vectorDistance > 0) {
            return vectorDistance;
        }
        if(coverageDistance(currentSol) > 0  && vectorDistance > 0) {
            return -coverageDistance;
        }
        return 0;
    }

    protected double euclidienDistance(List<CtLiteral> currentSolVector, List<CtLiteral> originalVector) {
        double vectorDistance = 0;
        for(int i = 0; i < originalVector.size(); i++ ) {
            double tmp = ((Number) currentSolVector.get(i).getValue()).doubleValue() - ((Number) originalVector.get(i).getValue()).doubleValue();
            vectorDistance += tmp * tmp;
        }
        return  Math.sqrt(vectorDistance);
    }

    protected double coverageDistance(CtMethod method) {
        CtClass cl = method.getParent(CtClass.class);
        String originalTestName = cl.getQualifiedName() + "." +method.getSimpleName().split("____")[0];

        List<Double> originalTestCoverage = originalTestCoverages.get(originalTestName);
        List<Double> neighbourCoverage = neighboursCoverage.get(cl.getQualifiedName() + "." +method.getSimpleName());


        if(originalTestCoverage == null
            || neighbourCoverage == null
            || originalTestCoverage.size() != neighbourCoverage.size()) {
            return 100;
        } else {

            double distance = 0;
            for (int i = 0; i < originalTestCoverage.size(); i++) {
                double tmp = originalTestCoverage.get(i) - neighbourCoverage.get(i);
                distance += tmp * tmp;
            }

            return Math.sqrt(distance);
        }
    }

    protected List<CtMethod> generateNeighbours(CtMethod test, CtClass testClass) throws InterruptedException, IOException {
        List<CtMethod> neighbours = new ArrayList<>();


        Collection<List<CtLiteral>> combi = new ArrayList<>();
        List<CtLiteral> number = getNumber(test);


        combi.addAll(combi(number, interactionLevel, (Object n) -> literalPlusOne(n)));
        combi.addAll(combi(number, interactionLevel, (Object n) -> literalMinusOne(n)));
        combi.addAll(combi(number, interactionLevel, (Object n) -> literalMultiTwo(n)));
        combi.addAll(combi(number, interactionLevel, (Object n) -> literalDivTwo(n)));

        combi = filterCombi(combi);

        inputVectors = new HashMap<>();
        for(List<CtLiteral> c : combi) {
            neighbours.add(generateNeighbour(test, c));
        }
        generateNewSource(testClass, neighbours);

        computeNeighboursFitness(neighbours, builder.getFailedTests());

        restoreTestclass(testClass, neighbours);
        FileUtils.forceDelete(jacocoDir);

        return neighbours;
    }

    protected void restoreTestclass(CtClass testClass, List<CtMethod> neighbours) {
        for(CtMethod neighbour : neighbours) {
            testClass.removeMethod(neighbour);
        }

    }

    protected void computeNeighboursFitness(List<CtMethod> neighbours, List<String> failedTests) throws IOException, InterruptedException {
        neighboursCoverage = new HashMap<>();
        initFitnessValue(neighboursCoverage);

    }


    protected void generateNewSource(CtClass testClass, List<CtMethod> testMethods) {
        for(CtMethod method : testMethods) {
            testClass.addMethod(method);
        }
        writeJavaClass();
    }

    protected void writeJavaClass() {
        File fileFrom = new File(inputProgram.getAbsoluteTestSourceCodeDir());
        File out = new File(tmpDir + "/" + inputProgram.getRelativeTestSourceCodeDir());
        Environment env = inputProgram.getFactory().getEnvironment();
        AbstractProcessor processor = new JavaOutputProcessorWithFilter(out, new DiversifyPrettyPrinter(env), allClassesName(fileFrom));
        applyProcessor(inputProgram.getFactory(), processor);
    }

    protected void applyProcessor(Factory factory, AbstractProcessor processor) {
        ProcessingManager pm = new QueueProcessingManager(factory);
        pm.addProcessor(processor);
        pm.process();
    }

    protected List<String> allClassesName(File dir) {
        List<String> list = new ArrayList<>();

        for(File file : dir.listFiles())
            if(file.isDirectory())
                list.addAll(allClassesName(file));
            else {
                String name = file.getName();
                if(name.endsWith(".java")) {
                    String[] tmp = name.substring(0, name.length() - 5).split("/");
                    list.add(tmp[tmp.length - 1]);
                }
            }
        return list;
    }

    protected CtMethod generateNeighbour(CtMethod test, List<CtLiteral> numbers) {
        CtMethod cloned_method = cloneMethod(test);
        List<CtLiteral> cloneNumbers = getNumber(cloned_method);

        for (int index = 0; index < numbers.size(); index++) {
            cloneNumbers.get(index).replace(numbers.get(index));
        }

        inputVectors.put(cloned_method, numbers);
        return cloned_method;
    }

    protected CtMethod cloneMethod(CtMethod method) {
        CtMethod cloned_method = inputProgram.getFactory().Core().clone(method);
        cloned_method.setParent(method.getParent());

        //rename the clone
        String originalTestName =  method.getSimpleName().split("____")[0];
        cloned_method.setSimpleName(originalTestName + "____"+cloneCount);
        cloneCount++;

        CtAnnotation toRemove = cloned_method.getAnnotations().stream()
                                             .filter(annotation -> annotation.toString().contains("Override"))
                                             .findFirst().orElse(null);

        if(toRemove != null) {
            cloned_method.removeAnnotation(toRemove);
        }
        return cloned_method;
    }

    protected List<CtLiteral> getNumber(CtMethod method) {
        return Query.getElements(method, new TypeFilter<CtLiteral>(CtLiteral.class)).stream()
                .filter(literal -> literal.getValue() instanceof Number )
                .collect(Collectors.toList());
    }

    private  Set<List<CtLiteral>> combiList;
    protected Set<List<CtLiteral>> combi(List<CtLiteral> elem, int interactionLevel, Function<Object, Number> f) {
        combiList = new HashSet<>();
        combi(elem, new HashSet<>(), interactionLevel, f);
        return combiList;
    }

    protected void combi(List<CtLiteral> elem, Set<Integer> alreadyModif, int interactionLevel, Function<Object, Number> f) {
        if(interactionLevel != 0) {
            for (int index = 0; index < elem.size(); index++) {
                if (!alreadyModif.contains(index)) {
                    HashSet copyAlreadyModif = new HashSet(alreadyModif);
                    copyAlreadyModif.add(index);
                    List<CtLiteral> cloneElem = cloneLiteralList(elem);
                    if(interactionLevel == 1) {
                        combiList.add(cloneElem);
                    }
                    modif(cloneElem, index, f);

                    combi(cloneElem, copyAlreadyModif, interactionLevel - 1, f);
                }
            }
        }

    }

    private void modif(List<CtLiteral> cloneElem, int index, Function<Object, Number> f) {
        CtLiteral literal = cloneElem.get(index);
        Object value = literal.getValue();
        Number newValue = f.apply(value);

        if(value instanceof Integer) {
            literal.setValue(newValue.intValue());
        } else if(value instanceof Long) {
            literal.setValue(newValue.longValue());
        } else if(value instanceof Double) {
            literal.setValue(newValue.doubleValue());
        } else if(value instanceof Short) {
            literal.setValue(newValue.shortValue());
        } else if(value instanceof Float) {
            literal.setValue(newValue.floatValue());
        } else if(value instanceof Byte) {
            literal.setValue(newValue.byteValue());
        }
    }

    protected Number literalPlusOne(Object literal) {
        Double value = ((Number) literal).doubleValue();
        return value + 1;
    }
    protected Number literalMinusOne(Object literal) {
        Double value = ((Number) literal).doubleValue();
        return value - 1;
    }
    protected Number literalMultiTwo(Object literal) {
        Double value = ((Number) literal).doubleValue();
        return value * 2;
    }
    protected Number literalDivTwo(Object literal) {
        Double value = ((Number) literal).doubleValue();
        return value / 2;
    }

    protected List<CtLiteral> cloneLiteralList(List<CtLiteral> list) {
        List<CtLiteral> clone = new ArrayList<>(list.size());

        for(CtLiteral literal : list) {
            clone.add(inputProgram.getFactory().Core().clone(literal));
        }
        return clone;
    }


    protected Set<List<CtLiteral>> filterCombi(Collection<List<CtLiteral>> combi) {
        Map<List<CtLiteral>, List<Number>> map = new HashMap<>();

        for( List<CtLiteral> lit: combi) {
            List<Number> numbers = lit.stream()
                                      .map(l -> (Number) l.getValue())
                                      .collect(Collectors.toList());
            if(!map.values().contains(numbers)) {
                map.put(lit,numbers);
            }
        }
       return map.keySet();

    }

}
