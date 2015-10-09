package fr.inria.diversify.constantgenerator;

import fr.inria.diversify.util.Log;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.*;

/**
 * User: Simon
 * Date: 31/03/15
 * Time: 11:23
 */
public abstract class ObjectCreation {
    protected ObjectCreation[] args;

    protected Object value;
    protected boolean compute = false;

    protected static SecurityManager constantSecurityManager = new ConstantGeneratorSecurityManager();
    protected static ExecutorService exService = Executors.newCachedThreadPool();

    public abstract Method[] getMethods();

    protected Object buildObject() throws IllegalAccessException, InvocationTargetException, InstantiationException, ExecutionException, InterruptedException {
        try {
            Future<Object> callFuture = exService.submit(new Callable<Object>() {
                @Override
                public Object call() throws IllegalAccessException, InstantiationException, InvocationTargetException {
                    return pBuildObject();
                }
            });

            System.setSecurityManager(constantSecurityManager);
            try {
                setValue(callFuture.get(100, TimeUnit.MILLISECONDS));
            } catch (TimeoutException e) {
                callFuture.cancel(true);
                Log.debug("stop build object: {} {}", toString());
                throw new InterruptedException();
            }
            return value;
        } finally {
            System.setSecurityManager(null);
        }
    }

    protected abstract Object pBuildObject() throws IllegalAccessException, InstantiationException, InvocationTargetException;

    public abstract Class getDynamicType();

    public boolean buildWithoutException() {
        try {
            setValue(buildObject());
            toString();
        } catch (Throwable e) {
            return false;
        }
        return true;
    }

    public abstract int size();

    public Object getValue() {
        if(!compute) {
            try {
                setValue(buildObject());
            } catch (Exception e) {}
        }
        return value;
    }

    protected void setValue(Object value) {
        compute = true;
        this.value = value;
    }
}
