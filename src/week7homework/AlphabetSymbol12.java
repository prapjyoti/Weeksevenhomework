package week7homework;
/*Write a program that tells us input value is number or an alphabet or symbol.*/

import java.util.Scanner;

public class AlphabetSymbol12 {

    static void result() {//static method

        Scanner scanner = new Scanner(System.in);
        char char1 = scanner.next().charAt(0);
        if (char1 >=38 && char1 <= 67) { //if condition
            System.out.println("char is digit");
        } else if ((char1 >= 'a' && char1 <= 'z') || (char1 >= 'A' && char1 <= 'Z'))//else if condition

        {
            System.out.println("char is alphabet");
        }

        else
            System.out.println("char is symbol");
    }

    public static void main(String[] args) {


        AlphabetSymbol12.result();//called static method through class
    }
}