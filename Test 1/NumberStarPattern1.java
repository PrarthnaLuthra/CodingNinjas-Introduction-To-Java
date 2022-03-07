import java.util.Scanner;

public class NumberStarPattern1 {
   
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i =1;
        s.close();
        while(i<=n){
            int j =n;
            
            while(j>=1){
                if(j!=i){
                System.out.print(j);
                }else{
                   System.out.print("*"); 
                }
                j--;
                
                
            }
            
            System.out.println();
            i++;
        }

	}
}
