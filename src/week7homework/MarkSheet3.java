package week7homework;
/*
Write a java program to input student Name, roll No, and three subjects Math, Science and
English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
Input, Marks should between 0 to 100”) and find out total, percentage and result.
If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
%> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format

| |
| Mark Sheet |
|_______________________________|
| Name : Jay                    |
| Roll No: 08                   |
|_______________________________|
| Subjects : Marks              |
|_______________________________|
| Math : 98                     |
| Science : 90                  |
| English : 85                  |
|_______________________________|
| Total : 273                   |
|_______________________________|
| Percentage : 91.0             |
| Result : Pass                 |
| Grade : A+                    |
|_______________________________|

 */

import java.util.Scanner;

public class MarkSheet3 {
    //static method
    static void result (){

        Scanner sc= new Scanner(System.in);//called scanner class

            System.out.print("Enter the name of Student ");
            String name=sc.nextLine();
            System.out.print("Enter the Roll Number     ");
            String roll=sc.nextLine();
            System.out.print("Enter the Marks of Maths  ");
            int maths=sc.nextInt();
            System.out.print("Enter the Marks of Science ");
            int science =sc.nextInt();
            System.out.print("Enter the Marks of English ");
            int english =sc.nextInt();

        int total=maths+english+science;//formula for total of subject
            float percent;//datatype declare for percent
            percent=total/3;//percent formula
            String grade="";
            String result="";
        if ((maths >= 0 && maths < 100) || (science >= 0 && science < 100) || (english >= 0 && english < 100)) {
            System.out.println("Invalid Input");//if statement
        }
         if (percent >= 80) {
             grade = "A+";
             result = "Pass";
         }else if (percent>=60){
             grade= "A";
             result="Pass";
         }else if(percent >=50){
             grade ="B";
             result="pass";
         }else if (percent>=35){
             grade="C";
             result="Pass";
         }else{
             result="Fail";
         }
         if ((maths<=35)|| (science<=34)|| (english<=34)){
             result="Fail";
         }

     //print statement

        System.out.println("|-------------------------- |");
        System.out.println("|  Mark sheet               |");
        System.out.println("|---------------------------|");
        System.out.println("|Name:   "+name+           "|");
        System.out.println("|Roll No. "+roll+          "|");
        System.out.println("|---------------------------|");
        System.out.println("|Subject:   marks           |");
        System.out.println("|Maths     :   "+maths+    "|");
        System.out.println("|Science: "+science+       "|");
        System.out.println("|English: "+english+       "|");
        System.out.println("|---------------------------|");
        System.out.println("|Total:         "+total+   "|");
        System.out.println("|---------------------------|");
        System.out.println("|Percentage:   "+percent+  "|");
        System.out.println("|Result:        "+result+  "|");
        System.out.println("|Grade:   "+grade+         "|");
        System.out.println("|---------------------------|");

        }

    public static void main(String[] args) {

        MarkSheet3.result();//called static method through class
    }
    }
