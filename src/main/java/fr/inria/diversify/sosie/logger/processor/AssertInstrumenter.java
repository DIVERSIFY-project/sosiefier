package fr.inria.diversify.sosie.logger.processor;

import fr.inria.diversify.transformation.Transformation;
import spoon.reflect.code.*;

import spoon.reflect.cu.CompilationUnit;
import spoon.reflect.cu.SourceCodeFragment;
import spoon.reflect.cu.SourcePosition;
import spoon.reflect.declaration.*;
import spoon.reflect.reference.CtExecutableReference;
import spoon.reflect.reference.CtTypeReference;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * User: Simon
 * Date: 25/02/14
 * Time: 11:32
 */
public class AssertInstrumenter extends AbstractLoggingInstrumenter<CtInvocation<?>> {
    protected static Map<CtExecutable, Integer> count = new HashMap();
    protected static Map<Integer,String> idMap = new HashMap();

    public AssertInstrumenter() {
        super(new ArrayList<Transformation>());
    }

    @Override
    public boolean isToBeProcessed(CtInvocation<?> candidate) {
        try {
            return candidate.getExecutable().getSimpleName().startsWith("assert");
        } catch (NullPointerException e) {
            return false;
        }
    }

    //Obtains a proper argument type string... yes, is not as simple as toString some very special times
    private String buildTypedArgumentString(CtTypeReference typedElement) {
        String result = "";

        if (typedElement.getDeclaringType() != null && !typedElement.getDeclaringType().toString().equals("null")) {
            //A declaring type must be a class so it must have a package
            result += typedElement.getDeclaringType().getPackage().getSimpleName() + ".";
            result += typedElement.getDeclaringType().getSimpleName() + ".";
        } else if (typedElement.getPackage() != null && !typedElement.getPackage().toString().equals("null")) {
            //If not declaring type, check for packages
            result += typedElement.getPackage().getSimpleName() + ".";
        }

        result += typedElement.getSimpleName();

        //Build elements inside the "<>" diamond
        List<CtTypeReference<?>> r = typedElement.getActualTypeArguments();
        if (r.size() > 0) {
            result += "<";
            for (int i = 0; i < r.size(); i++) {
                result += buildTypedArgumentString(r.get(i));
                result += i + 1 >= r.size() ? ">" : ",";
            }
        }
        return result;
    }

    public void process(CtInvocation<?> invocation) {
        CtExecutableReference<?> executable = invocation.getExecutable();
        SourcePosition sp = invocation.getPosition();
        CompilationUnit compileUnit = sp.getCompilationUnit();
        String snippet = "";
        List<String> assertVar = new ArrayList();
        List<String> types = new ArrayList();

        for (CtExpression expression : invocation.getArguments()) {
            String var = "asssertVar_" + getCount(invocation);
            String type;
            assertVar.add(var);
            if (expression.getTypeCasts().size() != 0)
                type = expression.getTypeCasts().get(0).toString();
            else if (expression.getType().toString().equals("?") || expression.getType().toString().equals("<nulltype>"))
                type = "Object";
            else if (expression.toString().endsWith(".class"))
                type = "java.lang.Class<?>";
            else if (expression.getType().getActualTypeArguments().size() > 0)
                //On typed argument expressions the expression.getType().toString() is not good
                //since produces bad syntax code. So a more complex analysis must be made
                type = buildTypedArgumentString(expression.getType());
            else
                type = expression.getType().toString();

            types.add(type);
            snippet += type + " " + var + " = " + expression + ";\n";
        }

        snippet += getLogName() + ".writeAssert(" + sp.getSourceStart() + ",Thread.currentThread(),\"" +
                getClass(invocation).getQualifiedName() + "\",\"" + getMethod(invocation).getSignature() + "\",\"" +
                executable.getSimpleName() + "\"";

        for (int i = 0; i < assertVar.size(); i++) {
            snippet += ", \"" + types.get(i) + "\", " + assertVar.get(i);
        }

        snippet += ");\n";
        if (assertVar.size() != 0) {
            if (executable.isStatic())
                snippet += executable.getDeclaringType().getPackage() + "." + executable.getDeclaringType().getSimpleName() + "." + executable.getSimpleName() + "(" + assertVar.get(0);
            else
                snippet += executable.getSimpleName() + "(" + assertVar.get(0);
            for (int i = 1; i < assertVar.size(); i++)
                snippet += ", " + assertVar.get(i);
            snippet += ");\n";
        }

        compileUnit.addSourceCodeFragment(new SourceCodeFragment(sp.getSourceStart(), "/**", 0));
        compileUnit.addSourceCodeFragment(new SourceCodeFragment(sp.getSourceEnd() + 1, "**/\n" + snippet, 0));
    }

    protected int getCount(CtInvocation stmt) {
        CtExecutable parent = stmt.getParent(CtExecutable.class);
        if (count.containsKey(parent))
            count.put(parent, count.get(parent) + 1);
        else
            count.put(parent, 0);
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