package inria;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        System.out.println("0: " + loopZero());
        System.out.println("1: " + loopOne());
        System.out.println("2: " + loopTwo());
        System.out.println("3: " + loopThree());
        System.out.println("4: " + loopFour());
        System.out.println("5: " + loopFive());
        System.out.println("6: " + loopSix());
        System.out.println("7: " + loopSeven());
        System.out.println("8: " + loopEight());
        System.out.println("9: " + loopNine());
        System.out.println("10: " + loopTen());
        System.out.println("11: " + loopEleven());
    }

    public static int loopZero(){
        int s = 0;
        for(int i = 0 ; 5 >= i; i = i + 1) {
            s += i;
        }
        return s; //15
    }

    public static int loopOne(){
        int s = 0;
        for(int i = 0 ; i <= 5; i++) {
            s += i;
        }
        return s; //15
    }

    public static int loopTwo(){
        int s = 0;
        for(int i = 5 ; i >= 0; i--) {
            s += i;
        }
        return s; //15
    }

    public static int loopThree(){
        int s = 0;
        for(int i = 0 ; i < 6; i++) {
            s += i;
        }
        return s; //15
    }

    public static int loopFour(){
        int s = 0;
        for(int i = 6 ; i > 1; i--) {
            s += i;
        }
        return s-5; //15
    }

    public static int loopFive(){
        int s = 0;
        for(int i = 0 ; i <= 10; i += 2) {
            s += i/2;
        }
        return s; //15
    }

    public static int loopSix(){
        int s = 0;
        for(int i = 10 ; i >= 0; i -= 2) {
            s += i/2;
        }
        return s; //15
    }

    public static int loopSeven(){
        int s = 0;
        for(int i = 0 ; i < 12; i += 2) {
            s += i/2;
        }
        return s; //15
    }

    public static int loopEight(){
        int s = 0;
        for(int i = 12 ; i > 1; i -= 2) {
            s += i/2;
        }
        return s-6; //15
    }

    public static int loopNine(){
        int s = 0;
        for(int i = 0 ; i < 11; i += 2) {
            s += i/2;
        }
        return s; //15
    }

    public static int loopTen(){
        int s = 0;
        int[] array = {1,2,3,4,5};
        for(int i : array) {
            s += i;
        }
        return s;
    }

    public static int loopEleven() {
        int s = 0;
        int[] array = {1,2,3,4,5};
        for(int i : array) {
            s += i;
        }
        return s;
    }
}
