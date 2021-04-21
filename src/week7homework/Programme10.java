package week7homework;
/*
10.Write a java program to input any two number and ask user to enter their symbol (+, -,
/, *) find addition, Subtraction, multiplication and division according to their symbol
(using if else)
 */

import netscape.javascript.JSUtil;

import java.util.Scanner;

public class Programme10 {

    void calculation() {

        int a, b, result;//variable declare
        char ch;
        Scanner input = new Scanner(System.in);//called scanner class
        System.out.println("Enter a First number");
        a = input.nextInt();
        System.out.println("Enter a Second number");
        b = input.nextInt();
        System.out.println("Enter a operator(+,-,*,/): ");
        ch = input.next().charAt(0);

        if (ch == '+') {
            result = a + b;
            System.out.println("Result= " + result);
        } else if (ch == '-') {
            result = a - b;
            System.out.println("Result= " + result);
        } else if (ch == '*'){
            result = a * b;
            System.out.println("Result= " + result);
      } else if (ch == '/'){
            result = a / b;
            System.out.println("result= " + result);
        }else{
            System.out.println();

        }

    }

    public static void main(String[] args) {
        Programme10 sum=new Programme10();
        sum.calculation();
    }
}

