package fr.inria.diversify;

import fr.inria.diversify.diversification.InputConfiguration;
import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.factories.SpoonMetaFactory;
import fr.inria.diversify.sosie.SosiePoolCreator;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.TransformationJsonParser;
import fr.inria.diversify.transformation.TransformationParserException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import spoon.reflect.factory.Factory;

import java.io.*;
import java.util.List;

/**
 * A program to create a pool of sosies out of a directory of transformations
 * <p/>
 * Created by marodrig on 19/06/2014.
 */
public class FromISSTAToPoolCreatorInput {

    public static void main(String[] args) throws Exception {
        FromISSTAToPoolCreatorInput creator = new FromISSTAToPoolCreatorInput();
        //creator.init(args[0], args[1]);
        InputConfiguration inputConfiguration = new InputConfiguration("C:\\MarcelStuff\\projects\\DIVERSE\\programs\\properties\\common-lang\\issta-to-normal.properties");
        try {
            //creator.init(inputConfiguration);
            creator.test(inputConfiguration);
        } catch (Exception e) {
            System.out.println("Something went wrong" + e.getMessage() );
        }

    }

    private void test(InputConfiguration inputConfiguration) throws IllegalAccessException, InstantiationException, ClassNotFoundException, IOException, JSONException {



        String project = inputConfiguration.getProjectPath();
        String src = inputConfiguration.getSourceCodeDir();
        String prevTransfPath = inputConfiguration.getPreviousTransformationPath();
        String out = inputConfiguration.getResultPath();

        JSONArray array = getNormalArray(new File(out));

        Factory factory = new SpoonMetaFactory().buildNewFactory(project, 7);

        InputProgram inputProgram = new InputProgram();
        inputProgram.setFactory(factory);
        inputProgram.setSourceCodeDir(src);
        inputProgram.setPreviousTransformationsPath(prevTransfPath);
        inputProgram.processCodeFragments();



        TransformationJsonParser parser = new TransformationJsonParser(false, inputProgram);
        List<Transformation> transf = parser.parseArray(array);

        System.out.println("transf size" + transf.size());
    }

    private JSONArray getNormalArray(File input) throws IOException, JSONException {
        StringBuilder sb = new StringBuilder();
        BufferedReader reader = new BufferedReader(new FileReader(input));
        String line = null;
        while ((line = reader.readLine()) != null) {
            sb.append(line);
        }
        return new JSONArray(sb.toString());
    }

    private JSONArray getArray(File input) throws IOException, JSONException {
        JSONArray result = new JSONArray();
        StringBuilder sb = new StringBuilder();
        BufferedReader reader = new BufferedReader(new FileReader(input));
        String line;
        while ((line = reader.readLine()) != null) {
            JSONObject obj = new JSONObject(line);
            result.put(obj);
        }
        return result;
    }

    private JSONObject getObject(File input) throws IOException, JSONException {
        StringBuilder sb = new StringBuilder();
        BufferedReader reader = new BufferedReader(new FileReader(input));
        String line = null;
        while ((line = reader.readLine()) != null) {
            sb.append(line);
        }
        return new JSONObject(sb.toString());
    }


    /**
     * Creates a json file
     *
     */
    public void init(InputConfiguration inputConfiguration) throws IOException, JSONException, IllegalAccessException,
            InstantiationException, ClassNotFoundException, TransformationParserException {

        String project = inputConfiguration.getProjectPath();
        String src = inputConfiguration.getSourceCodeDir();
        String prevTransfPath = inputConfiguration.getPreviousTransformationPath();
        String out = inputConfiguration.getResultPath();

        JSONArray diverse = new JSONArray();
        File d = new File(prevTransfPath);
        for (File f : d.listFiles()) {
            try {
                if (f.isDirectory()) {
                    JSONArray array = getArray(new File(f.getAbsolutePath() + "/trans.json"));
                    String position = getObject(new File(f.getAbsolutePath() + "/transplant.json")).getString("Position");
                    for (int i = 0; i < array.length(); i++) {
                        JSONObject t = array.getJSONObject(i);
                        if (t.getJSONObject("transplantationPoint").getString("position").equals(position)) {
                            diverse.put(t);
                        }
                    }
                }
            } catch (JSONException e) {
                System.out.println(f.getAbsoluteFile());
            }
        }

        System.out.println("Diverse amount: " + diverse.length());
        RepeatedTransformationCleaner cleaner = new RepeatedTransformationCleaner();
        diverse = cleaner.clean(diverse);
        System.out.println("Clean amount: " + diverse.length());

        Factory factory = new SpoonMetaFactory().buildNewFactory(project, 7);

        InputProgram inputProgram = new InputProgram();
        inputProgram.setFactory(factory);
        inputProgram.setSourceCodeDir(src);
        inputProgram.setPreviousTransformationsPath(prevTransfPath);
        inputProgram.processCodeFragments();

        TransformationJsonParser parser = new TransformationJsonParser(false, inputProgram);
        List<Transformation> transf = parser.parseArray(diverse);

        JSONArray result = new JSONArray();
        for (Transformation t : transf) {
            result.put(t.toJSONObject());
        }

        FileWriter fw = new FileWriter(out);
        result.write(fw);
        fw.close();

        //Read and test
        JSONArray test = getArray(new File(out));
        inputProgram = new InputProgram();
        inputProgram.setFactory(factory);
        inputProgram.setSourceCodeDir(src);
        inputProgram.setPreviousTransformationsPath(prevTransfPath);
        inputProgram.processCodeFragments();

        parser = new TransformationJsonParser(false, inputProgram);
        transf = parser.parseArray(diverse);

        System.out.println("transf size" + transf.size());

    }

}
