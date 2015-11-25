package fr.inria.diversify.persistence.json.input;

import fr.inria.diversify.runner.InputProgram;
import fr.inria.diversify.persistence.PersistenceException;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.typeTransformation.InstanceTransformation;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import spoon.reflect.code.CtConstructorCall;

import java.util.Map;
import java.util.UUID;

import static fr.inria.diversify.persistence.json.output.JsonSectionOutput.POSITION;
import static fr.inria.diversify.persistence.json.output.JsonSectionOutput.SOURCE_CODE;

/**
 * User: Simon
 * Date: 19/11/15
 * Time: 10:36
 */
public class NewInstanceTransformationInput extends JsonTransformationInput {
    public static String NEW_CONSTRUCTORS = "newConstructors";
    public static String NEW_INSTANCE = "newInstance";
    public static String PARAMETER_TYPES = "parameterTypes";

    public NewInstanceTransformationInput(InputProgram inputProgram, JSONObject jsonObject) {
        super(inputProgram, jsonObject);
    }

    public NewInstanceTransformationInput(InputProgram inputProgram) {
        super(inputProgram);
    }

    @Override
    protected Transformation build() {
        return new InstanceTransformation();
    }

    @Override
    public void read(Map<UUID, Transformation> transformations) {
        try {
            InstanceTransformation transf = (InstanceTransformation)get(transformations); //add the transformation to the transformations map if not present

            JSONArray array = getJsonObject().getJSONArray(NEW_CONSTRUCTORS);
            for(int i = 0; i < array.length(); i++ ) {
                JSONObject cfJson = array.getJSONObject(i);
                CtConstructorCall cf = getInputProgram().findElement(CtConstructorCall.class, cfJson.getString(POSITION), cfJson.getString(SOURCE_CODE));

                Class cl = findClass(cfJson.getString(NEW_INSTANCE));

                JSONArray paramStrings = cfJson.getJSONArray(PARAMETER_TYPES);
                Class[] paramTypes = new Class[paramStrings.length()];
                for(int j = 0; j < paramStrings.length(); j++) {
                    paramTypes[j] = findClass(paramStrings.getString(j));
                }
                try {
                    transf.add(cf,cl.getConstructor(paramTypes));
                } catch (NoSuchMethodException e) {
                    throw new PersistenceException(e);
                }
            }

            addTransformation(transformations, transf);
        } catch (JSONException e) {
            throw new PersistenceException("Unable to parse delete transformation", e);
        }
    }

    protected Class findClass(String className) throws JSONException {
        try {
            return Class.forName(className);
        } catch (ClassNotFoundException e) {
            throw new JSONException(e);
        }
    }

    @Override
    public boolean canRead(String s) {
        return s.equals("replaceNew.replaceNew");
    }
}
