package fr.inria.diversify.transformation;

import spoon.reflect.code.CtIf;
import spoon.reflect.code.CtStatementList;

/**
 * User: Simon
 * Date: 27/05/16
 * Time: 10:53
 */
public class RemoveParameterCondition extends SpoonTransformation<CtIf, CtIf> {

    public RemoveParameterCondition() {
        type = "special";
        name = "removeParameterCondition";
    }
}
