import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double kdvOranı;
        double fiyat,kdvliFiyat,kdvTutarı;

	    Scanner input = new Scanner(System.in);

	    System.out.print("lütfen ücreti giriniz:");
        fiyat = input.nextDouble();

        if(fiyat > 0 && fiyat < 1000){
            kdvOranı = 0.18;
        }else{
            kdvOranı = 0.08;
        }

        kdvTutarı = fiyat * kdvOranı;
        kdvliFiyat = fiyat + kdvTutarı;

        System.out.println("kdv oranı:" + kdvOranı);
        System.out.println("kdvli fiyatı:" + kdvliFiyat);




    }
}
