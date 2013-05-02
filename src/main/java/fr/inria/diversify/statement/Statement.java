package fr.inria.diversify.statement;


import fr.inria.diversify.replace.ReplaceVariableVisitor;
import fr.inria.diversify.statementProcessor.SubStatementVisitor;
import spoon.reflect.Factory;
import spoon.reflect.code.CtFieldAccess;
import spoon.reflect.code.CtStatement;
import spoon.reflect.declaration.CtPackage;
import spoon.reflect.declaration.CtSimpleType;
import spoon.reflect.declaration.CtTypedElement;
import spoon.reflect.reference.CtTypeReference;
import spoon.reflect.reference.CtVariableReference;
import spoon.support.reflect.code.CtCaseImpl;
import spoon.support.reflect.code.CtLocalVariableImpl;
import spoon.support.reflect.code.CtThrowImpl;

import java.io.File;
import java.util.List;
import java.util.Random;

public class Statement {
    protected Context context;
    protected CtStatement stmt;
    private String equalString;


    public Statement(CtStatement stmt) {
        this.stmt = stmt;
        context = new Context(initInputContext(), initOutputContext());
        this.initOutputContext();
        this.initInputContext();
    }


    public CtTypeReference<?> getOuputContext() {
        return context.getOuputContext();
    }


    public InputContext getInputContext() {
        return context.getInputContext();
    }

    protected CtTypeReference<?> initOutputContext() {
        if (stmt instanceof CtTypedElement) {
            return ((CtTypedElement<?>) stmt).getType();

        } else
            return Factory.getLauchingFactory().Type().createReference(void.class);
    }

    protected InputContext initInputContext() {
        VariableVisitor visitor = new VariableVisitor();
        stmt.accept(visitor);
        return visitor.input();
    }


    @Override
    public String toString() {
        String tmp = "Input:" + getInputContext();
        tmp = tmp + "\nOutput: " + getOuputContext() + "\nSource: " + stmt;
        return tmp;
    }

    public String StatementString() {
        return stmt.toString();
    }

    public String equalString() {
        if (equalString != null)
            return equalString;
        StatementEqualPrinter pp = new StatementEqualPrinter(stmt.getFactory().getEnvironment());
        stmt.accept(pp);
        equalString = pp.toString();
        return equalString;
    }

    public Statement replace(Statement other) {
        Statement newStatement = null;
        System.out.println("\navant: " + stmt.getPosition());
        System.out.println(stmt.getParent());
        stmt.replace(other.stmt);
        SubStatementVisitor sub = new SubStatementVisitor()  ;
        stmt.getParent().accept(sub);
        for(CtStatement statement: sub.getStatements())
            if(statement.toString().equals(other.stmt.toString()))
                newStatement = new Statement(statement);
        Random r = new Random();
        for (CtVariableReference<?> variable : newStatement.getInputContext().getLocalVar()) {
            List<Object> list = getInputContext().allCandidate(variable.getType());
            Object candidate = list.get(r.nextInt(list.size()));
            ReplaceVariableVisitor visitor = new ReplaceVariableVisitor(variable, candidate);
            newStatement.stmt.accept(visitor);
        }
        for (CtFieldAccess<?> variable : newStatement.getInputContext().getField()) {
            List<CtFieldAccess> list = getInputContext().allCandidateForFieldAccess(variable.getType());
            Object candidate = list.get(r.nextInt(list.size()));

            ReplaceVariableVisitor visitor = new ReplaceVariableVisitor(variable, candidate);
            newStatement.stmt.accept(visitor);
        }
        if(stmt instanceof CtLocalVariableImpl) {
            ((CtLocalVariableImpl)newStatement.stmt).setSimpleName(((CtLocalVariableImpl) stmt).getSimpleName());

        }

        System.out.println("\napres: "+stmt.getParent());
        return newStatement;
    }



    //check if this can be replaced by other
    public boolean isReplace(Statement other) {
        Class<?> cl = stmt.getClass();
        Class<?> clOther = other.stmt.getClass();
        if((clOther ==  CtLocalVariableImpl.class || cl == CtLocalVariableImpl.class) && cl != clOther)
            return false;
        if(StatementString().contains("super("))
            return false;
        if((clOther ==  CtCaseImpl.class || cl == CtCaseImpl.class) && cl != clOther)
            return false;
        if((clOther ==  CtThrowImpl.class || cl == CtThrowImpl.class) && cl != clOther)
            return false;
        SubStatementVisitor sub = new SubStatementVisitor()  ;
        other.stmt.getParent().accept(sub);
        if(sub.getStatements().contains(stmt))
            return false;

        return getInputContext().isInclude(other.getInputContext()) && getOuputContext().equals(other.getOuputContext());
    }

     public CtStatement getCtStatement()  {
         return stmt;
     }

    public Context getContext() {
        return context;
    }

    public Class<?> getStatementType() {
        return stmt.getClass();
    }

    public CtSimpleType<?> getSourceClass() {
        return stmt.getPosition().getCompilationUnit().getMainType();
    }

    public int getStartLine() {
        return stmt.getPosition().getLine();
    }

    public int getEndLine() {
        return stmt.getPosition().getEndLine();
    }

    public CtPackage getSourcePackage() {
        return getSourceClass().getPackage();
    }

    public int id() {
        return equalString().hashCode() + context.hashCode();
    }

    public File getSourceFile() {
        return stmt.getPosition().getFile();
    }
}
