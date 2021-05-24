import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sıcaklık;
        System.out.println("Lütfen sıcaklığı girin:");
        sıcaklık = input.nextInt();
        if(sıcaklık < 5){
            System.out.println("kayak yapın");
        }else if(sıcaklık >= 5 && sıcaklık < 25){
            if(sıcaklık < 15){
                System.out.println("sinemaya gidin");
            }else if(sıcaklık > 10){
                System.out.println("piknik yapın");
            }
        }else{
            System.out.println("yüzmeye gidin");
        }
    }
}
