package fr.inria.diversify.jit;

/**
 * User: Simon
 * Date: 28/05/15
 * Time: 17:28
 */
public class JitParsor {
//    -XX:+UnlockDiagnosticVMOptions -XX:CompileCommand=print,*MyClass.myMethod
    protected String instruction = "0x(\\d|[abcdef])+:\\s+(\\w+)(\\s+)(.*)";
}
