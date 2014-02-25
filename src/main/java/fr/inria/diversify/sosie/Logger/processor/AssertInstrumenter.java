package fr.inria.diversify.sosie.logger.processor;

import spoon.processing.AbstractProcessor;
import spoon.reflect.code.*;

import spoon.reflect.cu.CompilationUnit;
import spoon.reflect.cu.SourceCodeFragment;
import spoon.reflect.cu.SourcePosition;
import spoon.reflect.declaration.CtConstructor;
import spoon.reflect.declaration.CtExecutable;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.declaration.CtSimpleType;

import java.util.HashMap;
import java.util.Map;

/**
 * User: Simon
 * Date: 25/02/14
 * Time: 11:32
 */
public class AssertInstrumenter extends AbstractProcessor<CtInvocation<?>> {
    protected static Map<CtExecutable,Integer> count = new HashMap<CtExecutable, Integer>();
    protected static Map<String,String> idMap = new HashMap<String, String>();

    @Override
    public boolean isToBeProcessed(CtInvocation<?> candidate) {
        return candidate.getExecutable().getSimpleName().startsWith("assert");
    }



    public void process(CtInvocation<?> invocation) {
        String snippet = "fr.inria.diversify.sosie.logger.LogWriter.writeAssert(Thread.currentThread(),\"" +
            getClass(invocation).getQualifiedName() + "\",\"" + getMethod(invocation).getSignature() + "\"";

        for(CtExpression expression : invocation.getArguments()) {
            snippet += ", " + expression.toString();
        }
        snippet += ");\n";

        SourcePosition sp = invocation.getPosition();
        CompilationUnit compileUnit = sp.getCompilationUnit();
        int index = compileUnit.beginOfLineIndex(sp.getSourceStart());
        compileUnit.addSourceCodeFragment(new SourceCodeFragment(index, snippet, 0));

//        snippet = "\n}\n";

//        index = compileUnit.nextLineIndex(sp.getSourceEnd());
//        compileUnit.addSourceCodeFragment(new SourceCodeFragment(index, snippet, 0));
    }

    protected int getCount(CtStatement stmt) {
        CtExecutable parent = stmt.getParent(CtExecutable.class);
        if(count.containsKey(parent))
            count.put(parent,count.get(parent) + 1);
        else
            count.put(parent,0);
        return count.get(parent);
    }

    protected CtSimpleType<?> getClass(CtStatement stmt) {
        return stmt.getParent(CtSimpleType.class);
    }

    protected CtExecutable<?> getMethod(CtStatement stmt) {
        CtExecutable<?> ret = stmt.getParent(CtMethod.class);
        if (ret == null)
            ret = stmt.getParent(CtConstructor.class);
        return ret;
    }

}