import java.util.*;
public class TriangleOfNumbers {
    public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
        int n = s.nextInt();
        int i=1;
        
        while(i<=n){
            int spaces = 1;
            while(spaces<=n-i){
                System.out.print(" ");
                spaces++;
            }int j=1;
            int temp = i;
            while(j<=i){
                System.out.print(temp);
                temp++;
                j++;
            }temp = 2*i-2;
            j =1;
            while(j<=i-1){
                System.out.print(temp);
                temp--;
                j++;
            
            
    
            }
            System.out.println();
            i++;
        }
        s.close();
	}
}
