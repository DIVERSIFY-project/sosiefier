package fr.inria.diversify.codeFragment;

import spoon.reflect.reference.CtTypeReference;

public class Context {
	protected InputContext inputContext;
	protected CtTypeReference<?> ouputContext;
	
	
	public Context(InputContext inputContext, CtTypeReference<?> ouputContext) {
		this.inputContext = inputContext;
		this.ouputContext = ouputContext;
	}

	public InputContext getInputContext() {
		return inputContext;
	}
	
	public CtTypeReference<?> getOuputContext() {
		return ouputContext;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null || !(obj instanceof Context))
			return false;
			
		Context other = (Context)obj;
		return inputContext.equals(other.inputContext) && ouputContext.equals(other.ouputContext);
	}
	
	@Override
	public int hashCode() {
		return inputContext.hashCode() * ouputContext.hashCode();
	}

	public String equalString() {
		return inputContext.equalString()+ " "
                + ouputContext.toString();
	}

	public int size() {
		return inputContext.size();
	}
}
