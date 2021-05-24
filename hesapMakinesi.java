import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1,num2,select,sonuc;
        System.out.print("birinci sayıyı girin:");
        num1 = input.nextInt();

        System.out.print("ikinci sayıyı girin:");
        num2 = input.nextInt();

        System.out.print("toplama işlemi için 1,çıkartma 2,çarpma 3,bölme 4, seçin:");
        select = input.nextInt();
        switch(select){
            case 1:
                sonuc = num1 + num2;
                System.out.print("sonuc:" + sonuc);
                break;
            case 2:
                if(num1 < num2){
                    sonuc = num2 - num1;
                }else{
                    sonuc = num1 - num2;
                }
                System.out.print("sonuc:" + sonuc);
                break;
            case 3:
                sonuc = num1 * num2;
                System.out.print("sonuc:" + sonuc);
                break;
            case 4:
                sonuc = num1 / num2;
                System.out.print("sonuc:" + sonuc);
                break;
        }
    }
}
