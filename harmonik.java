import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double result = 0;
		System.out.print("Enter a number please: ");
		int number = input.nextInt();

		for (int i = 1; i <= number; i++) {
			result += (1/i);
		}
		System.out.println("Result : "+result);
	}
}
