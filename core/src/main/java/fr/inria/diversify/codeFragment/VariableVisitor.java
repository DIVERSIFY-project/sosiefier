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


    public VariableVisitor() {
        this.withField = true;
    }

	public InputContext input() {
        variableReferences.removeAll(localVariableCreate);
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

    @Override
    public <T> void visitCtThisAccess(CtThisAccess<T> thisAccess) {
        if (!(thisAccess.getParent() instanceof CtFieldWrite || thisAccess.getParent() instanceof CtFieldRead)) {
            CtVariableReference thisVariable = thisAccess.getFactory().Core().createCatchVariableReference();
            thisVariable.setType(thisAccess.getType());
            thisVariable.setFactory(thisAccess.getFactory());
            thisVariable.setSimpleName("this");

            variableReferences.add(thisVariable);
    }
        super.visitCtThisAccess(thisAccess);
    }
}
