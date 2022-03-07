public class MinimumLengthWord {
    
	public static String minLengthWord(String input){
		int spaceIndex=0;
		int startIndex=0;
		int endIndex=0;
		int min=Integer.MAX_VALUE;
        int n = input.length();
		for(int i=0;i<=n;i++) {
			
			if(i==n || input.charAt(i)==' ' ) {
				int length= i-spaceIndex;
				if(min > length) {
					min=length;
					startIndex=spaceIndex;
					endIndex=i;
				}
				spaceIndex=i+1;
			}
			
			
		}
		return input.substring(startIndex,endIndex);
		

	}
}