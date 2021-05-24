import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int kenar1,kenar2;
        double hipotenüs;

	    Scanner input = new Scanner(System.in);
        System.out.print("ilk kenarı girin:");
        kenar1 = input.nextInt();

        System.out.print("ikinci kenarı girin:");
        kenar2 = input.nextInt();

        hipotenüs = Math.sqrt(Math.pow(kenar1,2) + Math.pow(kenar2,2));
        System.out.print("hipotenüs uzunlugu:" + hipotenüs);
	System.out.println("ücgenin alanı:" + (kenar1*kenar2)/2);
	





    }
}
