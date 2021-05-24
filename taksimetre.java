import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int acilis = 10;
        double toplam,fiyat;
        double kmUcret = 2.20;
        double gidilenYol;
        System.out.print("lütfen gidilen mesafeyi giriniz:");
        gidilenYol = input.nextDouble();
        toplam = (gidilenYol * kmUcret) + acilis;
        if(toplam < 20){
            fiyat = 20;
        }else{
            fiyat = toplam;
        }
        System.out.print("ödenecek tutar:" + fiyat);



    }
}
