package fr.inria.diversify.transformation.cvl;

import spoon.reflect.cu.CompilationUnit;
import spoon.reflect.cu.SourceCodeFragment;
import spoon.reflect.cu.SourcePosition;
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

        logInfo();
        SourcePosition sp = transformationPoint.getPosition();
        CompilationUnit compileUnit = sp.getCompilationUnit();

        compileUnit.addSourceCodeFragment(new SourceCodeFragment(sp.getSourceStart(),  "/** nodeType: "+transformationPoint.getClass()+"  \n", 0));
        compileUnit.addSourceCodeFragment(new SourceCodeFragment(sp.getSourceEnd()+1, " **/\n"+
                    transplant.toString(), 0));
    }


    public boolean equals(Object other) {
        if(other == null)
            return false;
        if(!this.getClass().isAssignableFrom(other.getClass()))
            return  false;

        ObjectSubstitution o = (ObjectSubstitution)other;

        try {
        return transformationPoint.getSignature().equals(o.transformationPoint.getSignature())
                && transplant.getSignature().equals(o.transplant.getSignature());
        } catch (Exception e) {}
        return false;
    }
}
