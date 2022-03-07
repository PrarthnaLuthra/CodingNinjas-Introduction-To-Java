import java.util.Scanner;

public class FindPowerOfAnumber {
     
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int n = s.nextInt();
        s.close();
        
        long i = 1;
        while (n!=0){
            i*=x;
            n--;
        }
        System.out.println(i);
        
        
    }
}