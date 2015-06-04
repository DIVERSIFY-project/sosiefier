package fr.inria.diversify.exp;

import fr.inria.diversify.buildSystem.maven.MavenDependencyResolver;
import fr.inria.diversify.diversification.InputConfiguration;
import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.factories.SpoonMetaFactory;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.TransformationJsonParser;
import fr.inria.diversify.transformation.TransformationParserException;
import fr.inria.diversify.util.Log;
import org.json.JSONException;
import org.json.JSONObject;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.factory.Factory;

import java.io.*;
import java.util.*;

/**
 * Created by Simon on 30/07/14.
 */
public class GenerateReport {


    private InputConfiguration inputConfiguration;
    private InputProgram inputProgram;

    public static void main(String[] args) throws Exception {
        new GenerateReport(args[0]);
    }

    public GenerateReport(String propertiesFile) throws Exception {

        inputConfiguration = new InputConfiguration(propertiesFile);

        initLogLevel();
        if (inputConfiguration.getProperty("builder").equals("maven")) {
            MavenDependencyResolver t = new MavenDependencyResolver();
            t.DependencyResolver(inputConfiguration.getProperty("project") + "/pom.xml");
        }
        initSpoon();
        buildReport();
    }


    protected void initSpoon() throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        Factory factory = new SpoonMetaFactory().buildNewFactory(inputConfiguration.getProperty("project") + "/" +
                inputConfiguration.getProperty("src"), Integer.parseInt(inputConfiguration.getProperty("javaVersion")));
        initInputProgram(factory);
    }

    protected void initLogLevel() {
        int level = Integer.parseInt(inputConfiguration.getProperty("logLevel"));
        Log.set(level);
    }

    protected void initInputProgram(Factory factory) {
        inputProgram = new InputProgram();
        inputProgram.setFactory(factory);

        inputProgram.setClassesDir(inputConfiguration.getProperty("classes"));
    }

    protected void buildReport() throws Exception {
        List<JSONObject> jsonReport = loadJSONReport();
        List<String> diffVar = loadDiffVar();

        for (String var : diffVar) {
            String sosie = var.split("::")[0];
            String point = var.split("::")[1];
            for (JSONObject object : jsonReport) {
                List<String> tests = contain(sosie, point, object);
                if (!tests.isEmpty()) {
                    writeReportOf(sosie, point, tests);
                }
            }
        }
    }

    protected void writeReportOf(String sosie, String point, List<String> tests) throws Exception {
        String trans = inputConfiguration.getProperty("sosieDir") + "/" + sosie + "/trans.json";

        String result = "sosie: " + sosie + "\npoint:" + point + "\ntest";

        for (String test : tests) {
            result += "\n\t" + test;
        }

        int i = 0;
        for (Transformation t : loadFromFile(new File(trans))) {
            i++;
            result += "\n\nTransformation: " + i + ":\n" + transformationDetail(t);

        }
        File dir = new File(inputConfiguration.getProperty("resultDir"));
        if(!dir.exists()) {
            dir.mkdirs();
        }
        Writer writer = new FileWriter(inputConfiguration.getProperty("resultDir") + "/" + sosie + "_" + point);
        writer.write(result);
        writer.close();
    }

    protected CtMethod getTest(String name) {

        for(CtElement elem: inputProgram.getAllElement(CtMethod.class)) {
            CtMethod method = (CtMethod) elem;
            if(name.equals(method.getDeclaringType().getQualifiedName() +"."+ method.getSimpleName()))
                return method;
        }
        return null;
    }

    protected String transformationDetail(Transformation transformation) throws Exception {
        String detail = "";
//        detail += "package: " + transformation.packageLocationName();
//        detail += "\nclass: " + transformation.classLocationName();
//
//        detail += "\nname: " + transformation.getName();
//        detail += "\ntype: " + transformation.getType();
//
//        try {
//            detail += "\n" + transformation.getTransformationString();
//        } catch (Exception e) {
//            Log.debug("");
//        }

        return detail;
    }

    protected List<String> contain(String sosie, String point, JSONObject object) throws JSONException {
        List<String> list = new ArrayList<>();
        if (object.get("sosie").equals(sosie)) {
            Map<String, List<String>> map = parseMap(object.getJSONObject("diff"));

            for (String key : map.keySet()) {
                if (map.get(key).contains(point)) {
                    list.add(key);
                }
            }
        }
        return list;
    }

    protected Map<String, List<String>> parseMap(JSONObject o) throws JSONException {
        Map<String, List<String>> map = new HashMap<>();

        Iterator it = o.keys();
        while (it.hasNext()) {
            String key = (String) it.next();
            List<String> list = new ArrayList<>();
            int size = o.getJSONArray(key).length();
            for (int i = 0; i < size; i++) {
                list.add(o.getJSONArray(key).getString(i));
            }
            map.put(key, list);
        }

        return map;
    }

    protected List<JSONObject> loadJSONReport() throws IOException, JSONException {
        List<JSONObject> reports = new ArrayList();

        File file = new File(inputConfiguration.getProperty("reportDir"));

        for (File f : file.listFiles()) {
            if (f.getName().endsWith("_good.json")) {
                BufferedReader br = new BufferedReader(new FileReader(f));
                StringBuilder sb = new StringBuilder();
                String line = br.readLine();
                while (line != null) {
                    sb.append(line);
                    line = br.readLine();
                }

                reports.add(new JSONObject(sb.toString()));
            }
        }
        return reports;
    }

    protected List<String> loadDiffVar() throws IOException {
        List<String> map = new ArrayList<>();

        BufferedReader br = new BufferedReader(new FileReader(inputConfiguration.getProperty("diffVar")));
        String line = br.readLine();
        while (line != null) {
            map.add(line);
            line = br.readLine();
        }
        return map;
    }


    public List<Transformation> loadFromFile(File file) throws IOException, JSONException, TransformationParserException {
        BufferedReader br = null;
        List<Transformation> transformations = new ArrayList<>();
        try {
            TransformationJsonParser parser = new TransformationJsonParser(false, inputProgram);
            br = new BufferedReader(new FileReader(file));
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            while (line != null) {
                Transformation t = parser.parseTransformation(new JSONObject(line));
                transformations.add(t);
                line = br.readLine();
            }
        } finally {
            if (br != null) {
                br.close();
            }
        }
        return transformations;
    }


}
