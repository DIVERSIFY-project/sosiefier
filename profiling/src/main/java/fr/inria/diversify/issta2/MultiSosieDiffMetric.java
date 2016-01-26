package fr.inria.diversify.issta2;

import fr.inria.diversify.buildSystem.android.InvalidSdkException;
import fr.inria.diversify.logger.Diff;
import fr.inria.diversify.logger.JsonDiffInput;
import fr.inria.diversify.logger.transformationUsed.StaticDiff;
import fr.inria.diversify.persistence.json.input.JsonTransformationLoader;
import fr.inria.diversify.runner.InputConfiguration;
import fr.inria.diversify.runner.InputProgram;
import fr.inria.diversify.transformation.MultiTransformation;
import fr.inria.diversify.transformation.SingleTransformation;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.ast.ASTTransformation;
import fr.inria.diversify.util.InitUtils;
import spoon.reflect.cu.SourcePosition;

import java.io.File;
import java.io.FileWriter;
import java.util.*;
import java.util.stream.Collectors;

/**
 * User: Simon
 * Date: 12/01/16
 * Time: 10:10
 */
public class MultiSosieDiffMetric {
    protected List<Transformation> singleTransformations;
    protected Map<Transformation, Set<Diff>> transToDiff;
    protected int sizeMax = 20;


    protected SourcePosition s1;
    protected MultiTransformation createMultiSosie() {
        Random r = new Random();
        MultiTransformation tran = new MultiTransformation();
        List<SourcePosition> positions = new ArrayList<>();
        for(int i = 0; i < r.nextInt(sizeMax - 2) + 2; i++) {
            Transformation t = singleTransformations.get(r.nextInt(singleTransformations.size()));
            s1 = t.getPositions().get(0);
            while(!positions.stream().allMatch(position -> ok(position))) {
                s1 = t.getPositions().get(0);
                t = singleTransformations.get(r.nextInt(singleTransformations.size()));
            }
            positions.add(s1);
            tran.add(t);
        }

        return tran;
    }

    protected boolean ok(SourcePosition s2) {
        String className1 = s1.getCompilationUnit().getMainType().getQualifiedName();
        int begin1 = s1.getLine();
        int end1 = s1.getEndLine();

        String className2 = s2.getCompilationUnit().getMainType().getQualifiedName();
        int begin2 = s2.getLine();
        int end2 = s2.getEndLine();

        if(className1.equals(className2)) {
            if(begin1 > begin2) {
                return end1 > begin2;
            }
            if(begin1 < begin2) {
                return end2 > begin1;
            }
            return false;
        } else {
            return true;
        }
    }

    public void run(String fileName, int nb) throws Exception {
        List<MultiTransformation> multiTransformations = new ArrayList<>(nb);
        File dir = new File(fileName);
        dir.mkdirs();

        FileWriter branch = new FileWriter(fileName + "/matrixMetricBranch");
        FileWriter position = new FileWriter(fileName + "/matrixMetricPosition");
        FileWriter method = new FileWriter(fileName + "/matrixMetricMethod");
        FileWriter all = new FileWriter(fileName + "/matrixMetric");
        FileWriter metric = new FileWriter(fileName + "/metric");
        metric.write("id;branch;method;size\n");

        for(int i = 0; i < nb; i++) {
            multiTransformations.add(createMultiSosie());
        }

        for(MultiTransformation t1 : multiTransformations) {
            Diff d1 = t1.getTransformations().stream()
                    .filter(t -> transToDiff.containsKey(t))
                    .flatMap(t -> transToDiff.get(t).stream()
                            .filter(diff -> diff instanceof StaticDiff))
                    .reduce((a, b) -> {
                                a.merge(b);
                                return a;
                            }
                    )
                    .orElse(new StaticDiff());


            metric.write(count+ ";"+((StaticDiff)d1).branchDiffSize()+";" + ((StaticDiff)d1).methodDiffSize()+";"+t1.size()+"\n");
            writeTransformation(fileName, t1);
            List<Integer> positionList = new ArrayList<>();
            List<Integer> methodList = new ArrayList<>();
            List<Integer> branchList = new ArrayList<>();
            List<Integer> allList = new ArrayList<>();

            for(MultiTransformation t2 : multiTransformations) {
                int[] metrics = computeDiffMetric(t1, t2);
                positionList.add(metrics[0]);
                branchList.add(metrics[1]);
                methodList.add(metrics[2]);
                allList.add(metrics[0] + metrics[1] + metrics[2]);
            }
            branch.write(branchList.stream().map(i -> i +"").collect(Collectors.joining(";")) + "\n");
            position.write(positionList.stream().map(i -> i +"").collect(Collectors.joining(";")) + "\n");
            method.write(methodList.stream().map(i -> i +"").collect(Collectors.joining(";")) + "\n");
            all.write(allList.stream().map(i -> i +"").collect(Collectors.joining(";")) + "\n");
        }
        branch.close();
        position.close();
        method.close();
        all.close();
        metric.close();
    }

