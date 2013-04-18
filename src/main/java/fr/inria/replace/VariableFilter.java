package fr.inria.replace;

import spoon.reflect.code.CtStatement;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtVariable;
import spoon.reflect.reference.CtVariableReference;
import spoon.reflect.visitor.filter.AbstractFilter;

public class VariableFilter extends AbstractFilter<CtVariable<?>> {
	CtVariable<?> variable;
	CtStatement statement;
	
	public VariableFilter(CtVariable<?> variable, CtStatement statement) {
		super(CtVariable.class);
		this.variable = variable;
		this.statement = statement;
	}

	public boolean matches(CtVariable<?> element) {
		return element.equals(variable) || inStatement(element);
	}

	protected boolean inStatement(CtElement element){
		CtElement parent = element.getParent();
		
		if(parent == null)
			return false;
		if(parent.equals(statement))
			return true;
		return inStatement(parent);
	}
}
