public class CodeBinarySearch {
    
    public static int binarySearch(int[] arr, int x) {
    	int n = arr.length;
        int start = 0;
        int end= n-1;
        int k =0;
        int mid = (start+end)/2;
        while(start<=end){
            if(arr[mid]<x){
                start= mid +1;
            }else if(arr[mid]==x){
                k = mid;
                break;
            }else{
                end=mid-1;
            }
            mid = (start+end)/2;
        }
        if(start>end){
            return -1;
        }return k;
            
    }

}