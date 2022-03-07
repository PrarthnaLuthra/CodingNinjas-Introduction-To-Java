import java.util.Scanner;

public class ParallelogramPattern {
    
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i =1;
        s.close();
        while(i<=n){
            
            int j =1;
        //     while(j<=n){
        //         System.out.print("*");
        //         j++;
            
            
            while(j<=i-1){
                // int space =1;
                System.out.print(" ");
                // spai++;
                j++;
            }j=1;
            while(j<=n){
                System.out.print("*");
                j++;
             }
                System.out.println();
                i++;
        }
	}
}
