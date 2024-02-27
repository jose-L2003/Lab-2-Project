// This program will output every number from 1-15. Upon reaching 15, it will multiply the number by 10, then by 100.
public class Main {
    public static void main(String[] args) {
        // Declarations
        int a = 1;
        int MAXCOUNT = 15;

        // While loop 1-15
        while(a <= MAXCOUNT) {
            System.out.println(a);
            a++;
            if( a == 16) {
                a = a - 1;
                break;
            }
        }
        // First value
        System.out.println("The value is " + a);

        // a times 10
        System.out.println( a + " multiplied by 10 is equal to ");
        a = a * 10;
        System.out.println(a);

        // a times 100
        System.out.println( a + " multiplied by 100 is equal to ");
        a = a * 100;
        System.out.println(a);




    }
}
