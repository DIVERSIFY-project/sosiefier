package fr.inria.diversify.javassist;


import fr.inria.diversify.coverage.ICoverageReport;
import javassist.CtClass;
import javassist.CtMethod;
import javassist.bytecode.BadBytecode;
import javassist.bytecode.CodeAttribute;
import javassist.bytecode.CodeIterator;
import javassist.bytecode.MethodInfo;

import java.util.ArrayList;
import java.util.Random;
import java.util.List;

/**
 * User: Simon
 * Date: 07/11/13
 * Time: 13:07
 */
public class ByteCodeTransformationQuery {
//    protected List<CtClass> classes;
    protected List<CtMethod> methods;
    protected int nbTransformation = 1;
    protected String type = "replace";
    protected ICoverageReport coverageReport;

    public ByteCodeTransformationQuery(List<CtMethod> methods, ICoverageReport coverageReport) {
        this.methods = methods;
        this.coverageReport = coverageReport;
    }


    public void setNbTransformation(int n) {
        nbTransformation = n;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ByteCodeTransformation getTransformation() throws Exception {
        String type = this.type;
        if(type == null) {
            Random r = new Random();
            int i = r.nextInt(2);
            if(i == 0)
                type = "replace";
            if(i == 1)
                type = "delete";
            if(i == 2)
                type = "add";
        }

        if(type.equals("replace"))
            return replace();

        if(type.equals("add"))
            return add();

        if(type.equals("delete"))
            return delete();

        return null;
    }


    public BytecodeDelete delete() throws Exception {
        CtMethod method = randomConcreteMethod();
        int opCodeIndex = randomOpCode(method);

        while(coverageReport.opCodeCoverage(method,opCodeIndex) == 0) {
            method = randomConcreteMethod();
            opCodeIndex = randomOpCode(method);
        }
        return new BytecodeDelete(method,opCodeIndex);
    }

    public BytecodeAdd add() throws Exception {
        CtMethod method = randomConcreteMethod();
        int opCodeIndex = randomOpCode(method);

        while(coverageReport.opCodeCoverage(method,opCodeIndex) == 0) {
            method = randomConcreteMethod();
            opCodeIndex = randomOpCode(method);
        }
        return null;// new BytecodeAdd(method,opCodeIndex);
    }

    public BytecodeReplace replace() throws Exception {
        CtMethod method = randomConcreteMethod();
        int opCodeIndex = randomOpCode(method);

        while(coverageReport.opCodeCoverage(method,opCodeIndex) == 0) {
            method = randomConcreteMethod();
            opCodeIndex = randomOpCode(method);
        }
        return null;// new BytecodeReplace(method,opCodeIndex);
    }


    protected CtMethod randomConcreteMethod() {
        Random r = new Random();

        return methods.get(r.nextInt(methods.size()));
    }

    protected int randomOpCode(CtMethod method) throws BadBytecode {
        MethodInfo minfo = method.getMethodInfo();

        CodeAttribute ca = minfo.getCodeAttribute();
        List<Integer> opCodeIndexList = opCodeIndexList(ca);

        Random r = new Random();

        return opCodeIndexList.get(r.nextInt(opCodeIndexList.size()));
    }

    protected List<Integer> opCodeIndexList(CodeAttribute ca) throws BadBytecode {
        List<Integer> list = new ArrayList<Integer>();
        CodeIterator i = ca.iterator();

        while (i.hasNext()) {
            list.add(i.next());
        }
        return list;
    }
}