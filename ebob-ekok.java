import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num1,num2;
        int EBOB = 0,EKOK;
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter first number:");
        num1 = input.nextInt();
        System.out.print("Please enter second number:");
        num2 = input.nextInt();
        int i = 1;
        while(i <= num1 && i <= num2){
            if(num1 % i == 0 && num2 % i == 0){
                EBOB = i;
            }
            ++i;
        }
        EKOK = (num1 + num2) / EBOB;
        System.out.println(EBOB);
        System.out.println(EKOK);
    }
}
