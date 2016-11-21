package fr.inria.diversify.statistic;

import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.ast.ASTTransformation;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collection;
import java.util.stream.Collectors;

/**
 * User: Simon
 * Date: 27/04/16
 * Time: 10:41
 */
public class TransformationInfo {
    Collection<Transformation> transformations;
    public boolean printPurity = false;

    public TransformationInfo(Collection<Transformation> transformations) {
        this.transformations = transformations;
    }

    public void print(String fileName) throws IOException {
        BufferedWriter out = new BufferedWriter(new FileWriter(fileName));
        out.append("uuid;type;name;position;status;nbFailures");
        if(printPurity) out.append(";inPure;inConstructor");
        out.append("\n");


        for(Transformation transformation : transformations) {
            out.append(transformation.getIndex() + ";");
            out.append(transformation.getType() + ";");
            out.append(transformation.getName() + ";");
            out.append(transformation.getPositions().stream()
                    .map(position -> position.getCompilationUnit().getMainType().getQualifiedName() + ":" + position.getLine())
                    .collect(Collectors.joining(",")) + ";");
            out.append(transformation.getStatus() + ";");
            out.append(transformation.getFailures().size() + "");
            if(printPurity && (transformation instanceof ASTTransformation)) {
                ASTTransformation a = (ASTTransformation) transformation;
                out.append(";" + a.inPure + ";" + a.inConstructor);
            }
            out.append("\n");
        }

        out.close();
    }
}
