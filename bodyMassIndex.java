import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double height,weight,bodyMassIndex;

        System.out.print("Please enter your weight:");
        weight = input.nextDouble();

        System.out.print("Please enter your height:");
        height = input.nextDouble();

        bodyMassIndex = weight / Math.pow(height,2);

        System.out.println("Your body mass index is:" +  bodyMassIndex);
    }
}
