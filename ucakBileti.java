import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mesafe,yas;
        double fiyat,yeniFiyat,toplam;
        int secim;
        Scanner input = new Scanner(System.in);

        System.out.println("Gidilecek mesafeyi girin:");
        mesafe = input.nextInt();
        fiyat = mesafe * 0.10;
        System.out.println("Yaşınız:");
        yas = input.nextInt();

        System.out.println("Tek yön için 1 gidiş dönüş için 2 seçiniz.");
        secim = input.nextInt();

        switch (secim){
            case 1:
                System.out.println("Tek yönlü yolculuk seçtiniz..");
                if(yas < 12){
                    fiyat -= (fiyat * 0.50);
                    toplam = fiyat;
                    System.out.println(toplam);
                }
                else if(yas <= 24 && yas >= 12){
                    fiyat -= (fiyat * 0.10);
                    toplam = fiyat;
                    System.out.println(toplam);
                }
                else if(yas > 65){
                    fiyat -= (fiyat * 0.30);
                    toplam = fiyat;
                    System.out.println(toplam);
                }
                break;
            case 2:
                System.out.println("Çift yönlü yolculuk seçtiniz..");

                if(yas < 12){
                    fiyat -= (fiyat * 0.50);
                    yeniFiyat = fiyat - (fiyat * 0.20);
                    toplam = yeniFiyat * 2;
                    System.out.println(toplam);
                }
                else if(yas <= 24 && yas >= 12){
                    fiyat -= (fiyat * 0.10);
                    yeniFiyat = fiyat - (fiyat * 0.20);
                    toplam = yeniFiyat * 2;
                    System.out.println(toplam);
                }
                else if(yas > 65){
                    fiyat -= (fiyat * 0.30);
                    yeniFiyat = fiyat - (fiyat * 0.20);
                    toplam = yeniFiyat * 2;
                    System.out.println(toplam);
                }
                break;
            default:
                System.out.println("Hatalı Veri Girdiniz !");
                break;
        }
    }
}
