package fr.inria.diversify.statement;


import spoon.reflect.Factory;
import spoon.reflect.code.CtFieldAccess;
import spoon.reflect.code.CtStatement;
import spoon.reflect.declaration.CtPackage;
import spoon.reflect.declaration.CtSimpleType;
import spoon.reflect.declaration.CtTypedElement;
import spoon.reflect.reference.CtTypeReference;
import spoon.reflect.reference.CtVariableReference;
import spoon.support.reflect.code.CtLocalVariableImpl;

public class Statement {
    protected Context context;
    protected CtStatement stmt;
    private String equalString;


    public Statement(CtStatement stmt) {
        this.stmt = stmt;
        context = new Context(initInputContext(), initOutputContext());
        this.initOutputContext();
        this.initInputContext();
    }

    public CtTypeReference<?> getOuputContext() {
        return context.getOuputContext();
    }


    public InputContext getInputContext() {
        return context.getInputContext();
    }

    protected CtTypeReference<?> initOutputContext() {
        if (stmt instanceof CtTypedElement) {
            return ((CtTypedElement<?>) stmt).getType();

        } else
            return Factory.getLauchingFactory().Type().createReference(void.class);
    }

    protected InputContext initInputContext() {
        VariableVisitor visitor = new VariableVisitor();
        stmt.accept(visitor);
        return visitor.input();
    }


    @Override
    public String toString() {
        String tmp = "Input:" + getInputContext();
        tmp = tmp + "\nOutput: " + getOuputContext() + "\nSource: " + stmt;
        return tmp;
    }


    public String equalString() {
        if (equalString != null)
            return equalString;
        StatementEqualPrinter pp = new StatementEqualPrinter(stmt.getFactory().getEnvironment());
        stmt.accept(pp);
        equalString = pp.toString();
        return equalString;
    }

    public void replace(Statement other) throws CloneNotSupportedException {
        System.out.println("\navant: " + stmt.getPosition());
        System.out.println(stmt.getParent());
        System.out.println("replace local var ");
        for (CtVariableReference<?> variable : other.getInputContext().getLocalVar()) {
            Object candidate = getInputContext().candidate(variable.getType());
            System.out.println("replace: " + variable + " by " + candidate);

            ReplaceVariableVisitor visitor = new ReplaceVariableVisitor(variable, candidate);
            other.stmt.accept(visitor);
        }

        System.out.println("replace field access ");
        for (CtFieldAccess<?> variable : other.getInputContext().getField()) {
            Object candidate = getInputContext().candidate(variable.getType());
            System.out.println("replace: " + variable + " by " + candidate);

            ReplaceVariableVisitor visitor = new ReplaceVariableVisitor(variable, candidate);
            other.stmt.accept(visitor);
        }
        stmt.replace(other.stmt);
        System.out.println("\napres: ");
        System.out.println(stmt.getParent());

    }

    //check if this can be replaced by other
    public boolean isReplace(Statement other) {
        Class<?> cl = stmt.getClass();
        Class<?> clOther = other.stmt.getClass();
        if(cl == CtLocalVariableImpl.class && clOther != CtLocalVariableImpl.class)
            return false;
        if(clOther ==  CtLocalVariableImpl.class && cl != CtLocalVariableImpl.class)
            return false;
        return getInputContext().isInclude(other.getInputContext()) && getOuputContext().equals(other.getOuputContext());
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
        return context;
    }

    public Class<?> getStatementType() {
        return stmt.getClass();
    }

    public CtSimpleType<?> getSourceClass() {
        return stmt.getPosition().getCompilationUnit().getMainType();
    }

    public CtPackage getSourcePackage() {
        return getSourceClass().getPackage();
    }

    public int id() {
        return equalString().hashCode() + context.hashCode();
    }

}
