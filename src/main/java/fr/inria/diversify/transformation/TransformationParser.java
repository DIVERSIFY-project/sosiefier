package fr.inria.diversify.transformation;

import fr.inria.diversify.diversification.InputProgram;
import fr.inria.diversify.transformation.cvl.*;
import fr.inria.diversify.transformation.other.ShuffleStmtTransformation;
import fr.inria.diversify.util.DiversifyEnvironment;
import fr.inria.diversify.codeFragment.CodeFragment;
import fr.inria.diversify.transformation.ast.ASTAdd;
import fr.inria.diversify.transformation.ast.ASTDelete;
import fr.inria.diversify.transformation.ast.ASTReplace;
import fr.inria.diversify.transformation.ast.ASTTransformation;
import fr.inria.diversify.transformation.bytecode.BytecodeAdd;
import fr.inria.diversify.transformation.bytecode.BytecodeDelete;
import fr.inria.diversify.transformation.bytecode.BytecodeReplace;
import fr.inria.diversify.transformation.bytecode.BytecodeTransformation;
import fr.inria.diversify.transformation.mutation.*;
import fr.inria.diversify.util.Log;
import javassist.CtMethod;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import spoon.reflect.code.CtBinaryOperator;
import spoon.reflect.code.CtBlock;
import spoon.reflect.code.CtLocalVariable;
import spoon.reflect.code.CtReturn;
import spoon.reflect.declaration.CtClass;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtPackage;
import spoon.reflect.declaration.CtSimpleType;
import spoon.reflect.reference.CtTypeReference;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

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
