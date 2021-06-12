public class Main {
    public static void main(String[] args) {
        double[] array = { 1, 2, 3, 4, 5 };
        double seri = 0;
        for (int i = 0; i < array.length; i++) {
            seri = seri+ (1 / array[i]);
        }
        System.out.println(seri);
        double average = (array.length) / (seri);
        System.out.println(average);
    }
} 
