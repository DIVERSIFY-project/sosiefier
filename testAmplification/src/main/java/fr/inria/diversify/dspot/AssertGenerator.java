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

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * User: Simon
 * Date: 22/10/15
 * Time: 10:06
 */
public class AssertGenerator {
    protected ClassLoader applicationClassLoader;
    protected CtMethod test;
    protected CtClass originalClass;
    protected List<CtMethod> testsToRun;
    protected DiversityCompiler compiler;
    protected InputProgram inputProgram;
    protected List<Integer> statementsIndexToAssert;



    public AssertGenerator(CtClass originalClass, InputProgram inputProgram, DiversityCompiler compiler, ClassLoader applicationClassLoader) throws IOException {
        this.originalClass = originalClass;
        this.compiler = compiler;
        this.applicationClassLoader = applicationClassLoader;

        this.inputProgram = inputProgram;
        statementsIndexToAssert = new ArrayList<>();
        for(int i = 0; i < 50; i++) {
            statementsIndexToAssert.add(i);
        }
    }

    public AssertGenerator(CtClass originalClass, CtMethod test, InputProgram inputProgram, DiversityCompiler compiler, ClassLoader applicationClassLoader) throws IOException {
        this.originalClass = originalClass;
        this.compiler = compiler;
        this.applicationClassLoader = applicationClassLoader;
        this.inputProgram = inputProgram;
    }

    protected CtMethod genereteAssert(CtMethod test, List<Integer> statementsIndexToAssert) {
        this.test = test;
        this.statementsIndexToAssert = statementsIndexToAssert;
        return genereteAssert();
    }

    protected CtMethod genereteAssert() {
         CtClass cl = initTestClass();
        try {
            boolean isCompile = writeAndCompile(cl);
            Result result = runTest();
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

    protected CtMethod   buildNewAssert() throws IOException, ClassNotFoundException {
        CtClass cl = initTestClass();
        testsToRun.clear();

        for(int i = 0; i < 3; i++) {
            CtMethod testWithLog = createTestWithLog();
            testWithLog.setSimpleName(testWithLog.getSimpleName() + i);
            cl.addMethod(testWithLog);
            testsToRun.add(testWithLog);
            cl.addMethod(testWithLog);
        }

        writeAndCompile(cl);
        ObjectLog.reset();

        Result result = runTest();

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

    protected void removeFailAssert() throws IOException, ClassNotFoundException {
        List<Integer> goodAssert = findGoodAssert();
        String testName = test.getSimpleName();
        test = createTestWithoutAssert(goodAssert, true);
        test.setSimpleName(testName);
    }

    protected List<Integer> findGoodAssert() throws IOException, ClassNotFoundException {
        int stmtIndex = 0;
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
        testsToRun.clear();
        for(int i = 0; i < assertIndex.size(); i++) {
            List<Integer> assertToKeep = new ArrayList<>();
            assertToKeep.add(assertIndex.get(i));
            CtMethod mth = createTestWithoutAssert(assertToKeep, false);
            mth.setSimpleName(mth.getSimpleName() + "_" + i);
            newClass.addMethod(mth);
            testsToRun.add(mth);
        }
        writeAndCompile(newClass);
        ObjectLog.reset();
        Result result = runTest();

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

    protected Result runTest() throws ClassNotFoundException {
        DiversifyClassLoader diversifyClassLoader = new DiversifyClassLoader(applicationClassLoader, compiler.getDestinationDirectory().getAbsolutePath());
        List<String> filter = new ArrayList<>(1);
        filter.add(originalClass.getQualifiedName());
        diversifyClassLoader.setClassFilter(filter);
        JunitRunner junitRunner = new JunitRunner(inputProgram, diversifyClassLoader);
        return junitRunner.runTestClass(originalClass, testsToRun.stream().map(test -> test.getSimpleName()).collect(Collectors.toList()));
    }

    protected boolean writeAndCompile(CtClass cl) throws IOException {
        FileUtils.cleanDirectory(compiler.getOutputDirectory());
        FileUtils.cleanDirectory(compiler.getDestinationDirectory());

        copyLoggerFile();
        LoggerUtils.printJavaFile(compiler.getOutputDirectory(), cl);

        try {
            return compiler.compileFileIn(compiler.getOutputDirectory());
        } catch (Exception e) {
            Log.warn("error during compilation", e);
            return false;
        }
    }


    protected CtClass initTestClass() {
        testsToRun = new ArrayList<>();
        CtClass newClass = getFactory().Core().clone(originalClass);
        newClass.setParent(originalClass.getParent());

        CtMethod cloneTest = getFactory().Core().clone(test);
        newClass.addMethod(cloneTest);
        testsToRun.add(cloneTest);

        CtMethod testWithoutAssert = createTestWithoutAssert(new ArrayList<>(), false);
        testsToRun.add(testWithoutAssert);
        newClass.addMethod(testWithoutAssert);

        return newClass;
    }


    protected CtMethod createTestWithLog() {
        CtMethod newTest = getFactory().Core().clone(test);
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
