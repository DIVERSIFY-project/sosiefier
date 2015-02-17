package fr.inria.diversify.ut.ast;

import fr.inria.diversify.transformation.ast.ASTAdd;
import fr.inria.diversify.transformation.ast.ASTDelete;
import fr.inria.diversify.transformation.ast.ASTReplace;
import org.junit.Test;

import static org.junit.Assert.assertNotEquals;

/**
 * Created by marodrig on 17/02/2015.
 */
public class ASTTransformation {

    /**
     * Test that every transformation is given an unique UUID
     */
    @Test
    public void testUniqueId() {
        ASTAdd a = new ASTAdd();
        ASTReplace r = new ASTReplace();
        ASTDelete d = new ASTDelete();
        assertNotEquals(a.getIndex(), r.getIndex());
        assertNotEquals(a.getIndex(), d.getIndex());
        assertNotEquals(r.getIndex(), d.getIndex());
    }

}
