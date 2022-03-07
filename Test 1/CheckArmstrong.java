import java.util.Scanner;

public class CheckArmstrong {
    
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int  y, z, rem, power = 1, count = 0, digits = 0;
        int sum = 0;
        s.close();
        
      
        

        z = y = n;

        while (y != 0) {
            y /= 10;
            ++count;
        }

        digits = count;

        while (z != 0) {
            rem = z % 10;

            power = 1;
            while (count > 0) {
                power*= rem;
                --count;
            }
            count = digits;

            sum += power;
            z /= 10;
        }

       
        if ((int) sum == n) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}