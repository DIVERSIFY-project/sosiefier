package fr.inria.diversify.transformation;

import fr.inria.diversify.runner.InputProgram;
import fr.inria.diversify.transformation.exception.RestoreTransformationException;
import fr.inria.diversify.util.Log;
import spoon.compiler.Environment;
import spoon.reflect.cu.SourcePosition;
import spoon.reflect.declaration.*;
import spoon.reflect.factory.Factory;
import spoon.reflect.reference.CtTypeReference;
import spoon.reflect.visitor.DefaultJavaPrettyPrinter;
import spoon.support.JavaOutputProcessor;

import java.io.File;
import java.io.IOException;
import java.util.*;

/**
 * Created by nharrand on 21/06/17.
 */
public class RandomProtocol extends Transformation {

    Factory f;
    CtPackage fsm;
    CtTypeReference serverContext;
    CtTypeReference clientContext;
    CtTypeReference serverState;
    CtTypeReference clientState;
    List<Integer> partition;
    CtClass serverInit;
    CtClass clientInit;
    CtClass serverInitSave;
    CtClass clientInitSave;
    CtTypeReference requestType;
    CtTypeReference responseType;
    List<byte[]> keys;


    public RandomProtocol(Factory f, int partitionID, int n, List<byte[]> keys) {
        this.f = f;
        this.keys = keys;
        partition = composition(partitionID, n-1);
        init();
        serverInitSave = f.Core().clone(serverInit);
        clientInitSave = f.Core().clone(clientInit);
    }

    public void init() {
        fsm = f.Package().get("fr.inria.singleusagedemo.fsm");
        serverContext = f.Type().createReference(f.Type().get("fr.inria.singleusagedemo.fsm.ContextServer"));
        clientContext = f.Type().createReference(f.Type().get("fr.inria.singleusagedemo.fsm.ContextClient"));
        serverState = f.Type().createReference(f.Type().get("fr.inria.singleusagedemo.fsm.ServerState"));
        clientState = f.Type().createReference(f.Type().get("fr.inria.singleusagedemo.fsm.ClientState"));
        serverInit = f.Class().get("fr.inria.singleusagedemo.server.InitState");
        clientInit = f.Class().get("fr.inria.singleusagedemo.client.InitState");
        for(Object met : serverInit.getMethods()) {
            CtMethod m = (CtMethod) met;
            if(m.getSimpleName().equalsIgnoreCase("handle")) {
                requestType = ((CtParameter) m.getParameters().get(0)).getType();
                responseType = ((CtParameter) m.getParameters().get(1)).getType();
            }
        }
        //((CtParameterImpl)((java.util.ArrayList)((CtMethodImpl)((java.util.ArrayList)((CtClassImpl)f.Class().get("fr.inria.singleusagedemo.server.InitState")).typeMembers).get(2)).parameters).get(0)).type
    }

    public static List<Integer> composition(int i, int n) {
        List<Integer> res = new LinkedList<>();
        int cur = 1;
        while (n > 0) {
            if(i % 2 == 1) {
                cur++;
            } else {
                res.add(cur);
                cur = 1;
            }
            i = i >> 1;
            n--;
        }
        res.add(cur);
        return res;
    }

    public void transformServerInit() {
        CtMethod handle = null;
        for(Object met: serverInit.getMethods()) {
            CtMethod m = (CtMethod) met;
            if(m.getSimpleName().equalsIgnoreCase("handle")) handle = m;
        }
        String handleBody = "fr.inria.singleusagedemo.server.InitState.logger.info(\"hash={}, length={}\", new java.lang.String(req.bodyAsBytes()), req.bodyAsBytes().length);\n" +
                "        java.lang.String seed = req.headers(\"seed\");\n" +
                "        java.lang.String src = req.headers(\"personName\");\n" +
                "        int seed1 = java.lang.Integer.parseInt(seed);\n" +
                "        ctx.curState = new S0(seed1, src, ctx, this);" +
                "        return \"Ah?\"";
        handle.setBody(f.createCodeSnippetStatement(handleBody));
    }

    public void transformClientInit() {
        CtMethod handle = null;
        for(Object met: clientInit.getMethods()) {
            CtMethod m = (CtMethod) met;
            if(m.getSimpleName().equalsIgnoreCase("handle")) handle = m;
        }
        String handleBody = "java.util.Map<java.lang.String, java.lang.String> headers = new java.util.HashMap<>();\n" +
                "        headers.put(\"seed\", (\"\" + (seed)));\n" +
                "        headers.put(\"personName\", src);\n" +
                "        result = fr.inria.singleusagedemo.client.Client.message(headers, new byte[0]);\n" +
                "        this.isFinal = false;\n" +
                "        ctx.curState = new S0(ctx)";
        handle.setBody(f.createCodeSnippetStatement(handleBody));
    }

