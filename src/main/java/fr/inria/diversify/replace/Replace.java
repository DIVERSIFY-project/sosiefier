package fr.inria.diversify.replace;

import fr.inria.diversify.codeFragment.CodeFragment;
import fr.inria.diversify.codeFragment.CodeFragmentList;
import fr.inria.diversify.codeFragment.Statement;
import fr.inria.diversify.codeFragmentProcessor.StatementProcessor;
import fr.inria.diversify.codeFragmentProcessor.SubStatementVisitor;
import fr.inria.diversify.runtest.CoverageReport;
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
    protected CodeFragmentList statements;
    protected CodeFragment stmtToReplace;
    protected CodeFragment stmtReplacedBy;
    protected CtSimpleType<?> oldClass;
    protected CtSimpleType<?> newClass;


    public Replace(CodeFragmentList statements, CoverageReport cr, String tmpDir) {
        this.tmpDir = tmpDir;
        this.statements = statements;

        this.factory = statements.getCodeFragments().get(0).getCtCodeFragment().getFactory();
        this.coverageReport = cr;
    }

    public void setStatementToReplace(CodeFragment stmt) {
        stmtToReplace = stmt;
    }


    protected CodeFragment getStatementToReplace() {
        if(stmtToReplace == null)  {
//             choix d'une strategie de selection
            stmtToReplace = randomStatementToReplace();
        }
        return stmtToReplace;
    }

    protected CodeFragment getStatementReplacedBy() {
        if(stmtReplacedBy == null)  {
//             choix d'une strategie de selection
            stmtReplacedBy = findRandomCandidateStatement(stmtToReplace);
        }
        return stmtReplacedBy;
    }

    protected CodeFragment randomStatementToReplace(Class stmtType) {
        Random r = new Random();
        int size = getAllStatements().size();
        CodeFragment s = getAllStatements().get(r.nextInt(size));

        while (s.getClass() != stmtType && !coverageReport.statementCoverage(s))
            s = getAllStatements().get(r.nextInt(size));
        return s;
    }

    protected CodeFragment randomStatementToReplace() {
        Random r = new Random();
        int size = getAllStatements().size();
        CodeFragment stmt = getAllStatements().get(r.nextInt(size));

        while(!coverageReport.statementCoverage(stmt))
            stmt = getAllStatements().get(r.nextInt(size));
        return stmt;
    }

    protected CodeFragment findStatement(String stmtString) {
        CodeFragment s = null;
        for (CodeFragment stmt : getAllStatements())
            if (stmt.codeFragmentString().equals(stmtString))
                s = stmt;
        return s;
    }

    protected Statement findRandomCandidateStatement(CodeFragment stmt) {
        List<CodeFragment> list = new ArrayList<CodeFragment>();
        for (CodeFragment statement : getAllUniqueStatement())
            if (stmt.isReplace(statement) && !statement.equalString().equals(stmt.equalString()))
               list.add(statement);

        if (list.isEmpty())
            return null;

       Random r = new Random();
        CtStatement tmp = (CtStatement)copyElem(list.get(r.nextInt(list.size())).getCtCodeFragment());
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
        oldClass = factory.Core().clone(stmtToReplace.getSourceClass());
        newClass = stmtToReplace.getSourceClass();
//        oldClass = factory.Core().clone(stmtToReplace.getCtCodeFragment().getParent(CtSimpleType.class))  ;
//        newClass = stmtToReplace.getCtCodeFragment().getParent(CtSimpleType.class);
        Statement tmp = new Statement((CtStatement)copyElem(stmtReplacedBy.getCtCodeFragment()));

        Map<String,String> varMapping = stmtToReplace.randomVariableMapping(tmp);
        tf.setVariableMapping(varMapping);
        System.out.println("random variable mapping: "+varMapping);
        stmtToReplace.replace(tmp, varMapping);

        printJavaFile(tmpDir, newClass);
        compile(new File(tmpDir), newClass.getFactory());

        return tf;
    }



    public void restore() throws CompileException, IOException {
        List<CodeFragment> statementToRemove = new ArrayList<CodeFragment>();
        for (CodeFragment stmt : getAllStatements())
              if(stmt.getCtCodeFragment().getParent(CtSimpleType.class).equals(newClass))
                  statementToRemove.add(stmt);

        SubStatementVisitor sub = new SubStatementVisitor();
        getAllStatements().removeAll(statementToRemove);
        oldClass.accept(sub);
         StatementProcessor sp = new StatementProcessor();
        for (CtStatement stmt : sub.getStatements())
            sp.process(stmt);

        getAllStatements().addAll(sp.getStatements().getCodeFragments());
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

    protected List<CodeFragment> getAllStatements() {
        return statements.getCodeFragments();
    }

    protected Collection<CodeFragment> getAllUniqueStatement() {
        return statements.getUniqueCodeFragmentList();
    }
}
