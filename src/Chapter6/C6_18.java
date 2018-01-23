package Chapter6;

import java.util.*;

/**
 * Program to check the security of a user password.
 *
 * @author Grace Hopper
 */
public class C6_18 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Prompt user to enter a password 
        String x;

        int l = 0;

        int count = 0;

        char n;

        boolean condition = true;

        System.out.print("Enter your password: ");

        x = input.nextLine();

        l = x.length() - 1;

        n = x.charAt(l);

// pass the password to new method for testing 
        test(x);

    }

    /**
     * test checks the password for any difference in the conditions
     *
     * @param x the string (password) entered by user
     * @return the string which signifies whether or not the user's password was
     * correct, or which condition they might have broken
     */
    public static String test(String x) {

        // This method tests the password and outputs valid or invalid 
        // Define variables 
        int l = x.length() - 1,
                count = 0;

        char n = x.charAt(l);

        boolean valid = false,
                condition = false;

        String c1 = "",
                s1 = "";

        // Start testing conditions 
        if ((l + 1) < 8) {

            condition = false;

            System.out.println("Invalid Password");

            System.out.println("A password must have at least eight characters");

            System.exit(0);

        }

// the following algorithm transfers the password to an array to check for any non alphanumeric characters 
        char[] charArray = x.toCharArray();

        for (char c : charArray) {

            if (!Character.isLetterOrDigit(c)) {

                condition = false;

                System.out.println("Invalid Password");

                System.out.println("A password must contain only letters and digits");

                System.exit(0);

            }

        }

        for (int i = 0, len = x.length(); i < len; i++) {

            if (Character.isDigit(x.charAt(i))) {

                count++;

            }

        }

        if (count < 2) {

            condition = false;

            System.out.println("Invalid Password");

            System.out.println("A password must contain at least two digits");

            System.exit(0);

        } // The code will have already terminated if any of the conditions were false. At this point, the all options are ruled out, and the password is valid. 
        else {
            System.out.println("Valid Password");
        }

        return s1;

    }

}
