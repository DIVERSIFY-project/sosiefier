package fr.inria.diversify.fr.inria.diversify.replace;

import fr.inria.diversify.fr.inria.diverfy.runtest.CoverageReport;
import fr.inria.diversify.statement.Statement;
import fr.inria.diversify.statementProcessor.StatementProcessor;
import fr.inria.diversify.statementProcessor.SubStatementVisitor;
import spoon.reflect.Factory;
import spoon.reflect.code.CtStatement;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtSimpleType;
import spoon.support.ByteCodeOutputProcessor;
import spoon.support.JavaOutputProcessor;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

/**
 * User: Simon
 * Date: 4/25/13
 * Time: 2:42 PM
 */
public class Replace {

    protected final CoverageReport coverageReport;
    protected Factory factory;
    protected List<Statement> allStatements;
    protected List<Statement> uniqueStatements;
    protected Statement stmtToReplace;
    protected Statement stmtReplacedBy;
    protected CtSimpleType<?> oldClass;
    protected CtSimpleType<?> newClass;

    public Replace(List<Statement> allStatements, Collection<Statement> uniqueStatements, CoverageReport cr) {
        this.allStatements = allStatements;
        this.uniqueStatements = new ArrayList<Statement>();
        this.uniqueStatements.addAll(uniqueStatements);
        this.factory = allStatements.get(0).getCtStatement().getFactory();
        this.coverageReport = cr;
    }

    public void setStatementToReplace(Statement stmt) {
        stmtToReplace = stmt;
    }
//    public void setStatementReplacedBy(Statement stmt) {
//        stmtReplacedBy = stmt;
//    }

    protected Statement getStatementToReplace() {
        if(stmtToReplace == null)  {
//             choix d'une strategie de selection
            stmtToReplace = randomStatementToReplace();
//            oldClass = copyElem(stmtToReplace.getCtStatement().getParent(CtClass.class));
        }
        return stmtToReplace;
    }

    protected Statement getStatementReplacedBy() {
        if(stmtReplacedBy == null)  {
//             choix d'une strategie de selection
            stmtReplacedBy = findRandomCandidateStatement(stmtToReplace);
        }
        return stmtReplacedBy;
    }

    protected Statement randomStatementToReplace(Class stmtType) {
        Random r = new Random();
        Statement s = allStatements.get(r.nextInt(allStatements.size()));

        while (s.getClass() != stmtType)
            s = allStatements.get(r.nextInt(allStatements.size()));

        return s;
    }

    protected Statement randomStatementToReplace() {
        Random r = new Random();
        Statement stmt = allStatements.get(r.nextInt(allStatements.size()));

        while(!coverageReport.statementCoverage(stmt))
            stmt = allStatements.get(r.nextInt(allStatements.size()));
        return stmt;
    }

    protected Statement findStatement(String stmtString) {
        Statement s = null;
        for (Statement stmt : allStatements)
            if (stmt.StatementString().equals(stmtString))
                s = stmt;
        return s;
    }

    protected Statement findRandomCandidateStatement(Statement stmt) {
        List<Statement> list = new ArrayList<Statement>();
        for (Statement statement : uniqueStatements)
            if (stmt.isReplace(statement) && !statement.equalString().equals(stmt.equalString()))
               list.add(statement);

        if (list.isEmpty())
            return null;
       System.out.println("number of replace: "+list.size());

       Random r = new Random();
        CtStatement tmp = (CtStatement)copyElem(list.get(r.nextInt(list.size())).getCtStatement());
        return new Statement(tmp);
    }

    protected CtElement copyElem(CtElement elem) {
        CtElement tmp = factory.Core().clone(elem);
        tmp.setParent(elem.getParent());
        return tmp;
    }

    public void replace() {
        while(stmtReplacedBy == null) {
            stmtToReplace = randomStatementToReplace();
            getStatementReplacedBy();
        }

        oldClass = factory.Core().clone(stmtToReplace.getCtStatement().getParent(CtSimpleType.class))  ;
        newClass = stmtToReplace.getCtStatement().getParent(CtSimpleType.class);
        Statement tmp = new Statement((CtStatement)copyElem(stmtReplacedBy.getCtStatement()));

        System.out.println(stmtToReplace + "\n" + stmtToReplace.getStatementType().getSimpleName());
        System.out.println("\nreplaced by:");
        System.out.println(tmp + "\n" + tmp.getStatementType().getSimpleName());

        stmtToReplace.replace(tmp);

        try {
            printJavaFile("output_new", newClass);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void restore() {
        List<Statement> statementToRemove = new ArrayList<Statement>();
        for (Statement stmt : allStatements) {
              if(stmt.getCtStatement().getParent(CtSimpleType.class).equals(newClass))
                  statementToRemove.add(stmt);
        }
        SubStatementVisitor sub = new SubStatementVisitor();
        allStatements.removeAll(statementToRemove);
        oldClass.accept(sub);
         StatementProcessor sp = new StatementProcessor();
        for (CtStatement stmt : sub.getStatements())
          sp.process(stmt);

        allStatements.addAll(sp.getStatements());
        oldClass.setParent(newClass.getParent());

        try {
            printJavaFile("output_old", oldClass);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void printJavaFile(String repository, CtSimpleType<?> type) throws IOException {
        JavaOutputProcessor processor = new JavaOutputProcessor(new File(repository));
        processor.setFactory(factory);
        processor.createJavaFile(type);
    }

    public void printByteCode(String repository, CtSimpleType<?> type) throws IOException {
        File dir =  new File(repository);
        ByteCodeOutputProcessor processor = new ByteCodeOutputProcessor( new JavaOutputProcessor(dir), dir);
        processor.setFactory(factory);
        processor.process(type);
    }
}
