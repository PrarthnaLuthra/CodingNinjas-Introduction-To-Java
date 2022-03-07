import java.util.Scanner;

public class CheckNumberSequence {
    public static void main(String[] args) {
		// Write your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int prev=sc.nextInt(); // 9 8 4 5 6
        int count=2,current;
        boolean isDec=true;
        sc.close();
        while(count<=n){
            current=sc.nextInt();
            count++;
            if(current==prev){
                System.out.println(false);
                return;
            }
            if(current<prev){
                if(isDec==false){
                    System.out.println(false);
                    return;
                }
            }
            
            else{
                if(isDec==true){
                    isDec=false;
                }
            }
            prev=current;
        }
        System.out.println(true);
	}
}