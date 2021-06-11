import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the boundary:");
        int number = input.nextInt();
        for(int i = 1; i <= number; i *= 4){
            System.out.println(i);
        }
        System.out.println("**********************************");
        for(int i = 1; i <= number; i *=5){
            System.out.println(i);
        }
    }
}
