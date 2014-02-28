package fr.inria.diversify.sosie.logger.processor;

import fr.inria.diversify.util.Log;
import spoon.processing.AbstractProcessor;
import spoon.reflect.code.*;

import spoon.reflect.cu.CompilationUnit;
import spoon.reflect.cu.SourceCodeFragment;
import spoon.reflect.cu.SourcePosition;
import spoon.reflect.declaration.CtConstructor;
import spoon.reflect.declaration.CtExecutable;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.declaration.CtSimpleType;
import spoon.reflect.reference.CtExecutableReference;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
        CtExecutableReference<?> executable = invocation.getExecutable();
        String snippet = "";
        List<String> assertVar = new ArrayList<String>();
        for(CtExpression expression : invocation.getArguments()) {
            String var = "asssertVar_"+getCount(invocation);
            assertVar.add(var);
            if(expression.getTypeCasts().size() != 0)
                snippet += expression.getTypeCasts().get(0)+" "+ var + " = "+ expression + ";\n";
            else if(expression.getType().toString().equals("?") || expression.getType().toString().equals("<nulltype>"))
                snippet += "Object "+ var + " = "+ expression + ";\n";
            else if(expression.toString().endsWith(".class"))
                snippet += "java.lang.Class<?> "+ var + " = "+ expression + ";\n";
            else
                snippet += expression.getType() +" "+ var + " = "+ expression + ";\n";
        }
        snippet += "fr.inria.diversify.sosie.logger.LogWriter.writeAssert(Thread.currentThread(),\"" +
            getClass(invocation).getQualifiedName() + "\",\"" + getMethod(invocation).getSignature() + "\",\"" +
                executable.getSimpleName()+ "\"";

        for(String var : assertVar) {
            snippet += ", " + var;
        }

        snippet += ");\n";
        if(assertVar.size() != 0)  {
            snippet += /**executable.getDeclaringType().getPackage()+"."+executable.getDeclaringType().getSimpleName()+"."+**/executable.getSimpleName() + "("+assertVar.get(0);
            for(int i = 1; i < assertVar.size(); i++)
                snippet += ", " + assertVar.get(i);
            snippet += ");\n";
        }

        Log.info(snippet);
        SourcePosition sp = invocation.getPosition();
        CompilationUnit compileUnit = sp.getCompilationUnit();
        int index = compileUnit.beginOfLineIndex(sp.getSourceStart());
//        compileUnit.addSourceCodeFragment(new SourceCodeFragment(index, snippet, 0));

        compileUnit.addSourceCodeFragment(new SourceCodeFragment(sp.getSourceStart(), "/**", 0));
        compileUnit.addSourceCodeFragment(new SourceCodeFragment(sp.getSourceEnd()+1, "**/\n"+snippet, 0));

//        snippet = "\n}\n";

//        index = compileUnit.nextLineIndex(sp.getSourceEnd());
//        compileUnit.addSourceCodeFragment(new SourceCodeFragment(index, snippet, 0));
    }

    protected int getCount(CtInvocation stmt) {
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