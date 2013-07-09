package fr.inria.diversify.replace;

import fr.inria.diversify.codeFragment.CodeFragment;
import fr.inria.diversify.codeFragment.CodeFragmentList;
import fr.inria.diversify.codeFragment.Statement;
import fr.inria.diversify.codeFragmentProcessor.StatementProcessor;
import fr.inria.diversify.codeFragmentProcessor.SubStatementVisitor;
import fr.inria.diversify.runtest.ICoverageReport;
import spoon.reflect.Factory;
import spoon.reflect.code.CtStatement;
import spoon.reflect.cu.SourceCodeFragment;
import spoon.reflect.cu.SourcePosition;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtSimpleType;
import spoon.support.JavaOutputProcessor;

import java.io.File;
import java.io.IOException;
import java.util.*;

/**
 * User: Simon
 * Date: 4/25/13
 * Time: 2:42 PM
 */
public class Replace {

    protected final String srcDir;
    protected ICoverageReport coverageReport;
    protected CodeFragmentList codeFragments;
    protected CodeFragment cfToReplace;
    protected CodeFragment cfReplacedBy;
    protected CtSimpleType<?> originalClass;


    public Replace(CodeFragmentList codeFragments, ICoverageReport cr, String srcDir) {
        this.codeFragments = codeFragments;
        this.srcDir = srcDir;
        this.coverageReport = cr;
    }

    public void setCodeFragmentToReplace(CodeFragment stmt) {
        cfToReplace = stmt;
    }


    protected CodeFragment getCodeFragmentToReplace() {
        if (cfToReplace == null) {
//             choix d'une strategie de selection
            cfToReplace = randomCodeFragmentToReplace();
        }
        return cfToReplace;
    }

    protected CodeFragment getCodeFragmentReplacedBy() {
        if (cfReplacedBy == null) {
//             choix d'une strategie de selection
            cfReplacedBy = findRandomCandidateStatement(cfToReplace);
        }
        return cfReplacedBy;
    }

    protected CodeFragment randomCodeFragmentToReplace(Class stmtType) {
        Random r = new Random();
        int size = getAllCodeFragments().size();
        CodeFragment s = getAllCodeFragments().get(r.nextInt(size));

        while (s.getCodeFragmentType() != stmtType || coverageReport.codeFragmentCoverage(s) == 0)
            s = getAllCodeFragments().get(r.nextInt(size));
        return s;
    }

    protected CodeFragment randomCodeFragmentToReplace() {
        Random r = new Random();
        int size = getAllCodeFragments().size();
        CodeFragment stmt = getAllCodeFragments().get(r.nextInt(size));

        while (coverageReport.codeFragmentCoverage(stmt) == 0)
            stmt = getAllCodeFragments().get(r.nextInt(size));
        return stmt;
    }

    protected CodeFragment findCodeFragment(String stmtString) {
        CodeFragment s = null;
        for (CodeFragment stmt : getAllCodeFragments())
            if (stmt.codeFragmentString().equals(stmtString))
                s = stmt;
        return s;
    }

    protected Statement findRandomCandidateStatement(CodeFragment stmt) {
        List<CodeFragment> list = new ArrayList<CodeFragment>();
        for (CodeFragment statement : getAllUniqueCodeFragments())
            if (stmt.isReplace(statement) && !statement.equalString().equals(stmt.equalString()))
                list.add(statement);

        if (list.isEmpty())
            return null;

        Random r = new Random();
        CtStatement tmp = (CtStatement) copyElem(list.get(r.nextInt(list.size())).getCtCodeFragment());
        return new Statement(tmp);
    }

    protected CtElement copyElem(CtElement elem) {
        Factory factory = elem.getFactory();
        CtElement tmp = factory.Core().clone(elem);
        tmp.setParent(elem.getParent());
        return tmp;
    }


    public Transformation replace() throws Exception {
        Transformation tf = new Transformation();
        while (cfReplacedBy == null) {
            cfToReplace = randomCodeFragmentToReplace();
            getCodeFragmentReplacedBy();
        }
        originalClass = cfToReplace.getCompilationUnit().getMainType();


        tf.setStatementToReplace(cfToReplace);
        tf.setStatementReplacedBy(cfReplacedBy);

        System.out.println("cfToReplace:\n " + cfToReplace);
        System.out.println(cfToReplace.getCtCodeFragment().getPosition());
        System.out.println("cfReplacedBy\n " + cfReplacedBy);
        Map<String, String> varMapping = cfToReplace.randomVariableMapping(cfReplacedBy); //tmp
        tf.setVariableMapping(varMapping);
        System.out.println("random variable mapping: " + varMapping);
        cfReplacedBy.replaceVar(cfToReplace, varMapping);  //tmp

        if(cfReplacedBy.codeFragmentString().equals(cfToReplace.codeFragmentString()))
            throw new Exception("same statment");

        printJavaFile2(srcDir, originalClass);

//        printJavaFile2("/Users/Simon/Documents/code/diversify-statements/tmp", originalClass);
        return tf;
    }


    public void restore() throws Exception {

        String fileToCopy = originalClass.getPosition().getFile().toString();
        String destination = srcDir+ "/"+originalClass.getQualifiedName().replace('.', '/') + ".java";
        Runtime r = Runtime.getRuntime();
        Process p = r.exec("cp " + fileToCopy + " " + destination);

        System.out.println("restore file: " + fileToCopy + " -> " + destination);
        p.waitFor();
    }

    public List<CodeFragment> codeFragmentFor(CtSimpleType<?> cl) {
        SubStatementVisitor sub = new SubStatementVisitor();
        cl.accept(sub);
        StatementProcessor sp = new StatementProcessor();
        for (CtStatement stmt : sub.getStatements())
            sp.process(stmt);

        return sp.getStatements().getCodeFragments();
    }


    public void printJavaFile(String repository, CtSimpleType<?> type) throws IOException {
        ReplaceJavaOutputProcessor processor = new ReplaceJavaOutputProcessor(new File(repository));
        processor.setFactory(type.getFactory());
        processor.createJavaFile(type);
        System.out.println("copy file: "+repository+" " +type.getQualifiedName());
    }

    public void printJavaFile2(String repository, CtSimpleType<?> type) throws IOException {
        JavaOutputProcessor processor = new JavaOutputProcessor(new File(repository));
        type.getFactory().getEnvironment().useSourceCodeFragments(true);
        SourcePosition sp = cfToReplace.getCtCodeFragment().getPosition();

        processor.setFactory(type.getFactory());
        int r =sp.getSourceEnd() -sp.getSourceStart();

        type.getPosition().getCompilationUnit().addSourceCodeFragment(new SourceCodeFragment(sp.getSourceStart(), "//delete", r));
        type.getPosition().getCompilationUnit().addSourceCodeFragment(new SourceCodeFragment(sp.getSourceStart(), cfReplacedBy.codeFragmentString(), 0));
        processor.createJavaFile(type);
        type.getPosition().getCompilationUnit().getSourceCodeFraments().clear();
        System.out.println("copy file: "+repository+" " +type.getQualifiedName());
    }

    protected List<File> allJavaFile(File dir) {
        List<File> list = new ArrayList<File>();
        for (File file : dir.listFiles())
            if (file.isFile()) {
                if (file.getName().endsWith(".java"))
                    list.add(file);
            } else
                list.addAll(allJavaFile(file));
        return list;
    }

    protected List<CodeFragment> getAllCodeFragments() {
        return codeFragments.getCodeFragments();
    }

    protected Collection<CodeFragment> getAllUniqueCodeFragments() {
        return codeFragments.getUniqueCodeFragmentList();
    }

}
