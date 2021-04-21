package week7homework;
/*
Write a Java program to sort a numeric array and a string array.
 */

import java.util.Arrays;

public class Programme17 {
   void sortArray(){

       int [] input1={15,36,50,49,65,60,91,80,92,10};// int value given to array

       String [] input2={"Apple","Delta","Charly","Bravo","Eco", "India", "Papa"};//string array value given

       System.out.println("Original numeric value :     "+ Arrays.toString(input1));//print original numeric value
       Arrays.sort(input1);
       System.out.println("Sorted numeric value:        "+ Arrays.toString(input1));//sorted value print
       System.out.println("Original String :       "+ Arrays.toString(input2));//print original value
       Arrays.sort(input2);
       System.out.println("Sorted String:           "+ Arrays.toString(input2));//sorted value print
   }

    public static void main(String[] args) {
        Programme17 pro= new Programme17();//object created for calling instance method in to main method
        pro.sortArray();//called through object
    }
}
