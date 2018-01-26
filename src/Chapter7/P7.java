package Chapter7;

import java.util.*;

/**
 * Program finds average of an array
 *
 * @author Grace Hopper
 *
 */
public class P7 {

    /**
     * Main Method sends the array entered to method Method1
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        // the main method asks for the user to define an array length and passes this array to void method Method1
        Scanner input = new Scanner(System.in);

        System.out.print("How many numbers will be read >> ");
        int x = input.nextInt();
        int[] array = new int[x];
        Method1(array);

    }

    /**
     * Method1 counts elements in an array and sends it to Method2
     *
     * @param array the array of numbers defined by the user
     */
    public static void Method1(int[] array) {
        // this method aske for the user to define a list and uses a for loop to fill the array as defined in the main method
        Scanner input = new Scanner(System.in);
        System.out.print("Enter " + array.length + " elements >> ");
        for (int i = 0; i < array.length; i++) {
            int y = input.nextInt();
            array[i] = y;
        }
        Method2(array);
    }

    /**
     * Method2 finds the average and sends it to Method3
     *
     * @param array the array of numbers defined by the user
     * @return returns n, the average
     */
    public static double Method2(int[] array) {
        double n = 0;
        for (int i = 1; i < array.length; i++) {
            n = array[i] + n;
        }

        n = Math.ceil(n / array.length);
        System.out.println("The average is " + n);

        Method3(array);
        return n;
    }

    /**
     * Method3 prints the array.
     *
     * @param array the array of numbers defined by the user
     */
    public static void Method3(int[] array) {
        System.out.print("The array's contents are >> [");
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i] + " ");
        }
        System.out.println("]");
    }
}
