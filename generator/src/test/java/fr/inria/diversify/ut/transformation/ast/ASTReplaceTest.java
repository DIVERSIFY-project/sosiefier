package fr.inria.diversify.ut.transformation.ast;

import fr.inria.diversify.codeFragmentProcessor.AllStatementsProcessor;
import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.factories.SpoonMetaFactory;
import fr.inria.diversify.transformation.ast.ASTAdd;
import fr.inria.diversify.transformation.ast.ASTReplace;
import fr.inria.diversify.transformation.ast.exception.BuildTransplantException;
import org.junit.Test;
import spoon.reflect.code.CtBlock;
import spoon.reflect.code.CtCodeElement;
import spoon.reflect.code.CtIf;
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
     * @throws Exception
     */
    @Test
    public void testTransformation() throws Exception {
        Factory f = new SpoonMetaFactory().buildNewFactory("src\\test\\java\\fr\\inria\\diversify\\ut\\samples", 7);
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
