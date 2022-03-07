public class PushZerosToEnd {
    
    public static void pushZerosAtEnd(int[] arr) {
    	int n = arr.length;
        // int m = n-1;
        int i = 0;
        int k =0;
        
        for(;i<n;){
            if(arr[i]!=0){
                int temp = arr[i];
                arr[i]=arr[k];
                arr[k]=temp;
                i++;
                k++;
            }else{
                i++;
            }
        }
    }

}