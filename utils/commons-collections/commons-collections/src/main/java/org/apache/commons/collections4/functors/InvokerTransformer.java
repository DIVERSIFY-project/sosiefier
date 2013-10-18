/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.collections4.functors;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.apache.commons.collections4.FunctorException;
import org.apache.commons.collections4.Transformer;

/**
 * Transformer implementation that creates a new object instance by reflection.
 *
 * @since 3.0
 * @version $Id: InvokerTransformer.java 1477839 2013-04-30 21:32:47Z tn $
 */
public class InvokerTransformer<I, O> implements Transformer<I, O>, Serializable {

    /** The serial version */
    private static final long serialVersionUID = -8653385846894047688L;

    /** The method name to call */
    private final String iMethodName;
    /** The array of reflection parameter types */
    private final Class<?>[] iParamTypes;
    /** The array of reflection arguments */
    private final Object[] iArgs;

    /**
     * Gets an instance of this transformer calling a specific method with no arguments.
     *
     * @param <I>  the input type
     * @param <O>  the output type
     * @param methodName  the method name to call
     * @return an invoker transformer
     * @since 3.1
     */
    public static <I, O> Transformer<I, O> invokerTransformer(final String methodName) {
        if (methodName == null) {
            throw new IllegalArgumentException("The method to invoke must not be null");
        }
        return new InvokerTransformer<I, O>(methodName);
    }

    /**
     * Gets an instance of this transformer calling a specific method with specific values.
     *
     * @param <I>  the input type
     * @param <O>  the output type
     * @param methodName  the method name to call
     * @param paramTypes  the parameter types of the method
     * @param args  the arguments to pass to the method
     * @return an invoker transformer
     */
    public static <I, O> Transformer<I, O> invokerTransformer(final String methodName, final Class<?>[] paramTypes,
                                                              final Object[] args) {
        if (methodName == null) {
            throw new IllegalArgumentException("The method to invoke must not be null");
        }
        if (((paramTypes == null) && (args != null))
            || ((paramTypes != null) && (args == null))
            || ((paramTypes != null) && (args != null) && (paramTypes.length != args.length))) {
            throw new IllegalArgumentException("The parameter types must match the arguments");
        }
        if (paramTypes == null || paramTypes.length == 0) {
            return new InvokerTransformer<I, O>(methodName);
        } else {
            return new InvokerTransformer<I, O>(methodName, paramTypes, args);
        }
    }

    /**
     * Constructor for no arg instance.
     *
     * @param methodName  the method to call
     */
    private InvokerTransformer(final String methodName) {
        super();
        iMethodName = methodName;
        iParamTypes = null;
        iArgs = null;
    }

    /**
     * Constructor that performs no validation.
     * Use <code>invokerTransformer</code> if you want that.
     * <p>
     * Note: from 4.0, the input parameters will be cloned
     *
     * @param methodName  the method to call
     * @param paramTypes  the constructor parameter types
     * @param args  the constructor arguments
     */
    public InvokerTransformer(final String methodName, final Class<?>[] paramTypes, final Object[] args) {
        super();
        iMethodName = methodName;
        iParamTypes = paramTypes != null ? paramTypes.clone() : null;
        iArgs = args != null ? args.clone() : null;
    }

    /**
     * Transforms the input to result by invoking a method on the input.
     *
     * @param input  the input object to transform
     * @return the transformed result, null if null input
     */
    @SuppressWarnings("unchecked")
    public O transform(final Object input) {
        if (input == null) {
            return null;
        }
        try {
            final Class<?> cls = input.getClass();
            final Method method = cls.getMethod(iMethodName, iParamTypes);
            return (O) method.invoke(input, iArgs);
        } catch (final NoSuchMethodException ex) {
            throw new FunctorException("InvokerTransformer: The method '" + iMethodName + "' on '" +
                                       input.getClass() + "' does not exist");
        } catch (final IllegalAccessException ex) {
            throw new FunctorException("InvokerTransformer: The method '" + iMethodName + "' on '" +
                                       input.getClass() + "' cannot be accessed");
        } catch (final InvocationTargetException ex) {
            throw new FunctorException("InvokerTransformer: The method '" + iMethodName + "' on '" +
                                       input.getClass() + "' threw an exception", ex);
        }
    }

}
