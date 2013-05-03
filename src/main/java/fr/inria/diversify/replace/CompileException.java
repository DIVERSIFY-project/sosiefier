package fr.inria.diversify.replace;

/**
 * User: Simon
 * Date: 5/3/13
 * Time: 2:14 PM
 */
public class CompileException extends Exception {

    public CompileException(String s) {
        super(s);
    }

    public CompileException(Exception e) {
        super(e);
    }
}
