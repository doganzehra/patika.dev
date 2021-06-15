import java.util.Scanner;

public class Main {

    public static int[][] makeMatrix(int satır,int sütun){
        Scanner input = new Scanner(System.in);
        int[][] matris = new int[satır][sütun];
        for (int i = 0; i < satır; i++) {
            for (int j = 0; j < sütun; j++) {
                System.out.println("Lütfen matrisin " + i + ". satır ve " + j + ". sütununda bulunan elemanını giriniz:");
                matris[i][j] = input.nextInt();
            }
        }
        return matris;
    }

    public static void showMatrix(int[][] matris){
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {
                System.out.print(matris[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] transpose(int[][] matris,int satır,int sütun){
        int[][] transpoz = new int[sütun][satır];
        for (int i = 0; i < satır; i++){
            for (int j = 0; j < sütun; j++) {
                transpoz[j][i] = matris[i][j];
            }
        }
        return transpoz;
    }


    public static void main(String []args) {
        Scanner input = new Scanner(System.in);
        System.out.println("matris satırı kaç elemanlı olacak:");
        int satır = input.nextInt();
        System.out.println("matris sütunu kaç elemanlı olacak:");
        int sütun = input.nextInt();
        int[][] matrix = makeMatrix(satır,sütun);
        showMatrix(matrix);
        int[][] transpos = transpose(matrix,satır,sütun);
        System.out.println();
        showMatrix(transpos);

    }
}
