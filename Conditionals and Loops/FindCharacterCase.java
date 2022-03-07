
import java.util.Scanner;
public class FindCharacterCase {
   
    
    public static void main(String[] args) {
        
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		char c = str.charAt(0);
		if('A'<=c && 'Z'>=c) {
			System.out.println("1");
		}else if('a'<=c && 'z'>=c) {
			System.out.println("0");
		}else {
		
			System.out.println("-1");
            s.close();

	}
    }
}