import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number:");
        number = input.nextInt();
        desen(number);
    }

    static void desen(int number) {
        if(number > 0){
            System.out.print(number + " ");
            desen(number - 5);
        }
        System.out.print(number + " ");
    }
}
