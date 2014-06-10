package fr.inria.diversify.transformation.query.searchStrategy;

/**
 * Created by marcel on 9/06/14.
 */
public class SearchException extends Exception {
    public SearchException() { super(); }
    public SearchException(String message) { super(message); }
    public SearchException(String message, Throwable cause) { super(message, cause); }
    public SearchException(Throwable cause) { super(cause); }
}
