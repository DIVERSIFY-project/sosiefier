package fr.inria.diversify.persistence.json.input.special;

import fr.inria.diversify.codeFragment.CodeFragment;
import fr.inria.diversify.persistence.json.input.JsonAstReplaceInput;
import fr.inria.diversify.persistence.json.output.JsonSectionOutput;
import fr.inria.diversify.runner.InputProgram;
import fr.inria.diversify.transformation.AddMethodInvocation;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.util.PrimitiveUtil;
import org.json.JSONException;
import org.json.JSONObject;
import spoon.reflect.code.CtStatement;
import spoon.reflect.code.CtTry;
import spoon.reflect.declaration.CtField;
import spoon.reflect.declaration.CtType;
import spoon.reflect.declaration.ModifierKind;
import spoon.reflect.factory.Factory;
import spoon.reflect.reference.CtTypeReference;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.UUID;

import static fr.inria.diversify.persistence.json.output.JsonSectionOutput.POSITION;
import static fr.inria.diversify.persistence.json.output.JsonSectionOutput.SOURCE_CODE;
import static fr.inria.diversify.persistence.json.output.JsonSectionOutput.STATUS;

/**
 * Created by nharrand on 12/12/16.
 */
public class JsonAddMethodInvocationInput extends JsonAstReplaceInput {

    public JsonAddMethodInvocationInput(InputProgram inputProgram) {
        super(inputProgram);
    }

    @Override
    public void read(Map<UUID, Transformation> transformations) {
        AddMethodInvocation transf = null;
        try {
            transf = (AddMethodInvocation) get(transformations); //add the transformation to the transformations map if not present


            JSONObject cfJson = getJsonObject().getJSONObject(JsonSectionOutput.TRANSPLANT_POINT);
            JSONObject insertJson = getJsonObject().getJSONObject("insert");

            //CodeFragment cf = getCodeFragment(cfJson.getString(POSITION), cfJson.getString(SOURCE_CODE));
            //CtStatement tp = (CtStatement) cf.getCtCodeFragment();


            CtStatement tp = getInputProgram().findElement(
                            Class.forName(cfJson.getString("type")),
                            cfJson.getString(POSITION),
                            cfJson.getString(SOURCE_CODE)
                    );

            if(tp == null) {
                System.out.println(cfJson.toString());
                tp = getInputProgram().findElement(
                        Class.forName(cfJson.getString("type")),
                        cfJson.getString(POSITION),
                        cfJson.getString(SOURCE_CODE)
                );
            }

            Factory f = tp.getFactory();
            transf.setTp(tp);
            transf.setup();



            CtField well = null;
            if(insertJson.getString("createdWell").compareTo("true") == 0) {
                String[] wellstr = insertJson.getString("well").split(" ");
                String wellName, wellType, wellInit;
                if(wellstr[1].compareTo("static") == 0) {
                    wellType = wellstr[2];
                    wellName = wellstr[3];
                    wellInit = wellstr[5];
                    CtTypeReference type = PrimitiveUtil.getTypeReference(wellType, f);
                    well = f.Code().createCtField(wellName, type, wellInit, ModifierKind.PUBLIC, ModifierKind.STATIC);
                } else {
                    wellType = wellstr[1];
                    wellName = wellstr[2];
                    wellInit = wellstr[4];
                    CtTypeReference type = PrimitiveUtil.getTypeReference(wellType, f);
                    well = f.Code().createCtField(wellName, type,wellInit, ModifierKind.PUBLIC);
                }
            }
            transf.setWell(well);
            int status = Integer.parseInt(getJsonObject().getString(STATUS));
            if(status > -3) transf.setStatus(status);

            CtStatement tryInv = f.Code().createCodeSnippetStatement(insertJson.getString("stmt"));
            transf.setTryInv(tryInv);
            transf.setInsertIsStatic(insertJson.getString("static").compareTo("true") == 0);


            addTransformation(transformations, transf);

        } catch (Exception e) {
            String s = "JsonAstReplaceInput::read Unable to parse replace transformation from json object";
            throwError(getTransformationErrorString(transf, s), e, true);
        }
    }


    @Override
    protected Transformation build() {
        return new AddMethodInvocation();
    }

    /**
     * Indicate if can handle a section within the file
     *
     * @param s Section name
     * @return True if can handle
     */
    @Override
    public boolean canRead(String s) {
        String[] r = s.split("\\.");
        if ( r.length != 2 ) return false;
        return  (r[0].equals("add") || r[0].equals("special"))
                && r[1].contains("addMethodInvocation");
    }
}
