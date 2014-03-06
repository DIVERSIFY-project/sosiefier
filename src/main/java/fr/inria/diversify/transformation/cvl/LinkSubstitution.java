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
    protected CtElement transplant;
    protected CtTypeReference classOrInterfaceSubstitution;
    public LinkSubstitution() {
        type= "cvl";
        name = "linkSubstitution";
    }

    @Override
    public void apply(String srcDir) throws Exception {
        Log.debug("transformation: {}, {}", type, name);
        Log.debug("object ({}):\n {}", object.getClass().getSimpleName(), object);
        Log.debug("\npositiom:{}", object.getPosition());

        SourcePosition sp = object.getPosition();
        CompilationUnit compileUnit = sp.getCompilationUnit();

        if (object instanceof CtField) {
            compileUnit.addSourceCodeFragment(new SourceCodeFragment(compileUnit.beginOfLineIndex(sp.getSourceStart()),  "/** ", 0));
            compileUnit.addSourceCodeFragment(new SourceCodeFragment(compileUnit.nextLineIndex(sp.getSourceEnd()), " **/\n"+
                    transplant.toString(), 0));
        }
        if(object instanceof CtSimpleType) {
            Factory factory = object.getFactory();
            CtClass classClone = factory.Core().clone((CtClass)object);
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

        printJavaFile(srcDir);
        removeSourceCode(object);
    }

    private boolean isPackage(int i, String originalSourceCode) {
        int max = Math.min(originalSourceCode.length() - 1, i + 10);
        return originalSourceCode.substring(i, max).contains("package");
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

    public void setClassOrInterfaceSubstitution(CtTypeReference classOrInterfaceSubstitution) {
        this.classOrInterfaceSubstitution = classOrInterfaceSubstitution;
    }

    @Override
    public JSONObject toJSONObject() throws JSONException {
        JSONObject json = super.toJSONObject();

        json.put("transplantPosition", transplant.getParent(CtPackage.class).getQualifiedName()
                + "." + transplant.getPosition().getCompilationUnit().getMainType().getSimpleName() + ":" + transplant.getPosition().getLine());

        CodeFragmentEqualPrinter pp = new CodeFragmentEqualPrinter(transplant.getFactory().getEnvironment());
        transplant.accept(pp);
        json.put("transplant", pp.toString());

        if(classOrInterfaceSubstitution != null)
            json.put("classOrInterfaceExistence",classOrInterfaceSubstitution.getPackage()+"."+classOrInterfaceSubstitution.getSimpleName());

        return json;
    }
}