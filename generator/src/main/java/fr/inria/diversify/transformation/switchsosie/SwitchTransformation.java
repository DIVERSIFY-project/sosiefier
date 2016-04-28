package fr.inria.diversify.transformation.switchsosie;

import fr.inria.diversify.transformation.SingleTransformation;
import fr.inria.diversify.transformation.ast.ASTTransformation;
import fr.inria.diversify.transformation.ast.exception.ApplyTransformationException;
import fr.inria.diversify.util.Log;
import org.apache.commons.io.FileUtils;
import spoon.compiler.Environment;
import spoon.reflect.code.CtBlock;
import spoon.reflect.code.CtCodeElement;
import spoon.reflect.code.CtIf;
import spoon.reflect.code.CtStatement;
import spoon.reflect.cu.SourcePosition;
import spoon.reflect.declaration.CtType;
import spoon.reflect.factory.Factory;
import spoon.reflect.reference.CtFieldReference;
import spoon.reflect.visitor.DefaultJavaPrettyPrinter;
import spoon.support.JavaOutputProcessor;

import java.io.File;
import java.io.IOException;


/**
 * User: Simon
 * Date: 16/09/15
 * Time: 09:50
 */
public class SwitchTransformation extends SingleTransformation {
    protected ASTTransformation transformation;
    protected CtCodeElement copyTransplant;

    public SwitchTransformation(ASTTransformation transformation) {
        this.transformation = transformation;
    }

    @Override
    public String classLocationName() {
        return transformation.classLocationName();
    }

    @Override
    public String packageLocationName() {
        return transformation.packageLocationName();
    }

    @Override
    public String methodLocationName() {
        return transformation.methodLocationName();
    }

    @Override
    public String getTransformationString() throws Exception {
        return null;
    }


    protected  CtCodeElement buildReplacementElement() {
        CtCodeElement transplantationPoint = transformation.getTransplantationPoint().getCtCodeFragment();
        CtCodeElement copyTransplant = transformation.buildReplacementElement();

        Factory factory = copyTransplant.getFactory();

        CtFieldReference<Boolean> fieldRef = factory.Core().createFieldReference();
        fieldRef.setSimpleName("fr.inria.diversify.transformation.switchsosie.Switch.switchTransformation");

        CtIf stmtIf = factory.Core().createIf();
        stmtIf.setParent(transplantationPoint.getParent());

        stmtIf.setCondition(factory.Code().createVariableRead(fieldRef, true));

        CtBlock bodyThen = factory.Core().createBlock();
        stmtIf.setThenStatement(bodyThen);
        CtStatement tmp = (CtStatement) factory.Core().clone(copyTransplant);
        tmp.setParent(stmtIf);
        bodyThen.addStatement(tmp);

        CtBlock bodyElse = factory.Core().createBlock();
        stmtIf.setElseStatement(bodyElse);
        tmp = (CtStatement) factory.Core().clone(transplantationPoint);
        tmp.setParent(stmtIf);
        bodyElse.addStatement(tmp);


        return stmtIf;
    }

    public void apply(String srcDir) throws Exception {
        try {
            copyTransplant = buildReplacementElement();
            transformation.getTransplantationPoint().getCtCodeFragment().replace(copyTransplant);
            copySwitch(srcDir);
            printJavaFile(srcDir);
        } catch (Exception e) {
            throw new ApplyTransformationException("", e);
        }
    }

    protected void copySwitch(String copyDirName) throws IOException {
        File srcFile = new File(System.getProperty("user.dir") + "/generator/src/main/java/fr/inria/diversify/switchsosie/Switch.java");
        File destFile = new File(copyDirName  + "/fr/inria/diversify/transformation/switchsosie/Switch.java");

        FileUtils.copyFile(srcFile, destFile);
    }

    protected void deleteSwitch(String copyDirName) throws IOException {
        File delete = new File(copyDirName  + "/fr/inria/diversify/transformation/switchsosie/Switch.java");

        FileUtils.forceDelete(delete);
    }

    @Override
    public void restore(String srcDir) throws Exception {
        deleteSwitch(srcDir);
        if (parent != null) {
            parent.restore(srcDir);
        }
        try {
            copyTransplant.replace(transformation.getTransplantationPoint().getCtCodeFragment());
        } catch (Throwable e) {
            e.printStackTrace();
            Log.debug("");
        }
        printJavaFile(srcDir);
    }

    @Override
    public SourcePosition getPosition() {
        return transformation.getPosition();
    }

    @Override
    public int line() {
        return transformation.line();
    }

    @Override
    public void printJavaFile(String directory) throws IOException {
        CtType<?> type = transformation.getOriginalClass(transformation.getTransplantationPoint());
        Factory factory = type.getFactory();
        Environment env = factory.getEnvironment();

        JavaOutputProcessor processor = new JavaOutputProcessor(new File(directory), new DefaultJavaPrettyPrinter(env));
        processor.setFactory(factory);

        processor.createJavaFile(type);
        Log.debug("write type {} in directory {}", type.getQualifiedName(), directory);
    }
}
