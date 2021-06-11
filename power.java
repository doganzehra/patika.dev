import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sum = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number:");
        int number = input.nextInt();
        System.out.println("Please enter power:");
        int power = input.nextInt();
        for(int i = 1; i <=power; i++){
            sum *= number;
        }
        System.out.println(sum);

    }
}
