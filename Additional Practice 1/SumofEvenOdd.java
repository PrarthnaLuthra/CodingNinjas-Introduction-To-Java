import java.util.Scanner;

public class SumofEvenOdd {
    public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sum_even=0;
        int sum_odd=0;
        s.close();
        while(n!=0){
            int i = n%10;
            if(i%2==0){
                sum_even=(sum_even+i);
            }else{sum_odd=(sum_odd+i);}
            n=(int)(n/10);
            
        }System.out.println(sum_even + " " + sum_odd);
	}
}

