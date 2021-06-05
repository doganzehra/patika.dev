import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int toplam = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen matematik notunuzu girin:");
        arr[0] = input.nextInt();

        System.out.print("Lütfen fizik notunuzu girin:");
        arr[1] = input.nextInt();

        System.out.print("Lütfen turkce notunuzu girin:");
        arr[2] = input.nextInt();

        System.out.print("Lütfen tarih notunuzu girin:");
        arr[3] = input.nextInt();

        System.out.print("Lütfen muzik notunuzu girin:");
        arr[4] = input.nextInt();

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0 || arr[i] == 100){
                continue;
            }else {
                toplam += arr[i];
            }
        }

        double ortalama= toplam / 6.0;
        System.out.println("ortalamanız: " + ortalama);

        String geçmeDurumu = ortalama > 55 ? "Geçtiniz" : "Kaldınız";
        System.out.print(geçmeDurumu);

    }
}
