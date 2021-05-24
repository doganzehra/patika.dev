import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat,fizik,türkce,tarih,muzik;

	    Scanner input = new Scanner(System.in);

	    System.out.print("Lütfen matematik notunuzu girin:");
	    mat = input.nextInt();

        System.out.print("Lütfen fizik notunuzu girin:");
        fizik = input.nextInt();

        System.out.print("Lütfen turkce notunuzu girin:");
        türkce = input.nextInt();

        System.out.print("Lütfen tarih notunuzu girin:");
        tarih = input.nextInt();

        System.out.print("Lütfen muzik notunuzu girin:");
        muzik = input.nextInt();

        double ortalama= (mat + fizik + türkce + tarih + muzik) / 6.0;
        System.out.println("ortalamanız: " + ortalama);

        String geçmeDurumu = ortalama > 60 ? "Geçtiniz" : "Kaldınız";
        System.out.print(geçmeDurumu);
        

    }
}
