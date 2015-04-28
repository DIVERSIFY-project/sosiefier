package fr.inria.diversify.testamplification.branchcoverage.processor;

import spoon.processing.AbstractProcessor;
import spoon.reflect.code.*;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.factory.Factory;
import spoon.reflect.visitor.Query;
import spoon.reflect.visitor.filter.TypeFilter;
import spoon.support.reflect.code.CtCodeSnippetStatementImpl;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * User: Simon
 * Date: 09/04/15
 */
public class BranchCoverageProcessor extends AbstractProcessor<CtMethod> {
    List<String> methodsId;
    Map<Integer, Integer> blockIds;
    PrintWriter infoFile;


    public BranchCoverageProcessor(String outputDir) throws IOException {
        File file = new File(outputDir + "/log/");
        if(!file.exists()) {
            file.mkdirs();
        }
        this.infoFile = new PrintWriter(new FileWriter(outputDir + "/log/info"));
        methodsId = new ArrayList<>();
        blockIds = new HashMap<>();
    }

    @Override
    public boolean isToBeProcessed(CtMethod method) {
        return method.getBody() != null
                && Query.getElements(method, new TypeFilter(CtIf.class)).size()
                    + Query.getElements(method, new TypeFilter(CtLoop.class)).size()
                    + Query.getElements(method, new TypeFilter(CtCatch.class)).size()
                    != 0 ;
    }

    @Override
    public void process(CtMethod method) {
        int methodId = methodId(method);
        String info = methodId + " " + method.getDeclaringType().getQualifiedName() + "." + method.getSignature().replace(" ", "_");

        for(Object object : Query.getElements(method, new TypeFilter(CtIf.class))) {
            CtIf ctIf = (CtIf) object;
            int branchId = idBranch(methodId);
            CtStatement stmt = ctIf.getThenStatement();
            if (!(stmt instanceof CtBlock)) {
                CtBlock block = getFactory().Core().createBlock();
                block.setParent(stmt.getParent());
                block.addStatement(stmt);
                ctIf.setThenStatement(block);
            }
            addBranchLogger(ctIf.getThenStatement(),branchId , "t");
            info += " t" + branchId;
            if (ctIf.getElseStatement() == null) {
                CtBlock block = getFactory().Core().createBlock();
                block.setParent(stmt.getParent());
                ctIf.setElseStatement(block);
            } else {
                stmt = ctIf.getElseStatement();
                if (!(stmt instanceof CtBlock)) {
                    CtBlock block = getFactory().Core().createBlock();
                    block.setParent(stmt.getParent());
                    block.addStatement(stmt);
                    ctIf.setElseStatement(block);
                }
            }
            addBranchLogger(ctIf.getElseStatement(), branchId, "e");
            info += " e" + branchId;
        }

        for(Object object : Query.getElements(method, new TypeFilter(CtLoop.class))) {
            CtLoop ctLoop = (CtLoop) object;
            CtStatement stmt = ctLoop.getBody();
            if (!(stmt instanceof CtBlock)) {
                CtBlock block = getFactory().Core().createBlock();
                block.setParent(stmt.getParent());
                block.addStatement(stmt);
                ctLoop.setBody(block);
            }
            int branchId = idBranch(methodId);
            addBranchLogger((CtBlock)ctLoop.getBody(), branchId, "l");
            info += " l" + branchId;
        }
        for(Object object : Query.getElements(method, new TypeFilter(CtCatch.class))) {
            CtCatch ctCatch = (CtCatch) object;
            CtStatement stmt = ctCatch.getBody();
            if (!(stmt instanceof CtBlock)) {
                CtBlock block = getFactory().Core().createBlock();
                block.setParent(stmt.getParent());
                block.addStatement(stmt);
                ctCatch.setBody(block);
            }
            int branchId = idBranch(methodId);
            addBranchLogger((CtBlock)ctCatch.getBody(), branchId, "c");
            info += " c" + branchId;
        }


        addInOut(method, methodId);
        infoFile.append(info + "\n");
    }

    protected void addBranchLogger(CtBlock block, int idBranch, String type) {
        String snippet = getLogName() + ".branch(Thread.currentThread(),\"" + type + idBranch + "\")";

        CtCodeSnippetStatement beginStmt = new CtCodeSnippetStatementImpl();
        beginStmt.setValue(snippet);
        block.insertBegin(beginStmt);
    }

    protected void addInOut(CtMethod method, int id) {

        Factory factory = method.getFactory();

        CtTry ctTry = factory.Core().createTry();
        ctTry.setBody(method.getBody());

        String snippet = getLogName() + ".methodIn(Thread.currentThread(),\"" + id + "\")";

        CtCodeSnippetStatement beginStmt = new CtCodeSnippetStatementImpl();
        beginStmt.setValue(snippet);

        ctTry.getBody().insertBegin(beginStmt);

        CtCodeSnippetStatement stmt = new CtCodeSnippetStatementImpl();
        stmt.setValue(getLogName()+".methodOut(Thread.currentThread(),\"" + id + "\")");

        CtBlock finalizerBlock = factory.Core().createBlock();
        finalizerBlock.addStatement(stmt);
        ctTry.setFinalizer(finalizerBlock);

        CtBlock methodBlock = factory.Core().createBlock();
        methodBlock.addStatement(ctTry);
        method.setBody(methodBlock);
    }

    protected int idBranch(int methodId) {
        if(!blockIds.containsKey(methodId)) {
            blockIds.put(methodId, 0);
        }
        blockIds.put(methodId, blockIds.get(methodId) + 1);
        return blockIds.get(methodId);
    }

    protected int methodId(CtMethod method) {
        String signature = method.getDeclaringType().getQualifiedName() + " " + method.getSignature();
        if(!methodsId.contains(signature)) {
            methodsId.add(signature);
        }
        return methodsId.indexOf(signature);
    }

    public void processingDone() {
        infoFile.close();
    }

    public String getLogName() {
        return "fr.inria.diversify.testamplification.branchcoverage.logger.Logger";
    }
}
