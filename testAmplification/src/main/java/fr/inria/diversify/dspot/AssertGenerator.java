package fr.inria.diversify.dspot;

import fr.inria.diversify.buildSystem.DiversifyClassLoader;
import fr.inria.diversify.compare.ObjectLog;
import fr.inria.diversify.compare.Observation;
import fr.inria.diversify.runner.InputProgram;
import fr.inria.diversify.factories.DiversityCompiler;
import fr.inria.diversify.util.Log;
import fr.inria.diversify.util.LoggerUtils;
import org.apache.commons.io.FileUtils;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import spoon.reflect.code.*;
import spoon.reflect.declaration.CtAnnotation;
import spoon.reflect.declaration.CtClass;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.factory.Factory;
import spoon.reflect.reference.CtPackageReference;
import spoon.reflect.reference.CtTypeReference;
import spoon.reflect.visitor.Query;
import spoon.reflect.visitor.filter.TypeFilter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

/**
 * User: Simon
 * Date: 22/10/15
 * Time: 10:06
 */
public class AssertGenerator {


    protected ClassLoader assertGeneratorClassLoader;
    protected ClassLoader regressionTestClassLoader;
    protected CtMethod test;
    protected CtClass originalClass;
    protected DiversityCompiler compiler;
    protected InputProgram inputProgram;
    protected List<Integer> statementsIndexToAssert;



    public AssertGenerator(CtClass originalClass, InputProgram inputProgram, DiversityCompiler compiler, ClassLoader applicationClassLoader) throws IOException {
        this.originalClass = originalClass;
        this.compiler = compiler;
        this.assertGeneratorClassLoader = applicationClassLoader;

        this.inputProgram = inputProgram;
        statementsIndexToAssert = new ArrayList<>();

    }

    protected static BufferedWriter log;
    protected static int version;
    protected static String resultDir;
    public static void initLog(String dir, int v) throws IOException {
        version = v;
        if(log == null) {
            resultDir = dir;
            FileWriter fw = new FileWriter(resultDir + "/assertGeneratorLog");
            log = new BufferedWriter(fw);
            File file = new File(resultDir + "/assertGenerationTestSource/");
            file.mkdirs();
        }
    }

    protected CtMethod generateAssert(CtMethod test) throws IOException, ClassNotFoundException {
        this.test = test;
        this.test = createTestWithoutAssert(new ArrayList<>(), false);
        this.test.setParent(test.getParent());
        for(int i = 0; i < Query.getElements(this.test, new TypeFilter(CtStatement.class)).size(); i++) {
            statementsIndexToAssert.add(i);
        }

        CtMethod newTest = generateAssert();
        if(newTest == null || !isCorrect(newTest)) {
            return null;
        }
        return newTest;
    }

    protected CtMethod generateAssert(CtMethod test, List<Integer> statementsIndexToAssert) throws IOException, ClassNotFoundException {
        this.test = test;
        this.statementsIndexToAssert = statementsIndexToAssert;
        CtMethod newTest = generateAssert();
        if(newTest == null || !isCorrect(newTest)) {
            return null;
        }

        Result r1 = runSingleTest(newTest, assertGeneratorClassLoader);
        Result r2 = runSingleTest(newTest, DSpot.regressionClassLoader);

        if(!equalResult(r1, r2)) {
            try {
                r1 = runSingleTest(newTest, assertGeneratorClassLoader);
                r2 = runSingleTest(newTest, DSpot.regressionClassLoader);
                Thread.sleep(200);
                if(!equalResult(r1, r2)) {
                    Log.info("");
                    log.write("version: "+ version + ", " + test.getSignature());
                    File file = new File(resultDir + "/assertGenerationTestSource/"+ version + "/");
                    file.mkdirs();

                    CtClass newClass = initTestClass();

                    CtMethod cloneTest = getFactory().Core().clone(test);
                    newClass.addMethod(cloneTest);
                    LoggerUtils.printJavaFile(compiler.getOutputDirectory(), newClass);

                }
            } catch (InterruptedException e) {}
        }

        return newTest;
    }

    private boolean equalResult(Result r1, Result r2) {

        return (r1 == null) == (r2 == null)
                && r1 == null
                || r1.getFailures().size() == r2.getFailures().size();
    }

