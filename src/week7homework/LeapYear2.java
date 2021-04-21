package week7homework;
/*
Write a java program to input any year like (ex.2007) and find out if it is leap year or
not?
 */

  import java.util.Scanner;

public class LeapYear2 {
    void year1() {//instance method
        int year;
        Scanner sc = new Scanner(System.in);//scanner class
        System.out.println("Enter Any Year");
        year = sc.nextInt();

        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) { //logic for leap year
            System.out.println(year + "is a leap year");

        } else {
            System.out.println(year + "is not leap year");
        }
    }

    public static void main(String[] args) {

        LeapYear2 yr = new LeapYear2();
        yr.year1();
    }

}