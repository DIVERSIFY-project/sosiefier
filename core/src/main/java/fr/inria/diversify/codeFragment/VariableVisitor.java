package fr.inria.diversify.codeFragment;

import spoon.reflect.code.*;
import spoon.reflect.reference.CtFieldReference;
import spoon.reflect.reference.CtLocalVariableReference;
import spoon.reflect.reference.CtTypeReference;
import spoon.reflect.reference.CtVariableReference;
import spoon.reflect.visitor.CtScanner;
import spoon.support.reflect.reference.CtLocalVariableReferenceImpl;

import java.util.HashSet;
import java.util.Set;


public class VariableVisitor extends CtScanner {
    protected boolean withField;
    protected Set<CtVariableReference> variableReferences = new HashSet();
 	protected Set<CtVariableReference> localVariableCreate = new HashSet();
	protected CtTypeReference<?> refThis;


    public VariableVisitor() {
        this.withField = true;
    }

    public VariableVisitor(boolean withField) {
        this.withField = withField;
    }

	public InputContext input() {
        variableReferences.removeAll(localVariableCreate);

		if(refThis != null)
            variableReferences.add(getThis());
		return new InputContext(variableReferences);
	}

	public <T> void visitCtLocalVariable(CtLocalVariable<T> localVariable) {
		localVariableCreate.add(localVariable.getReference());
		super.visitCtLocalVariable(localVariable);
    }

	@Override
	public <T> void visitCtVariableRead(CtVariableRead<T> variableRead) {
		variableReferences.add(variableRead.getVariable());
		super.visitCtVariableRead(variableRead);
	}

	@Override
	public <T> void visitCtVariableWrite(CtVariableWrite<T> variableWrite) {
		variableReferences.add(variableWrite.getVariable());
		super.visitCtVariableWrite(variableWrite);
	}

	public <T> void visitCtLocalVariableReference(CtLocalVariableReference<T> reference) {
		variableReferences.add(reference);

		super.visitCtLocalVariableReference(reference);
	}

    public <T> void visitCtFieldReference(CtFieldReference<T> reference) {
        if(withField && !(reference.getSimpleName() == "super"))
                variableReferences.add(reference);

        super.visitCtFieldReference(reference);
    }

	public <T> void visitCtInvocation(CtInvocation<T> invocation) {
		if(!invocation.getExecutable().isStatic()
            && invocation.getTarget() == null)
			refThis = invocation.getExecutable().getDeclaringType();

		super.visitCtInvocation(invocation);
	}

	protected CtVariableReference<?> getThis(){
		CtVariableReference thisVariable = new CtLocalVariableReferenceImpl();
		thisVariable.setType(refThis);
        thisVariable.setFactory(refThis.getFactory());
		thisVariable.setSimpleName("this");
		return thisVariable;
	}

    public Set<CtVariableReference> getVariableReferences() {
        return variableReferences;
    }
}
