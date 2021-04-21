package week7homework;
/*
String length()-length of the string
String charAt()-returns a char value at the given index number
String concat()-combines specified string at the end of this string
String contains()-returns true if char are found in the string
String starts with()-checks if this string starts with given prefix
String ends with()-checks if this string ends with given suffix
String equals()-compares the contents of two given strings
String indexOf()- return index of given character value or substring
String is empty()-checks if string is empty
String is replace()-return a string replacing all the old char to new char
String is substring()-returns a part of the string
String is toCharArray()-converts this string into character array
String is toLowerCase()-returns the string in lowercase
String is toUpperCase()-returns the string in uppercase
String is trim()-eliminates leading and trailing space
 */

import java.util.Locale;

public class StringMethod21 {
    public static void main(String[] args) {


        String name="This is my string";
        String name1= "Hello World";
        System.out.println("the length of string is "+name.length());//it will count space as well+is for space
        System.out.println(name.charAt(3));//count this from 0 value
        System.out.println("is this string empty ="+name.isEmpty());//gives value true or false
        System.out.println(name.equals(name1));//compare with string and string 1
        System.out.println(name.contains("x"));
        System.out.println(name.contains("i"));
        System.out.println(name.startsWith("The"));
        System.out.println(name.endsWith("String"));
        System.out.println(name.indexOf('m'));
        System.out.println(name1.replace(name1,name));
        System.out.println(name.substring(5));
        System.out.println(name1.toCharArray());
        System.out.println(name.toLowerCase());
        System.out.println(name1.toUpperCase());
        System.out.println(name1.trim());

    }
}
