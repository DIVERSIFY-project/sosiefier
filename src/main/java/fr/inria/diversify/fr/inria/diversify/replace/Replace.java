package fr.inria.diversify.fr.inria.diversify.replace;

import fr.inria.diversify.statement.Statement;
import fr.inria.diversify.statementProcessor.StatementProcessor;
import spoon.processing.ProcessingManager;
import spoon.reflect.Factory;
import spoon.support.QueueProcessingManager;
import spoon.support.builder.SpoonBuildingManager;

import java.util.List;
import java.util.Random;

/**
 * User: Simon
 * Date: 4/25/13
 * Time: 2:42 PM
 */
public class Replace {

    protected Factory factory;
    protected List<Statement> statements;

    public Replace(List<Statement> stmts,Factory factory) {
        statements = stmts;
        this.factory = factory;
    }

    protected Statement getStatementToReplace(Class stmtType) {
        Random r = new Random();
        Statement s = statements.get(r.nextInt(statements.size()));

        while (s.getClass() != stmtType)
            s = statements.get(r.nextInt(statements.size()));

        return s;
    }

    protected Statement getStatementToReplace() {
        Random r = new Random();
        return statements.get(r.nextInt(statements.size()));
    }

    protected Statement findStatement(String stmtString) {
        Statement s = null;
        for (Statement stmt : statements)
            if (stmt.StatementString().equals(stmtString))
                s = stmt;
        return s;
    }

    protected Statement getStatement(Statement stmt) {
        Statement s = null;
        for (Statement statement2 : statements)
            if (stmt.isReplace(statement2) && statement2 != stmt) {
                s = statement2;
                break;
            }
        if (s == null)
            return null;
        return copyStatement(s);
    }

    protected Statement copyStatement(Statement statement) {
        SpoonBuildingManager builder = new SpoonBuildingManager(factory);

        try {
            builder.addInputSource(statement.getSourceFile());
            builder.build();
        } catch (Exception e) {

            e.printStackTrace();
        }

        ProcessingManager pm = new QueueProcessingManager(factory);
        StatementProcessor processor = new StatementProcessor();

        pm.addProcessor(processor);
        pm.process();

        Statement s = null;
        for (Statement stmt : processor.getStatements()) {
            if (statement.equalString().equals(stmt.equalString())) {
                s = stmt;
            }
        }
        System.out.println(s.getContext() +"  "+ statement.hashCode());

        return s;
    }

    public void replace() {
        Statement stmt = getStatementToReplace();
        Statement stmt2 = getStatement(stmt);
        System.out.println(stmt + "\n" + stmt.getStatementType().getSimpleName());
        if (stmt2 != null) {

            System.out.println("\nreplaced by:");
            System.out.println(stmt2 + "\n" + stmt2.getStatementType().getSimpleName());
            try {
                stmt.replace(stmt2);
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
        }

    }

}
