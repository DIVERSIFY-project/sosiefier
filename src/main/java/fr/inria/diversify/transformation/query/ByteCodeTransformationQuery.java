package fr.inria.diversify.transformation.query;


import fr.inria.diversify.util.DiversifyEnvironment;
import fr.inria.diversify.coverage.ICoverageReport;
import fr.inria.diversify.transformation.bytecode.BytecodeAdd;
import fr.inria.diversify.transformation.bytecode.BytecodeDelete;
import fr.inria.diversify.transformation.bytecode.BytecodeReplace;
import fr.inria.diversify.transformation.bytecode.BytecodeTransformation;
import fr.inria.diversify.transformation.query.TransformationQuery;
import javassist.CtClass;
import javassist.CtMethod;
import javassist.NotFoundException;
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
public class ByteCodeTransformationQuery extends TransformationQuery {
    protected List<CtMethod> methods;
    protected String type = "replace";
    protected ICoverageReport coverageReport;

    public ByteCodeTransformationQuery(ICoverageReport coverageReport) throws NotFoundException {
        this.coverageReport = coverageReport;
        methods = DiversifyEnvironment.getJavassistMethods();
    }


    public void setType(String type) {
        this.type = type;
    }

    public BytecodeTransformation buildTransformation() throws Exception {
        String type = this.type;
        if(type == null) {
            Random r = new Random();
            int i = r.nextInt(3);
            if(i == 0)
                type = "replace";
            if(i == 1)
                type = "add";
            if(i == 2)
                type = "delete";
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

        while(coverageReport.opCodeCoverage(method,opCodeIndex) == 0x00) {
            method = randomConcreteMethod();
            opCodeIndex = randomOpCode(method);
        }
        return new BytecodeDelete(method,opCodeIndex, methods);
    }

    public BytecodeAdd add() throws Exception {
        CtMethod method = randomConcreteMethod();
        int opCodeIndex = randomOpCode(method);

        while(coverageReport.opCodeCoverage(method,opCodeIndex) == 0x00) {
            method = randomConcreteMethod();
            opCodeIndex = randomOpCode(method);
        }
        return new BytecodeAdd(method,opCodeIndex, randomOpCodeInClass(method.getDeclaringClass()), methods);
    }

    public BytecodeReplace replace() throws Exception {
        CtMethod method = randomConcreteMethod();
        int opCodeIndex = randomOpCode(method);

        while(coverageReport.opCodeCoverage(method,opCodeIndex) == 0x00) {
            method = randomConcreteMethod();
            opCodeIndex = randomOpCode(method);
        }
        return new BytecodeReplace(method,opCodeIndex, randomOpCodeInClass(method.getDeclaringClass()), methods);
    }


    protected CtMethod randomConcreteMethod() {
        Random r = new Random();
        CtMethod mth = methods.get(r.nextInt(methods.size()));
        while (mth.getDeclaringClass().isFrozen())
            mth = methods.get(r.nextInt(methods.size()));
        return mth;
    }

    protected int randomOpCode(CtMethod method) throws BadBytecode {
        MethodInfo minfo = method.getMethodInfo();

        CodeAttribute ca = minfo.getCodeAttribute();
        List<Integer> opCodeIndexList = opCodeIndexList(ca);
        Random r = new Random();

        return r.nextInt(opCodeIndexList.size());
    }

    protected byte[] randomOpCodeInClass(CtClass cl) throws BadBytecode {
        Random r = new Random();
        CtMethod[] methods = cl.getDeclaredMethods();
        CtMethod method = methods[r.nextInt(methods.length)];
        while (method.isEmpty())
            method = methods[r.nextInt(methods.length)];

        MethodInfo minfo = method.getMethodInfo();
        CodeAttribute ca = minfo.getCodeAttribute();
        List<Integer> opCodeIndexList = opCodeIndexList(ca);
        int opCodeIndex = r.nextInt(opCodeIndexList.size());

        return byteCodeAt(ca,opCodeIndexList,opCodeIndex);
    }

    protected byte[] byteCodeAt(CodeAttribute ca, List<Integer> opCodeIndexList, int index) {
        int borne;
        int byteCodeIndex = opCodeIndexList.get(index);
        if(index + 1 == opCodeIndexList.size())
            borne = ca.getCodeLength();
        else
            borne = opCodeIndexList.get(index+1);
        CodeIterator iter = ca.iterator();
        byte[] bytecode = new  byte[borne - byteCodeIndex];
        for(int i = 0; i < borne - byteCodeIndex; i++) {
            bytecode[i] = (byte) iter.byteAt(i);
        }
        return bytecode;
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