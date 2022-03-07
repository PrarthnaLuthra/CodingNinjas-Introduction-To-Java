public class RemoveCharacter {
    
	public static String removeAllOccurrencesOfChar(String str, char ch) {
		int n = str.length();
        String x = "";
        for(int i = 0; i<n;i++){
            if(str.charAt(i)!=ch){
                x=x+str.charAt(i);
            }
        }
        return x;
	}

}