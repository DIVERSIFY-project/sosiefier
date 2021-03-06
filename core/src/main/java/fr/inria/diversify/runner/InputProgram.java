package fr.inria.diversify.runner;

import fr.inria.diversify.codeFragment.CodeFragment;
import fr.inria.diversify.codeFragment.CodeFragmentList;
import fr.inria.diversify.codeFragmentProcessor.*;
import fr.inria.diversify.coverage.ICoverageReport;
import fr.inria.diversify.runner.accessors.Accessor;
import fr.inria.diversify.runner.accessors.SourceAccesor;
import fr.inria.diversify.runner.accessors.TypeAccesor;
import fr.inria.diversify.util.Log;
import fr.inria.diversify.util.StringSimilarity;
import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtMethod;
import javassist.NotFoundException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import spoon.processing.AbstractProcessor;
import spoon.processing.ProcessingManager;
import spoon.reflect.code.CtLocalVariable;
import spoon.reflect.code.CtReturn;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtPackage;
import spoon.reflect.declaration.CtType;
import spoon.reflect.factory.Factory;
//import spoon.reflect.visitor.QueryVisitor;
import spoon.reflect.visitor.filter.TypeFilter;
import spoon.support.QueueProcessingManager;

import java.util.*;
import java.util.stream.Collectors;
//import java.util.stream.Collectors;

/**
 * The InputProgram class encapsulates all the known information of the program being sosiefiecated
 * <p/>
 * Created by marcel on 6/06/14.
 */
public class InputProgram {

    /**
     * The preferred generator version indicates the preferred version of the generator to modify this
     * program
     */
    private String preferredGeneratorVersion = InputConfiguration.LATEST_GENERATOR_VERSION;

    /**
     * Code fragment processor to identify interesting fragments for the input program
     */
    private AbstractCodeFragmentProcessor<?> codeFragmentProcessor;

    /**
     * Default tolerance value for the code fragment searching algorithm
     */
    private double searchToleranceThreshold = 0.9999999;

    /**
     * List of all the code fragments extracted by Spoon of the input program
     */
    protected CodeFragmentList codeFragments;

    /**
     * Coverage report for the input program
     */
    private ICoverageReport coverageReport;

    /**
     * Path to the root directory of the input program
     */
    private String programDir;

    /**
     * Path to the source code of the input program
     */
    private String sourceCodeDir;

    private String externalSourceCodeDir = "";

    /**
     * Path to the test source code of the input program
     */
    private String testSourceCodeDir;

    /**
     * java version of this program
     */
    private int javaVersion;

    /**
     * Path to the built classes
     */
    private String classesDir;


    /**
     * Path to the test built classes
     */
    private String testClassesDir = "target/test-classes";

    /**
     * Path to the coverage information
     */
    private String coverageDir;

    /**
     * Path to previous transformations made in this input program
     */
    private String previousTransformationsPath;

    /**
     * Number of transformations that we are going to attempt in every run of the diversificator
     */
    private int transformationPerRun;

    /**
     * Minimum number of transformations that we are going to attempt in every run of the diversificator
     */
    private int minTransformationsPerRun;

    /**
     * Root spoon element for an input program, mostly upper level packages
     */
    private Set<CtElement> roots;

    /**
     * List Spoon return statements that can be found in this program
     */
    protected List<CtReturn> returns;


    protected Map<Class, List<? extends CtElement>> typeToObject = new HashMap<Class, List<? extends CtElement>>();

    /**
     * List of inline constants that can be found in this program
     */
    protected List<CtLocalVariable> inlineConstant;

    /**
     * Java assists methods for byte code manipulation
     */
    private List<CtMethod> javassistMethods;

    /**
     * Spoon factory to process all AST elements
     */
    private Factory factory;

    /**
     * Code fragments separated by class
     */
    protected HashMap<String, CodeFragmentList> codeFragmentsByClass = null;

