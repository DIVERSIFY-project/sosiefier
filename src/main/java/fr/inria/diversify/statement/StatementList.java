package fr.inria.diversify.statement;

import spoon.reflect.reference.CtTypeReference;

import java.util.*;

/**
 * User: Simon
 * Date: 5/3/13
 * Time: 10:08 AM
 */
public class StatementList {
    protected List<Statement> statements;

    protected Map<InputContext,Integer> uniqueInputContext;
    protected Map<CtTypeReference<?>,Integer> uniqueOutputContext;
    protected Map<Context,Integer> uniqueContext;
    protected Map<Integer,Integer> uniqueStatement;
    protected Map<Integer,Statement> idToStatement;

    public StatementList(List<Statement> statements) {
        init();
        this.statements = statements;
        for (Statement statement : statements)
            add(statement);
    }

    public StatementList() {
        init();
    }

    protected void init() {
        statements = new LinkedList<Statement>();
        uniqueInputContext = new HashMap<InputContext, Integer>();
        uniqueOutputContext = new HashMap<CtTypeReference<?>, Integer>();
        uniqueContext = new HashMap<Context, Integer>();
        uniqueStatement = new HashMap<Integer, Integer>();
        idToStatement = new HashMap<Integer,Statement>();
    }

    public void add(Statement stmt) {
        try {
            statements.add(stmt);
            addUniqueInputContext(stmt.getInputContext());
            addUniqueOutputContext(stmt.getOuputContext());
            addUniqueContext(stmt.getContext());
            addUniqueStatement(stmt);
        } catch (Exception e) {
            System.err.println("erreur la");
        }

    }

    protected void addUniqueStatement(Statement stmt) {
        boolean same = false;
        for (Integer otherStmtId: uniqueStatement.keySet()) {
            if(otherStmtId == stmt.id()) {
                same = true;
                uniqueStatement.put(otherStmtId, uniqueStatement.get(otherStmtId)+1);
                break;
            }
        }
        if(!same) {
            uniqueStatement.put(stmt.id(),1);
            idToStatement.put(stmt.id(), stmt);
        }
    }

    protected void addUniqueContext(Context context) {
        boolean same = false;
        for (Context othercontext: uniqueContext.keySet()) {
            if(context.equals(othercontext)) {
                same = true;
                uniqueContext.put(othercontext, uniqueContext.get(othercontext)+1);
                break;
            }
        }
        if(!same)
            uniqueContext.put(context,1);
    }

    protected void addUniqueInputContext(InputContext otherInputContext) {
        boolean same = false;
        for (InputContext inputContext: uniqueInputContext.keySet()) {
            if(inputContext.equals(otherInputContext)) {
                uniqueInputContext.put(inputContext, uniqueInputContext.get(inputContext)+1);
                same = true;
                break;
            }
        }
        if(!same)
            uniqueInputContext.put(otherInputContext,1);
    }

    protected void addUniqueOutputContext(CtTypeReference<?> output){
        boolean same = false;
        for (CtTypeReference<?> otherOuput: uniqueOutputContext.keySet()) {
            if(output.equals(otherOuput)) {
                uniqueOutputContext.put(otherOuput, uniqueOutputContext.get(otherOuput)+1);
                same = true;
                break;
            }
        }
        if(!same)
            uniqueOutputContext.put(output,1);
    }

    public int size() {
        return statements.size();
    }
    public Map<Context, Integer> getUniqueContext() {
        return uniqueContext;
    }
    public Map<InputContext, Integer> getUniqueInputContext() {
        return uniqueInputContext;
    }
    public Map<CtTypeReference<?>, Integer> getUniqueOutputContext() {
        return uniqueOutputContext;
    }
    public Map<Integer, Integer> getUniqueStatment() {
        return uniqueStatement;
    }

    public Collection<Statement> getUniqueStatementList() {
        return idToStatement.values();
    }

    public List<Statement> getStatements() {
        return  statements;
    }
}
