// This program will allow a user to enter 20 numbers
// Then, it will display them in reverse order

import javax.swing.JOptionPane;
public class arrayPractice {
    public static void main(String[] args){

        // Declarations
        int[] numbers = new int[20];
        int QUIT = 999;

        // User inputs up to 20 numbers or quits when 999 is entered
        for( int i = 0; i < numbers.length; i++ ) {
                int input = Integer.parseInt(JOptionPane.showInputDialog("Enter a number or enter 999 to quit: "));
        }

        // Print all the values of numbers[] in reverse order
        for( int i = numbers.length; i >= 0; i-- ){
            System.out.println(i);
        }


    } // end of main() method
} // end of arrayPractice class
