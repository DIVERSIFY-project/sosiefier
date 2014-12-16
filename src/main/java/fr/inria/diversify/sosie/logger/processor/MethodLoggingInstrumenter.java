package fr.inria.diversify.sosie.logger.processor;


import fr.inria.diversify.transformation.Transformation;
import spoon.processing.AbstractProcessor;
import spoon.processing.ProcessingManager;
import spoon.reflect.code.*;
import spoon.reflect.cu.CompilationUnit;
import spoon.reflect.cu.SourceCodeFragment;
import spoon.reflect.cu.SourcePosition;
import spoon.reflect.declaration.*;
import spoon.reflect.factory.Factory;
import spoon.reflect.visitor.QueryVisitor;
import spoon.reflect.visitor.filter.TypeFilter;
import spoon.support.QueueProcessingManager;
import spoon.support.reflect.code.CtCodeSnippetStatementImpl;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * User: Simon
 * Date: 06/01/14
 * Time: 10:04
 */
public class MethodLoggingInstrumenter extends AbstractLoggingInstrumenter<CtMethod> {
    protected List<CtMethod> methods;


    public MethodLoggingInstrumenter(List<Transformation> transformations) {
        super(transformations);
    }

    @Override
    public boolean isToBeProcessed(CtMethod candidate) {

        return !candidate.isImplicit()
                && candidate.getBody() != null
                && candidate.getBody().getStatements().size() != 0
               // && hasCall(candidate)
                && !containsGoto(candidate);

    }

    @Override
    public void process(CtMethod candidate) {
        String id = idFor(getClass(candidate).getQualifiedName() + "." + candidate.getSignature());
        Factory factory = candidate.getFactory();

        CtTry ctTry = factory.Core().createTry();
        ctTry.setBody(candidate.getBody());

        String snippet;
        if (containsTransformation(candidate)) {
            snippet = getLogName()+".startLogging(Thread.currentThread(),\""+id+"\");\n\t" + getLogName() + ".methodCall(Thread.currentThread(),\"" +
                    id + "\")";
        } else {
            snippet = getLogName() + ".methodCall(Thread.currentThread(),\"" +
                    id + "\")";
        }
        CtCodeSnippetStatement beginStmt = new CtCodeSnippetStatementImpl();
        beginStmt.setValue(snippet);

        ctTry.getBody().insertBegin(beginStmt);

        CtCodeSnippetStatement stmt = new CtCodeSnippetStatementImpl();
        stmt.setValue(getLogName()+".methodOut(Thread.currentThread())");

        CtBlock finalizerBlock = factory.Core().createBlock();
        finalizerBlock.addStatement(stmt);
        ctTry.setFinalizer(finalizerBlock);

        CtBlock methodBlock = factory.Core().createBlock();
        methodBlock.addStatement(ctTry);
        candidate.setBody(methodBlock);
    }

    protected boolean hasCall(CtMethod method) {
        QueryVisitor query = new QueryVisitor(new TypeFilter(CtInvocation.class));
        method.accept(query);

        for(Object o : query.getResult()) {
            CtInvocation target = (CtInvocation) o;
            if(target.getExecutable() != null && target.getExecutable().getDeclaration() != null)
                if (getAllMethod(method.getFactory()).contains(target.getExecutable().getDeclaration())) {
                    return true;
                }
        }
        return false;
    }

    protected List<CtMethod> getAllMethod(Factory factory) {
        if(methods == null) {
            QueryVisitor query = new QueryVisitor(new TypeFilter(CtMethod.class));
            Set<CtElement> roots = getRoots(factory);

            roots.stream().flatMap(root -> {
                root.accept(query);
                return query.getResult().stream();
            }).collect(Collectors.toList());

            methods = query.getResult();
        }
        return methods;
    }

    protected Set<CtElement> getRoots(Factory factory) {
        Set<CtElement> roots = new HashSet<>();
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

        return roots;
    }
}
