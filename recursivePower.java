import java.util.Scanner;

public class Main {

    static int üsAl(int taban, int üs){
        if(üs == 0){
            return 1;
        }else{
            return taban * üsAl(taban, (üs - 1));
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Taban sayısı girin:");
        int taban = input.nextInt();
        System.out.println("Üs sayısı girin:");
        int üs = input.nextInt();
        int sum = üsAl(taban,üs);
        System.out.println(sum);
    }
}
