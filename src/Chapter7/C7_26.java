package Chapter7;

import java.util.*;

/**
 * program explores the usability of arrays
 *
 * @author Grace Hopper
 */
public class C7_26 {

    /**
     * main method controls the output of the code, the input of the two arrays,
     * and sends them to method equals
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

        // define variables 
        Scanner input = new Scanner(System.in);

        System.out.print("How many variables long is the first list? ");

        int n = input.nextInt();

        int[] list1 = new int[n];

        System.out.print("How many variables long is the second list? ");

        n = input.nextInt();

        int[] list2 = new int[n];

        // ask user to fill the two arrays to see if they are equal 
        System.out.print("Enter list one >> ");

        for (int i = 0; i < list1.length; i++) {

            list1[i] = input.nextInt();

        }

        System.out.print("Enter list two >> ");

        for (int i = 0; i < list2.length; i++) {

            list2[i] = input.nextInt();

        }

        // call the equality testing method and output whether or not the two lists are strictly identical or not. 
        if (equals(list1, list2) == true) {
            System.out.println("The two lists are strictly identical");
        } else {
            System.out.println("The two lists are not strictly identical");
        }

    }

    /**
     * equals checks to see if the arrays are the same
     *
     * @param list1 denotes the first list entered
     * @param list2 denotes the second list entered
     * @return boolean returns whether they are equal
     */
    public static boolean equals(int[] list1, int[] list2) {

        boolean bool = false;

        if (Arrays.equals(list1, list2)) {
            bool = true;
        } else {
            bool = false;
        }

        return bool;

    }
}
