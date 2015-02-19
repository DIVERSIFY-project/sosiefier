package fr.inria.diversify.testamplification.processor;

import spoon.reflect.code.CtInvocation;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.visitor.Query;
import spoon.reflect.visitor.filter.TypeFilter;

import java.util.List;

/**
 * Created by Simon on 03/02/15.
 */
public class CountProcessor extends TestProcessor {
    protected int testCount;
    protected int assertCount;
    protected int monitoringPointCount;

    @Override
    public void process(CtMethod method) {
        List<CtInvocation> invocations = Query.getElements(method, new TypeFilter(CtInvocation.class));
        testCount++;
        for(CtInvocation invocation : invocations) {
            if(isAssert(invocation)) {
                assertCount++;
            }
            if(isMonitoringPoint(invocation)) {
                monitoringPointCount++;
            }
        }
    }


    protected boolean isMonitoringPoint(CtInvocation invocation) {
        return invocation.toString().contains(".logAssertArgument(");
    }

    public int getTestCount() {
        return testCount;
    }

    public int getAssertCount() {
        return assertCount;
    }

    public int getMonitoringPointCount() {
        return monitoringPointCount;
    }
}
