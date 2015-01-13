package fr.inria.diversify.testamplification.logger;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Simon on 12/01/15.
 */
public class Observe {

    public List<Method> findGetters(Class aClass){
        List<Method> getters = new ArrayList<>();
        for(Method method : aClass.getMethods()){
            if(isGetter(aClass, method)) {
                getters.add(method);
            }
        }
        return getters;
    }

    protected boolean isGetter(Class aClass, Method method) {
        for(Field field: aClass.getFields()) {
            if (getterOf(field,method))
                return true;
        }
        return false;
    }

    protected boolean getterOf(Field field, Method method) {
        return method.getName().startsWith("get")
                && method.getName().toLowerCase().contains(field.getName().toLowerCase())
                && method.getParameterTypes().length == 0
                && method.getReturnType().isAssignableFrom(field.getType());

    }

}
