package inria;

/**
 * Created by nharrand on 23/11/16.
 */
public class B {
    int i;
    public B(A a) {
        this.i = a.i;
    }

    public A ba(A a) {
        return new A(a.b,a.s,a.i,a.l,a.f,a.d,a.c,a.bo);
    }

    public int getI() {
        return i;
    }
}