    /**
     * Process all code fragments. Used to early process them.
     */
    public void processCodeFragments() {
        if (codeFragments == null || codeFragments.size() == 0) {
            ProcessingManager pm = new QueueProcessingManager(factory);
            AbstractCodeFragmentProcessor<?> processor = getCodeFragmentProcessor();
            pm.addProcessor(processor);
            pm.process(factory.Package().getRootPackage());
            codeFragments = processor.getCodeFragments();
            codeFragmentsByClass = processor.getCodeFragmentsByClass();
        }
    }


    /**
     * Process only the code fragments needed to handle a known set of transformations.
     * <p/>
     * This is faster than processing all. Useful for multi-sosies when we start from a known set of single-sosies
     * instead of searching out of the fragments.
     *
     * @param transformations An array of stored transformations.
     * @deprecated: Set a KnownTransfStatementProcessor as the code fragment processor instead and use processCodeFragments() without parameters
     */
    @Deprecated
    public void processCodeFragments(JSONArray transformations) throws JSONException {
        if (codeFragments == null) {
            ProcessingManager pm = new QueueProcessingManager(factory);
            KnownTransfStatementProcessor processor = null;
            processor = new KnownTransfStatementProcessor(transformations);
            pm.addProcessor(processor);
            pm.process(factory.Package().getRootPackage());
            codeFragments = processor.getCodeFragments();
        }
    }

    /**
     * List of all the code fragments extracted by Spoon of the input program
     */
    public synchronized CodeFragmentList getCodeFragments() {
        processCodeFragments();
        return codeFragments;
    }

    /**
     * Search for a specific code fragment given its serialized JSON object.
     * <p/>
     * Note: The JSON object is the serialized version OF THE CODE FRAGMENT by no means
     * THE TRANSFORMATION containing a particular code fragment.
     *
     * @param serialized Serialized object
     * @return The code fragment
     */
    @Deprecated
    public synchronized CodeFragment getCodeFragment(JSONObject serialized) {
        if (serialized.has("position")) {
            try {
                String position = serialized.getString("position");
                if (serialized.has("sourceCode")) {
                    return getCodeFragment(position, serialized.getString("sourceCode"));
                } else if (serialized.has("sourcecode")) {
                    // Super Hack!!!
                    return getCodeFragment(position, serialized.getString("sourcecode").replace("\n", "\r\n"));
                } else if (serialized.has("type")) {
                    return findCodeFragment(position, serialized.getString("type"), new TypeAccesor());
                } else {
                    return null;
                }
            } catch (JSONException e) {
                return null;
            }
        }
        return null;
    }

    /**
     * Search for a code fragment given a search predicate. The method will always search for code locations
     * in the proximity of the position that meet some features.
     *
     * @param position    position where the source code was "last seen".
     * @param searchValue Value to search for
     * @param accesor     Accesor function to the property we are looking for
     * @return
     */

    public CodeFragment findCodeFragment(String position, String searchValue,
                                         Accessor<CodeFragment, String> accesor) {
        return findCodeFragment(position, searchValue, accesor, 5, 0.85);
    }

