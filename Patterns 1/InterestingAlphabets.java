import java.util.Scanner;
public class InterestingAlphabets {
    

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
        int n= s.nextInt();
        int i=n;
       
        while(i>=1){
            int j=i;
           
            while(j<=n){
                
                System.out.print((char)('A'+j-1));
                
                j++;
            }System.out.println();
                i--;
        }
        s.close();
    }

}
