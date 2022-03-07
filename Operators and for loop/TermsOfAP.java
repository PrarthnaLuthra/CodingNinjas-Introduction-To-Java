import java.util.Scanner;

public class TermsOfAP {
    public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int count =1;
        s.close();
        for(int i =1; count<=n;i++){
            int a = (3*i+2);
            if(a%4 !=0){
               
                System.out.print(a + " ");
                count++;
            }
        }
        

	}
}
