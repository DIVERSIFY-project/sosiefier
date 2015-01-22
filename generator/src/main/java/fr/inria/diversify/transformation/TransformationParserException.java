package fr.inria.diversify.transformation;

import org.json.JSONObject;

/**
 * Created by marodrig on 11/06/2014.
 */
public class TransformationParserException extends Exception {

    public TransformationParserException(String message, Object object) {
        super(message);
    }


    public TransformationParserException() {
    }

    public TransformationParserException(String message) {
        super(message);
    }

    public TransformationParserException(Throwable cause) {
        super(cause);
    }

    public TransformationParserException(String message, Throwable cause) {
        super(message, cause);
    }
}
