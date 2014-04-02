package fr.inria.diversify.transformation.cvl;

import fr.inria.diversify.codeFragment.CodeFragmentEqualPrinter;
import fr.inria.diversify.util.Log;
import org.json.JSONException;
import org.json.JSONObject;
import spoon.reflect.cu.CompilationUnit;
import spoon.reflect.cu.SourceCodeFragment;
import spoon.reflect.cu.SourcePosition;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtPackage;
import spoon.reflect.declaration.CtSimpleType;

/**
 * User: Simon
 * Date: 25/02/14
 * Time: 15:08
 */
public class ObjectSubstitution extends CVLTransformation {

    public ObjectSubstitution() {
        type= "cvl";
        name = "objectSubstitution";
    }

    @Override
    public void addSourceCode() throws Exception {
        if(transformationPoint instanceof CtPackage || transformationPoint instanceof CtSimpleType)
            throw new Exception();
        Log.debug("transformation: {}, {}", type, name);
        Log.debug("object ({}):\n {}", transformationPoint.getClass().getSimpleName(), transformationPoint);
        Log.debug("\npositiom:{}", transformationPoint.getPosition());
        Log.debug("transformation: {}, {}", type, name);
        Log.debug("object:\n {}", transformationPoint);
        Log.debug("\ntransplant:{}", transplant);
        SourcePosition sp = transformationPoint.getPosition();
        CompilationUnit compileUnit = sp.getCompilationUnit();

        compileUnit.addSourceCodeFragment(new SourceCodeFragment(sp.getSourceStart(),  "/** nodeType: "+transformationPoint.getClass()+"  \n", 0));
        compileUnit.addSourceCodeFragment(new SourceCodeFragment(sp.getSourceEnd()+1, " **/\n"+
                    transplant.toString(), 0));
    }

//    @Override
//    public JSONObject toJSONObject() throws JSONException {
//        JSONObject json = super.toJSONObject();
//
//        json.put("transplantPosition", transplant.getParent(CtPackage.class).getQualifiedName()
//                + "." + transplant.getParent(CtSimpleType.class).getSimpleName() + ":" + transplant.getPosition().getLine());
//
//        CodeFragmentEqualPrinter pp = new CodeFragmentEqualPrinter(transplant.getFactory().getEnvironment());
//        transplant.accept(pp);
////        json.put("transplant", pp.toString());
//
//        return json;
//    }

    public boolean equals(Object other) {
        if(other == null)
            return false;
        if(!this.getClass().isAssignableFrom(other.getClass()))
            return  false;

        ObjectSubstitution o = (ObjectSubstitution)other;

        try {
        return stmtType().equals(o.stmtType())
                && transformationPoint.getSignature().equals(o.transformationPoint.getSignature())
                && transplant.getSignature().equals(o.transplant.getSignature());
        } catch (Exception e) {}
        return false;
    }
}
