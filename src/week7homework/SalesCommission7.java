package week7homework;
/*
Write a java program input sales id, seller's name, sales amount, and salary basic and
then fined this sales
Commission
Sales amount >= 50,000 35%
Sales amount >= 30,000 20%
>= 20,000 10%
>= 10,000 5%
<10,000 2%
 */

import java.util.Scanner;

public class SalesCommission7 {
    static void com(){
      double salescommssion=0;
        Scanner sc=new Scanner(System.in);
        int salesid;
        System.out.println("Enter Sales Id");//call for print
        salesid=sc.nextInt();
        String name;
        System.out.println("Enter seller name");
        name=sc.next();
        double salesamount;
        System.out.println("Enter salary amount");
        salesamount =sc.nextFloat();
        double bs;
        System.out.println("Enter basic salary");
        bs=sc.nextDouble();


      //if statement condition
      if (salesamount>=50000.00){
          salescommssion=salesamount*0.35;
      }else if (salesamount >=30000.00){
          salescommssion=salesamount*0.2;
      }else if(salesamount>=20000.00){
          salescommssion=salesamount*0.1;
      }else if(salesamount>=10000.00){
          salescommssion=salesamount*0.05;
      }else if(salesamount<10000.00){
          salescommssion=salesamount*0.02;
      }
          System.out.println("Sales commission:" +salesamount);
      }


    public static void main(String[] args) {
        SalesCommission7.com();
    }


    }

