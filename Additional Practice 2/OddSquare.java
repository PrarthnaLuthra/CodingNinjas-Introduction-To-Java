import java.util.Scanner;

public class OddSquare {
    
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i =1;
        int k =1;
        s.close();
        
       
        while (i<=n){
            int val=k;
            int j=1;
            while(j<=(n-i+1)){
            
              System.out.print(val);
             val+=2;
                j++;
            }int temp=1;
            j=1;
            while(j<=i-1){
                System.out.print(temp);
             temp+=2;
                j++;
            }
           
            System.out.println();
            k+=2;
               i++;
    
           
            
        }
	}
}
