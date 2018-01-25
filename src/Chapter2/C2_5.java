package Chapter2;

import java.util.Scanner;

/**
 * Program to calculate a problem entered by a user
 *
 * @author Grace Hopper
 */
public class C2_5 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double subtotal, gratuity, total;

        System.out.print("Enter your subtotal and gratuity rate >> ");

        subtotal = input.nextDouble();

        gratuity = input.nextDouble();

        gratuity = gratuity / 100.0;

        total = (subtotal * gratuity) + subtotal;

        gratuity = gratuity * 10;

        System.out.println("The gratuity is $" + gratuity + " and the total is $" + total);
    }
}
