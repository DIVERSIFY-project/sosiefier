package fr.inria.diversify.util;

import spoon.reflect.declaration.CtSimpleType;
import spoon.support.JavaOutputProcessor;

import java.io.File;
import java.util.Collection;

/**
 * User: Simon
 * Date: 06/01/14
 * Time: 16:18
 */
public class JavaOutputProcessorWithFilter extends JavaOutputProcessor {
    protected Collection<String> classesName;

    /**
     * Creates a new processor for generating Java source files.
     *
     * @param outputDirectory the root output directory
     */
    public JavaOutputProcessorWithFilter(File outputDirectory, Collection<String> classesName) {
        super();
        setOutputDirectory(outputDirectory);
        this.classesName = classesName;
    }

    @Override
    public boolean isToBeProcessed(CtSimpleType<?> candidate) {
        return classesName.contains(candidate.getSimpleName());
    }
}
