import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi1,sayi2,sayi3;

        System.out.println("birinci sayıyı girin:");
        sayi1 = input.nextInt();

        System.out.println("ikinci sayıyı girin:");
        sayi2 = input.nextInt();

        System.out.println("ucuncu sayıyı girin:");
        sayi3 = input.nextInt();

        if(sayi1 > sayi2 && sayi1 > sayi3){
            if(sayi2 > sayi3){
                System.out.println("sayi1 > sayi2 > sayi3");
            }else{
                System.out.println("sayi1 > sayi3 > sayi2");
            }
        }else if(sayi2 > sayi1 && sayi2 > sayi3){
            if(sayi1 > sayi3){
                System.out.println("sayi2 > sayi1 > sayi3");
            }else{
                System.out.println("sayi2 > sayi3 > sayi1");
            }
        }else if(sayi3 > sayi1 && sayi3 > sayi2){
            if(sayi1 > sayi2){
                System.out.println("sayi3 > sayi1 > sayi2");
            }else{
                System.out.println("sayi3 > sayi3 > sayi2");
            }
        }
    }
}
