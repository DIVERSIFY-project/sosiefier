package fr.inria.diversify.dspot.processor;

import spoon.reflect.code.*;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.visitor.Query;
import spoon.reflect.visitor.filter.TypeFilter;

import java.util.ArrayList;
import java.util.List;


public class TestMethodCallRemover extends AbstractAmp {

	protected boolean toRemove(CtInvocation invocation) {
		return invocation.getParent() instanceof CtBlock
				&& invocation.getParent(CtTry.class) == null;
	}

	protected boolean inWhileLoop(CtStatement stmt) {
		return stmt.getParent(CtWhile.class) != null;
	}

	protected boolean containsIteratorNext(CtStatement stmt) {
		return stmt.toString().contains(".next()");
	}

    public List<CtMethod> apply(CtMethod method) {
        List<CtMethod> methods = new ArrayList<>();
        try{
            //get the list of method calls
            List<CtInvocation> invocations = Query.getElements(method, new TypeFilter(CtInvocation.class));
            //this index serves to replace ith literal is replaced by zero in the ith clone of the method
            int lit_index=0;
            for(CtInvocation invocation : invocations){
                if(toRemove(invocation)
						&& !isAssert(invocation)
						&& !inWhileLoop(invocation)
						&& !containsIteratorNext(invocation)) {
                    //clone the method
                    CtMethod cloned_method = cloneMethodTest(method, "_remove",1000);
                    //add the cloned method in the same class as the original method
                    if (method.getDeclaringType() != null) {
                        //get the lit_indexth literal of the cloned method
                        CtInvocation stmt = Query.getElements(cloned_method, new TypeFilter<CtInvocation>(CtInvocation.class)).get(lit_index);
                        CtBlock b = ((CtBlock) stmt.getParent());
                        b.removeStatement(stmt);
                        methods.add(cloned_method);
                    }
                }
                lit_index++;
            }
        }
        catch(Exception e){}
        return filterAmpTest(methods, method);
    }


}
