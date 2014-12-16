package fr.inria.diversify.sosie.logger.processor;

import fr.inria.diversify.transformation.Transformation;
import spoon.processing.AbstractProcessor;
import spoon.reflect.code.CtBreak;
import spoon.reflect.declaration.*;
import spoon.reflect.visitor.QueryVisitor;
import spoon.reflect.visitor.filter.TypeFilter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by marodrig on 27/06/2014.
 */
public abstract class AbstractLoggingInstrumenter<E extends CtElement> extends AbstractProcessor<E> {
    protected static Map<String, String> idMap = new HashMap();
    protected static Map<CtExecutable, Integer> count = new HashMap();
    List<String> classFilter;

    protected List<Transformation> transformations;

    protected boolean useCompactLog = false;

    public AbstractLoggingInstrumenter(List<Transformation> transformations) {
        this.transformations = transformations;
    }
    
    public boolean getUseCompactLog() {
        return useCompactLog;
    }

    public void setUseCompactLog(boolean logClassFullName) {
        this.useCompactLog = logClassFullName;
    }

    protected String getLogName() {
        String packName = "fr.inria.diversify.sosie.logger.";
        return packName + (useCompactLog ? "BinLogWriter" : "LogWriter" );
    }

    protected CtClass<?> getClass(CtElement stmt) {
        return stmt.getParent(CtClass.class);
    }

    protected CtExecutable<?> getMethod(CtElement stmt) {
        CtExecutable<?> ret = stmt.getParent(CtMethod.class);
        if (ret == null)
            ret = stmt.getParent(CtConstructor.class);
        return ret;
    }

    protected String idFor(String string, String anotation) {
        String key = string + " " + anotation;
        if (!idMap.containsKey(key))
            idMap.put(key, Integer.toString(idMap.size()));

        return idMap.get(key);
    }

    public boolean classFilterContains(E element) {
        return getClass(element) != null
            && classFilter.contains(getClass(element).getSimpleName());
    }



    protected String idFor(String string) {
        return idFor(string, "");
    }


    public static void writeIdFile(String dir) throws IOException {
        File file = new File(dir + "/log");
        file.mkdirs();
        FileWriter fw = new FileWriter(file.getAbsoluteFile() + "/id");

        for (String s : idMap.keySet())
            fw.write(idMap.get(s) + " " + s + "\n");

        fw.close();
    }

    protected int getCount(CtElement stmt) {
        CtExecutable parent = stmt.getParent(CtExecutable.class);
        if (count.containsKey(parent))
            count.put(parent, count.get(parent) + 1);
        else
            count.put(parent, 0);
        return count.get(parent);
    }

    protected boolean containsGoto(CtElement elem) {
        QueryVisitor query = new QueryVisitor(new TypeFilter(CtBreak.class));
        elem.accept(query);
        for(Object o : query.getResult()) {
            CtBreak ctBreak = (CtBreak) o;
            if(ctBreak.getTargetLabel() != null) {
                return true;
            }
        }
        return false;
    }

    protected boolean containsTransformation(CtExecutable method) {
        if(transformations == null) {
            return false;
        }
        String methodSignature = method.getDeclaringType().getQualifiedName() +"."+ method.getSimpleName();
        for (Transformation trans : transformations) {
            String transSignature = trans.classLocationName() +"."+ trans.methodLocationName();
            if(transSignature.equals(methodSignature)) {
                return true;
            }
        }
        return false;
    }

    public void setClassFilter(List<String> classFilter) {
        this.classFilter = classFilter;
    }
}