    CtClass xorHelper;

    public CtClass createXorHelper(CtPackage p) {
        String template="byte[] res = new byte[bytes.length];\n" +
                        "    for(int i = 0; i < bytes.length; i++) {\n" +
                        "        res[i] = (byte) (bytes[i] ^ key[i % key.length]);\n" +
                        "    }\n" +
                        "    return res\n";
        CtClass xorHelper = f.Class().create(p,"XorHelper");
        xorHelper.addModifier(ModifierKind.PUBLIC);
        List<CtParameter<?>> params = new LinkedList<>();
        params.add(f.Method().createParameter(null,f.Type().createArrayReference(f.Type().bytePrimitiveType()),"bytes"));
        params.add(f.Method().createParameter(null,f.Type().createArrayReference(f.Type().bytePrimitiveType()),"key"));
        CtMethod xor = f.Method().create(xorHelper,null,f.Type().createArrayReference(f.Type().bytePrimitiveType()),"xor",params,null);
        xor.addModifier(ModifierKind.PUBLIC);
        xor.addModifier(ModifierKind.STATIC);
        xor.setBody(f.createCodeSnippetStatement(template));
        xorHelper.addMethod(xor);
        p.addType(xorHelper);
        return xorHelper;
    }

    public CtClass createServerState(
            CtClass mother,
            int i,
            int rangeFrom,
            int rangeTo,
            String key,
            boolean isLast) {

        CtClass state = f.Class().create(mother,"S" + i);
        state.addModifier(ModifierKind.PUBLIC);
        state.setSuperclass(serverState);
        Set<ModifierKind> modField = new HashSet<>();
        modField.add(ModifierKind.PUBLIC);
        state.addField(f.Field().create(null,modField,f.Type().integerPrimitiveType(),"seed"));
        state.addField(f.Field().create(null,modField,f.Type().stringType(),"src"));
        state.addField(f.Field().create(null,modField,serverContext,"ctx"));
        state.addField(f.Field().create(null,modField,serverInit.getReference(),"init"));

        //Constructor
        List<CtParameter<?>> consParams = new LinkedList<>();
        consParams.add(f.Method().createParameter(null,f.Type().integerPrimitiveType(),"seed"));
        consParams.add(f.Method().createParameter(null,f.Type().stringType(),"src"));
        consParams.add(f.Method().createParameter(null,serverContext,"ctx"));
        consParams.add(f.Method().createParameter(null,mother.getReference(),"init"));
        Set<ModifierKind> consMod = new HashSet<>();
        consMod.add(ModifierKind.PUBLIC);
        CtConstructor cons = f.Constructor().create(state,consMod,consParams,null);
        String consBody = "this.seed = seed;\n" +
                "            this.src = src;\n" +
                "            this.ctx = ctx;\n" +
                "            this.init = init";
        cons.setBody(f.createCodeSnippetStatement(consBody));
        state.addConstructor(cons);

        //Handle
        List<CtParameter<?>> handleParams = new LinkedList<>();
        handleParams.add(f.Method().createParameter(null,requestType,"req"));
        handleParams.add(f.Method().createParameter(null,responseType,"resp"));
        Set<ModifierKind> handleMod = new HashSet<>();
        handleMod.add(ModifierKind.PUBLIC);
        CtMethod handle = f.Method().create(state,handleMod,f.Type().stringType(),"handle",handleParams,null);

        //seed, src, ctx, init)

        String handleBody = "fr.inria.singleusagedemo.server.InitState.logger.info(\"State " + i + "\");\n" +
                "System.arraycopy(fr.inria.singleusagedemo.fsm.XorHelper.xor(req.bodyAsBytes(), " + key + "),0,init.b," + rangeFrom + "," + (rangeTo - rangeFrom) + ");";
        if(!isLast) handleBody += "\nctx.curState = new S" + (i + 1) + "(seed, src, ctx, init);\n" +
                "           return \"Ah?\"";
        else handleBody += "\nctx.curState = init;\n" +
                "           ctx.server.computeBio(seed, src);\n" +
                "           byte[] b2 = ctx.server.results.get(src).get(seed);\n" +
                "           if(b2 == null) {\n" +
                "                resp.body(\"0%\");\n" +
                "                return \"0%\";\n" +
                "            } else if (java.util.Arrays.equals(b, b2)){\n" +
                "                resp.body(\"100%\");\n" +
                "                return \"100%\";\n" +
                "            }\n" +
                "            resp.body(\"0%\");\n" +
                "            return \"0%\"";

        handle.setBody(f.createCodeSnippetStatement(handleBody));
        state.addMethod(handle);
        mother.addNestedType(state);



        return state;

    }

