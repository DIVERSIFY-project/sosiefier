package fr.inria.diversify.test;

/**
 * User: Simon
 * Date: 4/25/13
 * Time: 9:32 AM
 */
public class A1 {
    public A2 field1;
    public A2 field2;

    public void foo1(A3 a){
//        A3 a4 = new A3(field2);
//        a4.baz();
//        A2 aa = new A2();
//        field2 = new A2();
    }
    public void foo2(A2 a22, A1[] a1){
//        for (int i = 0; i < 10; i++) {
//             field2.bar(a1);
//        }
//        A3 a3 = a1.field1.bar2();
//        field2 = a3.baz2();
//        a1.field1 = a22;
//        a22 = field2;
        if(a1.length == 4)
            System.out.print("f00");
        if( field1 != null)
            System.out.print("f0xf0");
    }

}