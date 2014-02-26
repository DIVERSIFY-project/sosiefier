package fr.inria.diversify.transformation.cvl;

import fr.inria.diversify.util.Log;
import spoon.reflect.cu.CompilationUnit;
import spoon.reflect.cu.SourceCodeFragment;
import spoon.reflect.cu.SourcePosition;
import spoon.reflect.declaration.CtElement;

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
    public void apply(String srcDir) throws Exception {
        Log.debug("transformation: {}, {}", type, name);
        Log.debug("object ({}):\n {}", element.getClass().getSimpleName(), element);
        Log.debug("\npositiom:{}", element.getPosition());
        Log.debug("transformation: {}, {}", type, name);
        Log.debug("object:\n {}", element);
        Log.debug("\ntransplant:{}", transplant);
        SourcePosition sp = element.getPosition();
        CompilationUnit compileUnit = sp.getCompilationUnit();

        compileUnit.addSourceCodeFragment(new SourceCodeFragment(sp.getSourceStart(),  "/** ", 0));
        compileUnit.addSourceCodeFragment(new SourceCodeFragment(sp.getSourceEnd()+1, " **/\n"+
                    transplant.toString(), 0));

        printJavaFile(srcDir);
        removeSourceCode(element);
    }

    @Override
    public void restore(String srcDir) throws Exception {
        removeSourceCode(element);
        printJavaFile(srcDir);
    }

    public void setTransplant(CtElement e) {
        transplant = e;
    }

    public CtElement getTransplant() {
        return transplant;
    }

}
