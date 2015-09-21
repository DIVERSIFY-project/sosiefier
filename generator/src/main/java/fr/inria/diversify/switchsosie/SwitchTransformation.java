package fr.inria.diversify.switchsosie;

import fr.inria.diversify.transformation.SingleTransformation;
import fr.inria.diversify.transformation.ast.ASTTransformation;
import fr.inria.diversify.transformation.ast.exception.ApplyTransformationException;
import fr.inria.diversify.util.Log;
import spoon.compiler.Environment;
import spoon.reflect.code.CtBlock;
import spoon.reflect.code.CtCodeElement;
import spoon.reflect.code.CtIf;
import spoon.reflect.code.CtStatement;
import spoon.reflect.cu.SourcePosition;
import spoon.reflect.declaration.CtField;
import spoon.reflect.declaration.CtType;
import spoon.reflect.declaration.ModifierKind;
import spoon.reflect.factory.Factory;
import spoon.reflect.reference.CtFieldReference;
import spoon.reflect.reference.CtTypeReference;
import spoon.reflect.visitor.DefaultJavaPrettyPrinter;
import spoon.support.JavaOutputProcessor;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

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
        addField();
        CtCodeElement transplantationPoint = transformation.getTransplantationPoint().getCtCodeFragment();
        CtCodeElement copyTransplant = transformation.buildReplacementElement();

        Factory factory = copyTransplant.getFactory();

        CtFieldReference<Boolean> fieldRef = factory.Core().createFieldReference();
        fieldRef.setSimpleName("switchTransformation");

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
            printJavaFile(srcDir);
        } catch (Exception e) {
            throw new ApplyTransformationException("", e);
        }
    }


    protected CtField<Boolean> addField() {
        CtType<?> cl = transformation.getOriginalClass(transformation.getTransplantationPoint());
        Factory factory = cl.getFactory();

        CtTypeReference<Boolean> typeRef = factory.Core().createTypeReference();
        typeRef.setSimpleName("boolean");

        CtField<Boolean> field = factory.Core().createField();
        field.setType(typeRef);
        field.setSimpleName("switchTransformation");
        field.setDefaultExpression(factory.Code().createLiteral(true));

        Set<ModifierKind> modifiers = new HashSet<>();
        modifiers.add(ModifierKind.STATIC);
        modifiers.add(ModifierKind.PUBLIC);
        field.setModifiers(modifiers);

        field.setParent(cl);
        cl.addField(field);

        return field;
    }


    @Override
    public void restore(String srcDir) throws Exception {

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
