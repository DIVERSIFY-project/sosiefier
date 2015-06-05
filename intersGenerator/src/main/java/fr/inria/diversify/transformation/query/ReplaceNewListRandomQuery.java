package fr.inria.diversify.transformation.query;

import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.transformation.ReplaceNewListTransformation;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.logger.LogWriter;
import fr.inria.diversify.util.Log;
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
import java.io.PrintWriter;
import java.lang.reflect.Constructor;
import java.util.*;

/**
 * Created by lguerin on 02/06/15.
 */
public class ReplaceNewListRandomQuery extends TransformationQuery {

    private PrintWriter fileWriter;

    private HashMap<String,Integer> classes=new HashMap<String,Integer>();
    private HashMap<String,Integer> constructors=new HashMap<String,Integer>();

    public ReplaceNewListRandomQuery(InputProgram inputProgram) {
        super(inputProgram);
    }

    /**this function collect all CtConstructorCall with the static type List.
     * Choose a candidate randomly and search an other constructor which can replace this candidate.
     * It create an new CtConstructorCall with the new constructor and create the corresponding transformation.
     * @return Transformation
     * @throws QueryException
     */
    @Override
    public Transformation query() throws QueryException {
        Reflections reflections=new Reflections("org.apache.commons.collections4.map.LinkedMap.linkedMapList");


        ReplaceNewListTransformation transformation = new ReplaceNewListTransformation();
        List<CtElement> newClasses = getInputProgram().getAllElement(CtConstructorCall.class);

        List<CtConstructorCall> candidates=new ArrayList<>();

        for(int i=0;i<newClasses.size();i++){
            if(isCandidate((CtConstructorCall)newClasses.get(i))){
                CtConstructorCall ctConstructorCall=(CtConstructorCall)newClasses.get(i);
                candidates.add(ctConstructorCall);
                analyzeConstructor(ctConstructorCall);
            }
        }

        if(!candidates.isEmpty()){
            Random r=new Random();
            int random = (int)(Math.random() * candidates.size());
            transformation.setTransplantationPoint((CtConstructorCall)candidates.get(random));
            CtConstructorCall newCtConstructorCall= constructCtConstructorCall((CtConstructorCall) candidates.get(random));
            transformation.setTransplant(newCtConstructorCall);
            printResult(candidates.size());

            return transformation;
        }

        return null;
    }

