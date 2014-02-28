package fr.inria.diversify.transformation.cvl;

import fr.inria.diversify.util.Log;
import spoon.reflect.cu.CompilationUnit;
import spoon.reflect.cu.SourceCodeFragment;
import spoon.reflect.cu.SourcePosition;
import spoon.reflect.declaration.CtElement;
import spoon.reflect.declaration.CtField;
import spoon.reflect.declaration.CtSimpleType;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * User: Simon
 * Date: 25/02/14
 * Time: 15:09
 */
public class LinkSubstitution extends CVLTransformation {
    protected CtElement transplant;
    public LinkSubstitution() {
        type= "cvl";
        name = "linkSubstitution";
    }

    @Override
    public void apply(String srcDir) throws Exception {
        Log.debug("transformation: {}, {}", type, name);
        Log.debug("object ({}):\n {}", object.getClass().getSimpleName(), object);
        Log.debug("\npositiom:{}", object.getPosition());

        SourcePosition sp = object.getPosition();
        CompilationUnit compileUnit = sp.getCompilationUnit();

        if (object instanceof CtField) {
            compileUnit.addSourceCodeFragment(new SourceCodeFragment(sp.getSourceStart(),  "/** ", 0));
            compileUnit.addSourceCodeFragment(new SourceCodeFragment(sp.getSourceEnd()+1, " **/\n"+
                    transplant.toString(), 0));
        }
        if(object instanceof CtSimpleType) {
            String className = ((CtSimpleType)object).getSimpleName();
            String classSubstitution = ((CtSimpleType)transplant).getSimpleName();
            int[] index = findIndex(className,classSubstitution);
            compileUnit.addSourceCodeFragment(new SourceCodeFragment(index[0],  "/** ", 0));
            compileUnit.addSourceCodeFragment(new SourceCodeFragment(index[1]+1, " **/\n"+
                    classSubstitution, 0));
        }

        printJavaFile(srcDir);
        removeSourceCode(object);
    }

    @Override
    public void restore(String srcDir) throws Exception {
        removeSourceCode(object);
        printJavaFile(srcDir);
    }

    protected int[] findIndex(String className, String classSubstitution) throws IOException {
        SourcePosition sp = object.getPosition();
        FileInputStream fstream = new FileInputStream(sp.getFile());
        BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
        Pattern classPattern = Pattern.compile("(\\.|\\n)+(class)|(interface)\\w+"+className);

        StringBuilder sb = new StringBuilder();
        int r;
        int i = 0;
        boolean stop = true;
        while((r = br.read()) != -1 && stop) {
            sb.append((char)r);
            Matcher m = classPattern.matcher(sb);
            if(m.matches()) {
                stop = false;
            }
            i++;
        }
         Log.info(sb.toString());
         classPattern = Pattern.compile("(extends)|(implements)\\w+"+classSubstitution);

        int j = i;
        stop = true;
        sb = new StringBuilder();
        while((r = br.read()) != -1  && stop) {
            sb.append((char)r);
            Matcher m = classPattern.matcher(sb);
            if(m.matches()) {

            }
            j++;
        }
        Log.info(sb.toString());
        int index[] = new int[2];
        index[0] = j - classSubstitution.length();
        index[1] = j;

        return  index;
    }

    public void setTransplant(CtElement e) {
        transplant = e;
    }

    public CtElement getTransplant() {
        return transplant;
    }
}
