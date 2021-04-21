package week7homework;
/*
umber of Days In Month
Write a method isLeapYear with a parameter of type int named year.
The parameter needs to be greater than or equal to 1 and less than or equal to 9999.
If the parameter is not in that range return false.
Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is,
otherwise return false.
A year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400.
Example of input/Output:
● isLeapYear(-1600); should return false since the parameter is not in the range(1-9999)
● isLeapYear(1600); should return true since 1600 is a leap year
● isLeapYear(2017); should return false since 2017 is not a leap year
● isLeapYear(2000);should return true because 2000 is a leap year
Write another method getDaysInMonth with two parameter month and year. Both of type
int.
If parameter month is < 1 or >12 return -1.
If parameter year is <1 or >9999 than return -1.
This method needs to return the number of days in the month. Be careful about leap years
they have 29 days in month 2 (February).
You should check if the year is a leap year using the method isLeapYear describe above.

Example of input/Output:
● getDaysInMonth(1, 2020); should return 31 since January has 31 days.
● getDaysInMonth(2, 2020); should return 29 since February has 29 days in a year and 2020 is a leap
year.
● getDaysInMonth(2, 2018); should return 28 since February has 28 days if it’s not a leap year and
2018 is not a leap year.
● getDaysInMonth(-1, 2020); should return -1 since the parameter month is invalid.
● getDaysInMonth(1, -2020); should return -1 since the parameter year is outside the range of 1 to9999

*/

public class Programme4 {

    public static boolean isLeapYear(int year){//static method with return type
        boolean result;
        if((year>=1 && year <=9999) && (year %4==0 && year%100!=0) || year%400==0){//formula for leap year
            result=true;
            System.out.println(result);
        }else{
            result=false;
            System.out.println(result);
        }
        return result;
    }
    public static int getDaysMonth(int month,int year){//static method with return type with parameters
        int days=0;
        if (month<1||month>12||year<1||year>9999){
            days=-1;
        }else{
            switch(month){//switch statement
                case 1:
                    days=31;
                    break;
                case 2:
                    if (isLeapYear(year)==true){
                        days=29;
                        break;
                    }else{
                        days=28;
                        break;
                    }
                    case 3:
                        days=31;
                        break;
                case 4:
                    days=30;
                    break;
                case 5:
                    days=31;
                    break;
                case 6:
                    days=30;
                    break;
                case 7:
                    days=31;
                    break;
                case 8:
                    days=31;
                    break;
                case 9:
                    days=30;
                    break;
                case 10:
                    days=31;
                    break;
                case 11:
                    days=30;
                    break;
                case 12:
                    days=31;
                    break;

                default:
                    System.out.println("The parameter month is invalid");

            }
        }
        return days;
    }

    public static void main(String[] args) {
      Programme4.isLeapYear(-1600);
      Programme4.getDaysMonth(2,2200);
    }
}
