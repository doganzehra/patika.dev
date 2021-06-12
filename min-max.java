import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int max=0,min=0,num,temp;
        int[] arr = new int[20];
        Scanner input = new Scanner(System.in);

        System.out.print("Kaç sayı gireceksiniz:");
        num = input.nextInt();
        for(int i = 0; i <= num - 1; i++){
            System.out.println("Lütfen "+ (i + 1) + ". sayıyı girin:");
            arr[i]= input.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("En büyük sayı: " + max);
        System.out.println("En küçük sayı: " + min);
    }
}
