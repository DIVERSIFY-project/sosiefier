package fr.inria.diversify.util;

import fr.inria.diversify.runner.InputConfiguration;
import fr.inria.diversify.runner.InputProgram;
import fr.ybonnel.csvengine.CsvEngine;
import fr.ybonnel.csvengine.exception.CsvErrorsExceededException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import spoon.reflect.code.CtStatement;
import spoon.reflect.declaration.CtClass;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.declaration.CtPackage;
import spoon.reflect.declaration.CtType;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static fr.inria.diversify.persistence.json.output.JsonSectionOutput.POSITION;
import static fr.inria.diversify.persistence.json.output.JsonSectionOutput.SOURCE_CODE;

/**
 * Created by nharrand on 03/07/17.
 */
public class TestBaseInfo {

    InputProgram inputProgram;
    InputConfiguration inputConfiguration;
    File stmtReport;
    File mutationReport;
    File updatedStmtReport;

    public TestBaseInfo(InputProgram inputProgram, InputConfiguration inputConfiguration) {
        this.inputProgram = inputProgram;
        this.inputConfiguration = inputConfiguration;
        this.stmtReport = new File(inputConfiguration.getProperty("stmtreport"));
        this.mutationReport = new File(inputConfiguration.getProperty("mutationreport"));
        this.updatedStmtReport = new File(inputConfiguration.getProperty("updated-stmtreport"));

        try {
            loadMutationReport();
        } catch (JSONException e) {
            System.err.println("Incorrect Json report format");
            e.printStackTrace();
        }
        readStmtReport();

        String updatedReport = StmtInfo.header();

        for(StmtInfo stmt : stmts) {
            String m = getMethod(stmt.position);
            if(tried.containsKey(m)) {
                stmt.nbMutantTried = tried.get(m);
            }
            if(survived.containsKey(m)) {
                stmt.nbMutantSurvived = survived.get(m);
            }
            updatedReport += stmt.toString();
        }
        FileUtils.writeFile(updatedReport,updatedStmtReport);
        System.out.println("OK");
    }

    public JSONObject readFromFile(File f) {
        JSONObject jsonObject = null;
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(f));
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            while (line != null) {
                sb.append(line);
                line = br.readLine();
            }

            jsonObject = new JSONObject(sb.toString());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (br != null) try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return jsonObject;
    }

    Map<String, Integer> survived = new HashMap<>();
    Map<String, Integer> tried = new HashMap<>();

    public void loadMutationReport() throws JSONException {
        JSONObject report = readFromFile(mutationReport);
        JSONArray mutations = report.getJSONArray("mutations");
        for(int i = 0; i < mutations.length(); i++) {
            JSONObject mutation = mutations.getJSONObject(i);
            JSONObject method = mutation.getJSONObject("method");

            String sig = readParameters(method.getString("description").split("\\(")[1].split("\\)")[0]).replace("/",".");

            String methodName = method.getString("package") + "."
                    + method.getString("class") + "."
                    + method.getString("name") + "("
                    + sig + ")";

            String status = mutation.getString("status");

            Integer survivors = survived.get(methodName);
            if(survivors == null) survivors = new Integer(0);
            survived.put(methodName,survivors);
            Integer tries = tried.get(methodName);
            if(tries == null) tries = new Integer(0);
            tried.put(methodName,tries);

            if (status.equalsIgnoreCase("SURVIVED")) survived.put(methodName,survivors+1);
            tried.put(methodName,tries+1);
        }
    }

    public static String[] readParameter(String parameters) throws InvalidCharacter {
        String res[] = new String[2];
        char first = parameters.charAt(0);
        switch (first) {
            case 'B':
                res[0] = "byte";
                res[1] = parameters.substring(1);
                break;
            case 'C':
                res[0] = "char";
                res[1] = parameters.substring(1);
                break;
            case 'D':
                res[0] = "double";
                res[1] = parameters.substring(1);
                break;
            case 'F':
                res[0] = "float";
                res[1] = parameters.substring(1);
                break;
            case 'I':
                res[0] = "int";
                res[1] = parameters.substring(1);
                break;
            case 'J':
                res[0] = "long";
                res[1] = parameters.substring(1);
                break;
            case 'S':
                res[0] = "short";
                res[1] = parameters.substring(1);
                break;
                /*case 'V':
                    result.add("void");
                    remain = remain.substring(1);
                    break;*/
            case 'Z':
                res[0] = "boolean";
                res[1] = parameters.substring(1);
                break;
            case '[':
                String[] tmp = readParameter(parameters.substring(1));
                res[0] = tmp[0] + "[]";
                res[1] = tmp[1];
                break;
            case 'L':
                res[0] = parameters.split(";")[0].substring(1);
                res[1] = parameters.substring(res[0].length() + 2);
                break;
            default:
                System.out.println("Invalid char: '" + first + "'");
                throw new InvalidCharacter();
        }
        return res;
    }

    public static String readParameters(String parameters){
        /*TODO [Ljava.lang.Class -> Class
        [BII -> ?
        */
        String result = "";
        try {
            String remain = parameters;
            int i = 0;
            while(remain.length() > 0) {
                if(i != 0) result += ",";
                String[] tmp = readParameter(remain);
                result += tmp[0];
                remain = tmp[1];
                i++;
            }
        } catch (InvalidCharacter invalidCharacter) {
            invalidCharacter.printStackTrace();
        }
        return result;
    }

    public static class InvalidCharacter extends Exception {}

    public String getMethod(String stmtPosition) {
        CtStatement stmt = inputProgram.findElement(CtStatement.class,stmtPosition,null);
        if(stmt != null) {
            CtMethod method = stmt.getParent(CtMethod.class);
            if(method != null) {
                CtType cla = method.getDeclaringType();
                return cla.getQualifiedName() + "." + method.getSignature().split(" ")[1];
            }
        }
        System.err.println("[Warning] Position: " + stmtPosition + " could not be found.");
        return "not found";
    }

    List<StmtInfo> stmts;
    CsvEngine engine;

    public void readStmtReport() {
        engine = new CsvEngine(StmtInfo.class);
        try {
            stmts = engine.parseInputStream(new FileInputStream(stmtReport), StmtInfo.class).getObjects();
            System.out.println("ok");
        } catch (CsvErrorsExceededException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
