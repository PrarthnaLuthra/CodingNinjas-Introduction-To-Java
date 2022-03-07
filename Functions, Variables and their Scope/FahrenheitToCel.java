import java.util.Scanner;

public class FahrenheitToCel {
    

	public static void printFahrenheitTable(int start, int end, int step) {
		int cel;
        while(start<=end){
            cel= (5*(start-32))/9;
            System.out.println(start+" "+cel);
            start=start+step;
            
		}}
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        int S= s.nextInt();
        int E= s.nextInt();
        int W= s.nextInt();
        printFahrenheitTable(S,E,W);
        s.close();
            
        
                
    }
		
}

