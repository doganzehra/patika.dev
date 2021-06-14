import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number,n,temp;
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen dizi büyüklüğünü girin:");
        n = input.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            System.out.println("lütfen " + (i + 1) + ". elemanı girin:");
            arr[i] = input.nextInt();
        }

        for(int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
