public class ReverseStringWordWise {
    public static String reverseWordWise(String input) {
		String output = "";
        int n = input.length();
        
        for(int i = n-1; i>=0;i--){
            if (i==0){
                output = output+input.substring(0,n);
            }
            
            else if(input.charAt(i)== ' '){
                output = output+input.substring(i+1,n)+" ";
                n= i;
            }
        }
        
        return output;

	}
}
