import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int reversed =0;
        s.close();
        while(n!=0){
            int a = n%10;
            reversed = reversed*10+a;
            n/=10;
        }
        System.out.println(reversed);
	}
}
