import java.util.Scanner;
//burç bulma -özellikle switch case kullanmadan yapıldı
public class Main {
    public static void main(String[] args) {
        int ay,gün;
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen dogdunuz ayı sayı olarak giriniz:");
        ay = input.nextInt();
        System.out.println("Lütfen dogdugunuz günü girin:");
        gün = input.nextInt();
        if (ay == 12) {
            if (gün < 22)
                System.out.println("yay");
            else
            System.out.println("oğlak");
        }
        else if (ay == 1){
            if (gün < 20)
                System.out.println("oğlak");
            else
                System.out.println("kova");
        }

        else if (ay == 2){
            if (gün < 19)
                System.out.println("kova");
            else
                System.out.println("balık");
        }

        else if(ay == 3){
            if (gün < 21)
                System.out.println("balık");
            else
                System.out.println("koç");
        }
        else if (ay == 4){
            if (gün <= 20)
                System.out.println("koç");
            else
                System.out.println("boga");
        }

        else if (ay == 5){
            if (gün <= 21)
                System.out.println("boga");
            else
                System.out.println("ikizler");
        }

        else if( ay == 6){
            if (gün <= 22)
                System.out.println("ikizler");
            else
                System.out.println("yengeç");
        }

        else if (ay == 7){
            if (gün < 23)
                System.out.println("yengeç");
            else
                System.out.println("aslan");
        }

        else if( ay == 8){
            if (gün < 23)
                System.out.println("aslan");
            else
                System.out.println("başak");
        }

        else if (ay == 9){
            if (gün < 23)
                System.out.println("başak");
            else
                System.out.println("terazi");
        }

        else if (ay == 10){
            if (gün < 23)
                System.out.println("terazi");
            else
                System.out.println("akrep");
        }

        else if (ay == 11){
            if (gün < 22)
                System.out.println("akrep");
            else
                System.out.println("yay");
        }
    }
}
