
import java.util.Scanner;
public class FindPowerOfNumber  {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int n = s.nextInt();
        
        long i = 1;
        while (n!=0){
            i*=x;
            n--;
        }
        System.out.println(i);
        
        s.close();
    }
}
