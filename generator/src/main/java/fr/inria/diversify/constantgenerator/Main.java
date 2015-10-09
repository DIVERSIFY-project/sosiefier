package fr.inria.diversify.constantgenerator;

import fr.inria.diversify.buildSystem.android.InvalidSdkException;
import fr.inria.diversify.diversification.InputConfiguration;
import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.util.InitUtils;
import fr.inria.diversify.util.Log;
import spoon.reflect.declaration.CtType;

import java.util.HashSet;
import java.util.Set;

/**
 * User: Simon
 * Date: 31/03/15
 * Time: 15:58
 */
public class Main {


    private final InputProgram inputProgram;

    public Main(String propertiesFile) throws Exception, InvalidSdkException {
        Log.DEBUG();
        InputConfiguration inputConfiguration = new InputConfiguration(propertiesFile);
        inputProgram = InitUtils.initInputProgram(inputConfiguration);
        InitUtils.initDependency(inputConfiguration);
        InitUtils.initSpoon(inputProgram, false);

        FindValue findValue = new FindValue();
        findValue.init(getAllClass());
        findValue.foo();
        findValue.infoEnd();
    }

    protected  Set<Class<?>> getAllClass() {
        Set<Class<?>> classes = new HashSet<>();

        ClassLoader classLoader =  Thread.currentThread().getContextClassLoader();
        for(Object c : inputProgram.getAllElement(CtType.class)) {
            try {
                Class<?> cl = classLoader.loadClass(((CtType) c).getQualifiedName());
                classes.add(cl);
            } catch (ClassNotFoundException e) {}
        }

        return classes;
    }

    public static void main(String[] args) throws InvalidSdkException, Exception {
        Main main = new Main(args[0]);
    }
}
