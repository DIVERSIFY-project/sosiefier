package fr.inria.diversify.transformation.query;

import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.util.Log;
import org.reflections.Reflections;
import spoon.reflect.code.*;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.declaration.CtVariable;
import spoon.support.reflect.code.CtAssignmentImpl;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by aelie on 03/02/15.
 */
public class SubClassReplaceQuery extends TransformationQuery  {
    protected Map<CtNewClass,Class> instantiations;
    //protected List<Class> allClasses;
    Reflections reflections;


    public SubClassReplaceQuery(InputProgram inputProgram) {
        super(inputProgram);
        reflections = new Reflections(".*");
        initFindInstantiationStatements();
    }

    protected void initFindInstantiationStatements() {
        List<CtNewClass> newClasses = getInputProgram()
                .getAllElement(CtNewClass.class).stream()
                .map(operator -> (CtNewClass) operator)
                .collect(Collectors.toList());

        instantiations = new HashMap<>();

        for(CtNewClass newCl : newClasses) {
            try {
                Class staticType = null;
                CtElement parent = newCl.getParent();
                if (parent instanceof CtVariable) {
                    CtVariable var = (CtVariable) parent;
                    staticType = var.getType().getActualClass();
                }
                if (parent instanceof CtThrow) {

                }
                if (parent instanceof CtInvocation) {
                    CtInvocation invocation = (CtInvocation) parent;
                    if(!invocation.getTarget().equals(newCl)) {
                        int position = invocation.getArguments().indexOf(newCl);
                        Method mth = invocation.getExecutable().getActualMethod();
                        staticType = mth.getParameterTypes()[position];
                    }
                }
                if (parent instanceof CtNewClass) {
                    CtNewClass newClass = (CtNewClass) parent;
                    int position = newClass.getArguments().indexOf(newCl);
                    Constructor constructor = newClass.getExecutable().getActualConstructor();
                    staticType = constructor.getParameterTypes()[position];
                }
                if (parent instanceof CtReturn) {
                    CtMethod mth = parent.getParent(CtMethod.class);
                    staticType = mth.getType().getActualClass();
                }
                if (parent instanceof CtAssignment) {
                    CtAssignment assignment = (CtAssignment) parent;
                    staticType = assignment.getAssigned().getType().getActualClass();
                }
                if (parent instanceof CtConditional) {

                }
                if(staticType != null) {
                    instantiations.put(newCl, staticType);
                }

            } catch (Exception e) {
                Log.debug("");
            }
        }


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
//        Random random = new Random();
////        CtAssignment transplant = null;
//        CtNewClass transplantationPoint = instantiations.get(random.nextInt(instantiations.size()));
//        try {
//            Set<Class> subClasses = getAllSubClass(getTypeOf(transplantationPoint));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }


        return result;
    }


    protected Class getTypeOf(CtNewClass newClass) {
        return  newClass.getType().getActualClass();
    }

//    protected List<Class> getAllClasses() throws NoSuchFieldException, IllegalAccessException {
//
//        if(allClasses == null) {
//            allClasses = getAllClasses(Thread.currentThread().getContextClassLoader());
//        }
//        return allClasses;
//    }
//
//    protected List<Class> getAllClasses(ClassLoader classLoader) throws NoSuchFieldException, IllegalAccessException {
//        Field f = ClassLoader.class.getDeclaredField("classes");
//        f.setAccessible(true);
//        List<Class> classes = new LinkedList<>();
//
//        if(classLoader.getParent() != null) {
//            classes.addAll(getAllClasses(classLoader.getParent()));
//        }
//        classes.addAll((Vector<Class>) f.get(classLoader));
//        return classes;
//    }
//
//    protected Set<Class> getAllSubClass(Class superClass) throws NoSuchFieldException, IllegalAccessException {
//
//        for(Class cl : getAllClasses()) {
//            try {
//                isSubClass(cl, superClass);
//            } catch ( Exception e) {
//                e.printStackTrace();
//                Log.debug("");
//            }
//        }
//
//        return getAllClasses().stream()
//                .filter(cl -> isSubClass(cl, superClass))
//                .collect(Collectors.toSet());
//    }
//
//    protected boolean isSubClass(Class subClass, Class superClass) {
//        if(subClass.equals(Object.class)) {
//            return false;
//        }
//        for(Class inter : subClass.getInterfaces()) {
//            if(inter.equals(superClass)) {
//                return true;
//            }
//        }
//        if(subClass.isInterface()) {
//            return false;
//        } else {
//            if(subClass.getSuperclass().equals(superClass)) {
//                return true;
//            }
//            return isSubClass(subClass.getSuperclass(), superClass);
//        }
//    }
}
