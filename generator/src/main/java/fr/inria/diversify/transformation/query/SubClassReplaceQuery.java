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
    protected List<Class> allClasses;


    public SubClassReplaceQuery(InputProgram inputProgram) {
        super(inputProgram);
        initFindInstantiationStatements();
    }

    protected void initFindInstantiationStatements() {
        try {
            getAllSubClass(Map.class);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        instantiations = getInputProgram().getAllElement(CtNewClass.class).stream()
                                           .map(operator -> (CtNewClass) operator)
                                            .filter(newClass -> {
                                                try {
                                                    return getAllSubClass(getTypeOf(newClass)).size() > 1;
                                                } catch (Exception e) {
                                                    return false;
                                                }
                                            }).collect(Collectors.toList());
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
//        CtAssignment transplant = null;
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
        if(allClasses == null) {
            allClasses = getAllClasses(Thread.currentThread().getContextClassLoader());
        }
        return allClasses;
    }

    protected List<Class> getAllClasses(ClassLoader classLoader) throws NoSuchFieldException, IllegalAccessException {
        Field f = ClassLoader.class.getDeclaredField("classes");
        f.setAccessible(true);
        List<Class> classes = new LinkedList<>();

        if(classLoader.getParent() != null) {
            classes.addAll(getAllClasses(classLoader.getParent()));
        }
        classes.addAll((Vector<Class>) f.get(classLoader));
        return classes;
    }

    protected Set<Class> getAllSubClass(Class superClass) throws NoSuchFieldException, IllegalAccessException {

        for(Class cl : getAllClasses()) {
            try {
                isSubClass(cl, superClass);
            } catch ( Exception e) {
                e.printStackTrace();
                Log.debug("");
            }
        }

        return getAllClasses().stream()
                .filter(cl -> isSubClass(cl, superClass))
                .collect(Collectors.toSet());
    }

    protected boolean isSubClass(Class subClass, Class superClass) {
        if(subClass.equals(Object.class)) {
            return false;
        }
        for(Class inter : subClass.getInterfaces()) {
            if(inter.equals(superClass)) {
                return true;
            }
        }
        if(subClass.isInterface()) {
            return false;
        } else {
            if(subClass.getSuperclass().equals(superClass)) {
                return true;
            }
            return isSubClass(subClass.getSuperclass(), superClass);
        }
    }
}
