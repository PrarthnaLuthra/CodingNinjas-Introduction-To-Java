
public class FibonacciNumber {
    public static boolean checkMember(int n) {

        for (int num1 = 0, num2 = 1, i = 1; i <= n; i++) {
            int fib = num1 + num2;
            num1 = num2;
            num2 = fib;
            if (n == num2) {
                return true;
            }
        }

        return false;
    }
}

/*
 * Your class should be named Solution
 * Don't write main().
 * Don't read input, it is passed as function argument.
 * Return output and don't print it.
 * Taking input and printing output is handled automatically.
 */

// public static void main(String[] args){
// Scanner s= new Scanner(System.in);
// int n= s.nextInt();
// // boolean ans = checkMember(n);
// s.close();

// }
// }
