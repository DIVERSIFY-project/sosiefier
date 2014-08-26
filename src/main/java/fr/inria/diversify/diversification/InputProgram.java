package fr.inria.diversify.diversification;

import fr.inria.diversify.codeFragment.CodeFragmentList;
import fr.inria.diversify.codeFragmentProcessor.InlineConstantProcessor;
import fr.inria.diversify.codeFragmentProcessor.KnownTransfStatementProcessor;
import fr.inria.diversify.codeFragmentProcessor.ReturnProcessor;
import fr.inria.diversify.codeFragmentProcessor.StatementProcessor;
import fr.inria.diversify.coverage.ICoverageReport;
import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtMethod;
import javassist.NotFoundException;
import org.json.JSONArray;
import org.json.JSONException;
import spoon.processing.AbstractProcessor;
import spoon.processing.ProcessingManager;
import spoon.reflect.code.CtLocalVariable;
import spoon.reflect.code.CtReturn;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtPackage;
import spoon.reflect.declaration.CtSimpleType;
import spoon.reflect.factory.Factory;
import spoon.reflect.visitor.QueryVisitor;
import spoon.reflect.visitor.filter.TypeFilter;
import spoon.support.QueueProcessingManager;

import java.util.*;
import java.util.stream.Collectors;

/**
 * The InputProgram class encapsulates all the known information of the program being sosiefiecated
 * <p/>
 * Created by marcel on 6/06/14.
 */
public class InputProgram {

    /**
     * List of all the code fragments extracted by Spoon of the input program
     */
    private CodeFragmentList codeFragments;

    /**
     * Coverage report for the input program
     */
    private ICoverageReport coverageReport;

    /**
     * Path to the root directory of the input program
     */
    private String programDir;

    /**
     * Path to the source code of the input program
     */
    private String sourceCodeDir;

    /**
     * Path to the test source code of the input program
     */
    private String testSourceCodeDir;

    /**
     * Path to the built classes
     */
    private String classesDir;

    /**
     * Path to the coverage information
     */
    private String coverageDir;

    /**
     * Path to previous transformations made in this input program
     */
    private String previousTransformationsPath;

    /**
     * Number of transformations that we are going to attempt in every run of the diversificator
     */
    private int transformationPerRun;

    /**
     * Minimum number of transformations that we are going to attempt in every run of the diversificator
     */
    private int minTransformationsPerRun;

    /**
     * Root spoon element for an input program, mostly upper level packages
     */
    private Set<CtElement> roots;

    /**
     * List Spoon return statements that can be found in this program
     */
    protected List<CtReturn> returns;


    protected Map<Class, List<CtElement>> typeToObject = new HashMap<Class, List<CtElement>>();

    /**
     * List of inline constants that can be found in this program
     */
    protected List<CtLocalVariable> inlineConstant;

    /**
     * Java assists methods for byte code manipulation
     */
    private List<CtMethod> javassistMethods;

    /**
     * Spoon factory to process all AST elements
     */
    private Factory factory;


    /**
     * Spoon factory to process all AST elements
     */
    public Factory getFactory() {
        return factory;
    }

    public void setFactory(Factory factory) {
        this.factory = factory;
    }

    /**
     * Coverage report for the input program
     */
    public ICoverageReport getCoverageReport() {
        return coverageReport;
    }

    /**
     * Coverage report for the input program
     */
    public void setCoverageReport(ICoverageReport coverageReport) {
        this.coverageReport = coverageReport;
    }

    /**
     * Path to the test source code of the input program
     */
    public String getTestSourceCodeDir() {
        return testSourceCodeDir;
    }

    public void setTestSourceCodeDir(String testSourceCodeDir) {
        this.testSourceCodeDir = testSourceCodeDir;
    }

    /**
     * Path to the source of the input program
     */
    public String getSourceCodeDir() {
        return sourceCodeDir;
    }

    public void setSourceCodeDir(String sourceCodeDir) {
        this.sourceCodeDir = sourceCodeDir;
    }


    /**
     * Path to the know sosie information stored in file
     */
    public String getPreviousTransformationsPath() {
        return previousTransformationsPath;
    }

    public void setPreviousTransformationsPath(String path) {
        this.previousTransformationsPath = path;
    }

    /**
     * Number of transformations that we are going to attempt in every run of the diversificator
     */
    public int getTransformationPerRun() {
        return transformationPerRun;
    }

    public void setTransformationPerRun(int transformationPerRun) {
        this.transformationPerRun = transformationPerRun;
    }

    /**
     * Path to the root directory of the input program
     */
    public String getProgramDir() {
        return programDir;
    }

    public void setProgramDir(String programDir) {
        this.programDir = programDir;
    }

    /**
     * Path to the built classes
     */
    public String getClassesDir() {
        return classesDir;
    }

    public void setClassesDir(String classesDir) {
        this.classesDir = classesDir;
    }


    /**
     * Path to the coverage information
     */
    public String getCoverageDir() {
        return coverageDir;
    }

