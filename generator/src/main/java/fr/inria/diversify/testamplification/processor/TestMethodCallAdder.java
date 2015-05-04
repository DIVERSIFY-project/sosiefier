package fr.inria.diversify.testamplification.processor;

import spoon.reflect.code.CtBlock;
import spoon.reflect.code.CtInvocation;
import spoon.reflect.declaration.CtClass;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.visitor.Query;
import spoon.reflect.visitor.filter.TypeFilter;

import java.util.ArrayList;
import java.util.List;


public class TestMethodCallAdder extends TestProcessor {
	
	public void process(CtMethod method) {
		try{			
			//get the list of method calls
			List<CtInvocation> invocations = Query.getElements(method, new TypeFilter(CtInvocation.class));
			//this index serves to replace ith literal is replaced by zero in the ith clone of the method
			int lit_index = 0;
			for(CtInvocation invocation : invocations) {
				if(toAdd(invocation) && !isAssert(invocation)) {
					//clone the method
					CtMethod cloned_method = cloneMethodTest(method, "_add", 1000);
					//add the cloned method in the same class as the original method
					if (method.getDeclaringType() != null) {
						((CtClass) method.getDeclaringType()).addMethod(cloned_method);
					}
					//get the lit_indexth literal of the cloned method
					CtInvocation stmt = Query.getElements(cloned_method, new TypeFilter<CtInvocation>(CtInvocation.class)).get(lit_index);
					stmt.insertBefore(this.getFactory().Core().clone(stmt));
                    notHarmanTest.add(cloned_method);
				}
				lit_index++;
			}
		}
		catch(Exception e){
			throw new RuntimeException(e);
			//let's be plastic, the transforms that work will work, for the rest 'anything goes'
		}
	}

    public  List<CtMethod> apply(CtMethod method) {
        List<CtMethod> methods = new ArrayList<>();
        try{
            //get the list of method calls
            List<CtInvocation> invocations = Query.getElements(method, new TypeFilter(CtInvocation.class));
            //this index serves to replace ith literal is replaced by zero in the ith clone of the method
            int lit_index = 0;
            for(CtInvocation invocation : invocations) {
                if(toAdd(invocation) && !isAssert(invocation)) {
                    //clone the method
                    CtMethod cloned_method = cloneMethodTest(method, "_add", 1000);
                    //add the cloned method in the same class as the original method
                    if (method.getDeclaringType() != null) {
                        //get the lit_indexth literal of the cloned method
                        CtInvocation stmt = Query.getElements(cloned_method, new TypeFilter<CtInvocation>(CtInvocation.class)).get(lit_index);
                        stmt.insertBefore(this.getFactory().Core().clone(stmt));
                        methods.add(cloned_method);
                    }

                }
                lit_index++;
            }
        }
        catch(Exception e) {}
        return methods;
    }

	public boolean toAdd(CtInvocation invocation) {
		return invocation.getParent() instanceof CtBlock;
	}

}
