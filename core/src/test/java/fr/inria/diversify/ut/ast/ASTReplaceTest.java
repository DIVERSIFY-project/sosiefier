package fr.inria.diversify.ut.ast;

import fr.inria.diversify.codeFragmentProcessor.AllStatementsProcessor;
import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.factories.SpoonMetaFactory;
import fr.inria.diversify.transformation.ast.ASTReplace;
import fr.inria.diversify.transformation.ast.exception.BuildTransplantException;
import fr.inria.diversify.ut.SpoonMetaFactoryTest;
import org.junit.Test;
import spoon.reflect.code.CtCodeElement;
import spoon.reflect.factory.Factory;

import static org.junit.Assert.assertEquals;

/**
 * Created by marodrig on 20/01/2015.
 */
public class ASTReplaceTest {

    public class ASTReplaceForTest extends ASTReplace {
        public CtCodeElement buildReplacement() throws BuildTransplantException {
            return buildReplacementElement();
        }
    }

    /**
     * Test the transformation of the AST. Test that after the transformation, the TP is AFTER the transplant
     */
    @Test
    public void testTransformation() throws BuildTransplantException {
        Factory f = new SpoonMetaFactoryTest().build();
        InputProgram p = new InputProgram();
        p.setFactory(f);
        p.setCodeFragmentProcessor(new AllStatementsProcessor());
        p.processCodeFragments();

        //Test that the replacement was properly built
        ASTReplaceForTest a = new ASTReplaceForTest();
        a.setTransplantationPoint(p.getCodeFragments().get(0));
        a.setTransplant(p.getCodeFragments().get(1));
        assertEquals(p.getCodeFragments().get(1).getCtCodeFragment(), a.buildReplacement());
    }
}
