import java.util.Scanner;

public class AllPrimeNumbers {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int num1 = 0, num2 = 1, i = 1; i <= n; i++) {
            int fib = num1 + num2;
            num1 = num2;
            num2 = fib;
            if (i == (n)) {
                System.out.println(num1);
            }
        }
        s.close();
    }

}
