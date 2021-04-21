package week7homework;
/*
a java program to print the numbers between 1 to 100 which can be divided by 3
and 5 separately.
 */

import java.util.Scanner;

public class Programme11 {

    static void numbers(){
        int numbres;
        Scanner sc=new Scanner(System.in);
        System.out.println("divided by 3: ");
        for (int a=1; a<100;a++){
            if (a%3==0)
                System.out.println(a +"");
        }

        System.out.println("divided by 5; ");
        for(int a=1; a<100; a++){
            if (a%5==0)
                System.out.println(a+ "");
        }

    }

    public static void main(String[] args) {
        Programme11.numbers();//called class method through class

    }
}
