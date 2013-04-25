package fr.inria.diversify.test;

/**
 * User: Simon
 * Date: 4/25/13
 * Time: 9:32 AM
 */
public class A1 {
    public A2 a2;

    public void foo1(A3 a){
        A3 a3 = new A3(a2);
        a3.baz();
    }
    public void foo2(A2 a2, A1 a1){
        for (int i = 0; i < 10; i++) {
               a2.bar(a1);
        }
        A3 a3 = a1.a2.bar2();
        a3 = a3.baz2();
        A2 a22 = a2;
    }

}