    public CtClass createClientState(
            CtClass mother,
            int i,
            int rangeFrom,
            int rangeTo,
            String key,
            boolean isLast) {

        CtClass state = f.Class().create(mother,"S" + i);
        state.addModifier(ModifierKind.PUBLIC);
        state.setSuperclass(clientState);

        //Constructor
        List<CtParameter<?>> consParams = new LinkedList<>();
        consParams.add(f.Method().createParameter(null,clientContext,"ctx"));
        Set<ModifierKind> consMod = new HashSet<>();
        consMod.add(ModifierKind.PUBLIC);
        CtConstructor cons = f.Constructor().create(state,consMod,consParams,null);
        String consBody = "this.ctx = ctx;\n";
        if(isLast) consBody += "this.isFinal = true";
        else consBody += "this.isFinal = false";
        cons.setBody(f.createCodeSnippetStatement(consBody));
        state.addConstructor(cons);

        //Handle
        List<CtParameter<?>> handleParams = new LinkedList<>();
        handleParams.add(f.Method().createParameter(null,f.Type().createArrayReference(f.Type().bytePrimitiveType()),"b"));
        Set<ModifierKind> handleMod = new HashSet<>();
        handleMod.add(ModifierKind.PUBLIC);
        CtMethod handle = f.Method().create(state,handleMod,f.Type().voidPrimitiveType(),"handle",handleParams,null);
        //CtAnnotation<?> a = f.Type().f.Annotation().create("Override");
        //handle.addAnnotation(a);

        String handleBody = "result = fr.inria.singleusagedemo.client.Client.message(new java.util.HashMap<>(), " +
                "fr.inria.singleusagedemo.fsm.XorHelper.xor(java.util.Arrays.copyOfRange(b, " + rangeFrom + ", " + rangeTo + "), " + key + "));";
        if(!isLast) handleBody += "\nctx.curState = new S" + (i + 1) + "(ctx)";

        handle.setBody(f.createCodeSnippetStatement(handleBody));
        state.addMethod(handle);
        mother.addNestedType(state);



        return state;
    }


    @Override
    public String getTransformationString() throws Exception {
        return null;
    }

    @Override
    public void apply(String srcDir) throws Exception {

        xorHelper = createXorHelper(fsm);
        int from = 0;
        int to = 0;
        for(int i = 0; i < partition.size(); i++) {
            to += partition.get(i);
            boolean isLast = i == partition.size()-1;
            String key = "new byte[]{";
            for(int j = 0; j <  keys.get(i).length; j ++) {
                if (j > 0) key += ",";
                key += keys.get(i)[j];
            }
            key += "}";
            createClientState(clientInit,i,from,to,key,isLast);
            createServerState(serverInit,i,from,to,key,isLast);
            from += partition.get(i);
        }
        transformClientInit();
        transformServerInit();
        printJavaFile(srcDir);

    }

    @Override
    public void applyWithParent(String srcDir) throws Exception {

    }


    @Override
    public void restore(String srcDir) throws RestoreTransformationException {
        throw new RestoreTransformationException("Irreversible transformation", null);
    }

    @Override
    public List<SourcePosition> getPositions() {
        return null;
    }

    public void printJavaFile(String directory) throws IOException {
        Environment env = f.getEnvironment();

        JavaOutputProcessor processor = new JavaOutputProcessor(new File(directory), new DefaultJavaPrettyPrinter(env));
        processor.setFactory(f);
        processor.createJavaFile(serverInit);
        Log.debug("write type {} in directory {}", serverInit.getQualifiedName(), directory);

        processor = new JavaOutputProcessor(new File(directory), new DefaultJavaPrettyPrinter(env));
        processor.setFactory(f);
        processor.createJavaFile(clientInit);
        Log.debug("write type {} in directory {}", clientInit.getQualifiedName(), directory);

        processor = new JavaOutputProcessor(new File(directory), new DefaultJavaPrettyPrinter(env));
        processor.setFactory(f);
        processor.createJavaFile(xorHelper);
        Log.debug("write type {} in directory {}", xorHelper.getQualifiedName(), directory);
    }
}
