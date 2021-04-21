package week7homework;

import java.util.Scanner;

public class AlphabetSwitch9 {

    void cityName(){

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Character");
        char city=sc.next().charAt(0);

        switch(city)//switch statement
        {
            case ('A'):
                System.out.println("Alford");
                break;
            case('B'):
                System.out.println("Birmingham");
                break;
            case('C'):
                System.out.println("Chester");
                break;
            case('D'):
                System.out.println("Derby");
                break;
            case('E'):
                    System.out.println("Enfield");
                    break;
            case('F'):
                System.out.println("Fenny");
                break;
            default:
                System.out.println("Invalid Entry");
        }

    }

    public static void main(String[] args) { //main method
        AlphabetSwitch9 ct=new AlphabetSwitch9();//calling instance in main method through object
        ct.cityName();
    }
}
