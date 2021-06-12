import java.util.Scanner;

public class Main {

    static void isPalindrom(){
        Scanner input = new Scanner(System.in);
        int number;
        System.out.println("Bir sayı girin:");
        number = input.nextInt();
        int temp = number;
        int reverse = 0;
        int mod;
        while (temp != 0){
            mod = temp % 10;
            reverse = (reverse * 10) + mod;
            temp /= 10;
        }
        if(number == reverse){
            System.out.println(number + " palindrom sayıdır");
        }else{
            System.out.println(number + " palindrom sayı degil");
        }
    }
    public static void main(String[] args) {
        isPalindrom();
    }
}
