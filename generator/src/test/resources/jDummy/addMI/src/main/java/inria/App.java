package inria;



/**
 * Hello world!
 *
 */
public class App 
{
    public static int three = 3;
    public int five = 5;

    public static void main( String[] args ) {
        Runtime.getRuntime().traceMethodCalls(true);
        System.out.println("0: ");
        A a = new A((byte) 0, (short) 0, (int) 0, (long) 0, (float) 0.0, (double) 0.0, '0', false);
        B b = new B(a);
        A ab = b.ba(a);
        ab.print();
        System.out.println("1: " + loops());
        System.out.println("2: " + conditions(15));
        System.out.println("3: " + three);
        branch(6);
    }

    public static int loops(){
        int s = 0;
        for(int i = 0 ; 5 >= i; i = i + 1) {
            s += i;
        }

        int[] array = {1,2,3,4,5};
        for(int i : array) {
            s += i;
        }

        int i = 0;
        while(i < 5) {
            s += i;
            i++;
        }

        i = 0;
        do {
            s += i;
            i++;
        } while (i < 5);
        return s;
    }

    public static int conditions(int i) {
        int r;
        if((i % 3) == 0) {
            r = 100;
        } else {
            r = 200;
        }
        if((i % 3) == 0) {
            r += 10;
        } else if ((i % 3) == 0) {
            r += 20;
        } else {
            r += 30;
        }
        switch(i % 3) {
            case 0:
                r += 1;
                break;
            case 1:
                r += 2;
                break;
            default:
                r += 3;
        }
        return r;
    }

    public static void branch(int i) {
        int a = 0;
        if(i > 0) {
            int b = 0;
            System.out.print(b);
            if(i>10) {
                int c = 0;
                System.out.print(c);
            } else {
                int d=0,e=0;
                System.out.print(d+e);
                int f=0,g=0;
                System.out.print(f+g);
            }
        }
        System.out.print(a);
    }
}
