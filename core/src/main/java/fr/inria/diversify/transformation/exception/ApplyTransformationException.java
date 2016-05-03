package fr.inria.diversify.transformation.exception;

/**
 * Created by Simon on 30/10/14.
 */
public class ApplyTransformationException extends Exception {

    public ApplyTransformationException(String s, Exception e) {
        super(s,e);
    }

    public ApplyTransformationException(String s) {
        super(s);
    }
}
