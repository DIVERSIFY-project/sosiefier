package fr.inria.diversify.transformation.other;

import fr.inria.diversify.transformation.ast.ASTAdd;
import fr.inria.diversify.transformation.ast.ASTReplace;

/**
 * Created by Simon on 04/02/15.
 */
public class ShuffleCollectionBeforeReturn extends ASTReplace {

    public ShuffleCollectionBeforeReturn() {
        name = "shuffleCollectionBeforeReturn";
        type = "other";
    }
}
