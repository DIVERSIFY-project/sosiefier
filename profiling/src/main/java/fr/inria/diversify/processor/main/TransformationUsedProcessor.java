package fr.inria.diversify.processor.main;

import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.ast.ASTTransformation;
import spoon.processing.AbstractProcessor;
import spoon.reflect.code.*;
import spoon.reflect.cu.SourcePosition;
import spoon.reflect.declaration.CtExecutable;
import spoon.reflect.factory.Factory;



/**
 * User: Simon
 * Date: 10/07/15
 * Time: 11:01
 */
public class TransformationUsedProcessor extends AbstractProcessor<CtStatement> {
    ASTTransformation transformation;
    InputProgram inputProgram;
    private String logger;

    public TransformationUsedProcessor(InputProgram inputProgram, Transformation transformation) {
        this.inputProgram = inputProgram;
        this.transformation = (ASTTransformation) transformation;
    }

    @Override
    public boolean isToBeProcessed(CtStatement candidate) {
        return !transformation.getName().equals("delete")
        && transformation.getCopyTransplant().toString().equals(candidate.toString());
    }

    public void process(CtStatement stmtTrans) {
        String transformationName = transformation.getName();

        if(transformationName.equals("add")) {
            CtIf ctIf = (CtIf) stmtTrans;
            stmtTrans = ((CtBlock)ctIf.getThenStatement()).getLastStatement();

        }

        CtCodeSnippetStatement snippet = getFactory().Code().createCodeSnippetStatement(
                "System.out.println(\"\\nlogTransformation\\n\");"+getLogger() + ".logTransformation(Thread.currentThread())");
        if(stmtTrans instanceof CtIf) {
            CtIf ctIf = (CtIf) stmtTrans;

            CtStatement stmt = ctIf.getThenStatement();
            if (!(stmt instanceof CtBlock)) {
                CtBlock block = getFactory().Core().createBlock();
                block.setParent(stmt.getParent());
                block.addStatement(stmt);
                ctIf.setThenStatement(block);
            }
            addSnippet(snippet, stmt);
            if (ctIf.getElseStatement() != null) {
                stmt = ctIf.getElseStatement();
                if (!(stmt instanceof CtBlock)) {
                    CtBlock block = getFactory().Core().createBlock();
                    block.setParent(stmt.getParent());
                    block.addStatement(stmt);
                    ctIf.setElseStatement(block);
                }
                addSnippet(snippet, stmt);
            }
        } else if(stmtTrans instanceof CtLoop) {
            CtLoop ctLoop = (CtLoop) stmtTrans;
            CtStatement stmt = ctLoop.getBody();
            if (!(stmt instanceof CtBlock)) {
                CtBlock block = getFactory().Core().createBlock();
                block.setParent(stmt.getParent());
                block.addStatement(stmt);
                ctLoop.setBody(block);
            }
            addSnippet(snippet, stmt);
        } else if(stmtTrans instanceof CtTry) {
            CtTry ctTry = (CtTry) stmtTrans;
            CtStatement stmt = ctTry.getBody();
            if (!(stmt instanceof CtBlock)) {
                CtBlock block = getFactory().Core().createBlock();
                block.setParent(stmt.getParent());
                block.addStatement(stmt);
                ctTry.setBody(block);
            }

        } else {
            stmtTrans.insertBefore(snippet);
        }

    }

    protected void addSnippet(CtCodeSnippetStatement snippet, CtStatement stmt) {
        CtBlock block = (CtBlock) stmt;
        block.insertBegin(snippet);
    }

    public String getLogger() {
        return logger;
    }

    public void setLogger(String logger) {
        this.logger = logger;
    }
}
