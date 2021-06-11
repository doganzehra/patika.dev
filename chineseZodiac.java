import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int zodiac,birthDate;
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your birth year:");
        birthDate = input.nextInt();
        zodiac = birthDate % 12;
        switch (zodiac){
            case 0:
                System.out.println("Your zodiac is : Monkey");
                break;
            case 1:
                System.out.println("Your zodiac is : Rooster");
                break;
            case 2:
                System.out.println("Your zodiac is : Dog");
                break;
            case 3:
                System.out.println("Your zodiac is : Pig");
                break;
            case 4:
                System.out.println("Your zodiac is : Mouse");
                break;
            case 5:
                System.out.println("Your zodiac is : Ox");
                break;
            case 6:
                System.out.println("Your zodiac is : Tiger");
                break;
            case 7:
                System.out.println("Your zodiac is : Rabbit");
                break;
            case 8:
                System.out.println("Your zodiac is : Dragon");
                break;
            case 9:
                System.out.println("Your zodiac is : Snake");
                break;
            case 10:
                System.out.println("Your zodiac is : Horse");
                break;
            case 11:
                System.out.println("Your zodiac is : Sheep");
                break;
            default:
                break;
        }
    }
}
