package week7homework;
/*
16. Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
“ZERO”
 */

import java.util.Scanner;

public class PositiveNegative16 {
    static void input() {
        int num;
        //object of scanner class
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        num = sc.nextInt();
        //using statement
        if (num > 0) {
            System.out.println("The number is Positive.");
        } else if (num < 0) {
            System.out.println("The number is Negative.");
        } else {
            System.out.println("The number is Zero");
        }

    }

    public static void main(String[] args) {

        PositiveNegative16.input();//called static through class in main method

    }
}
