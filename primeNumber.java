public class Main {
    public static void main(String[] args) {
        System.out.println("1 ile 100 arasındaki asal sayılar");
        int flag = 0;
        for(int number = 2; number <= 100; number++)
        {
            int f2 = 0;
            for (int i = 2; i < number; i++)
            {
                if (number % i == 0)
                {
                    f2 = 1;
                    break;
                }
            }
            if(f2==0)
            {
                System.out.print(number+" ");
                flag++;
            }
        }
    }
}
