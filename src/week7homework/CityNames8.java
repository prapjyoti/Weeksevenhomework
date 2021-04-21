package week7homework;
/*
Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
    any other alphabet should be invalid entry

 */

import java.util.Scanner;

public class CityNames8 {
    //instance method
    void CityAtoF(){
        Scanner sc=new Scanner(System.in);//import scanner
        System.out.println("Input  Alphabet");
        char city=sc.next().charAt(0);//formula
        if(city== 'a'){//condition
            System.out.println("Alford");//if body
        }else if (city=='b'){//else if condition
            System.out.println("Birmingham");
        }else if(city=='c'){
            System.out.println("Chester");
        }else if (city=='d'){
            System.out.println("Derby");
        }else if (city=='e'){
            System.out.println("Enfield");
        }else if (city=='f'){
            System.out.println("Fenny");
        }else{
            System.out.println("Invalid entry");
        }

    }

    public static void main(String[] args) {
        CityNames8 ci=new CityNames8();//called instance method created object
         ci.CityAtoF();
    }
}


