public class SecondLargestInArray {
    public static int secondLargestElement(int[] arr) {
        int n = arr.length;
        int largest = Integer.MIN_VALUE;
        int slargest =Integer.MIN_VALUE;
        for(int i = 0; i<n; i++){
            if(arr[i]>largest){
                slargest= largest;
                largest = arr[i];
            }if(arr[i]!=largest &&arr[i]>slargest ){
                slargest= arr[i];
            }
        }return slargest;
    }
}

