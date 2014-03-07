package fr.inria.diversify.transformation.query;

import fr.inria.diversify.util.DiversifyEnvironment;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.cvl.LinkExistence;
import fr.inria.diversify.transformation.cvl.LinkSubstitution;
import fr.inria.diversify.transformation.cvl.ObjectExistence;
import fr.inria.diversify.transformation.cvl.ObjectSubstitution;
import spoon.reflect.declaration.CtClass;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtField;
import spoon.reflect.reference.CtTypeReference;

import java.util.*;

/**
 * User: Simon
 * Date: 26/02/14
 * Time: 11:10
 */
public class CvlQuery extends TransformationQuery {

    @Override
    public void setType(String type) {

    }

    @Override
    public Transformation getTransformation() throws Exception {
        Random r = new Random();
        int i = r.nextInt(4);
        switch (i) {
            case 0: return getObjectExistence();
            case 1: return getObjectSubstitution();
            case 2: return getLinkExistence();
            case 3: return getLinkSubstitution();
        }
        return null;
    }

    public LinkSubstitution getLinkSubstitution() {
        Random r = new Random();

        if(r.nextInt()%2 == 0)
            return getLSForField();
        else
            return getLSForClass();
    }

    protected LinkSubstitution getLSForField() {
        LinkSubstitution ls = new LinkSubstitution();
        List<CtElement> objects = DiversifyEnvironment.getAllElement(CtField.class);
        Random r = new Random();

        ls.setObject(objects.get(r.nextInt(objects.size())));
        ls.setTransplant(objects.get(r.nextInt(objects.size())));

        return ls;
    }

    protected LinkSubstitution getLSForClass() {
        LinkSubstitution ls = new LinkSubstitution();
        List<CtElement> objects = DiversifyEnvironment.getAllElement(CtClass.class);
        Random r = new Random();

        CtClass cl = (CtClass) objects.get(r.nextInt(objects.size()));
        List<CtTypeReference> set = new ArrayList<CtTypeReference>();
        while (cl.getSimpleName().equals("") || set.isEmpty()) {
            set.clear();
            cl = (CtClass) objects.get(r.nextInt(objects.size()));
            if(cl.getSuperclass() != null)
                set.add(cl.getSuperclass());
            set.addAll(cl.getSuperInterfaces());
        }
        ls.setObject(cl);
        ls.setTransplant(objects.get(r.nextInt(objects.size())));
        ls.setClassOrInterfaceSubstitution(set.get(r.nextInt(set.size())));

        return ls;
    }

    public LinkExistence getLinkExistence() {
        Random r = new Random();

        if(r.nextInt()%2 == 0)
            return getLEForField();
        else
            return getLEForClass();
    }

    protected LinkExistence getLEForField() {
        LinkExistence ls = new LinkExistence();
        List<CtElement> objects = DiversifyEnvironment.getAllElement(CtField.class);
        Random r = new Random();

        ls.setObject(objects.get(r.nextInt(objects.size())));

        return ls;
    }

    protected LinkExistence getLEForClass() {
        LinkExistence ls = new LinkExistence();
        List<CtElement> objects = DiversifyEnvironment.getAllElement(CtClass.class);
        Random r = new Random();

        CtClass cl = (CtClass) objects.get(r.nextInt(objects.size()));
        List<CtTypeReference> set = new ArrayList<CtTypeReference>();
        while (cl.getSimpleName().equals("") || set.isEmpty()) {
            set.clear();
            cl = (CtClass) objects.get(r.nextInt(objects.size()));
            if(cl.getSuperclass() != null)
                set.add(cl.getSuperclass());
            set.addAll(cl.getSuperInterfaces());
        }
        ls.setObject(cl);
        ls.setClassOrInterfaceExistance(set.get(r.nextInt(set.size())));

        return ls;
    }

    public ObjectSubstitution getObjectSubstitution() {
        ObjectSubstitution os = new  ObjectSubstitution();
        Random r = new Random();

        List<CtElement> objects = DiversifyEnvironment.getAllElement(CtElement.class);
        os.setObject(objects.get(r.nextInt(objects.size())));

        List<CtElement> transplants = DiversifyEnvironment.getAllElement(os.getObject().getClass());
        os.setTransplant(transplants.get(r.nextInt(transplants.size())));

        return os;
    }

    public ObjectExistence getObjectExistence() {
        ObjectExistence oe = new  ObjectExistence();
        Random r = new Random();
        List<CtElement> objects = DiversifyEnvironment.getAllElement(CtElement.class);
        oe.setObject(objects.get(r.nextInt(objects.size())));
        return oe;
    }


}
