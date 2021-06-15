import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void frekansBul(int arr[], int number) {
        boolean aranan[] = new boolean[number];
        Arrays.fill(aranan, false);
        for (int i = 0; i < number; i++) {
            if (aranan[i] == true) {
                continue;
            }
            int sayac = 1;
            for (int j = i + 1; j < number; j++) {
                if (arr[i] == arr[j]) {
                    aranan[j] = true;
                    sayac++;
                }
            }
            System.out.println(arr[i] + " sayısı " + sayac + " kere tekrar edildi.");
        }
    }

    public static void main(String []args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("dizi kaç elemanlı olacak:");
        int elemanSayısı = input.nextInt();
        int arr[] = new int[elemanSayısı];
        for(int i = 0; i < elemanSayısı; i++){
            System.out.println("lütfen dizinin " + (i + 1) + ". elemanını girin:");
            arr[i] = input.nextInt();
        }
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        frekansBul(arr, elemanSayısı);
    }
}
