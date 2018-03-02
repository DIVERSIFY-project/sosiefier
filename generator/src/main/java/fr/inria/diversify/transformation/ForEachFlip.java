package fr.inria.diversify.transformation;

import fr.inria.diversify.transformation.exception.RestoreTransformationException;
import spoon.reflect.code.CtExpression;
import spoon.reflect.code.CtForEach;
import spoon.reflect.cu.SourcePosition;
import spoon.reflect.declaration.CtClass;
import spoon.reflect.declaration.CtPackage;
import spoon.reflect.declaration.CtType;
import spoon.reflect.factory.Factory;

public class ForEachFlip extends SingleTransformation {
    CtClass host;
    CtForEach tp;
    Factory f;
    CtType newType;
    public ForEachFlip(CtForEach tp) {
        host = tp.getParent(CtClass.class);
        this.tp = tp;
        f = tp.getFactory();
        //newType = f.Class().create()
    }

    @Override
    public String classLocationName() {
        return null;
    }

    @Override
    public String packageLocationName() {
        return null;
    }

    @Override
    public String methodLocationName() {
        return null;
    }

    @Override
    public SourcePosition getPosition() {
        return null;
    }

    @Override
    public int line() {
        return 0;
    }

    @Override
    public String getTransformationString() throws Exception {
        return null;
    }

    @Override
    public void apply(String srcDir) throws Exception {
        //ctPackage.addType()
        CtExpression old = tp.getExpression();
        CtExpression newE = f.Code().createCodeSnippetExpression("");
        //tp.setExpression()
    }

    @Override
    public void restore(String srcDir) throws RestoreTransformationException {

    }
}
