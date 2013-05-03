package fr.inria.diversify.replace;

import fr.inria.diversify.runtest.CoverageReport;
import fr.inria.diversify.statement.Statement;
import fr.inria.diversify.statement.StatementList;
import fr.inria.diversify.statementProcessor.StatementProcessor;
import fr.inria.diversify.statementProcessor.SubStatementVisitor;
import org.json.JSONException;
import spoon.reflect.Factory;
import spoon.reflect.code.CtStatement;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtSimpleType;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * User: Simon
 * Date: 4/25/13
 * Time: 2:42 PM
 */
public class Replace {

    protected String tmpDir;
    protected CoverageReport coverageReport;
    protected Factory factory;
    protected StatementList statements;
    protected Statement stmtToReplace;
    protected Statement stmtReplacedBy;
    protected CtSimpleType<?> oldClass;
    protected CtSimpleType<?> newClass;


    public Replace(StatementList statements, CoverageReport cr, String tmpDir) {
        this.tmpDir = tmpDir;
        this.statements = statements;

        this.factory = statements.getStatements().get(0).getCtStatement().getFactory();
        this.coverageReport = cr;
    }

    public void setStatementToReplace(Statement stmt) {
        stmtToReplace = stmt;
    }


    protected Statement getStatementToReplace() {
        if(stmtToReplace == null)  {
//             choix d'une strategie de selection
            stmtToReplace = randomStatementToReplace();
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
        int size = getAllStatements().size();
        Statement s = getAllStatements().get(r.nextInt(size));

        while (s.getClass() != stmtType && !coverageReport.statementCoverage(s))
            s = getAllStatements().get(r.nextInt(size));
        return s;
    }

    protected Statement randomStatementToReplace() {
        Random r = new Random();
        int size = getAllStatements().size();
        Statement stmt = getAllStatements().get(r.nextInt(size));

        while(!coverageReport.statementCoverage(stmt))
            stmt = getAllStatements().get(r.nextInt(size));
        return stmt;
    }

    protected Statement findStatement(String stmtString) {
        Statement s = null;
        for (Statement stmt : getAllStatements())
            if (stmt.StatementString().equals(stmtString))
                s = stmt;
        return s;
    }

    protected Statement findRandomCandidateStatement(Statement stmt) {
        List<Statement> list = new ArrayList<Statement>();
        for (Statement statement : getAllUniqueStatement())
            if (stmt.isReplace(statement) && !statement.equalString().equals(stmt.equalString()))
               list.add(statement);

        if (list.isEmpty())
            return null;

       Random r = new Random();
        CtStatement tmp = (CtStatement)copyElem(list.get(r.nextInt(list.size())).getCtStatement());
        return new Statement(tmp);
    }

    protected CtElement copyElem(CtElement elem) {
        CtElement tmp = factory.Core().clone(elem);
        tmp.setParent(elem.getParent());
        return tmp;
    }

    public Transformation replace() throws CompileException, IOException, JSONException {
        Transformation tf = new Transformation();
        while(stmtReplacedBy == null) {
            stmtToReplace = randomStatementToReplace();
            getStatementReplacedBy();
        }
        tf.setStatementToReplace(stmtToReplace.toJSONObject());
        tf.setStatementReplacedBy(stmtToReplace.toJSONObject());

        oldClass = factory.Core().clone(stmtToReplace.getCtStatement().getParent(CtSimpleType.class))  ;
        newClass = stmtToReplace.getCtStatement().getParent(CtSimpleType.class);
        Statement tmp = new Statement((CtStatement)copyElem(stmtReplacedBy.getCtStatement()));

        Map<String,String> varMapping = stmtToReplace.randomVariableMapping(tmp);
        tf.setVariableMapping(varMapping);
        System.out.println("random variable mapping: "+varMapping);
        stmtToReplace.replace(tmp, varMapping);

        printJavaFile(tmpDir, newClass);
        compile(new File(tmpDir), newClass.getFactory());

        return tf;
    }



    public void restore() throws CompileException, IOException {
        List<Statement> statementToRemove = new ArrayList<Statement>();
        for (Statement stmt : getAllStatements())
              if(stmt.getCtStatement().getParent(CtSimpleType.class).equals(newClass))
                  statementToRemove.add(stmt);

        SubStatementVisitor sub = new SubStatementVisitor();
        getAllStatements().removeAll(statementToRemove);
        oldClass.accept(sub);
         StatementProcessor sp = new StatementProcessor();
        for (CtStatement stmt : sub.getStatements())
            sp.process(stmt);

        getAllStatements().addAll(sp.getStatements().getStatements());
        oldClass.setParent(newClass.getParent());

        System.out.println("oldClass "+oldClass.getSimpleName() + oldClass.getSignature());

        printJavaFile(tmpDir, oldClass);
        compile(new File(tmpDir), oldClass.getFactory());
    }

    public void printJavaFile(String repository, CtSimpleType<?> type) throws IOException {
        MyJavaOutputProcessor processor = new MyJavaOutputProcessor(new File(repository));
        processor.setFactory(type.getFactory());
        processor.createJavaFile(type);
    }

    //method a refaire
    public void compile(File directory, Factory f) throws CompileException {
//        JDTCompiler compiler = new JDTCompiler();
//        try {
//            compiler.compileSrc(f, allJavaFile(directory));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        String tmp = "javac -encoding utf8 ";
        for (File file : allJavaFile(directory)) {
            tmp = tmp + file.toString() + " ";
        }
        try {
            Runtime r = Runtime.getRuntime();
            Process p = r.exec(tmp);
            BufferedReader reader = new BufferedReader(new InputStreamReader(p.getErrorStream()));
            p.waitFor();
            String line;
            StringBuffer output = new StringBuffer();
            while ((line = reader.readLine()) != null) {
                output.append(line+"\n");
                if (line.contains(" error"))  {
                    reader.close();
                    throw new CompileException("error during compilation\n"+output);
                }
            }
            reader.close();
        } catch (IOException e) {
            throw new CompileException(e);
        } catch (InterruptedException e) {
            throw new CompileException(e);
        }
    }

    protected List<File> allJavaFile(File dir) {
        List<File> list = new ArrayList<File>();
        for (File file : dir.listFiles())
            if(file.isFile())     {
                if(file.getName().endsWith(".java"))
                    list.add(file);
            }
            else
                list.addAll(allJavaFile(file));
        return list;
    }

    protected List<Statement> getAllStatements() {
        return statements.getStatements();
    }

    protected Collection<Statement> getAllUniqueStatement() {
        return statements.getUniqueStatementList();
    }
}