    int count = 0;
    protected void writeTransformation(String fileName, MultiTransformation trans) throws Exception {
        FileWriter fileWriter = new FileWriter(fileName + "/transformation_" + count);
        fileWriter.write("size: "+ trans.size() + "\n");


        Diff d1 = trans.getTransformations().stream()
                .filter(t -> transToDiff.containsKey(t))
                .flatMap(t -> transToDiff.get(t).stream()
                        .filter(diff -> diff instanceof StaticDiff))
                .reduce((a, b) -> {
                            a.merge(b);
                            return a;
                        }
                )
                .orElse(new StaticDiff());
        fileWriter.write("diff size: "+ d1.size() + "\n");
        fileWriter.write("branch diff size: "+ ((StaticDiff) d1).branchDiffSize() + "\n");
        fileWriter.write("method diff size: "+ ((StaticDiff) d1).methodDiffSize() + "\n");
        fileWriter.write("diff: "+ d1.toJSON().toString() + "\n\n");


        fileWriter.write("multi transformation:\n");
        int i = 0;
        for(Transformation t : trans.getTransformations()) {
            fileWriter.write("transformation " + i + " " +t.getName() +":\n");
            i++;
            ASTTransformation astTrans = (ASTTransformation) t;
            fileWriter.write("position: "+ astTrans.getTransplantationPoint().positionString() + "\n");
            fileWriter.write("original:\n");
            fileWriter.write(astTrans.getTransplantationPoint().toString() + "\n\n");
            fileWriter.write("sosie:\n");
            fileWriter.write(astTrans.getTransformationString());
            fileWriter.write("\n-------------------------------------------------\n\n");

            fileWriter.write("\n\n");
        }
        count++;
        fileWriter.close();

    }

    protected int[] computeDiffMetric(MultiTransformation t1, MultiTransformation t2) {
        int[] metrics = new int[3];

       Diff d1 = t1.getTransformations().stream()
               .filter(t -> transToDiff.containsKey(t))
               .flatMap(t -> transToDiff.get(t).stream()
                            .filter(diff -> diff instanceof StaticDiff))
               .reduce((a, b) -> {
                    a.merge(b);
                   return a;
                       }
                   )
               .orElse(new StaticDiff());

        Diff d2 = t2.getTransformations().stream()
                .filter(t -> transToDiff.containsKey(t))
                .flatMap(t -> transToDiff.get(t).stream()
                        .filter(diff -> diff instanceof StaticDiff))
                .reduce((a, b) -> {
                            a.merge(b);
                            return a;
                        }
                )
                .orElse(new StaticDiff());

        metrics[0] = sourcePositionDiff(t1, t2);
        metrics[1] = branchDiff((StaticDiff) d1, (StaticDiff) d2);
        metrics[2] = methodDiff((StaticDiff) d1, (StaticDiff) d2);
        return metrics;
    }

    protected int sourcePositionDiff(MultiTransformation t1, MultiTransformation t2) {
        Set<String> cl1 = t1.getTransformations().stream()
                .map(t -> (SingleTransformation) t)
                .map(t -> t.classLocationName())
                .collect(Collectors.toSet());

        Set<String> cl2 = t2.getTransformations().stream()
                .map(t -> (SingleTransformation) t)
                .map(t -> t.classLocationName())
                .collect(Collectors.toSet());

        Set<String> mth1 = t1.getTransformations().stream()
                .map(t -> (SingleTransformation) t)
                .map(t -> t.methodLocationName())
                .collect(Collectors.toSet());

        Set<String> mth2 = t2.getTransformations().stream()
                .map(t -> (SingleTransformation) t)
                .map(t -> t.methodLocationName())
                .collect(Collectors.toSet());

        Set<String> pk1 = t1.getTransformations().stream()
                .map(t -> (SingleTransformation) t)
                .map(t -> t.packageLocationName())
                .collect(Collectors.toSet());

        Set<String> pk2 = t2.getTransformations().stream()
                .map(t -> (SingleTransformation) t)
                .map(t -> t.packageLocationName())
                .collect(Collectors.toSet());
        return diffSet(cl1, cl2) + diffSet(mth1, mth2) + diffSet(pk1, pk2);
    }

    protected int branchDiff(StaticDiff diff1, StaticDiff diff2) {
        return diffSet(diff1.getBranchesDiff().getOrDefault("add", new HashSet<>()), diff2.getBranchesDiff().getOrDefault("add", new HashSet<>()))
                + diffSet(diff1.getBranchesDiff().getOrDefault("delete", new HashSet<>()), diff2.getBranchesDiff().getOrDefault("delete", new HashSet<>()));
    }

    protected int methodDiff(StaticDiff diff1, StaticDiff diff2) {
        return diffSet(diff1.getMethodDiffs().getOrDefault("add", new HashSet<>()), diff2.getMethodDiffs().getOrDefault("add", new HashSet<>()))
                + diffSet(diff1.getMethodDiffs().getOrDefault("delete", new HashSet<>()), diff2.getMethodDiffs().getOrDefault("delete", new HashSet<>()));
    }

    protected int diffSet(Set<String> set1, Set<String> set2) {
        int count = 0;
        for(String s1 : set1) {
            if(!set2.contains(s1)) {
                count++;
            }
        }
        for(String s2 : set2) {
            if(!set1.contains(s2)) {
                count++;
            }
        }
        return count;
    }

    public MultiSosieDiffMetric(String propertiesFile) throws Exception, InvalidSdkException {

        InputConfiguration inputConfiguration = new InputConfiguration(propertiesFile);

        InitUtils.initLogLevel(inputConfiguration);
        InputProgram inputProgram = InitUtils.initInputProgram(inputConfiguration);
        InitUtils.initDependency(inputConfiguration);
        InitUtils.initSpoon(inputProgram, false);

        JsonTransformationLoader parser = new JsonTransformationLoader(inputProgram);
        JsonDiffInput jsonDiffInput = new JsonDiffInput();
        parser.addSection(jsonDiffInput.getClass(), jsonDiffInput);

        Collection<Transformation> ts = parser.load(inputProgram.getPreviousTransformationsPath(), true);

        this.transToDiff = jsonDiffInput.getTransToDiffs();
        singleTransformations = ts.stream().map(t -> (SingleTransformation) t).collect(Collectors.toList());
    }

    public static void main(String[] args) throws InvalidSdkException, Exception {
        new MultiSosieDiffMetric(args[0]).run("result/multisosie", 1000);
    }
}
