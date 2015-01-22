package fr.inria.diversify.util;

import spoon.reflect.declaration.CtSimpleType;

import spoon.reflect.visitor.PrettyPrinter;
import spoon.support.JavaOutputProcessor;

import java.io.File;
import java.util.*;

/**
 * User: Simon
 * Date: 06/01/14
 * Time: 16:18
 */
public class JavaOutputProcessorWithFilter extends JavaOutputProcessor
{

    protected Collection<String> classes;

    public JavaOutputProcessorWithFilter(File outputDirectory, PrettyPrinter printer, Collection<String> classesName) {
        super(outputDirectory,printer);
        this.classes = classesName;
    }

    @Override
    public boolean isToBeProcessed(CtSimpleType<?> candidate) {
        return classes.contains(candidate.getSimpleName());
    }
}
