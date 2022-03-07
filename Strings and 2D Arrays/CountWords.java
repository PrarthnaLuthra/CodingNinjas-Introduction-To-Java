public class CountWords {
    
	public static int countWords(String str) {	
		int count=1;
		int n=str.length();
        if(str==""){
            return 0;
        }
        for(int i=0;i<n;i++){
            if(str.charAt(i)==' ')
                count++;  
            
        }
        return count;
	}

}