package fr.inria.diversify.util;

import fr.inria.diversify.codeFragment.CodeFragmentList;
import javassist.CtMethod;
import spoon.reflect.code.CtLocalVariable;
import spoon.reflect.code.CtReturn;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.factory.Factory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * User: Simon
 * Date: 20/02/14
 * Time: 13:26
 */
public class DiversifyEnvironment {
    protected static Map<Class, List<CtElement>> typeToObject = new HashMap<Class, List<CtElement>>();
    protected static CodeFragmentList codeFragments;
    protected static List<CtReturn> returns;
    protected static List<CtLocalVariable> inlineConstant;
    protected static List<CtMethod> javassistMethods;
    protected static Set<CtElement> roots;
    protected static Factory factory;




    public static void setFactory(Factory factory) {
        DiversifyEnvironment.factory = factory;
    }
}
