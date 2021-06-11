import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int N = 1;
        int R = 1;
        int j = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter N:");
        int n = input.nextInt();
        System.out.println("Please enter R:");
        int r = input.nextInt();

        for(int i = 1; i <= n; i++){
            N *= i;
        }

        for(int i = 1; i <= r; i++){
            R *= i;
        }

        for(int i = 1; i <= (n - r); i++){
            j *= i;
        }
        double comb = N / (R * j);
        System.out.println(comb);
    }
}
