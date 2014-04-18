package fr.inria.diversify.statistic;

import fr.inria.diversify.util.DiversifyEnvironment;
import spoon.reflect.declaration.CtClass;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtField;
import spoon.reflect.visitor.QueryVisitor;
import spoon.reflect.visitor.filter.TypeFilter;
import spoon.support.reflect.declaration.CtEnumImpl;
import spoon.support.reflect.declaration.CtFieldImpl;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Created by Simon on 02/04/14.
 */
public class CVLMetric {

    public void printMetrics(String fileName) throws IOException {
        BufferedWriter out = new BufferedWriter(new FileWriter(fileName));
        out.append("nodeType;objectExistence;objectSubstitution;linkExistence;linkSubstitution\n");

        Set<Class<? extends CtElement>> classes = DiversifyEnvironment.getAllElement(CtElement.class).stream()
                .map(e -> e.getClass())
                .collect(Collectors.toSet());

        for(Class cl : classes) {
            out.append(cl.getSimpleName() + ";");
            out.append(nbObjectExistence(cl) + ";");
            out.append(nbObjectSubstitution(cl) + ";");
            out.append(nbLinkExistence(cl) + ";");
            out.append(nbLinkSubstitution(cl) + "\n");
        }

        out.close();
    }

    public long nbObjectExistence(Class cl) {
        return DiversifyEnvironment.getAllElement(cl).size();
    }

    public long nbObjectSubstitution(Class cl) {
        long nb =  DiversifyEnvironment.getAllElement(cl).size();
        return nb * nb;
    }

    public long nbLinkExistence(Class cl) {

        if(CtField.class.isAssignableFrom(cl))
            return DiversifyEnvironment.getAllElement(CtField.class).size();

        if(CtClass.class.isAssignableFrom(cl) && !cl.equals(CtEnumImpl.class)) {
            long m = 0;
            List<CtElement> classes = DiversifyEnvironment.getAllElement(CtClass.class);
            for (CtElement el : classes) {
                CtClass c = (CtClass) el;
                if (cl.getSuperclass() != null)
                    m = m + 1 + c.getSuperInterfaces().size();
                else
                    m = m + c.getSuperInterfaces().size();
            }
            return m;
        }
        return 0;
    }

    public long nbLinkSubstitution(Class cl) {
        if(CtField.class.isAssignableFrom(cl)) {
            int tmp = DiversifyEnvironment.getAllElement(CtField.class).size();
            return tmp * tmp;
        }
        if(CtClass.class.isAssignableFrom(cl) && !cl.equals(CtEnumImpl.class)) {
            long m = 0;
            List<CtElement> classes = DiversifyEnvironment.getAllElement(CtClass.class);
            for (CtElement el : classes) {
                CtClass c = (CtClass) el;
                if (cl.getSuperclass() != null)
                    m = m + (1 + c.getSuperInterfaces().size()) * classes.size();
                else
                    m = m + c.getSuperInterfaces().size() * classes.size();
            }
            return m;
        }
        return 0;
    }
}
