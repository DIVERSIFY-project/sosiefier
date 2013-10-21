package example;

import java.lang.String;

public class A {

    public static void main(String[] args) {
        (new A()).foo();
    }

    public void foo() {
        for (int i = 1; i < 5 ;i++ )
            bar(i);
        for (int i = 1; i < 5 ;i++ )
            (new B()).mth(i);
    }

    public void bar(int i) {
        if(i%2 == 0) {
            (new C()).mth(i);
        }
        else
            (new B()).mth(i);
    }
}