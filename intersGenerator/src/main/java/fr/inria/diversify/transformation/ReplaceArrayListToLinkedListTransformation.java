package fr.inria.diversify.transformation;

import fr.inria.diversify.transformation.ast.exception.ApplyTransformationException;
import fr.inria.diversify.util.Log;
import spoon.compiler.Environment;
import spoon.reflect.code.CtConstructorCall;
import spoon.reflect.cu.SourcePosition;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtType;
import spoon.reflect.factory.Factory;
import spoon.reflect.reference.CtTypeReference;
import spoon.reflect.visitor.DefaultJavaPrettyPrinter;
import spoon.support.JavaOutputProcessor;

import java.io.File;
import java.io.IOException;
import java.util.*;

/**
 * Created by lguerin on 04/06/15.
 */
public class ReplaceArrayListToLinkedListTransformation extends Transformation {
    protected HashMap<CtConstructorCallPoint,CtConstructorCall> transplantationPoints= new HashMap<CtConstructorCallPoint,CtConstructorCall>();
    protected HashMap<CtConstructorCallPoint,CtConstructorCall> transplants= new HashMap<CtConstructorCallPoint,CtConstructorCall>();
    protected CtConstructorCall copyTransplant;


    @Override
    public String getTransformationString() throws Exception {
        return null;
    }

    @Override
    public void apply(String srcDir) throws Exception {
        Set<CtConstructorCallPoint> keySet= transplantationPoints.keySet();
        Iterator<CtConstructorCallPoint> it=keySet.iterator();

        while(it.hasNext()){
            CtConstructorCallPoint current=it.next();
            try {
                copyTransplant = transplantationPoints.get(current );
                current.getCtConstructorCall().replace(copyTransplant);

            } catch (Exception e) {
                throw new ApplyTransformationException("", e);
            }

        }

        printJavaFile(srcDir);
    }

    @Override
    public void applyWithParent(String srcDir) throws Exception {
        if (parent != null) parent.apply(srcDir);
        apply(srcDir);
    }

    @Override
    public void restore(String srcDir) throws Exception {
        Set<CtConstructorCallPoint> keySet= transplants.keySet();
        Iterator<CtConstructorCallPoint> it=keySet.iterator();

        while(it.hasNext()){
            CtConstructorCallPoint current=it.next();
            try {
                copyTransplant = transplants.get(current );
                current.getCtConstructorCall().replace(copyTransplant);

            } catch (Exception e) {
                throw new ApplyTransformationException("", e);
            }
        }

        printJavaFile(srcDir);
    }

    @Override
    public SourcePosition getPosition() {
        return null;
    }

    public void addTransplantationPoint(CtConstructorCall ctConstructorCall, CtConstructorCall newCtConstructorCall) {
        transplantationPoints.put(new CtConstructorCallPoint(transplantationPoints.size(),ctConstructorCall),newCtConstructorCall);
        transplants.put(new CtConstructorCallPoint(transplantationPoints.size(),newCtConstructorCall),ctConstructorCall);
    }

    private class CtConstructorCallPoint{
        private int id;
        private CtConstructorCall ctConstructorCall;

        public CtConstructorCallPoint(int i, CtConstructorCall c){
            this.id=i;
            this.ctConstructorCall=c;
        }

        public CtConstructorCall getCtConstructorCall(){
            return ctConstructorCall;
        }
    }

    public void printJavaFile(String directory) throws IOException {
        Set<CtConstructorCallPoint> keySet= transplantationPoints.keySet();
        Iterator<CtConstructorCallPoint> it=keySet.iterator();

        List<CtType> files=new ArrayList<>();

        while(it.hasNext()){
            CtConstructorCall current=it.next().getCtConstructorCall();
            CtType<?> type = getOriginalClass(current);
            if(!files.contains(type)){
                files.add(type);
            }
        }

        for(int i=0;i<files.size();i++){
            CtType type=files.get(i);
            Factory factory = type.getFactory();
            Environment env = factory.getEnvironment();

            JavaOutputProcessor processor = new JavaOutputProcessor(new File(directory), new DefaultJavaPrettyPrinter(env));
            processor.setFactory(factory);

            processor.createJavaFile(type);
            Log.debug("write type {} in directory {}", type.getQualifiedName(), directory);
        }
    }

    public CtType<?> getOriginalClass(CtElement element) {
        return (CtType<?>) element.getPosition().getCompilationUnit().getMainType();
    }
}
