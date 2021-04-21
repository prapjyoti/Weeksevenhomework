package week7homework;

/*
Write a java program to input any number and find out if it’s odd or even

 */

import java.util.Scanner;

public class OddEven6 {

    void result (){

        int num;
        System.out.println("Enter any number");
        Scanner sc =new Scanner(System.in);//sc value stored in num
        num = sc.nextInt();

        if(num %2==0)//if number is divisible by 2 then it's an even number or else odd num
            System.out.println("Enter number is even");
        else
            System.out.println("Enter number is odd");
    }

    public static void main(String[] args) {
        OddEven6 input= new OddEven6();//objected created for calling instance method in main method
        input.result();//
    }
}
