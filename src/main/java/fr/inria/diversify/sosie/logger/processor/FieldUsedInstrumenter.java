package fr.inria.diversify.sosie.logger.processor;

import fr.inria.diversify.transformation.Transformation;
import spoon.reflect.code.*;
import spoon.reflect.cu.CompilationUnit;
import spoon.reflect.cu.SourcePosition;
import spoon.reflect.declaration.*;
import spoon.reflect.reference.CtFieldReference;
import spoon.reflect.visitor.QueryVisitor;
import spoon.reflect.visitor.filter.TypeFilter;
import spoon.support.reflect.code.CtCodeSnippetStatementImpl;


import java.util.*;

/**
 * Created by Simon on 16/07/14.
 */
public class FieldUsedInstrumenter extends AbstractLoggingInstrumenter<CtStatement> {

    protected Set<CtStatement> alreadyInstrument;

    public FieldUsedInstrumenter(List<Transformation> transformations) {
        super(transformations);
        alreadyInstrument = new HashSet<>();
    }


    @Override
    public void process(CtStatement statement) {
        try {
            if (!alreadyInstrumented(statement)) {
                FieldReferenceVisitor scanner = getFieldUsed(statement);
                Map<CtFieldReference, String> fieldUsed = scanner.getFields();
                Set<CtFieldReference> after = scanner.getAfter();

                for (CtFieldReference<?> var : fieldUsed.keySet()) {
                    if (getMethod(statement) != null && ok(statement) && !var.getSimpleName().equals("class")) {
                        try {
                            alreadyInstrument.add(statement);
                            String id = idFor(getClass(statement).getQualifiedName() + "." + getMethod(statement).getSignature());

                            String snippet = getLogName() + ".writeVar(" + getCount(statement) + ",Thread.currentThread(),\"" + id + "\",\"" + idFor(var.getSimpleName()) + "\"," + fieldUsed.get(var) + ")";

                            if (fieldUsed.get(var).contains(".")) {
                                snippet = "try {\n\t" + snippet + ";\n} catch (Exception eeee) {}";
                            }
                            CtCodeSnippetStatement snippetStatement = new CtCodeSnippetStatementImpl();
                            snippetStatement.setValue(snippet);

                            if (!after.contains(var)) {
                                statement.insertBefore(snippetStatement);
                            } else {
                                statement.insertAfter(snippetStatement);
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
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
        if(statement instanceof CtBlock)
            return false;
        CtStatement parent = statement.getParent(CtStatement.class);
        if(parent instanceof CtBlock)
            return true  && !statement.toString().startsWith("this(")
                    && !statement.toString().startsWith("super(")
                    && !oneLineMethod(statement);
        else
            return false;
    }

    protected boolean oneLineMethod(CtStatement statement) {
        SourcePosition sp = statement.getPosition();
        CompilationUnit stmtCompileUnit = sp.getCompilationUnit();

        SourcePosition sp2 = statement.getParent(CtExecutable.class).getPosition();
        CompilationUnit mthCompileUnit = sp2.getCompilationUnit();

        return  stmtCompileUnit.beginOfLineIndex(sp.getSourceEnd()) ==  mthCompileUnit.beginOfLineIndex(sp2.getSourceEnd());
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
