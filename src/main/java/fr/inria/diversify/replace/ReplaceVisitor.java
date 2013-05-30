package fr.inria.diversify.replace;

import fr.inria.diversify.codeFragment.CodeFragment;
import spoon.reflect.code.*;
import spoon.reflect.declaration.CtExecutable;
import spoon.reflect.declaration.CtSimpleType;
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
    boolean visitLoop = false;
    private CtSimpleType<?> createClass;


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

        if(modifiers.contains(ModifierKind.PRIVATE)
                && !toReplace.getSourceClass().equals(type))
            isReplace = false;

        if(modifiers.contains(ModifierKind.PROTECTED)
                && !toReplace.getSourceClass().getPackage().equals(type.getPackage()))
                    isReplace = false;

        } catch (Exception e) {}

        super.visitCtInvocation(invocation);
    }

    @Override
    public void visitCtThrow(CtThrow throwStatement) {
        try {
            Set<CtTypeReference> thrownTypes = toReplace.getCtCodeFragment().getParent(CtExecutable.class).getThrownTypes();
            Class<?> cl = ((CtNewClass<?>)throwStatement.getThrownExpression()).getType().getActualClass();
             if(thrownTypes.isEmpty())
            isReplace = false;
//            System.out.println(cl);
//            for(CtTypeReference throwType : thrownTypes) {
//                cl.
//                System.out.println(cl.asSubclass(throwType.getActualClass()));
////                cl.asSubclass(throwType.getActualClass());
////                if(cl.asSubclass(throwType.getActualClass())) {
////                    isReplace = true;
////                    break;
////                }
//
//                System.out.println(thrownTypes);
//                System.out.println(((CtNewClass<?>)throwStatement.getThrownExpression()).getType());
//                System.out.println("throw: "+isReplace);
//            }
        }
        catch (Exception e) {}
        super.visitCtThrow(throwStatement);

    }



    @Override
    public void visitCtBreak(CtBreak breakStatement) {
        if(toReplace.getCtCodeFragment().getParent(CtLoop.class) == null && !visitLoop)
            isReplace = false;
//        super.visitCtBreak(breakStatement);
    }

    @Override
    public void visitCtWhile(CtWhile whileLoop) {
        visitLoop = true;
        super.visitCtWhile(whileLoop);
    }

    @Override
    public void visitCtFor(CtFor forLoop) {
        visitLoop = true;
        super.visitCtFor(forLoop);
    }

    @Override
    public void visitCtForEach(CtForEach foreach) {
        visitLoop = true;
        super.visitCtForEach(foreach);
    }

    @Override
    public void visitCtDo(CtDo doLoop) {
        visitLoop = true;
        super.visitCtDo(doLoop);
    }
}
