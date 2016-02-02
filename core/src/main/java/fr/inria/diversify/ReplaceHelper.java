package fr.inria.diversify;


import spoon.reflect.code.CtBlock;
import spoon.reflect.code.CtExpression;
import spoon.reflect.code.CtStatement;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtField;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.reference.CtExecutableReference;
import spoon.reflect.reference.CtPackageReference;
import spoon.reflect.reference.CtTypeReference;
import spoon.reflect.reference.CtVariableReference;
import spoon.reflect.visitor.CtScanner;

/**
 * User: Simon
 * Date: 26/01/16
 * Time: 17:10
 */
public class ReplaceHelper extends CtScanner {
    private static ReplaceHelper visitor;
    private CtElement newNode;
   public static <T extends CtElement, E extends CtElement> void replace(T oldNode, E newNode) {
       if(visitor == null) {
           visitor = new ReplaceHelper();
       }

       visitor.newNode = newNode;

       if(oldNode instanceof CtExpression && newNode instanceof CtExpression) {
           ((CtExpression) oldNode).replace((CtExpression) newNode);
       } else if(oldNode instanceof CtVariableReference) {
           ((CtVariableReference)oldNode).replace((CtVariableReference) newNode);
       } else if(oldNode instanceof CtStatement) {
           if(newNode instanceof CtBlock && oldNode instanceof CtBlock) {
               ((CtBlock)oldNode).replace((CtBlock) newNode);
           } else {
               ((CtStatement)oldNode).replace((CtStatement) newNode);
           }
       } else{
           oldNode.accept(visitor);
       }
   }

    public <T> void visitCtMethod(CtMethod<T> m) {
        m.replace((CtMethod) newNode);
    }

    public <T> void visitCtField(CtField<T> f) {
        f.replace((CtField) newNode);
    }

    public <T> void visitCtExecutableReference(CtExecutableReference<T> reference) {
        reference.replace((CtExecutableReference)newNode);
    }

    public void visitCtPackageReference(CtPackageReference reference) {
        reference.replace((CtPackageReference)newNode);

    }

    public <T> void visitCtTypeReference(CtTypeReference<T> reference) {
        reference.replace((CtTypeReference)newNode);

    }
}
