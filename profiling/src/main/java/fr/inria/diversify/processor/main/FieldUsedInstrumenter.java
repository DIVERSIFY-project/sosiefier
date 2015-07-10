package fr.inria.diversify.processor.main;

import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.processor.ProcessorUtil;
import fr.inria.diversify.util.Log;
import spoon.reflect.code.*;
import spoon.reflect.declaration.CtExecutable;
import spoon.reflect.reference.CtFieldReference;
import spoon.reflect.visitor.QueryVisitor;
import spoon.reflect.visitor.filter.TypeFilter;

import java.io.File;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by Simon on 16/07/14.
 */
public class FieldUsedInstrumenter extends AbstractLoggingInstrumenter<CtExecutable> {
    protected String methodObserve;
    protected Map<CtFieldReference, String> alwaysObserve;
    protected Set<Integer> alreadyInstrument;

    public FieldUsedInstrumenter(InputProgram inputProgram, String outputDir) {
        super(inputProgram);
        File file = new File(outputDir + "/log/");
        if(!file.exists()) {
            file.mkdirs();
        }
        alreadyInstrument = new HashSet<>();
    }


//    public void process(CtStatement statement) {
//        try {
//            if (!alreadyInstrumented(statement)
//                    && getMethod(statement) != null
//                    && ok(statement)) {
//                int methodId = methodId(getMethod(statement));
//                FieldReferenceVisitor scanner = getFieldUsed(statement);
//                Map<CtFieldReference, String> fieldUsed = scanner.getFields();
//                Set<CtFieldReference> after = scanner.getAfter();
//
//                for (CtFieldReference<?> var : fieldUsed.keySet()) {
//                    if (!var.getSimpleName().equals("class")) {
//                        try {
//                            alreadyInstrument.add(statement);
//                            String snippet = getLogger() + ".writeField(Thread.currentThread(),\"" +
//                                    methodId + "\",\"" +
//                                    getLocalId(statement) + "\",\"" +
//                                    ProcessorUtil.idFor(var.getSimpleName()) + "\"," +
//                                    fieldUsed.get(var) + ")";
//
//                            if (fieldUsed.get(var).contains(".") && !fieldUsed.get(var).contains("this.")) {
//                                snippet = "try {\n\t" + snippet + ";\n} catch (Exception eeee) {}";
//                            }
//                            CtCodeSnippetStatement snippetStatement = getFactory().Code().createCodeSnippetStatement(snippet);
//
//                            if (!after.contains(var)) {
//                                statement.insertBefore(snippetStatement);
//                            } else {
//                                statement.insertAfter(snippetStatement);
//                            }
//                        } catch (Exception e) {}
//                    }
//                }
//            }
//        } catch (Exception e) {}
//    }

    public void process(CtExecutable mth) {
        try {
            if(alreadyInstrument.contains(methodId(mth))) {
                return;
            }
            alreadyInstrument.add(methodId(mth));
            int methodId = methodId(mth);
            FieldReferenceVisitor scanner = getFieldUsed(mth);
            Map<CtFieldReference, String> fieldUsed = scanner.getFields();

            addAlwayLog(fieldUsed);

            String snippet = "";
            for (CtFieldReference<?> var : fieldUsed.keySet()) {
                if (!var.getSimpleName().equals("class")) {
                    try {
                        snippet += ";\n" + getLogger() + ".writeField(Thread.currentThread(),\"" +
                                methodId + "\",\"" +
                                ProcessorUtil.idFor(var.getSimpleName()) + "\"," +
                                fieldUsed.get(var) + ")";

                        if (fieldUsed.get(var).contains(".") && !fieldUsed.get(var).contains("this.")) {
                            snippet = "try {\n\t" + snippet + ";} catch (Exception eeee) {}";
                        }

                    } catch (Exception e) {}
                }
            } if(fieldUsed.size() != 0) {
                CtCodeSnippetStatement snippetStatement = getFactory().Code().createCodeSnippetStatement(snippet);
                CtTry ctTry = tryFinallyBody(mth);
                ctTry.getFinalizer().insertBegin(snippetStatement);
            }
        } catch (Exception e) {}
    }

    protected void addAlwayLog(Map<CtFieldReference, String> fieldUsed) {

    }

    protected boolean alreadyInstrumented(CtStatement statement) {
        boolean match = getSubStatement(statement).stream().anyMatch(stmt -> alreadyInstrument.contains(stmt));


        return match;
    }



    protected boolean ok(CtStatement statement) {
        if(statement instanceof CtBlock
                || statement instanceof CtLoop
                || statement instanceof CtTry
                || statement instanceof CtCatch) {
            return false;
        }
        return !statement.toString().startsWith("this(")
                && !statement.toString().startsWith("super(");
    }

    protected FieldReferenceVisitor getFieldUsed(CtExecutable mth) {
        FieldReferenceVisitor scanner = new FieldReferenceVisitor(mth);
        mth.accept(scanner);
        return scanner;
    }

    protected List<CtStatement> getSubStatement(CtStatement statement) {
        QueryVisitor query = new QueryVisitor(new TypeFilter(CtStatement.class));

        statement.accept(query);
        return query.getResult();
    }
}
