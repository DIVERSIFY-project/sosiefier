package fr.inria.diversify.processor.main;

import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.processor.ProcessorUtil;
import spoon.processing.AbstractProcessor;
import spoon.reflect.code.*;
import spoon.reflect.declaration.*;
import spoon.reflect.visitor.QueryVisitor;
import spoon.reflect.visitor.filter.TypeFilter;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by marodrig on 27/06/2014.
 */
public abstract class AbstractLoggingInstrumenter<E extends CtElement> extends AbstractProcessor<E> {
    protected static Map<CtExecutable, Integer> localId = new HashMap();

    protected InputProgram inputProgram;

    protected String logger;

    public  AbstractLoggingInstrumenter(InputProgram inputProgram) {
        this.inputProgram = inputProgram;
    }

    public String getLogger() {
        return logger;
    }

    public void setLogger(String logger) {
        this.logger = logger;
    }

    protected CtClass<?> getClass(CtElement stmt) {
        return stmt.getParent(CtClass.class);
    }

    protected CtExecutable<?> getMethod(CtElement stmt) {
        CtExecutable<?> ret = stmt.getParent(CtMethod.class);
        if (ret == null)
            ret = stmt.getParent(CtConstructor.class);
        return ret;
    }

    protected int getLocalId(CtElement stmt) {
        CtExecutable parent = stmt.getParent(CtExecutable.class);
        if (localId.containsKey(parent))
            localId.put(parent, localId.get(parent) + 1);
        else
            localId.put(parent, 0);
        return localId.get(parent);
    }

    protected boolean containsGoto(CtElement elem) {
        QueryVisitor query = new QueryVisitor(new TypeFilter(CtBreak.class));
        elem.accept(query);
        for(Object o : query.getResult()) {
            CtBreak ctBreak = (CtBreak) o;
            if(ctBreak.getTargetLabel() != null) {
                return true;
            }
        }
        return false;
    }

    protected int methodId(CtExecutable method) {
        return ProcessorUtil.idFor(method.getReference().getDeclaringType().getQualifiedName() + "." + method.getSignature());
    }

    protected boolean blockNeed(CtStatement statement) {
        return statement.getParent() instanceof CtLoop
                || statement.getParent() instanceof CtIf;
    }

    protected void insertInBlock(CtStatement statement, CtStatement snippetStmt)  {
        CtBlock<Object> block = getFactory().Core().createBlock();
        block.setParent(statement.getParent());
        block.addStatement(snippetStmt);
        block.addStatement(statement);

        if (statement.getParent() instanceof CtLoop) {
            CtLoop loop = (CtLoop) statement.getParent();
            loop.setBody(block);
        }
        if (statement.getParent() instanceof CtIf) {
            CtIf ctIf = (CtIf) statement.getParent();
            ctIf.setThenStatement(block);
        }
    }
}
