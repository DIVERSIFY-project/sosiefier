package fr.inria.diversify.transformation.query;

import fr.inria.diversify.codeFragment.CodeFragment;
import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.transformation.CheckReturnTransformation;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.util.Log;
import spoon.SpoonException;
import spoon.reflect.code.CtAssignment;
import spoon.reflect.code.CtCodeElement;
import spoon.reflect.code.CtNewClass;
import spoon.reflect.declaration.CtClass;
import spoon.reflect.declaration.CtVariable;
import spoon.reflect.reference.CtTypeReference;
import spoon.support.reflect.code.CtAssignmentImpl;

import javax.sql.rowset.serial.SerialRef;
import java.lang.reflect.Field;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by aelie on 03/02/15.
 */
public class SubClassReplaceQuery extends TransformationQuery  {
    protected List<CtNewClass> instantiations;


    public SubClassReplaceQuery(InputProgram inputProgram) {
        super(inputProgram);
        initFindInstantiationStatements();
    }

    protected void initFindInstantiationStatements() {
        instantiations = getInputProgram().getAllElement(CtNewClass.class).stream()
                                           .map(operator -> (CtNewClass)operator)
                                           .collect(Collectors.toList());
    }

    protected boolean isDeclaration(CtCodeElement codeElement) {
        if (codeElement instanceof CtVariable) {
            return true;
        }
        return false;
    }

    protected boolean isInstantiation(CtCodeElement codeElement) {
        if (codeElement instanceof CtAssignmentImpl) {
            if (((CtAssignmentImpl) codeElement).getAssignment() instanceof CtNewClass) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Transformation query() throws QueryException {
        Transformation result = null;
        Random random = new Random();
        CtAssignment transplant = null;
        CtNewClass transplantationPoint = instantiations.get(random.nextInt(instantiations.size()));
        try {
            Set<Class> subClasses = getAllSubClass(getTypeOf(transplantationPoint));
        } catch (Exception e) {
            e.printStackTrace();
        }


        return result;
    }


    protected Class getTypeOf(CtNewClass newClass) {
        return  newClass.getType().getActualClass();
    }

    protected List<Class> getAllClasses() throws NoSuchFieldException, IllegalAccessException {
        return getAllClasses(Thread.currentThread().getContextClassLoader());
    }

    protected List<Class> getAllClasses(ClassLoader classLoader) throws NoSuchFieldException, IllegalAccessException {
        Field f = ClassLoader.class.getDeclaredField("classes");
        f.setAccessible(true);
        List<Class> classes = new LinkedList<>();

        if(classLoader.getParent() != null) {
            classes.addAll(getAllClasses(classLoader.getParent()));
        }
        classes.addAll((Vector<Class>) f.get(Thread.currentThread().getContextClassLoader()));

        return classes;
    }

    protected Set<Class> getAllSubClass(Class superClass) throws NoSuchFieldException, IllegalAccessException {

        return getAllClasses().stream()
                .filter(cl -> isSubClass(cl, superClass))
                .collect(Collectors.toSet());
    }

    protected boolean isSubClass(Class subClass, Class superClass) {
        if(!subClass.equals(Object.class)) {
            return false;
        }
        if(subClass.getSuperclass().equals(superClass)) {
            return true;
        }

        for(Class inter : subClass.getInterfaces()) {
            if(inter.equals(superClass)) {
                return true;
            }
        }
        return isSubClass(subClass.getSuperclass(), superClass);
    }
}
