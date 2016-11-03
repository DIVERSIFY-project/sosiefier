package fr.inria.diversify.transformation;

import fr.inria.diversify.transformation.exception.RestoreTransformationException;
import spoon.reflect.code.*;
import spoon.reflect.cu.SourcePosition;
import spoon.reflect.declaration.*;
import spoon.reflect.factory.Factory;
import spoon.reflect.reference.CtParameterReference;
import spoon.reflect.reference.CtTypeReference;
import spoon.support.reflect.code.CtInvocationImpl;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by nicolas on 13.10.16.
 */
class MethodMerge extends SingleTransformation {
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

    private CtLiteral defaultValue(CtType t) {
        Factory factory = t.getFactory();
        if(t.getActualClass() == boolean.class) {
            return factory.Code().createLiteral(false);
        } else if (t.getActualClass() == byte.class) {
            return factory.Code().createLiteral(0);
        } else if (t.getActualClass() == short.class) {
            return factory.Code().createLiteral(0);
        } else if (t.getActualClass() == int.class) {
            return factory.Code().createLiteral(0);
        } else if (t.getActualClass() == long.class) {
            return factory.Code().createLiteral(0);
        } else if (t.getActualClass() == float.class) {
            return factory.Code().createLiteral(0.0);
        } else if (t.getActualClass() == double.class) {
            return factory.Code().createLiteral(0.0);
        } else if (t.getActualClass() == char.class) {
            return factory.Code().createLiteral('a');
        } else {//object
            return factory.Code().createLiteral(null);
        }

    }

    private void reWriteInvocation(CtInvocation inv, CtMethod newMethod, CtMethod other, boolean isFirst) {
        Factory factory = inv.getFactory();
        CtInvocation newInv = factory.Core().clone(inv);


        List<CtExpression> args = inv.getArguments();
        if(isFirst) {
            args.addAll(other.getFormalTypeParameters().stream().map(t -> defaultValue(t.getDeclaration())).collect(Collectors.toList()));
            args.add(factory.Code().createLiteral(true));
            newInv.setExecutable(newMethod.getReference());
            newInv.setTarget(inv.getTarget());
            newInv.setArguments(args);
        } else {
            args.clear();
            args.addAll(other.getFormalTypeParameters().stream().map(t -> defaultValue(t.getDeclaration())).collect(Collectors.toList()));
            args.addAll(inv.getArguments());
            args.add(factory.Code().createLiteral(false));
            newInv.setExecutable(newMethod.getReference());
            newInv.setTarget(inv.getTarget());
            newInv.setArguments(args);
        }
    }

    private CtMethod methodMerge(CtMethod m1, CtMethod m2) {
        CtMethod m = null;

        Factory factory = m1.getFactory();
        m = factory.Core().clone(m1);
        List<CtParameter<?>> param = m1.getParameters();
        param.addAll(m2.getParameters());
        m.setParameters(param);
        CtParameter sel = factory.Core().createParameter();
        sel.setSimpleName("pathSelector" + m1.getSimpleName() + m2.getSimpleName());
        sel.setType(factory.Type().BOOLEAN_PRIMITIVE);

        CtIf iff = factory.Core().createIf();
        iff.setThenStatement(m1.getBody());
        iff.setElseStatement(m2.getBody());


        iff.setCondition(factory.Code().createCodeSnippetExpression("pathSelector" + m1.getSimpleName() + m2.getSimpleName()));

        CtBlock b = factory.Core().createBlock();
        b.addStatement(iff);

        m.setBody(b);

        return m;
    }

    @Override
    public void apply(String srcDir) throws Exception {
        //gen new method
        //rewrite invocations
        //remove old methods
    }

    @Override
    public void restore(String srcDir) throws RestoreTransformationException {

    }
}
