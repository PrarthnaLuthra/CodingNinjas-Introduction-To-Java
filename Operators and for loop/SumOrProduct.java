import java.util.*;
public class SumOrProduct {
    
    public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
        int c = s.nextInt();
        int i =1;
        s.close();
        
        int product= 1;
        int sum=0;
        for(i=1;i<=n;i++){
                sum=sum+i;
                product=product*i;
                }
        if(c==1){
            System.out.println(sum);
        }else if(c==2){
            System.out.println(product);
        }else{
            System.out.println("-1");
        }
       
        
        

	}

}
