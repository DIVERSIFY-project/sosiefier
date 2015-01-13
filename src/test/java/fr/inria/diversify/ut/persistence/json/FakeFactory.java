package fr.inria.diversify.ut.persistence.json;

import spoon.compiler.Environment;
import spoon.reflect.factory.*;

/**
 * Created by marodrig on 12/01/2015.
 */
public class FakeFactory implements Factory {
    @Override
    public CoreFactory Core() {
        return null;
    }

    @Override
    public TypeFactory Type() {
        return null;
    }

    @Override
    public Environment getEnvironment() {
        return null;
    }

    @Override
    public PackageFactory Package() {
        return null;
    }

    @Override
    public CodeFactory Code() {
        return null;
    }

    @Override
    public ClassFactory Class() {
        return null;
    }

    @Override
    public FieldFactory Field() {
        return null;
    }

    @Override
    public ExecutableFactory Executable() {
        return null;
    }

    @Override
    public CompilationUnitFactory CompilationUnit() {
        return null;
    }

    @Override
    public MethodFactory Method() {
        return null;
    }

    @Override
    public AnnotationFactory Annotation() {
        return null;
    }

    @Override
    public EvalFactory Eval() {
        return null;
    }

    @Override
    public ConstructorFactory Constructor() {
        return null;
    }
}
