import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userId, password;
        Scanner input = new Scanner(System.in);
        int flag = 3;
        int balance = 1500;
        int select;

        while (flag > 0) {
            System.out.print("Kullanıcı Adınız :");
            userId = input.nextLine();
            System.out.print("Parolanız : ");
            password = input.nextLine();

            if (userId.equals("patika") && password.equals("dev123")) {
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");
                System.out.println("1-Para yatırma\n" +
                        "2-Para Çekme\n" +
                        "3-Bakiye Sorgula\n" +
                        "4-Çıkış Yap");
                System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                select = input.nextInt();
                switch (select){
                    case 1:
                        System.out.print("Para miktarı : ");
                        int price = input.nextInt();
                        balance += price;
                        break;
                    case 2:
                        System.out.print("Para miktarı : ");
                        int price2 = input.nextInt();
                        if (price2 > balance) {
                            System.out.println("Bakiye yetersiz.");
                        }else {
                            balance -= price2;
                        }
                        break;
                    case 3:
                        System.out.println("Bakiyeniz : " + balance);
                        break;
                    case 4:
                        System.out.println("Tekrar görüşmek üzere.");
                        break;

                }
            } else {
                flag--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                if (flag == 0) {
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                } else {
                    System.out.println("Kalan Hakkınız : " + flag);
                }
            }
        }
    }
}
