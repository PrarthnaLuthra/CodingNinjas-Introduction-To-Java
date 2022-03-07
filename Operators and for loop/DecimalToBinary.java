import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.close();
        long   binary =0;
        long  i=1;
        long  r=1;

        while(n!=0){

             r=n%2;
            // int q=n/2;

            
            binary+= r*i;
            i*=10;
          n=n/2;


        }System.out.println(binary);
    }
}
