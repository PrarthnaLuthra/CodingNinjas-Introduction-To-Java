public class HighestOccuringCharacter {
    
	public static char highestOccuringChar(String str) {
        int n = str.length();
		 int arr[]=new int[256];
        for(int i=0;i<n;i++){
			arr[str.charAt(i)]=arr[str.charAt(i)]+1;
        }
        
        int largest=Integer.MIN_VALUE;
        char ans='0';
        for(int j=0;j<n;j++){
            int temp=arr[str.charAt(j)];
            if(temp>largest){
                largest=temp;
                ans=str.charAt(j);
            }
            
        }
        return ans;
	}
}