    public CodeFragment findCodeFragment(String position, String searchValue,
                                         Accessor<CodeFragment, String> accesor,
                                         int lineThreshold, double valueThreshold) {
        CodeFragment result = null;

        String[] s = position.split(":");
        position = s[0];
        int lineNumber = Integer.parseInt(s[1]);


        int minDiff = Integer.MAX_VALUE;
        //int minDiff = lineThreshold;
        double sDiff = 0;
        //double sDiff = valueThreshold;

        int similarFragmentCount = 0;
        int similarMinDist = Integer.MAX_VALUE;

        CodeFragmentList fragments = getCodeFragmentsByClass().get(position);
        if (fragments != null) {
            for (CodeFragment codeFragment : fragments) {
                String[] cfPos = codeFragment.positionString().split(":");
                //Analyze only code fragments in the file of the one we are looking for
                if (cfPos[0].equals(position)) {
                    int cfLine = Integer.parseInt(cfPos[1]);
                    /*if(codeFragment.getCtCodeFragment().toString().equals(searchValue) && cfLine == lineNumber) {
                        //If it is of the same code and the same line: we found it!!
                        return codeFragment;
                    }*/
                    String ctValue = accesor.getValue(codeFragment);
                    if (ctValue.equals(searchValue) && cfLine == lineNumber) {
                        //If it is of the same code and the same line: we found it!!
                        return codeFragment;
                    //} else if (ctValue.contains(searchValue) && cfLine == lineNumber) {
                    } else {
                        //Similarity factor (provide flexibility...)
                        double x = StringSimilarity.CompareStrings(ctValue, searchValue);
                        //Line distance
                        int k = Math.abs(cfLine - lineNumber);

                        //Do not analyze this fragment if it is to different or to far
                        if (x < valueThreshold || k > lineThreshold) continue;

                        if (x > sDiff) {
                            similarFragmentCount = 0;//A better value is found, erase similar count
                            minDiff = k;//Store line distance
                            sDiff = x;
                            result = codeFragment;
                        } else if (Math.abs(x - sDiff) < 0.0000001) {
                            similarFragmentCount++; //equally good fragment found, augment the amount of fragments
                            int d = Math.abs(cfLine - lineNumber);
                            if (d < minDiff) {
                                similarMinDist = minDiff;
                                //else return the nearest one with same code
                                result = codeFragment;
                                minDiff = d;
                            }
                        }
                    }
                }
            }
        }

        //Log.info("Search completed of snippet at pos " + position);
        if (result == null) {
            Log.error("Unable to find " + searchValue + " at " + position + ":" + lineNumber);
        } else {
            position = position + ":" + lineNumber;
            if (!result.positionString().equals(position)) {
                Log.warn("Unable to find fragment at " + position);
                Log.info("Best match at " + result.positionString());
                if (sDiff < 1.0 || similarFragmentCount != 0) {
                    Log.info("Dice: " + sDiff + " Similars: " + similarFragmentCount + " Similar MinDist: " + similarMinDist);
                    Log.info("Search value: " + searchValue);
                    if (sDiff < 0) Log.info("Value found: " + accesor.getValue(result));
                }
            }
        }

        return result;
    }

    public <T extends CtElement> T findElement(Class type, String position, String searchValue) {
        return findElement(type, position, searchValue, 5, 0.85);
    }

    public <T extends CtElement> T findElement(Class type, String position, String searchValue,
                                         int lineThreshold, double valueThreshold) {
        T result = null;

        String[] s = position.split(":");
        String classPositionTmp = s[0];
        if(classPositionTmp.contains("$")) classPositionTmp = classPositionTmp.split("\\$")[0];
        String classPosition = classPositionTmp;
        int lineNumberPosition = Integer.parseInt(s[1]);

        List<T> allElements = getAllElement(type);
        /*List<T> elements = allElements.stream()
                .filter(e -> (e.getPosition().getLine() == lineNumberPosition)
                        && (e.getPosition().getCompilationUnit().getMainType().getQualifiedName().equals(classPosition))
                ).collect(Collectors.toList());*/
        List<T> elements = allElements.stream()
                .filter(e -> (e.getPosition().getLine() == lineNumberPosition))
                .collect(Collectors.toList());
        if(elements.size() == 1) return  elements.get(0);
        List<T> elementsFiltered = elements.stream()
                .filter(e -> e.getPosition().getCompilationUnit().getMainType().getQualifiedName().equals(classPosition))
                .collect(Collectors.toList());
        //if(elements.size() == 1) return  elements.get(0);
        if(elementsFiltered.size() == 1) return  elementsFiltered.get(0);
        //if(elements.size() > 0 && searchValue == null) return elements.get(0);
        //for(T elem : elements) {
        if(elementsFiltered.size() > 0 && searchValue == null) return elementsFiltered.get(0);
        for(T elem : elementsFiltered) {
            if (elem.toString().equals(searchValue))
                return elem;
            String buf = elem.toString();
            while(buf.startsWith("(") && buf.endsWith(")")) {
                buf = buf.substring(1,buf.length()-1);
                if (buf.equals(searchValue))
                    return elem;
            }
        }
        return result;
    }

