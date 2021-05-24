import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double armutFiyat = 2.14 , elmaFiyat = 3.67 , domatesFiyat = 1.11 , muzFiyat = 0.95, patlicanFiyat = 5.00;
        double armut,elma,domates,muz,patlıcan,fiyat;
        System.out.print("armut kg miktarı:");
        armut = input.nextDouble();
        System.out.print("elma kg miktarı:");
        elma = input.nextDouble();
        System.out.print("domates kg miktarı:");
        domates = input.nextDouble();
        System.out.print("muz kg miktarı:");
        muz = input.nextDouble();
        System.out.print("patlican kg miktarı:");
        patlıcan = input.nextDouble();
        fiyat = (armut * armutFiyat) + (elma * elmaFiyat) + (domates * domatesFiyat) +(muz * muzFiyat) + (patlıcan * patlicanFiyat);
        System.out.print("TOPLAM FİYAT:" +  fiyat);


    }
}
