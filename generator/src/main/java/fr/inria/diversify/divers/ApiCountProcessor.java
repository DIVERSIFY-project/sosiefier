package fr.inria.diversify.divers;


import spoon.processing.AbstractProcessor;
import spoon.reflect.declaration.CtMethod;
import spoon.reflect.declaration.ModifierKind;

/**
 * User: Simon
 * Date: 03/03/15
 * Time: 10:04
 */
public class ApiCountProcessor extends AbstractProcessor<CtMethod> {
    public static int publicCount = 0;
    public static int protectedCount = 0;
    public static int privateCount = 0;

    @Override
    public void process(CtMethod element) {
        if(element.getModifiers().contains(ModifierKind.PRIVATE)) {
            privateCount++;
        }
        if(element.getModifiers().contains(ModifierKind.PROTECTED)) {
            protectedCount++;
        }
        if(element.getModifiers().contains(ModifierKind.PUBLIC)) {
            publicCount++;
        }
    }
}
