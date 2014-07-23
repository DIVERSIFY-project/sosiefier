package fr.inria.diversify.sosie.logger.processor;

import fr.inria.diversify.transformation.Transformation;
import spoon.reflect.code.*;
import spoon.reflect.cu.CompilationUnit;
import spoon.reflect.cu.SourceCodeFragment;
import spoon.reflect.cu.SourcePosition;
import spoon.reflect.declaration.*;


import java.util.*;

/**
 * User: Simon
 * Date: 25/02/14
 * Time: 11:32
 */
public class ErrorLoggingInstrumenter extends AbstractLoggingInstrumenter<CtStatement> {
    protected static Map<CtExecutable,Integer> count = new HashMap();
    protected static Map<Integer,String> idMap = new HashMap();

    public ErrorLoggingInstrumenter(List<Transformation> transformations) {
        super(transformations);
    }

    @Override
    public boolean isToBeProcessed(CtStatement candidate) {
        if(candidate.getParent(CtCase.class) != null)
            return false;

        return
                CtIf.class.isAssignableFrom(candidate.getClass())
                        || CtTry.class.isAssignableFrom(candidate.getClass())
                        || CtThrow.class.isAssignableFrom(candidate.getClass())
                ;
    }

    public void process(CtStatement statement) {
        if (CtThrow.class.isAssignableFrom(statement.getClass()))
            instruThrow((CtThrow) statement);
        if (CtTry.class.isAssignableFrom(statement.getClass()))
            instruCatch((CtTry)statement);
    }



    protected void instruThrow(CtThrow throwStmt) {
        String className = getClass(throwStmt).getQualifiedName();
        SourcePosition sp = throwStmt.getPosition();
        CompilationUnit compileUnit = sp.getCompilationUnit();
        String methodName;
        if(getMethod(throwStmt) == null)
            methodName = "field";

        else
            methodName = getMethod(throwStmt).getSignature();
        String snippet = "\t"+getLogName()+".writeException("+sp.getSourceStart()+",Thread.currentThread(),\"" +
                 className + "\",\"" + methodName + "\"," +
                throwStmt.getThrownExpression() + ");\n";

        int index = compileUnit.beginOfLineIndex(sp.getSourceStart());
        compileUnit.addSourceCodeFragment(new SourceCodeFragment(index, snippet, 0));

        snippet = "\n";

        index = compileUnit.nextLineIndex(sp.getSourceEnd());
        compileUnit.addSourceCodeFragment(new SourceCodeFragment(index, snippet, 0));
    }


    protected void instruCatch(CtTry tryStmt) {
        String className = getClass(tryStmt).getQualifiedName();
        String methodName;
        if(getMethod(tryStmt) == null)
            methodName = "field";
        else
            methodName = getMethod(tryStmt).getSignature();

        List<CtCatch> catchList = tryStmt.getCatchers();
        for (CtCatch catchStmt : catchList) {
            CtBlock<?> catchBlock = catchStmt.getBody();
            if(getMethod(tryStmt) != null && !catchBlock.getStatements().isEmpty()) {
                CtStatement statement = catchBlock.getStatements().get(0);
                SourcePosition sp = statement.getPosition();

                String snippet = getLogName() + ".writeCatch("+sp.getSourceStart()+",Thread.currentThread(),\"" +
                        className + "\",\"" + methodName + "\"," +
                        catchStmt.getParameter().getSimpleName() + ");\n";


//                if(!catchBlock.getStatements().isEmpty()) {

                    CompilationUnit compileUnit = sp.getCompilationUnit();
                    int index = compileUnit.beginOfLineIndex(sp.getSourceStart());
                    compileUnit.addSourceCodeFragment(new SourceCodeFragment(index, snippet, 0));
//                }
            }
        }
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