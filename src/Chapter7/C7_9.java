package Chapter7;

import java.util.*;

/**
 * Program explores usability of arrays by allowing a user to enter ten numbers,
 * and then displays the minimum value of it.
 *
 * @author Grace Hopper
 */
public class C7_9 {

    /**
     * main method prompts the user to enter an array of numbers, and then
     * directs the array to method min
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // prompts the user to fill the array with ten values 
        double[] array = new double[10];

        System.out.print("Enter 10 numbers >> ");

        for (int i = 0; i < array.length; i++) {

            array[i] = input.nextDouble();

        }

        // calls and prints the min value 
        System.out.print("The minimum value is ");

        System.out.println(min(array));

    }

    /**
     * min uses a for loop to find the minimum value of the array entered.
     *
     * @param array signifies the list of numbers entered by the user
     * @return returns the minimum value of the list.
     */
    public static double min(double[] array) {

        double min = array[0];

        for (int i = 1; i < array.length; i++) {

            if (array[i] < min) {

                min = array[i];

            }

        }

        return min;

    }
}
