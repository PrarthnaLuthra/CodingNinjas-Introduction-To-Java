public class RemoveConsecutiveDuplicates {
    
	public static String removeConsecutiveDuplicates(String str) {
		int n = str.length();
        
        String output="";
		output=output+str.charAt(0);
		for(int i=1;i<n;i++) {
			if(str.charAt(i)!=output.charAt(output.length()-1)) {
				output=output+str.charAt(i);
			}
		}
		return output;
        
	}
}