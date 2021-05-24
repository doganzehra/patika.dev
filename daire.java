import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int yaricap,acı;
        double piSayisi = 3.14;
        double alan,dilimAlan,cevre;

        System.out.print("lutfen yarıcap uzunlugunu girin:");
        yaricap = input.nextInt();

        System.out.print("lutfen dairenin acısını girin:");
        acı = input.nextInt();

        alan = piSayisi * Math.pow(yaricap,2);
        cevre = piSayisi *  yaricap * 2;
        dilimAlan = (Math.pow(yaricap,2) * piSayisi * acı) / 360;
        
        System.out.println("dairenin alanı:" +  alan);
        System.out.println("dairenin cevresi:" + cevre);
        System.out.println("daire diliminin alanı:" + dilimAlan);
    }
}
