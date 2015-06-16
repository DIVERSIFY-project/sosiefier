package fr.inria.diversify.processor.main;

import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.processor.ProcessorUtil;
import spoon.reflect.code.CtBlock;
import spoon.reflect.code.CtCodeSnippetStatement;
import spoon.reflect.code.CtLoop;
import spoon.reflect.code.CtStatement;
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
public class FieldUsedInstrumenter extends AbstractLoggingInstrumenter<CtStatement> {

    protected Set<CtStatement> alreadyInstrument;

    public FieldUsedInstrumenter(InputProgram inputProgram, String outputDir) {
        super(inputProgram);
        File file = new File(outputDir + "/log/");
        if(!file.exists()) {
            file.mkdirs();
        }
        alreadyInstrument = new HashSet<>();
    }

    @Override
    public void process(CtStatement statement) {
        try {
            if (!alreadyInstrumented(statement)
                    && getMethod(statement) != null
                    && ok(statement)) {
                int methodId = methodId(getMethod(statement));
                FieldReferenceVisitor scanner = getFieldUsed(statement);
                Map<CtFieldReference, String> fieldUsed = scanner.getFields();
                Set<CtFieldReference> after = scanner.getAfter();

                for (CtFieldReference<?> var : fieldUsed.keySet()) {
                    if (!var.getSimpleName().equals("class")) {
                        try {
                            alreadyInstrument.add(statement);
                            String snippet = getLogger() + ".writeField(Thread.currentThread()," +
                                    methodId + "," +
                                    getLocalId(statement) + "," +
                                    ProcessorUtil.idFor(var.getSimpleName()) + "," +
                                    fieldUsed.get(var) + ")";

                            if (fieldUsed.get(var).contains(".")) {
                                snippet = "try {\n\t" + snippet + ";\n} catch (Exception eeee) {}";
                            }
                            CtCodeSnippetStatement snippetStatement = getFactory().Code().createCodeSnippetStatement(snippet);

                            if (!after.contains(var)) {
                                statement.insertBefore(snippetStatement);
                            } else {
                                statement.insertAfter(snippetStatement);
                            }
                        } catch (Exception e) {}
                    }
                }
            }
        } catch (Exception e) {}
    }

    protected boolean alreadyInstrumented(CtStatement statement) {
        boolean match = getSubStatement(statement).stream().anyMatch(stmt -> alreadyInstrument.contains(stmt));


        return match;
    }

    protected boolean ok(CtStatement statement) {
        if(statement instanceof CtBlock
                || statement instanceof CtLoop) {
            return false;
        }
        return !statement.toString().startsWith("this(")
                && !statement.toString().startsWith("super(");
    }

    protected FieldReferenceVisitor getFieldUsed(CtStatement statement) {
        FieldReferenceVisitor scanner = new FieldReferenceVisitor();
        statement.accept(scanner);
        return scanner;
    }

    protected List<CtStatement> getSubStatement(CtStatement statement) {
        QueryVisitor query = new QueryVisitor(new TypeFilter(CtStatement.class));

        statement.accept(query);
        return query.getResult();
    }
}
