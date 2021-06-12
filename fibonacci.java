import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1=0;
        int num2=1;
        int num3,num;
        System.out.print("Eleman Sayısını Girin:");
        num = input.nextInt();
        System.out.print(num1+" "+num2);
        for(int i = 2; i < num; ++i)
        {
            num3 = num1 + num2;
            System.out.print(" "+num3);
            num1 = num2;
            num2 = num3;
        }
        System.out.println();
    }
}
