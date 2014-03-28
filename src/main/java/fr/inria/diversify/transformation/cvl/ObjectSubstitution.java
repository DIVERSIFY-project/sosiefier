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
    protected CtElement transplant;

    public ObjectSubstitution() {
        type= "cvl";
        name = "objectSubstitution";
    }

    @Override
    public void addSourceCode() throws Exception {
        if(object instanceof CtPackage || object instanceof CtSimpleType)
            throw new Exception();
        Log.debug("transformation: {}, {}", type, name);
        Log.debug("object ({}):\n {}", object.getClass().getSimpleName(), object);
        Log.debug("\npositiom:{}", object.getPosition());
        Log.debug("transformation: {}, {}", type, name);
        Log.debug("object:\n {}", object);
        Log.debug("\ntransplant:{}", transplant);
        SourcePosition sp = object.getPosition();
        CompilationUnit compileUnit = sp.getCompilationUnit();

        compileUnit.addSourceCodeFragment(new SourceCodeFragment(sp.getSourceStart(),  "/** nodeType: "+object.getClass()+"  \n", 0));
        compileUnit.addSourceCodeFragment(new SourceCodeFragment(sp.getSourceEnd()+1, " **/\n"+
                    transplant.toString(), 0));
//
//        printJavaFile(srcDir);
//        removeSourceCode(object);
    }

    @Override
    public void restore(String srcDir) throws Exception {
        removeSourceCode(object);
        printJavaFile(srcDir);
    }

    public void setTransplant(CtElement e) {
        transplant = e;
    }

    public CtElement getTransplant() {
        return transplant;
    }

    @Override
    public JSONObject toJSONObject() throws JSONException {
        JSONObject json = super.toJSONObject();

        json.put("transplantPosition", transplant.getParent(CtPackage.class).getQualifiedName()
                + "." + transplant.getParent(CtSimpleType.class).getSimpleName() + ":" + transplant.getPosition().getLine());

        CodeFragmentEqualPrinter pp = new CodeFragmentEqualPrinter(transplant.getFactory().getEnvironment());
        transplant.accept(pp);
//        json.put("transplant", pp.toString());

        return json;
    }

    public boolean equals(Object other) {
        if(other == null)
            return false;
        if(!this.getClass().isAssignableFrom(other.getClass()))
            return  false;

        ObjectSubstitution o = (ObjectSubstitution)other;

        try {
        return stmtType().equals(o.stmtType())
                && object.getSignature().equals(o.object.getSignature())
                && transplant.getSignature().equals(o.transplant.getSignature());
        } catch (Exception e) {}
        return false;
    }
}