    /**
     * Returns an specific code fragment given its position and source. The source is optional.
     * However, you should supply both, since is possible that a code fragment
     * is not found given only position since a difference of line numbers is usual.
     *
     * @param position Position of the code fragment
     * @param source   Source of the code Fragment
     * @return
     */
    public synchronized CodeFragment getCodeFragment(String position, String source) {
        return findCodeFragment(position, source, new SourceAccesor());
    }


    /**
     * Root spoon element for an input program, mostly upper level packages
     */
    public synchronized Set<CtPackage> getRoots() {
//        if (roots == null) {
//            roots = new HashSet<>();
//            ProcessingManager pm = new QueueProcessingManager(factory);
//            AbstractProcessor<CtPackage> processor = new AbstractProcessor<CtPackage>() {
//                @Override
//                public void process(CtPackage element) {
//                    CtElement root = element;
//                    while (root.getParent() != null && !root.getParent().toString().equals("")) {
//                        root = root.getParent();
//                    }
//                    roots.add(root);
//                }
//            };
//            pm.addProcessor(processor);
//            pm.process();
//        }
//        return roots;
        return factory.Package().getRootPackage().getPackages();
    }

    /**
     * Java assists methods for byte code manipulation
     */
    public synchronized List<CtMethod> getJavassistMethods() {

        if (javassistMethods == null) {
            javassistMethods = new ArrayList<>();
            ClassPool pool = ClassPool.getDefault();
            //pool.insertClassPath(DiversifyProperties.getProperty("project") + "/" + DiversifyProperties.getProperty("classes"));
            try {
                pool.insertClassPath(classesDir);
            } catch (NotFoundException e) {
                throw new RuntimeException("Cannot find classesDir " + classesDir, e);
            }
            for (CtType cl : getCodeFragments().getAllClasses()) {
                CtClass cc;
                try {
                    cc = pool.get(cl.getQualifiedName());
                } catch (NotFoundException e) {
                    throw new RuntimeException(e);
                }
                for (CtMethod method : cc.getDeclaredMethods())
                    if (!method.isEmpty()) {
                        javassistMethods.add(method);
                    }
            }
        }
        return javassistMethods;
    }


    public synchronized <T extends CtElement> List<T> getAllElement(Class cl) {
        if (!typeToObject.containsKey(cl)) {
            List<T> elements = new ArrayList<>();
            elements.addAll(getFactory().getModel().getElements(new TypeFilter(cl)));
            /*QueryVisitor<T> query = new QueryVisitor(new TypeFilter(cl));
            List<T> elements = new ArrayList<>();
            for (CtElement e : getRoots()) {
                e.accept(query);
                elements.addAll(query.getResult());
            }*/
            typeToObject.put(cl, elements);
        }
        return (List<T>)typeToObject.get(cl);
    }

    /**
     * Copies properties from the configuration
     *
     * @param configuration
     */
    public void configure(InputConfiguration configuration) {
        setRelativeSourceCodeDir(configuration.getRelativeSourceCodeDir());
        setProgramDir(configuration.getProjectPath());
        setRelativeSourceCodeDir(configuration.getRelativeSourceCodeDir());
        setPreviousTransformationsPath(configuration.getPreviousTransformationPath());
        setClassesDir(configuration.getClassesDir());
        setCoverageDir(configuration.getCoverageDir());
    }

    public AbstractCodeFragmentProcessor<?> getCodeFragmentProcessor() {
        //Convention over configuration
        if (codeFragmentProcessor == null) codeFragmentProcessor = new StatementProcessor(externalSourceCodeDir);
        return codeFragmentProcessor;
    }

    public void setCodeFragmentProcessor(AbstractCodeFragmentProcessor<?> codeFragmentProcessor) {
        this.codeFragmentProcessor = codeFragmentProcessor;
    }

    /**
     * Spoon factory to process all AST elements
     */
    public Factory getFactory() {
        return factory;
    }

    public void setFactory(Factory factory) {
        this.factory = factory;
    }

