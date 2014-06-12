package fr.inria.diversify.util;

import fr.inria.diversify.codeFragment.CodeFragmentList;
import fr.inria.diversify.codeFragmentProcessor.InlineConstantProcessor;
import fr.inria.diversify.codeFragmentProcessor.ReturnProcessor;
import fr.inria.diversify.codeFragmentProcessor.StatementProcessor;
import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtMethod;
import javassist.NotFoundException;
import spoon.processing.AbstractProcessor;
import spoon.processing.ProcessingManager;
import spoon.reflect.code.CtLocalVariable;
import spoon.reflect.code.CtReturn;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtPackage;
import spoon.reflect.declaration.CtSimpleType;
import spoon.reflect.factory.Factory;
import spoon.reflect.visitor.QueryVisitor;
import spoon.reflect.visitor.filter.TypeFilter;
import spoon.support.QueueProcessingManager;

import java.util.*;
import java.util.stream.Collectors;

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
