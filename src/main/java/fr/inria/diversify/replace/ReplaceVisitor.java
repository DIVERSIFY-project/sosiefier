package fr.inria.diversify.replace;

import fr.inria.diversify.codeFragment.CodeFragment;
import spoon.reflect.code.CtInvocation;
import spoon.reflect.code.CtThrow;
import spoon.reflect.declaration.CtExecutable;
import spoon.reflect.declaration.CtType;
import spoon.reflect.declaration.ModifierKind;
import spoon.reflect.reference.CtTypeReference;
import spoon.reflect.visitor.CtScanner;

import java.util.Set;

/**
 * User: Simon
 * Date: 5/27/13
 * Time: 10:13 AM
 */
public class ReplaceVisitor extends CtScanner {
    CodeFragment toReplace;
    boolean isReplace = true;


    public ReplaceVisitor(CodeFragment cf) {
        toReplace = cf;
    }

    public boolean isReplace() {
        return isReplace;
    }

    @Override
    public <T> void visitCtInvocation(CtInvocation<T> invocation) {
        Set<ModifierKind> modifiers = null;
        CtType<?> type = null;
        try {
            type = invocation.getExecutable().getDeclaration().getDeclaringType();
            modifiers = invocation.getExecutable().getDeclaration().getModifiers();
        } catch (Exception e) {}

        if(modifiers.contains(ModifierKind.PRIVATE)
                && toReplace.getSourceClass().equals(type))
            isReplace = false;
            if(modifiers.contains(ModifierKind.PROTECTED)
                    && toReplace.getSourceClass().getPackage().equals(type.getPackage()))
                isReplace = false;

        super.visitCtInvocation(invocation);
    }

    @Override
    public void visitCtThrow(CtThrow throwStatement) {
        Set<CtTypeReference> thrownTypes = toReplace.getCtCodeFragment().getParent(CtExecutable.class).getThrownTypes();
        if(thrownTypes.contains(throwStatement.getThrownExpression()))
        super.visitCtThrow(throwStatement);
    }
}
