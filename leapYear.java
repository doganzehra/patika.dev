import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int year;
        boolean leapYear;
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a year:");
        year = input.nextInt();
        if(year % 4 == 0) {
            if( year % 100 == 0) {
                if ( year % 400 == 0) {
                    leapYear = true;
                }
                else {
                    leapYear = false;
                }
            }
            else {
                leapYear = true;
            }
        }
        else {
            leapYear = false;
        }
        if(leapYear){
            System.out.println(year + " is a leap year.");
        }else{
            System.out.println(year + " is not a leap year.");
        }
    }
}
