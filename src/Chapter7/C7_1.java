package Chapter7;

import java.util.*;

/**
 * program compiles and sorts students and finds their scores
 *
 * @author Grace Hopper
 */
public class C7_1 {

    /**
     * main method controls all the code needed for the program to execute
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String grade = "";

        int studentNum = 0;

        int best = 0;

        int x = 0;

// Prompt user for input 
        System.out.print("How many students? ");

        studentNum = input.nextInt();

        int score[] = new int[studentNum];

        System.out.print("Enter " + studentNum + " scores >> ");

// for loop adds each entry to the array 
        for (int i = 0; i < score.length; i++) {

            score[i] = input.nextInt();

        }

// for loop finds best score 
        for (int i = 0; i < score.length; i++) {

            if (i > 0) {
                x = score[i - 1];
            } else {
                x = score[i];
            }

            if (score[i] > x) {
                best = score[i];
            } else {
                continue;
            }

        }

// for loop assigns grades based on high score 
        for (int i = 0; i < score.length; i++) {

            if (score[i] >= (best - 10)) {
                grade = "A";
            } else if (score[i] >= (best - 20)) {
                grade = "B";
            } else if (score[i] >= (best - 30)) {
                grade = "C";
            } else if (score[i] >= (best - 40)) {
                grade = "D";
            } else {
                grade = "F";
            }

            System.out.println("Student " + i + " score is " + score[i] + " and grade is " + grade);

        }

    }
}
