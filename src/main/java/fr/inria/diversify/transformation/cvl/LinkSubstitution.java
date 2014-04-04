package fr.inria.diversify.transformation.cvl;

import fr.inria.diversify.codeFragment.CodeFragmentEqualPrinter;
import fr.inria.diversify.util.Log;
import org.json.JSONException;
import org.json.JSONObject;
import spoon.reflect.cu.CompilationUnit;
import spoon.reflect.cu.SourceCodeFragment;
import spoon.reflect.cu.SourcePosition;
import spoon.reflect.declaration.*;
import spoon.reflect.factory.Factory;
import spoon.reflect.reference.CtTypeReference;

/**
 * User: Simon
 * Date: 25/02/14
 * Time: 15:09
 */
public class LinkSubstitution extends CVLTransformation {
    protected CtTypeReference classOrInterfaceSubstitution;
    public LinkSubstitution() {
        type= "cvl";
        name = "linkSubstitution";
    }

    @Override
    public void addSourceCode() throws Exception {
        logInfo();

        SourcePosition sp = transformationPoint.getPosition();
        CompilationUnit compileUnit = sp.getCompilationUnit();

        if (transformationPoint instanceof CtField) {
            compileUnit.addSourceCodeFragment(new SourceCodeFragment(compileUnit.beginOfLineIndex(sp.getSourceStart()),  "/** nodeType: "+transformationPoint.getClass()+"  \n", 0));
            compileUnit.addSourceCodeFragment(new SourceCodeFragment(compileUnit.nextLineIndex(sp.getSourceEnd()), " **/\n"+
                    transplant.toString(), 0));
        }
        if(transformationPoint instanceof CtSimpleType) {
            Factory factory = transformationPoint.getFactory();
            CtClass classClone = factory.Core().clone((CtClass)transformationPoint);
            CtTypeReference<?> newRef = ((CtSimpleType)transplant).getReference();
            String ollRefName = classOrInterfaceSubstitution.getSimpleName();

            if(classClone.getSuperclass() != null && classClone.getSuperclass().getSimpleName().equals(ollRefName))
                classClone.setSuperclass(newRef);
            else {
                CtTypeReference<?> ref = null;
               for(Object e : classClone.getSuperInterfaces()) {
                   ref = (CtTypeReference<?>)e;
                   if(ref.getSimpleName().equals(ollRefName))
                       break;
               }
                classClone.removeSuperInterface(ref);
                classClone.addSuperInterface(newRef);
            }

            int beginLine = -1;
            for(int i = 0; i < compileUnit.getOriginalSourceCode().length()-1; i++) {
                if(compileUnit.beginOfLineIndex(i) != beginLine) {
                    beginLine = compileUnit.beginOfLineIndex(i);
                    if(!isPackage(i, compileUnit.getOriginalSourceCode()))
                        compileUnit.addSourceCodeFragment(new SourceCodeFragment(beginLine,  "// ", 0));
                }

            }
            compileUnit.addSourceCodeFragment(new SourceCodeFragment(compileUnit.beginOfLineIndex(compileUnit.getOriginalSourceCode().length()-1), "\n"+
                    classClone.toString(), 0));
        }
    }

    private boolean isPackage(int i, String originalSourceCode) {
        int max = Math.min(originalSourceCode.length() - 1, i + 10);
        return originalSourceCode.substring(i, max).contains("package");
    }


    public void setTransplant(CtElement e) {
        transplant = e;
    }

    public CtElement getTransplant() {
        return transplant;
    }

    public void setClassOrInterfaceSubstitution(CtTypeReference classOrInterfaceSubstitution) {
        this.classOrInterfaceSubstitution = classOrInterfaceSubstitution;
    }

    @Override
    public JSONObject toJSONObject() throws JSONException {
        JSONObject json = super.toJSONObject();

        if(classOrInterfaceSubstitution != null)
            json.put("classOrInterfaceExistence",classOrInterfaceSubstitution.getPackage()+"."+classOrInterfaceSubstitution.getSimpleName());

        return json;
    }

    public boolean equals(Object other) {
        if(other == null)
            return false;
        if(!this.getClass().isAssignableFrom(other.getClass()))
            return  false;

        LinkSubstitution o = (LinkSubstitution)other;

        try {
        return stmtType().equals(o.stmtType())
                && transformationPoint.equals(o.transformationPoint)
                && transplant.equals(o.transplant)
                && ((classOrInterfaceSubstitution == null && o.classOrInterfaceSubstitution == null)
                || classOrInterfaceSubstitution.equals(o.classOrInterfaceSubstitution));
        } catch (Exception e) {}
        return false;
    }
}
