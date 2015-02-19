package fr.inria.diversify.transformation;

import fr.inria.diversify.util.Log;
import spoon.compiler.Environment;
import spoon.reflect.code.CtFor;
import spoon.reflect.declaration.CtExecutable;
import spoon.reflect.declaration.CtPackage;
import spoon.reflect.declaration.CtSimpleType;
import spoon.reflect.factory.Factory;
import spoon.reflect.visitor.DefaultJavaPrettyPrinter;
import spoon.support.JavaOutputProcessor;

import java.io.File;
import java.io.IOException;

/**
 * Created by Simon on 18/02/15.
 */
public class LoopPerforation extends SingleTransformation {
    CtFor loop;
    CtFor loopPerforated;

    @Override
    public String classLocationName() {
        return loop.getParent(CtSimpleType.class).getSimpleName();
    }

    @Override
    public String packageLocationName() {
        return loop.getParent(CtPackage.class).getSimpleName();
    }

    public String methodLocationName() {
       return loop.getParent(CtExecutable.class).getSimpleName();
    }

    @Override
    public String getTransformationString() throws Exception {
        return null;
    }

    @Override
    public int line() {
        return loop.getPosition().getLine();
    }

    @Override
    public void printJavaFile(String srcDir) throws IOException {
        CtSimpleType<?> type = loop.getParent(CtSimpleType.class);
        Factory factory = type.getFactory();
        Environment env = factory.getEnvironment();

        JavaOutputProcessor processor = new JavaOutputProcessor(new File(srcDir), new DefaultJavaPrettyPrinter(env));
        processor.setFactory(factory);

        processor.createJavaFile(type);
        Log.debug("write type {} in directory {}", type.getQualifiedName(), srcDir);
    }

    @Override
    public void apply(String srcDir) throws Exception {
        Factory factory = loop.getFactory();

        loopPerforated = factory.Core().clone(loop);
        loopPerforated.setParent(loop.getParent());

     //   loopPerforated.getForUpdate()

        printJavaFile(srcDir);
    }

    @Override
    public void applyWithParent(String srcDir) throws Exception {
        if (parent != null) {
            parent.apply(srcDir);
        }
        apply(srcDir);
    }

    @Override
    public void restore(String srcDir) throws Exception {
        if (parent != null) {
            parent.restore(srcDir);
        }
        try {
            loopPerforated.replace(loop);
        } catch (Throwable e) {
            e.printStackTrace();
            Log.debug("");
        }
        printJavaFile(srcDir);
    }
}
