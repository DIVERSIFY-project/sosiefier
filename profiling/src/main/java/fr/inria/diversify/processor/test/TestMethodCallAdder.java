package fr.inria.diversify.processor.test;

import spoon.reflect.code.CtBlock;
import spoon.reflect.code.CtInvocation;
import spoon.reflect.code.CtNewArray;
import spoon.reflect.declaration.CtClass;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.visitor.Query;
import spoon.reflect.visitor.filter.TypeFilter;

import java.util.ArrayList;
import java.util.List;


public class TestMethodCallAdder extends TestProcessor {

    public void process(CtMethod method) {

        //get the list of method calls
        List<CtInvocation> invocations = Query.getElements(method, new TypeFilter(CtInvocation.class));
        //this index serves to replace ith literal is replaced by zero in the ith clone of the method
        int lit_index = 0;
        for(CtInvocation invocation : invocations) {
            if(toAdd(invocation) && !isAssert(invocation)) {
                try {
                    //clone the method
                    CtMethod cloned_method = cloneMethodTest(method, "_add", 1000);

                    //get the lit_indexth literal of the cloned method
                    CtInvocation stmt = Query.getElements(cloned_method, new TypeFilter<CtInvocation>(CtInvocation.class)).get(lit_index);
                    if (method.getDeclaringType() != null) {
                        CtInvocation stmtClone = getFactory().Core().clone(stmt);
                        stmtClone.setParent(stmt.getParent());
                        stmt.insertBefore(stmtClone);
                        //add the cloned method in the same class as the original method
                        try {
                            cloned_method.toString();
                            ((CtClass) method.getDeclaringType()).addMethod(cloned_method);
                            notHarmanTest.add(cloned_method);
                        } catch (Exception e) {
//                            notHarmanTest.add(cloned_method);
                        }

                    }
                }    catch(Exception e){
                    throw new RuntimeException(e);
                    //let's be plastic, the transforms that work will work, for the rest 'anything goes'
                }
            }
            lit_index++;
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
		return !invocation.toString().startsWith("super(")
            && invocation.getParent() instanceof CtBlock;
//            && Query.getElements(invocation, new TypeFilter(CtNewArray.class)).isEmpty()    ;
	}

}