    protected CtMethod generateAssert() throws IOException, ClassNotFoundException {
        List<CtMethod> testsToRun = new ArrayList<>();
        CtClass cl = initTestClass();

        CtMethod cloneTest = getFactory().Core().clone(test);
        cl.addMethod(cloneTest);
        testsToRun.add(cloneTest);

        CtMethod testWithoutAssert = createTestWithoutAssert(new ArrayList<>(), false);
        testsToRun.add(testWithoutAssert);
        cl.addMethod(testWithoutAssert);

        Result result = runTests(testsToRun, assertGeneratorClassLoader);
        if(result == null) {
            return null;
        }
        try {
            String testWithoutAssertName = test.getSimpleName() + "_withoutAssert";
            if(testFailed(testWithoutAssertName, result)) {
                return makeFailureTest(getFailure(testWithoutAssertName, result));
            } else if(!testFailed(test.getSimpleName(), result)) {
                if(!statementsIndexToAssert.isEmpty()) {
                    return buildNewAssert();
                }
            } else {
                removeFailAssert();
                if(!statementsIndexToAssert.isEmpty()) {
                    return buildNewAssert();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            Log.debug("");
        }
        return null;
    }

    protected CtMethod makeFailureTest(Failure failure) {
        CtMethod testWithoutAssert = createTestWithoutAssert(new ArrayList<>(), false);
        testWithoutAssert.setSimpleName(test.getSimpleName());
        Factory factory = testWithoutAssert.getFactory();

        CtAnnotation testAnnotation = testWithoutAssert.getAnnotations().stream()
                .filter(annotation -> annotation.toString().contains("Test"))
                .findFirst().orElse(null);

        if(testAnnotation != null) {
            testWithoutAssert.removeAnnotation(testAnnotation);
        }

        testAnnotation = factory.Core().createAnnotation();
        CtTypeReference<Object> ref = factory.Core().createTypeReference();
        ref.setSimpleName("Test");

        CtPackageReference refPackage = factory.Core().createPackageReference();
        refPackage.setSimpleName("org.junit");
        ref.setPackage(refPackage);
        testAnnotation.setAnnotationType(ref);


        Map<String, Object> elementValue = new HashMap<String, Object>();
        Throwable exception = failure.getException();
        if(exception instanceof  AssertionError)   {
            exception = exception.getCause();
        }
        Class exceptionClass;
        if(exception == null) {
            exceptionClass = Throwable.class;
        } else {
            exceptionClass = exception.getClass();
        }
        elementValue.put("expected", exceptionClass);
        testAnnotation.setElementValues(elementValue);

        testWithoutAssert.addAnnotation(testAnnotation);


        return testWithoutAssert;
    }

    protected CtMethod buildNewAssert() throws IOException, ClassNotFoundException {
        CtClass cl = initTestClass();
        List<CtMethod> testsToRun = new ArrayList<>();

        for(int i = 0; i < 3; i++) {
            CtMethod testWithLog = createTestWithLog();
            testWithLog.setSimpleName(testWithLog.getSimpleName() + i);
            cl.addMethod(testWithLog);
            testsToRun.add(testWithLog);
            cl.addMethod(testWithLog);
        }

        ObjectLog.reset();

        Result result = runTests(testsToRun, assertGeneratorClassLoader);

         return buildTestWithAssert(ObjectLog.getObservations());
    }

    protected CtMethod buildTestWithAssert(Map<Integer, Observation> observations) {
        CtMethod testWithAssert = getFactory().Core().clone(test);

        List<CtStatement> statements = Query.getElements(testWithAssert, new TypeFilter(CtStatement.class));
        for(Integer id : observations.keySet()) {
            for(String snippet : observations.get(id).buildAssert()) {
                CtStatement assertStmt = getFactory().Code().createCodeSnippetStatement(snippet);
                CtStatement stmt = statements.get(id);
                if (stmt instanceof CtInvocation) {
                    String localVarSnippet = ((CtInvocation) stmt).getType().getQualifiedName()
                            + " o_" + id + " = "
                            + stmt.toString();
                    CtStatement localVarStmt = getFactory().Code().createCodeSnippetStatement(localVarSnippet);
                    stmt.replace(localVarStmt);
                    localVarStmt.insertAfter(assertStmt);
                } else {
                    stmt.insertAfter(assertStmt);
                }
            }
        }

        return testWithAssert;
    }

    protected boolean isCorrect(CtMethod test) {
        CtClass newClass = initTestClass();

        CtMethod cloneTest = getFactory().Core().clone(test);
        newClass.addMethod(cloneTest);

        return writeAndCompile(newClass);
    }

    protected void removeFailAssert() throws IOException, ClassNotFoundException {
        List<Integer> goodAssert = findGoodAssert();
        String testName = test.getSimpleName();
        test = createTestWithoutAssert(goodAssert, true);
        test.setSimpleName(testName);
    }

    protected List<Integer> findGoodAssert() throws IOException, ClassNotFoundException {
        int stmtIndex = 0;
        List<CtMethod> testsToRun = new ArrayList<>();
        List<Integer> assertIndex = new ArrayList<>();
        List<CtStatement> statements = Query.getElements(test, new TypeFilter(CtStatement.class));
        for(CtStatement statement : statements) {
            if (isAssert(statement)) {
                assertIndex.add(stmtIndex);
            }
            stmtIndex++;
        }

        CtClass newClass = getFactory().Core().clone(originalClass);
        newClass.setParent(originalClass.getParent());
        for(int i = 0; i < assertIndex.size(); i++) {
            List<Integer> assertToKeep = new ArrayList<>();
            assertToKeep.add(assertIndex.get(i));
            CtMethod mth = createTestWithoutAssert(assertToKeep, false);
            mth.setSimpleName(mth.getSimpleName() + "_" + i);
            newClass.addMethod(mth);
            testsToRun.add(mth);
        }
//        writeAndCompile(newClass);
        ObjectLog.reset();
        Result result = runTests(testsToRun, assertGeneratorClassLoader);

        List<Integer> goodAssertIndex = new ArrayList<>();
        for(int i = 0; i < testsToRun.size(); i++) {
            if(!testFailed(testsToRun.get(i).getSimpleName(), result)) {
                goodAssertIndex.add(assertIndex.get(i));
            }
        }
        return goodAssertIndex;
    }

    protected Failure getFailure(String methodName, Result result) {
        return result.getFailures().stream()
                .filter(failure -> methodName.equals(failure.getDescription().getMethodName()))
                .findAny()
                .orElse(null);
    }

    protected boolean testFailed(String methodName, Result result) {
        return getFailure(methodName, result) != null;
    }

    protected Result runTests(List<CtMethod> testsToRun, ClassLoader classLoader) throws ClassNotFoundException {
        DiversifyClassLoader diversifyClassLoader = new DiversifyClassLoader(classLoader, compiler.getDestinationDirectory().getAbsolutePath());

        List<CtClass> classesToCompile = testsToRun.stream()
                .map(mth -> mth.getDeclaringType())
                .map(type -> (CtClass) type)
                .distinct()
                .collect(Collectors.toList());

        boolean status = classesToCompile.stream()
                .allMatch(cl -> writeAndCompile(cl));

        if(!status) {
            return null;
        }

        List<String> ClassName = classesToCompile.stream()
                .map(cl -> cl.getQualifiedName())
                .distinct()
                .collect(Collectors.toList());

        diversifyClassLoader.setClassFilter(ClassName);
        JunitRunner junitRunner = new JunitRunner(inputProgram, diversifyClassLoader);
        return junitRunner.runTestClasses(ClassName, testsToRun.stream().map(test -> test.getSimpleName()).collect(Collectors.toList()));
    }

    protected Result runSingleTest(CtMethod test, ClassLoader classLoader) throws ClassNotFoundException, IOException {
        List<CtMethod>testsToRun = new ArrayList<>();
        CtClass newClass = initTestClass();

        CtMethod cloneTest = getFactory().Core().clone(test);
        newClass.addMethod(cloneTest);
        testsToRun.add(cloneTest);

        return runTests(testsToRun, classLoader);
    }

    protected boolean writeAndCompile(CtClass cl) {
        try {
            FileUtils.cleanDirectory(compiler.getOutputDirectory());
            FileUtils.cleanDirectory(compiler.getDestinationDirectory());

            copyLoggerFile();
            LoggerUtils.printJavaFile(compiler.getOutputDirectory(), cl);

            return compiler.compileFileIn(compiler.getOutputDirectory(), false);
        } catch (Exception e) {
            Log.warn("error during compilation", e);
            return false;
        }
    }

    protected CtClass initTestClass() {
        CtClass newClass = getFactory().Core().clone(originalClass);
        newClass.setParent(originalClass.getParent());

        return newClass;
    }

//    protected CtClass initTestClass() {
//        testsToRun = new ArrayList<>();
//        CtClass newClass = getFactory().Core().clone(originalClass);
//        newClass.setParent(originalClass.getParent());
//
//        CtMethod cloneTest = getFactory().Core().clone(test);
//        newClass.addMethod(cloneTest);
//        testsToRun.add(cloneTest);
//
//        CtMethod testWithoutAssert = createTestWithoutAssert(new ArrayList<>(), false);
//        testsToRun.add(testWithoutAssert);
//        testWithoutAssert.setParent(newClass);
//        newClass.addMethod(testWithoutAssert);
//
//        return newClass;
//    }

    protected CtMethod createTestWithLog() {
        CtMethod newTest = getFactory().Core().clone(test);
        newTest.setParent(test.getParent());
        newTest.setSimpleName(test.getSimpleName() + "_withlog");

        List<CtStatement> stmts = Query.getElements(newTest, new TypeFilter(CtStatement.class));
        for(int i = 0; i < stmts.size(); i++) {
            CtStatement stmt = stmts.get(i);
            if(statementsIndexToAssert.contains(i) && isStmtToLog(stmt)) {
                addLogStmt(stmt, i);
            }
        }
        return newTest;
    }

    protected boolean isStmtToLog(CtStatement statement) {
        if(!(statement.getParent() instanceof CtBlock)) {
            return false;
        }
        if(statement instanceof CtInvocation) {
            CtInvocation invocation = (CtInvocation) statement;
            String type = invocation.getType().toString();
            return !(type.equals("void") || type.equals("void"));
        }
        return statement instanceof CtVariableWrite
                || statement instanceof CtAssignment
                || statement instanceof CtLocalVariable;
    }

    protected void addLogStmt(CtStatement stmt, int id) {
        String snippet = "";
        CtStatement insertAfter = null;
        if(stmt instanceof CtVariableWrite) {
            CtVariableWrite varWrite = (CtVariableWrite) stmt;
            snippet = "fr.inria.diversify.compare.ObjectLog.log(" + varWrite.getVariable()
                    + ",\"" + varWrite.getVariable() + "\"," + id + ")";
            insertAfter = stmt;
        }
        if(stmt instanceof CtLocalVariable) {
            CtLocalVariable localVar = (CtLocalVariable) stmt;
            snippet = "fr.inria.diversify.compare.ObjectLog.log(" + localVar.getSimpleName()
                    + ",\"" + localVar.getSimpleName() + "\"," + id + ")";
            insertAfter = stmt;
        }
        if(stmt instanceof CtAssignment) {
            CtAssignment localVar = (CtAssignment) stmt;
            snippet = "fr.inria.diversify.compare.ObjectLog.log(" + localVar.getAssigned()
                    + ",\"" + localVar.getAssigned() + "\"," + id + ")";
            insertAfter = stmt;
        }

        if(stmt instanceof CtInvocation) {
            CtInvocation invocation = (CtInvocation) stmt;
            String snippetStmt = "Object o_" + id + " = " + invocation.toString();
            CtStatement localVarSnippet = getFactory().Code().createCodeSnippetStatement(snippetStmt);
            stmt.replace(localVarSnippet);
            insertAfter = localVarSnippet;

            snippet = "fr.inria.diversify.compare.ObjectLog.log(o_" + id
                    + ",\"o_" + id + "\"," + id + ")";
        }
        CtStatement logStmt = getFactory().Code().createCodeSnippetStatement(snippet);
        insertAfter.insertAfter(logStmt);
    }

    protected CtMethod createTestWithoutAssert(List<Integer> assertIndexToKeep, boolean updateStatementsIndexToAssert) {
        CtMethod newTest = getFactory().Core().clone(test);
        newTest.setSimpleName(test.getSimpleName() + "_withoutAssert");

        int stmtIndex = 0;
        List<CtStatement> statements = Query.getElements(newTest, new TypeFilter(CtStatement.class));
        for(CtStatement statement : statements){
            try {
                if (!assertIndexToKeep.contains(stmtIndex) && isAssert(statement)) {
                    CtBlock block = buildRemoveAssertBlock((CtInvocation) statement, stmtIndex);
                    if(updateStatementsIndexToAssert) {
                        updateStatementsIndexToAssert(stmtIndex, block.getStatements().size() - 1);
                    }
                    if(statement.getParent() instanceof CtCase) {
                        CtCase ctCase = (CtCase) statement.getParent();
                        int index = ctCase.getStatements().indexOf(statement);
                        ctCase.getStatements().add(index, block);
                        ctCase.getStatements().remove(statement);
                    } else {
                        statement.replace(block);
                    }
                }
                stmtIndex++;
            } catch (Exception e) {}
        }
        return newTest;
    }

    protected void updateStatementsIndexToAssert(int stmtIndex, int update) {
        if(update != 0) {
            List<Integer> newList = new ArrayList<>(statementsIndexToAssert.size());
            for (Integer index : statementsIndexToAssert) {
                if(index > stmtIndex) {
                    statementsIndexToAssert.add(index + update);
                } else {
                    newList.add(index);
                }
            }
            statementsIndexToAssert = newList;
        }
    }

    protected CtBlock buildRemoveAssertBlock(CtInvocation assertInvocation, int blockId) {
        CtBlock block = getFactory().Core().createBlock();

        int[] idx = { 0 };
        getNotLiteralArgs(assertInvocation).stream()
                .filter(arg -> !(arg instanceof CtVariableAccess))
                .map(arg -> buildVarStatement(arg, blockId + "_" + (idx[0]++)))
                .forEach(stmt -> block.addStatement(stmt));

        block.setParent(assertInvocation.getParent());
        return block;
    }

    protected List<CtExpression> getNotLiteralArgs(CtInvocation invocation) {
        List<CtExpression> args = invocation.getArguments();
        return args.stream()
                .filter(arg -> !(arg instanceof CtLiteral))
                .collect(Collectors.toList());
    }

    protected CtLocalVariable<Object> buildVarStatement(CtExpression arg, String id) {
        CtTypeReference<Object> objectType = getFactory().Core().createTypeReference();
        objectType.setSimpleName("Object");
        CtLocalVariable<Object> localVar = getFactory().Code().createLocalVariable(objectType, "o_" + id, arg);

        return localVar;
    }

    protected Factory getFactory() {
        return test.getFactory();
    }

    protected boolean isAssert(CtStatement statement) {
        if(statement instanceof CtInvocation) {
            CtInvocation invocation = (CtInvocation) statement;
            try {
                Class cl = invocation.getExecutable().getDeclaringType().getActualClass();
                String signature = invocation.getSignature();
                return (signature.contains("assertTrue")
                        || signature.contains("assertFalse")
                        || signature.contains("assertSame")
                        || signature.contains("assertEquals"));
//                    && isAssertInstance(cl);
            } catch (Exception e) {
                return false;
            }
        }
        return false;
    }

    protected boolean isAssertInstance(Class cl) {
        if (cl.equals(org.junit.Assert.class) || cl.equals(junit.framework.Assert.class))
            return true;
        Class superCl = cl.getSuperclass();
        if(superCl != null) {
            return isAssertInstance(superCl);
        }
        return false;
    }

    protected void copyLoggerFile() throws IOException {
        File srcDir = new File(System.getProperty("user.dir") + "/testAmplification/src/main/java/fr/inria/diversify/compare/");

        File destDir = new File(compiler.getOutputDirectory() + "/fr/inria/diversify/compare/");
        FileUtils.forceMkdir(destDir);

        FileUtils.copyDirectory(srcDir, destDir);
    }
}
