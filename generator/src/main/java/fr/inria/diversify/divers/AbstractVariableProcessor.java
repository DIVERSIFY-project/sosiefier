package fr.inria.diversify.divers;

import spoon.processing.AbstractProcessor;
import spoon.reflect.declaration.*;
import spoon.reflect.reference.CtTypeReference;

import java.lang.reflect.Modifier;

/**
 * Created by Simon on 26/02/15.
 */
public class AbstractVariableProcessor extends AbstractProcessor<CtVariable> {
    public static int countVariable = 0;
    public static int countAbstractVariable = 0;
    public static int countParameter = 0;
    public static int countAbstractParameter = 0;
    public static int countField = 0;
    public static int countAbstractField = 0;

    @Override
    public void process(CtVariable element) {
        try {
            if (element instanceof CtParameter) {
                countParameter++;
            } else
                if (element instanceof CtField) {
                    countField++;
                } else {
                    countVariable++;
                }

            CtTypeReference type = element.getType();
            if (type.isInterface() || isAbstract(type)) {
                if (element instanceof CtParameter) {
                    countAbstractParameter++;
                } else
                    if (element instanceof CtField) {
                        countAbstractField++;
                    } else {
                        countAbstractVariable++;
                    }
            }
        } catch (Exception e) {
        }
    }

    protected boolean isAbstract(CtTypeReference type) {
        try {
            return Modifier.isAbstract(type.getActualClass().getModifiers());
        } catch (Exception e) {
            try {
                return type.getDeclaration().getModifiers().contains(ModifierKind.ABSTRACT);
            } catch (Exception ee) {
                return false;
            }
        }
    }

}
