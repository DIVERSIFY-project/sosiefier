package fr.inria.diversify.replace;

import fr.inria.diversify.codeFragment.CodeFragment;
import fr.inria.diversify.codeFragment.CodeFragmentList;
import fr.inria.diversify.codeFragment.Statement;
import fr.inria.diversify.codeFragmentProcessor.StatementProcessor;
import fr.inria.diversify.codeFragmentProcessor.SubStatementVisitor;
import fr.inria.diversify.runtest.ICoverageReport;
import spoon.reflect.Factory;
import spoon.reflect.code.CtStatement;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtSimpleType;

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
    private CodeFragment tmp;
    private boolean replace;


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

        while (s.getClass() != stmtType && coverageReport.codeFragmentCoverage(s) == 0)
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
        replace = false;
        Transformation tf = new Transformation();
        while (cfReplacedBy == null) {
            cfToReplace = randomCodeFragmentToReplace();
            getCodeFragmentReplacedBy();
        }
        originalClass = cfToReplace.getCompilationUnit().getMainType();
        CtSimpleType<?> newClass = (CtSimpleType<?>) copyElem(originalClass);

        for (CodeFragment cf : codeFragmentFor(newClass)) {
            if (cf.equalString().equals(cfToReplace.equalString())) {
                tmp = cf;
                break;
            }
        }

        tf.setStatementToReplace(cfToReplace);
        tf.setStatementReplacedBy(cfReplacedBy);

        System.out.println("cfToReplace (coverage: " + coverageReport.codeFragmentCoverage(cfToReplace) + ") type: "+cfToReplace.getCodeFragmentType() +"\n " + tmp);
        System.out.println("cfReplacedBy\n " + cfReplacedBy);
        Map<String, String> varMapping = tmp.randomVariableMapping(cfReplacedBy); //tmp
        tf.setVariableMapping(varMapping);
        System.out.println("random variable mapping: " + varMapping);
        tmp.replace(cfReplacedBy, varMapping);  //tmp

        printJavaFile(srcDir, newClass);

        replace = true;
        return tf;
    }


    public void restore() throws Exception {
        if(replace)
            tmp.getCtCodeFragment().getParent().replace(cfToReplace.getCtCodeFragment().getParent());

        String fileToCopy = originalClass.getPosition().getFile().toString();
        String destination = srcDir+ "/"+originalClass.getQualifiedName().replace('.', '/') + ".java";
        Runtime r = Runtime.getRuntime();
        Process p = r.exec("cp " + fileToCopy + " " + destination);

        System.out.println("restore file: "+fileToCopy + " -> "+destination);
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
//    public void compile(File directory, Factory f) throws CompileException {
//
////        JDTCompiler compiler = new JDTCompiler();
////        try {
////            compiler.compileSrc(f, allJavaFile(directory));
////        } catch (Exception e) {
////            e.printStackTrace();
////        }
//        String tmp = "javac -encoding utf8 ";
//        for (File file : allJavaFile(directory)) {
//            tmp = tmp + file.toString() + " ";
//        }
//        try {
//            Runtime r = Runtime.getRuntime();
//            Process p = r.exec(tmp);
//
//            p.waitFor();
//            String line;
//            StringBuffer output = new StringBuffer();
//            while ((line = reader.readLine()) != null) {
//                output.append(line + "\n");
//                if (line.contains(" error"))  {
//                    reader.close();
//                    throw new CompileException("error during compilation\n"+output);
//                }
//            }
//            reader.close();
//        } catch (IOException e) {
//            throw new CompileException(e);
//        } catch (InterruptedException e) {
//            throw new CompileException(e);
//        }
//    }
}
