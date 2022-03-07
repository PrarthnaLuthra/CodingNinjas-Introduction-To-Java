import java.util.Scanner;

public class SumPattern {
    
	public static void main(String[] args) {
		// Write your code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.close();
        for ( int i = 0; i< n; i++ ) {
            int sum=0;
            int count = 1;
            for ( int j = 0; j < 2*i+1; j ++ ) {
                
                if( j%2==0){
                    System.out.print(count);
                    sum += count;
                    count++;
                }else  System.out.print("+");
				
            }
            System.out.print("=" + sum);
            System.out.println();
        }
	}
}