    /**
     * Check if the ctConstructorCall have the static type List.
     * Return true if this ctConstructorCall can be a candidate for this transformation
     * @param ctConstructorCall
     * @return boolean
     */
    private boolean isCandidate(CtConstructorCall ctConstructorCall) {
        CtElement parent=ctConstructorCall.getParent();

        Class staticType=null;

        try{
            ctConstructorCall.getType().getActualClass();
        }catch (Exception e){
            Log.debug("The class can't be load");
        }


        try{
            if(parent instanceof CtLocalVariableImpl ) {

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

        return (staticType!=null && staticType.getSimpleName().equals("List"));
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
        Class typeArgs[]=new Class[arguments.size()];
        for(int i=0;i<arguments.size();i++){typeArgs[i]=arguments.get(i).getType().getActualClass();}

        List<Constructor> potentialsConstructors= getPotentialsConstructors(getSubTypeOfJavaUtilList());

        Constructor selectedConstructor=selectConstructor(potentialsConstructors, typeArgs,ctConstructorCall);

        if(selectedConstructor!=null){
            Class other=selectedConstructor.getDeclaringClass();

            newConstructorCall.setType(factory.Type().createReference(other));
            newConstructorCall.setArguments(arguments);
        }else{

            newConstructorCall=ctConstructorCall;
        }

        return newConstructorCall;

    }

    /**
     * Choose a constructor in the potentials constructors list which have compatibles parameters with typeArgs.
     * The constructor chosen should be different to the constructor of ctConstructorCall.
     * If there are not a compatible constructor, this function return null.
     * @param potentialsConstructors
     * @param typeArgs
     * @param ctConstructorCall
     * @return Constructor
     */
    private Constructor selectConstructor(List<Constructor> potentialsConstructors, Class[] typeArgs, CtConstructorCall ctConstructorCall) {
        for(int i=0;i<potentialsConstructors.size();i++){
            Class params[]=potentialsConstructors.get(i).getParameterTypes();
            if(compareConstructorsArguments(params,typeArgs) && (!potentialsConstructors.get(i).getName().equals(ctConstructorCall.getType().getActualClass().getName()))){
                return potentialsConstructors.get(i);
            }
        }

        return null;
    }

    /**
     * This function compare the arguments of a constructor and the arguments of a constructorCall
     * for example:
     * compareConstructorsArguments([Collection.class],[ArrayList.class]) return True because an ArrayList can instantiate a Collection.
     * compareConstructorsArguments([ArrayList.class],[integer.class]) return False because an integer can't instantiate an ArrayList.
     * compareConstructorsArguments([Collection.class],[ArrayList.class, Integer.class]) return False because the sizes are different.
     * @param constructorArguments
     * @param constructorCallArguments
     * @return boolean
     */
    private boolean compareConstructorsArguments(Class[] constructorArguments, Class[] constructorCallArguments){
        Reflections reflection=new Reflections(".*");

        if(constructorArguments.length!= constructorCallArguments.length){
            return false;
        }

        for(int i=0;i<constructorArguments.length;i++){
            if( !matchClass(constructorArguments[i], constructorCallArguments[i] )){
                return false;
            }
        }
        return true;
    }

    /**
     * Check if potentialSubType is a subType of potentialSuperType
     * @param potentialSuperType
     * @param potentialSubType
     * @return boolean
     */
    private boolean matchClass(Class potentialSuperType, Class potentialSubType){
        if(potentialSubType==null){
            return false;
        }else if(potentialSuperType.getName().equals(potentialSubType.getName())){
            return true;
        }else if(potentialSubType.getName().equals(Object.class.getName())){
                return false;
        }else{
            List<Class> superClassList=new ArrayList<>(Arrays.asList(potentialSubType.getInterfaces()));
            superClassList.add(potentialSubType.getSuperclass());
            if(superClassList.isEmpty()){
                return false;
            }else{
                for(int i=0;i<superClassList.size();i++){
                    if(matchClass(potentialSuperType, superClassList.get(i))){
                        return true;
                    }
                }
                return false;
            }
        }
    }

    /**
     * Return a list which contains all subTypes of List in java.util
     * @return List<Class>: SubType of List
     */
    private List<Class> getSubTypeOfJavaUtilList() {
        Reflections reflections = new Reflections(".*");
        Set<Class<? extends List>> subTypes=reflections.getSubTypesOf(List.class);
        List<Class> javaUtilsubTypes=new ArrayList<>();


        Iterator<Class<? extends List>> it=subTypes.iterator();
        while(it.hasNext()){
            Class current=it.next();
            if(current.toString().startsWith("class java.util")){
                javaUtilsubTypes.add(current);
            }
        }
        return javaUtilsubTypes;
    }

    /**
     * Return all constructors of classes in classList
     * @param classList
     * @return List<Constructor>
     */
    private List<Constructor> getPotentialsConstructors(List<Class> classList){
        List<Constructor> potentialsConstructors=new ArrayList<>();

        for(int i=0;i<classList.size();i++){
            try{
                Constructor constructorsTab[]=classList.get(i).getConstructors();
                for(int j=0;j<constructorsTab.length;j++){ potentialsConstructors.add(constructorsTab[j]);}
            }catch (Exception e){}

        }

        return potentialsConstructors;
    }

    private void printResult(int nb) {

        LogWriter.out("candidates,"+nb);

        Set<String> c=classes.keySet();
        Iterator<String> it=c.iterator();
        LogWriter.out("Classes,"+nb);
        while(it.hasNext()){
            String current =it.next();
            LogWriter.out(current+","+classes.get(current));
        }

        LogWriter.out("Constructors,"+nb);
        c=constructors.keySet();
        it=c.iterator();
        while(it.hasNext()){
            String current =it.next();
            LogWriter.out(current+","+constructors.get(current));
      }

    }

    private void analyzeConstructor(CtConstructorCall ctConstructorCall) {
        CtTypeReference classConstructor=ctConstructorCall.getType();
        String nameConstructor=classConstructor.getQualifiedName();

        String typesArguments=nameConstructor+"(";
        List<CtExpression> arguments=ctConstructorCall.getArguments();
        for(int i=0;i<arguments.size();i++){typesArguments=typesArguments+"  "+arguments.get(i).getType().getSimpleName();}
        typesArguments=typesArguments+")";

        if(classes.get(nameConstructor)!=null){
            classes.put(nameConstructor, (classes.get(nameConstructor)+1) );
        }else{
            classes.put(nameConstructor,1);
        }

        if(constructors.get(typesArguments)!=null){
            constructors.put(typesArguments, (constructors.get(typesArguments) + 1));
        }else{
            constructors.put(typesArguments,1);
        }

    }
}
