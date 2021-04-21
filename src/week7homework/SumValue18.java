package week7homework;
/*
Write a Java program to sum values of an array.
 */

import java.util.Scanner;

public class SumValue18 {

   static void sum(){
        Scanner dc=new Scanner(System.in);
        int[]array=new int[8];
        int sum=0;
        System.out.println("Enter the numbers");
        for (int i=0; i<8; i++)
        {
            array[i]=dc.nextInt();
        }
        for(int num:array) {
            sum=sum+num;

        }
       System.out.println("sum of array numbers is:  "+sum);
        }

    public static void main(String[] args) {
        SumValue18.sum();
    }
    }




