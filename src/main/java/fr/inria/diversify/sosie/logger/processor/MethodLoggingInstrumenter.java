package fr.inria.diversify.sosie.logger.processor;


import fr.inria.diversify.util.Log;
import spoon.processing.AbstractProcessor;
import spoon.processing.ProcessingManager;
import spoon.reflect.code.CtBlock;
import spoon.reflect.code.CtInvocation;
import spoon.reflect.code.CtStatement;
import spoon.reflect.code.CtTargetedExpression;
import spoon.reflect.cu.CompilationUnit;
import spoon.reflect.cu.SourceCodeFragment;
import spoon.reflect.cu.SourcePosition;
import spoon.reflect.declaration.*;
import spoon.reflect.factory.Factory;
import spoon.reflect.visitor.QueryVisitor;
import spoon.reflect.visitor.filter.TypeFilter;
import spoon.support.QueueProcessingManager;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * User: Simon
 * Date: 06/01/14
 * Time: 10:04
 */
public class MethodLoggingInstrumenter extends AbstractLogginInstrumenter<CtMethod> {
    protected List<CtMethod> methods;

    @Override
    public boolean isToBeProcessed(CtMethod candidate) {
        return !candidate.isImplicit()
                && candidate.getBody() != null
                && candidate.getBody().getStatements().size() != 0
                && hasCall(candidate);
    }

    @Override
    public void process(CtMethod candidate) {
        CtBlock body = candidate.getBody();
        CtStatement stmt = body.getStatement(0);
        String id = idFor(getClass(stmt).getQualifiedName() + "." + candidate.getSignature());

        String snippet = "\ttry{\n\t"+ getLogName() + ".methodCall(Thread.currentThread(),\"" +
                id + "\");\n";
        SourcePosition sp = stmt.getPosition();
        CompilationUnit compileUnit = sp.getCompilationUnit();

        int index;
        if(stmt.getPosition().getLine() == candidate.getPosition().getLine()) {
            index = sp.getSourceStart();
        } else {
            index = compileUnit.beginOfLineIndex(sp.getSourceStart());
        }
        compileUnit.addSourceCodeFragment(new SourceCodeFragment(index, snippet, 0));

        sp = body.getLastStatement().getPosition();
        compileUnit = sp.getCompilationUnit();
        compileUnit.addSourceCodeFragment(new SourceCodeFragment(sp.getSourceEnd()+2 ,
                "\n" + "\t}\n\tfinally{"+getLogName()+".methodOut(Thread.currentThread()); }", 0));
    }

    protected boolean hasCall(CtMethod method) {
        QueryVisitor query = new QueryVisitor(new TypeFilter(CtInvocation.class));
        method.accept(query);

        for(Object o : query.getResult()) {
            CtInvocation target = (CtInvocation) o;
            if(target.getExecutable().getDeclaration() != null)
                if (getAllMethod(method.getFactory()).contains(target.getExecutable().getDeclaration())) {
                    return true;
                }
        }
        return false;
    }

    public List<CtMethod> getAllMethod(Factory factory) {
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

    public  Set<CtElement> getRoots(Factory factory) {
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
