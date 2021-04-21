package week7homework;
/*
1. Write a java program that tells us that Input number is odd or even?
HINT: use ternary operator (? :)
 */


import java.util.Scanner;

public class OddEven1 {

    static void numbers() {//static method

        Scanner result = new Scanner(System.in);//scanner import
        System.out.println("Enter a number:  ");
        int num = result.nextInt();//obj created

        String evenOdd = (num % 2 == 0) ? "even" : "odd";//ternary operator
        System.out.println(num + " is " + evenOdd);//print statement

    }
  //main method
    public static void main(String[] args) {
        OddEven1.numbers();//called static method in to main method


    }
}