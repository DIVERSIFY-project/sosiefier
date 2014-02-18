package fr.inria.diversify.transformation;

import java.util.List;

/**
 * User: Simon
 * Date: 12/02/14
 * Time: 10:44
 */
public abstract class AbstractTransformation implements Transformation {
    protected Integer status = -3;
    protected List<String> failures;
    protected String name;
    protected String type;

    public void setStatus(Integer result) {
        status = result;
    }

    public int getStatus() {
        return status;
    }

    public void setFailures(List<String> f) {
        failures = f;
    }
    public List<String> getFailures() {
        return failures;
    }

    public boolean isCompile() {
        return status > -1;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }
}
