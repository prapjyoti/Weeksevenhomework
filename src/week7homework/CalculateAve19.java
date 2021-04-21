package week7homework;
/*
Write a Java program to calculate the average value of array elements.
 */



public class CalculateAve19 {

    static void cal(){
        int []numbers=new int[]{15,18,22,30,58};
        int sum=0;//calculate sum of all array value
        for (int i=0; i<numbers.length; i++)
            sum=sum+numbers[i];
        //calculate the average
        double avarage =sum/ numbers.length;
        System.out.println("Average value of the array element is: "+avarage);
    }

    public static void main(String[] args) {

        CalculateAve19 .cal();//called static through class
    }

    }
