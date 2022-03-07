import java.util.*;
public class FindDuplicate {
    
    public static int duplicateNumber(int arr[]) {
        int n = arr.length;
        int k = 0;
        Arrays.sort(arr);
        int i =0;
        if(n%2==0){
        while (i<n){
        
            if(arr[i]==arr[i+1]){
                k = i;
            }
            i+=2;
        }}else{
            while (i<n-2){
        
            if(arr[i]==arr[i+1]){
                k = i;
            }
            i+=1;
        }
        }return k;
    
    }
}