import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = {89,67,12,100,9,-34,0};
        int temp,number,max = 0,min = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sayı girin:");
        number = input.nextInt();

        for(int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i] > number){
               max = arr[i];
               break;
            }
            if(arr[i] < number){
                min = arr[i];
            }
        }
        System.out.println("Girilen sayıdan küçük en yakın sayı " + min);
        System.out.println("Girilen sayıdan büyük en yakın sayı " + max);
    }
}
