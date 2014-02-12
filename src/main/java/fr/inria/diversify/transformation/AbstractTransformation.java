package fr.inria.diversify.transformation;

/**
 * User: Simon
 * Date: 12/02/14
 * Time: 10:44
 */
public abstract class AbstractTransformation implements Transformation {
    protected Integer failures = -1;
    protected boolean compile;

    public void setJUnitResult(Integer result) {
        failures = result;
    }

    public int numberOfFailure() {
        return failures;
    }

    public boolean getCompile() {
        return compile;
    }
    //    public int nbMethodInClassLocation() {
//        return position.getCtCodeFragment().getParent(CtType.class).getMethods().size();
//    }
    public void setCompile(boolean b){
        compile = b;
    }
}
