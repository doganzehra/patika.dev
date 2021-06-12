import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number,sum = 0;
        Scanner input =  new Scanner(System.in);
        System.out.println("Please enter the number you want:");
        number = input.nextInt();
        for(int i = 1; i < number; i++){
            if(number % i == 0){
                sum += i;
            }
        }
        if(sum == number){
            System.out.println(number + " is a perfect number");
        }else{
            System.out.println(number + " is not a perfect number");
        }
    }
}
