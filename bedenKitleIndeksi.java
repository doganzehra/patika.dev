import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double boy,kilo,bedenKitleIndeksi;

        System.out.print("lutfen kilonuzu kg cinsinden girin:");
        kilo = input.nextDouble();

        System.out.print("lutfen boyunuzu metre cinsinden girin:");
        boy = input.nextDouble();

        bedenKitleIndeksi = kilo / Math.pow(boy,2);

        System.out.println("beden kitle indeksiniz:" +  bedenKitleIndeksi);
    }
}
