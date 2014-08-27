package fr.inria.diversify.codeFragment;

import spoon.reflect.reference.CtTypeReference;

public class Context {
	protected InputContext inputContext;
	protected CtTypeReference<?> outputContext;
	
	
	public Context(InputContext inputContext, CtTypeReference<?> outputContext) {
		this.inputContext = inputContext;
		this.outputContext = outputContext;
	}

	public InputContext getInputContext() {
		return inputContext;
	}
	
	public CtTypeReference<?> getOutputContext() {
		return outputContext;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null || !(obj instanceof Context))
			return false;
			
		Context other = (Context)obj;

		return inputContext.equals(other.inputContext)
                && outputContext.equals(other.outputContext)
                && outputContext.getActualTypeArguments().equals(other.outputContext.getActualTypeArguments());
	}
	
	@Override
	public int hashCode() {
		return inputContext.hashCode() * outputContext.hashCode();
	}

    public boolean isReplaceableBy(Context other, boolean varNameMatch,  boolean subType) {
        if(varNameMatch)
            return inputContext.getAllVarName().containsAll(other.inputContext.getAllVarName());
        else
            return inputContext.containsAll(other.inputContext, subType)
                && outputContext.equals(other.outputContext)
                && outputContext.getActualTypeArguments().equals(other.outputContext.getActualTypeArguments());
    }

	public String equalString() {
		return inputContext.equalString()+ " "
                + outputContext.toString();
	}

	public int size() {
		return inputContext.size();
	}
}
