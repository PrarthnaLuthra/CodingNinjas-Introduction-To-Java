import java.util.*;
public class DaimondOfStars {
    
	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
        int n = s.nextInt();
        int i=1;
        int n1 =(n+1)/2;
        int n2= n/2;
        while(i<=n1){
            int space = 1;
            while(space<=(n1-i)){
                System.out.print(" ");
                space++;
            }int j = 1;
            while(j<=((2*i)-1)){
               
            	System.out.print("*");
            	j++;
            }System.out.println();
            i++;
            
        } i=n2;
        while(i>0){
            int space = 1;
            while(space<= n2-i+1){
                System.out.print(" ");
                space++;
            
        } int j = 1;
            while(j<=((2*i)-1)){
               
            	System.out.print("*");
            	j++;
            }System.out.println();
            i--;
        }
        
	s.close();	
	}
}
