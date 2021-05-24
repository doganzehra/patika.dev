import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String id = "zehradogan";
        String password = "abcd";
        String newPassword;
        int secim;

        System.out.println("Lütfen kullanıcı adinizi giriniz:");
        String girilenId = input.nextLine();

        System.out.println("Lütfen şifenizi giriniz:");
        String girilenPassword = input.nextLine();
        if (id == girilenId && password == girilenPassword) {
            System.out.println("başarıyla giriş yaptınız..");
        } else if (girilenId != id) {
            System.out.println("şifrenizi değiştirmek ister misiniz evet için 1 hayır için 2:");
            secim = input.nextInt();
            if (secim == 1) {
                System.out.println("lütfen yeni bir şifre girin:");
                newPassword = input.nextLine();
                if (newPassword == password && newPassword == girilenPassword) {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                }
            }else{
                System.out.println("hatalı giriş");
            }
        }else{
            System.out.println("hatalı giriş");
        }
    }
}
