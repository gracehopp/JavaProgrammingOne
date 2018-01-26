package Chapter8;

import java.util.*;

/**
 * Program allows for the user to enter "Salesman data" and stores it according
 * to salesman ID and day on which the sales occured
 *
 * @author Grace Hopper
 */
public class P8 {

    /**
     * main method controls all the code
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        // variables defined
        Scanner input = new Scanner(System.in);
        char[] salesmen = {'A', 'B', 'C', 'D'};
        char[] week = {'M', 'T', 'W', 'H', 'F'};
        double[][] sales = new double[salesmen.length][week.length];
        double amt = 0;
        int n = 0;
        int l = 0;
        String x = "g";
        String day;
        String YoN = "y";
        boolean tof = false;

        // While loop runs until the user specifies that they have no more data to record
        while (YoN.toLowerCase().charAt(0) != 'n') {

            // Prompts user to enter a salesman ID, Day, and sales amt
            while (tof == false) {
                System.out.print("Computer prompt: Enter the salesman ID as A,B,C, or D." + ""
                        + "\n\tUser reply: ");
                x = input.next();
                if ((x.toLowerCase().charAt(0) != 'a') && (x.toLowerCase().charAt(0) != 'b') && (x.toLowerCase().charAt(0) != 'c') && (x.toLowerCase().charAt(0) != 'd')) {
                    tof = false;
                } else {
                    tof = true;
                }

                if (x.toLowerCase().charAt(0) == 'a') {
                    n = 0;
                } else if (x.toLowerCase().charAt(0) == 'b') {
                    n = 1;
                } else if (x.toLowerCase().charAt(0) == 'c') {
                    n = 2;
                } else if (x.toLowerCase().charAt(0) == 'd') {
                    n = 3;
                } else {
                    n = 0;
                }
            }

            tof = false;

            while (tof == false) {
                System.out.print("Computer prompt: Enter the day as M, T, W, H, or F." + ""
                        + "\n\tUser reply: ");
                day = input.next();
                if ((day.toLowerCase().charAt(0) != 'm') && (day.toLowerCase().charAt(0) != 't') && (day.toLowerCase().charAt(0) != 'w') && (day.toLowerCase().charAt(0) != 'h') && (day.toLowerCase().charAt(0) != 'f')) {
                    tof = false;
                } else {
                    tof = true;
                }
                if (day.toLowerCase().charAt(0) == 'm') {
                    l = 0;
                } else if (day.toLowerCase().charAt(0) == 't') {
                    l = 1;
                } else if (day.toLowerCase().charAt(0) == 'w') {
                    l = 2;
                } else if (day.toLowerCase().charAt(0) == 'h') {
                    l = 3;
                } else if (day.toLowerCase().charAt(0) == 'f') {
                    l = 4;
                }
            }
            tof = false;

            System.out.print("Computer prompt: Enter the amount of the sale." + ""
                    + "\n\tUser reply: ");
            amt = input.nextDouble();

            sales[n][l] = sales[n][l] + amt;
            tof = false;
            while (tof == false) {
                System.out.print("Computer prompt: More data? Enter Y for more or N to stop." + ""
                        + "\n\tUser reply: ");
                YoN = input.next();

                if (!(YoN.toLowerCase().charAt(0) == 'y') && !(YoN.toLowerCase().charAt(0) == 'n')) {
                    tof = false;
                } else {
                    tof = true;
                }
            }
        }

        String[] id = {"A", "B", "C", "D"};

        // Prints the recorded data
        System.out.print("\t\t M\t\t T\t\t W\t\t H\t\t F\n");
        for (int i = 0; i < sales.length; i++) {
            System.out.print("Salesman " + id[i] + ":\t");
            for (int j = 0; j < sales[i].length; j++) {
                System.out.printf("$%.2f \t\t", sales[i][j]);
            }
            System.out.print("\n");
        }
    }
}
