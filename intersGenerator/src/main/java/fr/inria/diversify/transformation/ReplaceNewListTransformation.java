package fr.inria.diversify.transformation;

import jdk.nashorn.internal.runtime.regexp.JoniRegExp;
import spoon.reflect.code.CtConstructorCall;
import spoon.reflect.code.CtExpression;
import spoon.reflect.declaration.CtConstructor;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.factory.Factory;
import spoon.reflect.reference.CtTypeReference;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/**
 * Created by lguerin on 5/29/15.
 */
public class ReplaceNewListTransformation extends RefactorSpoonTransformation<CtConstructorCall,CtConstructorCall>{




    @Override
    protected CtConstructorCall buildReplacementElement() {
       /* Factory factory=transplantationPoint.getFactory();
        CtConstructorCall newConstructorCall=factory.Core().createConstructorCall();

        List<CtExpression<?>> arguments=transplantationPoint.getArguments();
        Class typeArgs[]=new Class[arguments.size()];



        for(int i=0;i<arguments.size();i++){typeArgs[i]=arguments.get(i).getType().getActualClass();}

        Class other=LinkedList.class;

        newConstructorCall.setType(factory.Type().createReference(other));

        try {
            other.getDeclaredConstructor(typeArgs);
            newConstructorCall.setArguments(arguments);

        } catch (NoSuchMethodException e) {}*/


        return this.getTransplant();
    }
}
