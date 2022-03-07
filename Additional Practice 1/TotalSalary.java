
import java.util.Scanner;
import java.lang.Math;
public class TotalSalary {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int basic = s.nextInt();
        String str = s.next();
		char grade = str.charAt(0);
        double hra= 0.50*basic;
        double da= 0.20*basic;
        double pf= 0.11*basic;
        double allow, total;
        s.close();
            
        if(grade == 'A'){
            allow=1700;
            
        }else if(grade == 'B'){
            allow=1500;
            
        }else{
           allow=1300;
        }
       total = (basic+ hra + da + allow -pf);
        System.out.println(Math.round (total));
        

	}
}

