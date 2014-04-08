package fr.inria.diversify.statistic;

import fr.inria.diversify.util.DiversifyEnvironment;
import spoon.reflect.declaration.CtClass;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtField;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by Simon on 02/04/14.
 */
public class CVLMetric {

    public long nbObjectExistence() {
        return DiversifyEnvironment.getAllElement(CtElement.class).size();
    }

    public long nbObjectSubstitution() {
        Map<Class, List<CtElement>> group =  DiversifyEnvironment.getAllElement(CtElement.class).stream()
        .collect(Collectors.groupingBy(el -> el.getClass()));

        long m = 0;
        for(List<CtElement> list : group.values()) {
            m = m + list.size()*list.size();
        }
        return m;
    }

    public long nbLinkExistence() {
        long m = DiversifyEnvironment.getAllElement(CtField.class).size();

        List<CtElement> classes = DiversifyEnvironment.getAllElement(CtClass.class);
        for(CtElement el : classes) {
            CtClass cl = (CtClass)el;
            if(cl.getSuperclass() != null)
                m = m + 1 + cl.getSuperInterfaces().size();
            else
                m = m + cl.getSuperInterfaces().size();
        }
        return m;
    }

    public long nbLinkSubstitution() {
        int tmp = DiversifyEnvironment.getAllElement(CtField.class).size();
        long m = tmp*tmp;

        List<CtElement> classes = DiversifyEnvironment.getAllElement(CtClass.class);
        for(CtElement el : classes) {
            CtClass cl = (CtClass)el;
            if(cl.getSuperclass() != null)
                m = m + (1+cl.getSuperInterfaces().size())*classes.size();
            else
                m = m + cl.getSuperInterfaces().size()*classes.size();
        }
        return m;
    }

    public long nbCVLTransformation() {
        return nbObjectExistence() + nbObjectSubstitution() + nbLinkExistence() + nbLinkSubstitution();
    }
}
