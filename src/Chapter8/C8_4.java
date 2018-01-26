package Chapter8;

import java.util.*;

/**
 * Program explores the usability of mutlidimensional arrays
 *
 * @author Grace Hopper
 */
public class C8_4 {

    /**
     * main method controls all the necessary code for the program
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

        int[][] hours = new int[8][2];

        int[][] array = {{2, 4, 3, 4, 5, 8, 8},
        {7, 3, 4, 3, 3, 4, 4},
        {3, 3, 4, 3, 3, 2, 2},
        {9, 3, 4, 7, 3, 4, 1},
        {3, 5, 4, 3, 6, 3, 8},
        {3, 4, 4, 6, 3, 4, 4},
        {3, 7, 4, 8, 3, 8, 4},
        {6, 3, 5, 9, 2, 7, 9}};

        int x = 0;

        int[] total = new int[array.length];

        int[] total2 = new int[array.length];

        System.out.println("\t\tSu\tM\tT\tW\tTh\tF\tSa\tTotal");

        for (int i = 0; i < array.length; i++) {

            System.out.print("Employee " + i);

            for (int j = 0; j < array[i].length; j++) {

                System.out.print("\t" + array[i][j]);

                total[i] += array[i][j]; //getting the total for each row 

            }

            System.out.println("\t" + total[i]);

        }

        System.out.println("\n\n----------------------------------------------------------------\n\n");

        System.arraycopy(total, 0, total2, 0, total.length);

        java.util.Arrays.sort(total2);

        for (int i = total2.length - 1; i > -1; i--) {

            for (int j = 0; j < total2.length; j++) {

                if (total[j] == total2[i]) {

                    System.out.println("Employee " + j + ": " + total2[i]);

                    total[j] = -1;

                }

            }

        }

    }
}
