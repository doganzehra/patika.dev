import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sum = 0;
        int number = 0;
        Scanner input = new Scanner(System.in);

        do{
            System.out.println("Please enter a number:");
            number = input.nextInt();
            if(number % 4 == 0){
                sum += number;
            }
        }while(number % 2 == 0);
        System.out.println(sum);
    }
}
