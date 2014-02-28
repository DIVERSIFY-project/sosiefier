package fr.inria.diversify.transformation.query;

import fr.inria.diversify.DiversifyEnvironment;
import fr.inria.diversify.transformation.Transformation;
import fr.inria.diversify.transformation.cvl.LinkExistence;
import fr.inria.diversify.transformation.cvl.LinkSubstitution;
import fr.inria.diversify.transformation.cvl.ObjectExistence;
import fr.inria.diversify.transformation.cvl.ObjectSubstitution;
import spoon.reflect.declaration.CtClass;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.visitor.QueryVisitor;
import spoon.reflect.visitor.filter.TypeFilter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 * User: Simon
 * Date: 26/02/14
 * Time: 11:10
 */
public class CvlQuery extends TransformationQuery {
    protected Map<Class, List<CtElement>> typeToObject;


     public CvlQuery() {
         typeToObject = new HashMap<Class, List<CtElement>>();
     }

    @Override
    public void setType(String type) {

    }

    @Override
    public Transformation getTransformation() throws Exception {
        Random r = new Random();
        int i = r.nextInt(1);
        i = 3;
        switch (i) {
            case 0: return getObjectExistence();
            case 1: return getObjectSubstitution();
            case 2: return getLinkExistence();
            case 3: return getLinkSubstitution();
        }
        return null;
    }

    public LinkSubstitution getLinkSubstitution() {
        LinkSubstitution ls = new LinkSubstitution();
        List<CtElement> objects = getAllElement(CtClass.class);
        Random r = new Random();

        CtClass cl = (CtClass) objects.get(r.nextInt(objects.size()));
        while (cl.getSuperclass() == null || cl.getSuperclass().getSimpleName().equals("Object") ) {
            cl = (CtClass) objects.get(r.nextInt(objects.size()));
        }
        ls.setObject(cl);
        ls.setTransplant(objects.get(r.nextInt(objects.size())));

        return ls;
    }

    public LinkExistence getLinkExistence() {
        LinkExistence le = new LinkExistence();
        return le;
    }

    public ObjectSubstitution getObjectSubstitution() {
        ObjectSubstitution os = new  ObjectSubstitution();
        Random r = new Random();

        List<CtElement> objects = getAllElement(CtElement.class);
        os.setObject(objects.get(r.nextInt(objects.size())));

        List<CtElement> transplants = getAllElement(os.getObject().getClass());
        os.setTransplant(transplants.get(r.nextInt(transplants.size())));

        return os;
    }

    public ObjectExistence getObjectExistence() {
        ObjectExistence oe = new  ObjectExistence();
        Random r = new Random();
        List<CtElement> objects = getAllElement(CtElement.class);
        oe.setObject(objects.get(r.nextInt(objects.size())));
        return oe;
    }

    protected  List<CtElement> getAllElement(Class cl) {
        if(!typeToObject.containsKey(cl)) {
            QueryVisitor query = new QueryVisitor(new TypeFilter(cl));
            DiversifyEnvironment.getRoot().accept(query);
            typeToObject.put(cl, query.getResult());
        }
        return typeToObject.get(cl);
    }
}
