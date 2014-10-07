package fr.inria.diversify.transformation;

import fr.inria.diversify.diversification.InputProgram;
import org.json.JSONException;

import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.List;

/**
 * A transformation parser that fails as quietly as possible.
 *
 * User: Simon
 * Date: 5/28/13
 * Time: 11:38 AM
 */
public class  TransformationParser {

    TransformationJsonParser parser;

    public TransformationParser(Boolean b, InputProgram inputProgram) {
        parser = new TransformationJsonParser(b, inputProgram);
    }

    /**
     * Parses a complete directory
     * @param dir Directory containing JSON parse files
     * @return A list of all transformations found
     * @throws IOException
     * @throws JSONException
     */
    public Collection<Transformation> parseDir(String dir) throws TransformationParserException {
        return parser.parseDir(dir);
    }


    /**
     * Parses a single file
     * @param file File to parse
     * @return A list of all transformations found
     * @throws IOException
     * @throws JSONException
     */
    public List<Transformation> parseFile(File file) throws TransformationParserException {
        return parser.parseFile(file);
    }

    /**
     * Parses a single transformation on a file
     * @param file File to parse
     * @return A list of all transformations found
     * @throws Exception
     */
    public Transformation parseUniqueTransformation(File file) throws Exception {
        return parser.parseUniqueTransformation(file);
    }


}