    /**
     * Coverage report for the input program
     */
    public ICoverageReport getCoverageReport() {
        return coverageReport;
    }

    /**
     * Coverage report for the input program
     */
    public void setCoverageReport(ICoverageReport coverageReport) {
        this.coverageReport = coverageReport;
    }

    /**
     * Path to the test source code of the input program
     */
    public String getRelativeTestSourceCodeDir() {
        return testSourceCodeDir;
    }

    /**
     * Path to the test source code of the input program
     */
    public String getAbsoluteTestSourceCodeDir() {
        return  programDir + "/" + testSourceCodeDir;
    }

    public void setRelativeTestSourceCodeDir(String testSourceCodeDir) {
        this.testSourceCodeDir = testSourceCodeDir;
    }

    /**
     * Path to the  source of the input program
     */
    public String getAbsoluteSourceCodeDir() {
        return programDir + "/" + sourceCodeDir;
    }

    /**
     * Path to the  source of the input program
     */
    public String getRelativeSourceCodeDir() {
        return sourceCodeDir;
    }

    public void setRelativeSourceCodeDir(String sourceCodeDir) {
        this.sourceCodeDir = sourceCodeDir;
    }

    public void setExternalSourceCodeDir(String externalSourceCodeDir) {
        this.externalSourceCodeDir = externalSourceCodeDir;
    }

    public String getExternalSourceCodeDir() {
        return externalSourceCodeDir;
    }

    /**
     * Path to the know sosie information stored in file
     */
    public String getPreviousTransformationsPath() {
        return previousTransformationsPath;
    }

    public void setPreviousTransformationsPath(String path) {
        this.previousTransformationsPath = path;
    }

    /**
     * Number of transformations that we are going to attempt in every run of the diversificator
     */
    public int getTransformationPerRun() {
        return transformationPerRun;
    }

    public void setTransformationPerRun(int transformationPerRun) {
        this.transformationPerRun = transformationPerRun;
    }

    /**
     * Path to the root directory of the input program
     */
    public String getProgramDir() {
        return programDir;
    }

    public void setProgramDir(String programDir) {
        this.programDir = programDir;
    }

    public void setJavaVersion(int javaVersion) {
        this.javaVersion = javaVersion;
    }

    public int getJavaVersion() {
        return javaVersion;
    }

    /**
     * Path to the built classes
     */
    public String getClassesDir() {
        return classesDir;
    }


    /**
     * Path to the built test classes
     */
    public String getTestClassesDir() {
        return testClassesDir;
    }

    public void setClassesDir(String classesDir) {
        this.classesDir = classesDir;
    }


    /**
     * Path to the coverage information
     */
    public String getCoverageDir() {
        return coverageDir;
    }

    public void setCoverageDir(String coverageDir) {
        this.coverageDir = coverageDir;
    }

    /**
     * Minimum number of transformations that we are going to attempt in every run of the diversificator
     */
    public int getMinTransformationsPerRun() {
        return minTransformationsPerRun;
    }

    public void setMinTransformationsPerRun(int minTransformationsPerRun) {
        this.minTransformationsPerRun = minTransformationsPerRun;
    }


    public String getPreferredGeneratorVersion() {
        return preferredGeneratorVersion;
    }

    public void setPreferredGeneratorVersion(String preferredGeneratorVersion) {
        this.preferredGeneratorVersion = preferredGeneratorVersion;
    }

    public HashMap<String, CodeFragmentList> getCodeFragmentsByClass() {
        if (codeFragmentsByClass == null) processCodeFragments();
        return codeFragmentsByClass;
    }

    public InputProgram clone() {
        InputProgram clone = new InputProgram();
        clone.programDir = programDir;
        clone.sourceCodeDir = sourceCodeDir;
        clone.externalSourceCodeDir = externalSourceCodeDir;
        clone.testSourceCodeDir = testSourceCodeDir;
        clone.javaVersion = javaVersion;
        clone.coverageDir = coverageDir;
        clone.classesDir = classesDir;

        return clone;
    }
}
