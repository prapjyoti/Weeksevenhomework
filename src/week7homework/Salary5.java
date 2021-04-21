package week7homework;
/*
WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross
salary
HRA = basic salary 10%
DA = Basic salary 8%
TA = Basic salary 9%
PF= Basic salary 20%
Gross salary = basic salary + HRA + TA + DA –PF
Print in following format
_______________________________
| Salary Slip |
|______________________________|
| Employee Id : 2564 |
| Employee Name : Jay |
|______________________________|
| Basic Salary : 25000.0 |
| HRA 10% : 2500.0 |
| TA 8% : 2250.0 |
| DA 9% : 2000.0 |
| PF - 20& : 5000.0 |
|______________________________|
| Gross Salary : 26750.0 |
|===========================|


 */

import java.util.Scanner;

public class Salary5 {
    void wages(){
        Scanner so=new Scanner(System.in);//scanner class called
        System.out.println("Enter employee id");
        int employeeid =so.nextInt();
        System.out.println("Enter employee name");
        String name=so.next();
        System.out.println("Enter basic salary");
        int salary=so.nextInt();


        double hra, ta, da,pf,gs;//variable declare
        gs=0.0;
        hra = 0.1*salary;//formula for count ta,da,hra and pf
        da=0.08*salary;
        ta=0.09*salary;
        pf=0.2*salary;
        gs=(hra+ta+da+salary)-pf;//gross salary calculation
     //print statement
        System.out.println("|------------------------  |");
        System.out.println("|Salary slip               |");
        System.out.println("|-----------------------   |");
        System.out.println("|Employee Id:"+employeeid+ '|');
        System.out.println("|Employee Name  :           |");
        System.out.println("|Basic Salary :"+salary+    '|');
        System.out.println("|HRA 10%      :"+hra+        '|');
        System.out.println("|TA  8%       :"+ta+         '|');
        System.out.println("|DA  9%:       :"+da+        '|');
        System.out.println("|PF -20&       :"+pf+        '|');
        System.out.println("|-------------------------- |");
        System.out.println("|Gross Salary :"+gs+        '|');
        System.out.println("----------------------------|");


    }

    public static void main(String[] args) {//main method
        Salary5 sal=new Salary5();//called instance method through obj
        sal.wages();
    }
}
