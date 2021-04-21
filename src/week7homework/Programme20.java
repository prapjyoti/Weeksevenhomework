package week7homework;

/*
Write a Java program to test if an array contains a specific value.
 */


public class Programme20 {
    //string contains ()method
    public static boolean contains(int[]arr,int item){
        for(int x:arr){
            if(item==x){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[]myclass1={
                100,535,695,789,896,789};
        System.out.println(contains(myclass1,695));
        System.out.println(contains(myclass1,900));
        }
    }

