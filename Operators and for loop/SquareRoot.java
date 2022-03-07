import java.util.Scanner;

public class SquareRoot {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sqrt = 1;
        int i = 0;
        s.close();
        if (n <= 1) {
            System.out.println(n);

        }
        for (i = 0; sqrt <= n; i++) {

            sqrt = i * i;

            if (sqrt > n) {
                System.out.println(i - 1);

            }

        }
    }
}
