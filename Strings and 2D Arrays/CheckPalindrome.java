public class CheckPalindrome {
    public static boolean isPalindrome(String str) {
		int n = str.length();
        
        int i = 0;
        int j = n-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }i++;
            j--;
        }return true;
	}

}
