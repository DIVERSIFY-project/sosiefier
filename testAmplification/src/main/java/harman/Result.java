package harman;

import spoon.reflect.code.CtLiteral;
import spoon.reflect.declaration.CtClass;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.visitor.Query;
import spoon.reflect.visitor.filter.TypeFilter;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by Simon on 25/02/15.
 */
public class Result {
    Map<CtMethod, Integer> searchRadiuss;
    Map<CtMethod, Integer> numberOfTmpTests;
    Map<CtMethod, CtMethod> newTests;
    Map<CtClass, List<CtMethod>> newTestByClasses;


    public Result() {
        searchRadiuss = new HashMap<>();
        numberOfTmpTests = new HashMap<>();
        newTests = new HashMap<>();
        newTestByClasses = new HashMap<>();
    }

    public void addNewTest(CtClass cl, CtMethod originalTest, CtMethod newTest, int searchRadius, int numberOfTmpTest) {
        if(!newTestByClasses.containsKey(cl)) {
            newTestByClasses.put(cl, new ArrayList<>());
        }
        newTestByClasses.get(cl).add(newTest);
        newTests.put(newTest, originalTest);
        numberOfTmpTests.put(newTest, numberOfTmpTest);
        searchRadiuss.put(newTest, searchRadius);
    }

    public Map<CtClass, List<CtMethod>> getNewTestByClasses() {
        return newTestByClasses;
    }

    public void printSummary(String fileName) throws IOException {
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName)));

        for(CtClass cl : newTestByClasses.keySet()) {
            out.write(cl.getQualifiedName() +"\n");
            for(CtMethod mth : newTests.keySet()) {
                out.write("\toriginal method: " +newTests.get(mth).getSimpleName() +", "+getNumber(newTests.get(mth))+"\n");
                out.write("\tnew method: " +mth.getSimpleName() +", "+getNumber(mth)+"\n");
                out.write("\tsearch radius: " +searchRadiuss.get(mth) +"\n");
                out.write("\tnumber of tmp test: " +numberOfTmpTests.get(mth) +"\n");
                out.write("\tdistance : " +euclidienDistance(getNumber(newTests.get(mth)), getNumber(mth)) +"\n");
                out.write("\n");
            }
            out.write("\n");
        }
        out.close();
    }

    public void printCSVSummary(String fileName) throws IOException {
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileName)));

        out.write("class;original_method;new_method;inputVectorSize;searchRadius;numberOfTmpTest;distance\n");
        for(CtClass cl : newTestByClasses.keySet()) {
            for(CtMethod mth : newTests.keySet()) {
                out.write(cl.getQualifiedName() +";");
                out.write(newTests.get(mth).getSimpleName()+";");
                out.write(mth.getSimpleName()+";");
                out.write(getNumber(mth).size()+";");
                out.write(searchRadiuss.get(mth) +";");
                out.write(numberOfTmpTests.get(mth) +";");
                out.write(euclidienDistance(getNumber(newTests.get(mth)), getNumber(mth)) +";\n");
            }
        }
        out.close();
    }

    protected List<CtLiteral> getNumber(CtMethod method) {
        return Query.getElements(method, new TypeFilter<CtLiteral>(CtLiteral.class)).stream()
                    .filter(literal -> literal.getValue() instanceof Number )
                    .collect(Collectors.toList());
    }

    protected double euclidienDistance(List<CtLiteral> currentSolVector, List<CtLiteral> originalVector) {
        double vectorDistance = 0;
        for(int i = 0; i < originalVector.size(); i++ ) {
            double tmp = ((Number) currentSolVector.get(i).getValue()).doubleValue() - ((Number) originalVector.get(i).getValue()).doubleValue();
            vectorDistance += tmp * tmp;
        }
        return  Math.sqrt(vectorDistance);
    }

}
