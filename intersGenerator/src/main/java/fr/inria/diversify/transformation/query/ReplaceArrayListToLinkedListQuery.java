package fr.inria.diversify.transformation.query;

import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.transformation.ReplaceArrayListToLinkedListTransformation;
import fr.inria.diversify.transformation.Transformation;
import org.reflections.Reflections;
import spoon.reflect.code.CtAssignment;
import spoon.reflect.code.CtConstructorCall;
import spoon.reflect.code.CtExpression;
import spoon.reflect.code.CtReturn;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.factory.Factory;
import spoon.reflect.reference.CtExecutableReference;
import spoon.reflect.reference.CtTypeReference;
import spoon.support.reflect.code.CtInvocationImpl;
import spoon.support.reflect.code.CtLocalVariableImpl;

import java.lang.reflect.Constructor;
import java.util.*;

/**
 * Created by lguerin on 04/06/15.
 */
public class ReplaceArrayListToLinkedListQuery extends TransformationQuery{

    public ReplaceArrayListToLinkedListQuery(InputProgram inputProgram) {
        super(inputProgram);
    }

    @Override
    public Transformation query() throws QueryException {
        ReplaceArrayListToLinkedListTransformation transformation=new ReplaceArrayListToLinkedListTransformation();

        List<CtElement> newClasses = getInputProgram().getAllElement(CtConstructorCall.class);

        List<CtConstructorCall> candidates=new ArrayList<>();

        for(int i=0;i<newClasses.size();i++){
            if(isCandidate((CtConstructorCall)newClasses.get(i))){
                CtConstructorCall ctConstructorCall=(CtConstructorCall)newClasses.get(i);
                candidates.add(ctConstructorCall);
            }
        }
        CtConstructorCall newCtConstructorCall;

        for(int i=0;i<candidates.size();i++){
            newCtConstructorCall=constructCtConstructorCall(candidates.get(i));
            transformation.addTransplantationPoint(candidates.get(i), newCtConstructorCall);
        }

        return transformation;
    }

    private boolean isCandidate(CtConstructorCall ctConstructorCall) {
        CtElement parent=ctConstructorCall.getParent();

        Class staticType=null;

        try{
            //
            ctConstructorCall.getType().getActualClass();
            //

            if(parent instanceof CtLocalVariableImpl) {

                staticType= ((CtLocalVariableImpl) parent).getType().getActualClass();
            }else if(parent instanceof CtAssignment){
                staticType= ((CtAssignment) parent).getType().getActualClass();
            }else if(parent instanceof spoon.reflect.declaration.CtField){

                staticType= ((spoon.reflect.declaration.CtField) parent).getType().getActualClass();
            }else if(parent instanceof CtInvocationImpl){
                parent=(CtInvocationImpl) parent;
                List<CtExpression> argumentsInvocation=((CtInvocationImpl) parent).getArguments();
                CtExecutableReference executable=((CtInvocationImpl) parent).getExecutable();
                List<CtTypeReference> argumentsExecutable=executable.getParameters();

                for(int i=0; i<argumentsInvocation.size();i++){
                    if(argumentsInvocation.get(i).equals(ctConstructorCall)){

                        staticType=argumentsExecutable.get(i).getActualClass();
                    }
                }
            }else if(parent instanceof CtReturn){

                while (! (parent instanceof CtMethod) ){parent=parent.getParent();}

                staticType=((CtMethod) parent).getType().getActualClass();

            }
        }catch(Exception e){
            return false;
        }

        return (staticType!=null && staticType.getSimpleName().equals("List") && ctConstructorCall.getType().getActualClass().getSimpleName().equals("ArrayList"));

    }

    /**
     * this function construct an ctConstructorCall which can replace the ctConstructor
     * @param ctConstructorCall
     * @return CtConstructorCall
     */
    private CtConstructorCall constructCtConstructorCall(CtConstructorCall ctConstructorCall) {

        Factory factory=ctConstructorCall.getFactory();
        CtConstructorCall newConstructorCall=factory.Core().createConstructorCall();

        List<CtExpression<?>> arguments=ctConstructorCall.getArguments();

        Class linkedList=LinkedList.class;
        newConstructorCall.setType(factory.Type().createReference(linkedList));

        if(arguments.size()==0 || !(arguments.get(0).getType().getSimpleName().equals("int"))){
            newConstructorCall.setArguments(arguments);
        }


        return newConstructorCall;
    }


}
