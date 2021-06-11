import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sum = 0;
        float average;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int number = input.nextInt();
        int flag = 0;
        for(int i = 0; i <= number; i++){
            if(i % 3 == 0 && i % 4 == 0){
                sum += i;
                flag++;
            }

        }
        average = sum / flag;
        System.out.println("Sum is:" + sum);
        System.out.println("Average is:" + average);

    }
}