    public void setCoverageDir(String coverageDir) {
        this.coverageDir = coverageDir;
    }

    /**
     * Minimum number of transformations that we are going to attempt in every run of the diversificator
     */
    public int getMinTransformationsPerRun() {
        return minTransformationsPerRun;
    }

    public void setMinTransformationsPerRun(int minTransformationsPerRun) {
        this.minTransformationsPerRun = minTransformationsPerRun;
    }

    /**
     * Process all code fragments. Used to early process them.
     */
    public void processCodeFragments() {
        if (codeFragments == null) {
            ProcessingManager pm = new QueueProcessingManager(factory);
            StatementProcessor processor = new StatementProcessor();
            pm.addProcessor(processor);
            pm.process();
            codeFragments = processor.getCodeFragments();
        }
    }


    /**
     * Process only the code fragments needed to handle a known set of transformations.
     * <p/>
     * This is faster than processing all. Useful for multi-sosies when we start from a known set of single-sosies
     * instead of searching out of the fragments.
     *
     * @param transformations An array of stored transformations.
     */
    public void processCodeFragments(JSONArray transformations) throws JSONException {
        if (codeFragments == null) {
            ProcessingManager pm = new QueueProcessingManager(factory);
            KnownTransfStatementProcessor processor = null;
            processor = new KnownTransfStatementProcessor(transformations);
            pm.addProcessor(processor);
            pm.process();
            codeFragments = processor.getCodeFragments();
        }
    }

    /**
     * List of all the code fragments extracted by Spoon of the input program
     */
    public synchronized CodeFragmentList getCodeFragments() {
        processCodeFragments();
        return codeFragments;
    }

    /**
     * Root spoon element for an input program, mostly upper level packages
     */
    public synchronized Set<CtElement> getRoots() {
        if (roots == null) {
            roots = new HashSet<>();
            ProcessingManager pm = new QueueProcessingManager(factory);
            AbstractProcessor<CtPackage> processor = new AbstractProcessor<CtPackage>() {
                @Override
                public void process(CtPackage element) {
                    CtElement root = element;
                    while (root.getParent() != null) {
                        root = root.getParent();
                    }
                    roots.add(root);
                }
            };
            pm.addProcessor(processor);
            pm.process();
        }
        return roots;
    }

    /**
     * Java assists methods for byte code manipulation
     */
    public synchronized List<CtMethod> getJavassistMethods() {

        if (javassistMethods == null) {
            javassistMethods = new ArrayList<>();
            ClassPool pool = ClassPool.getDefault();
            //pool.insertClassPath(DiversifyProperties.getProperty("project") + "/" + DiversifyProperties.getProperty("classes"));
            try {
                pool.insertClassPath(classesDir);
            } catch (NotFoundException e) {
                throw new RuntimeException("Cannot find classesDir " + classesDir, e);
            }
            for (CtSimpleType cl : getCodeFragments().getAllClasses()) {
                CtClass cc;
                try {
                    cc = pool.get(cl.getQualifiedName());
                } catch (NotFoundException e) {
                    throw new RuntimeException(e);
                }
                for (CtMethod method : cc.getDeclaredMethods())
                    if (!method.isEmpty()) {
                        javassistMethods.add(method);
                    }
            }
        }
        return javassistMethods;
    }

    /**
     * Get the inline constant statements on the program
     *
     * @return
     */
    public synchronized List<CtLocalVariable> getInlineConstant() {
        if (inlineConstant == null) {
            ProcessingManager pm = new QueueProcessingManager(factory);
            InlineConstantProcessor processor = new InlineConstantProcessor();
            pm.addProcessor(processor);
            pm.process();

            inlineConstant = processor.getInlineConstant();
        }
        return inlineConstant;
    }

    public synchronized List<CtElement> getAllElement(Class cl) {

        if (!typeToObject.containsKey(cl)) {
            QueryVisitor query = new QueryVisitor(new TypeFilter(cl));
            getRoots().stream()
                    .flatMap(root -> {
                        root.accept(query);
                        return query.getResult().stream();
                    })
                    .collect(Collectors.toList());

            typeToObject.put(cl, query.getResult());
        }
        return typeToObject.get(cl);
    }


    /**
     * Get return statements of the program
     *
     * @return
     */
    public synchronized List<CtReturn> getReturns() {
        if (returns == null) {
            ProcessingManager pm = new QueueProcessingManager(factory);
            ReturnProcessor processor = new ReturnProcessor();
            pm.addProcessor(processor);
            pm.process();

            returns = processor.getReturns();
        }
        return returns;
    }

    /**
     * Copies properties from the configuration
     *
     * @param configuration
     */
    public void configure(InputConfiguration configuration) {
        setSourceCodeDir(configuration.getSourceCodeDir());
        setPreviousTransformationsPath(configuration.getPreviousTransformationPath());
        setClassesDir(configuration.getClassesDir());
        setCoverageDir(configuration.getCoverageDir());
    }
}
