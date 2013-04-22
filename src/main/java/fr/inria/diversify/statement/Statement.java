package fr.inria.diversify.statement;


import spoon.reflect.Factory;
import spoon.reflect.code.CtStatement;
import spoon.reflect.cu.SourcePosition;
import spoon.reflect.declaration.CtTypedElement;
import spoon.reflect.reference.CtTypeReference;
import spoon.reflect.reference.CtVariableReference;

public class Statement {
	protected InputContext inputContext;
	protected CtTypeReference<?> ouputContext;
	protected CtStatement stmt;
	private String equalString;
	
	
	public Statement(CtStatement stmt) {
		this.stmt = stmt;
		this.initOutputContext();
		this.initInputContext();
	}
	
	public CtTypeReference<?> getOuputContext() {	
		return ouputContext;
	}
	
	
	public InputContext getInputContext() {
		return inputContext;
	} 
	
	protected void initOutputContext(){
		if(stmt instanceof CtTypedElement) {
			ouputContext = ((CtTypedElement<?>)stmt).getType();
			if(ouputContext == null)
				System.out.println();
		}
		else
			ouputContext =Factory.getLauchingFactory().Type().createReference(Void.class) ;
	}

	protected void initInputContext(){
		VariableVisitor visitor = new VariableVisitor();
		stmt.accept(visitor);
		inputContext = visitor.input();
	}
	
	
	@Override
	public String toString() {
		String tmp = "Input:" + inputContext;
		tmp = tmp + "\nOutput: "+ouputContext+"\nSource: "+stmt;
		return tmp;
	}
	
	
	public String equalString() {
		if(equalString != null)
			return equalString;
		
		equalString = "Input: "+inputContext.equalString();	
		JavaPrettyPrinter pp = new JavaPrettyPrinter(stmt.getFactory().getEnvironment());
		stmt.accept(pp);
		equalString = equalString + "\nOutput: "+ouputContext+"\nSource: "+pp.toString();
		return equalString;
	}
	
	public void replace(Statement other) throws CloneNotSupportedException{
		System.out.println("\navant: "+stmt.getPosition());
		System.out.println(stmt.getParent());
	
		for (CtVariableReference<?> variable : other.getInputContext().getContext()) {
			System.out.println("replace: "+variable+ " by "+inputContext.candidate(variable));
			variable.setSimpleName(inputContext.candidate(variable).getSimpleName());
			
		}
		stmt.replace(other.stmt);
		System.out.println("\napres: ");
		System.out.println(stmt.getParent());
	
	}
	
	//check if this can be replaced by other
	public boolean isReplace(Statement other){
		return inputContext.isInclude(other.getInputContext()) && ouputContext.equals(other.ouputContext);
	}
	
	
	
//	@Override
//	public boolean equals(Object obj) {
//		if(obj == null)
//			return false;
//		
//		Statement stmtObj = (Statement)obj;
//		return stmt.toString().equals(stmtObj.stmt.toString()) && 
//				inputContext.equals(stmtObj.inputContext) &&
//				ouputContext.equals(stmtObj.ouputContext);
//	}
	
//	@Override
//	public int hashCode() {
//		return stmt.toString().hashCode()*inputContext.hashCode() + ouputContext.hashCode();
//	}
	
	public Context getContext() {
		return new Context(inputContext,ouputContext);
	}
	
	public Class<?> getStatementType() {
		return stmt.getClass();
	}
	
	public SourcePosition getSourcePosition() {
		return stmt.getPosition();
	}
	
	public int id() {
		return equalString().hashCode() + inputContext.hashCode() + ouputContext.hashCode();
	}
	
}
