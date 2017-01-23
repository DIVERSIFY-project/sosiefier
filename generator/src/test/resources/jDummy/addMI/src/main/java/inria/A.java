package inria;



/**
 * Hello world!
 *
 */
public class A
{
    public byte b;
    public short s;
    public int i;
    public long l;
    public float f;
    public double d;
    public char c;
    public boolean bo;

    public A(byte b, short s, int i, long l, float f, double d, char c, boolean bo) {
        this.b = b;
        this.s = s;
        this.i = i;
        this.l = l;
        this.f  = f;
        this.d = d;
        this.c = c;
        this.bo = bo;
    }

    public static void printHello() {
        System.out.println("Hello");
    }

    public static A clone(A a) {
        A res = new A(a.b,a.s,a.i,a.l,a.f,a.d,a.c,a.bo);
        return res;
    }

    public int getI() {
        return i;
    }

    public int addI(int a) {
        return  a + i;
    }

    public void print() {
        System.out.println("A: " + this.toString());
    }

    public void addA(A a) {
        this.b = a.b;
        this.s = a.s;
        this.i = a.i;
        this.l = a.l;
        this.f = a.f;
        this.d = a.d;
        this.c = a.c;
        this.bo = a.bo;
    }

    public void addB(B b) {
        this.i += b.getI();
    }
}