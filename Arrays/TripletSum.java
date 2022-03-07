public class TripletSum {
    public static int findTriplet(int[] arr, int x) {
    	int n = arr.length;
        int i =0;
        int count = 0;
       
       
            for(i = 0; i<n;i++){
                for(int j=i+1; j<n;j++){
                    for(int k = j+1; k<n;k++){
                    if(arr[i]+arr[j]+arr[k]==x){
                        count++;
                    }
                }
            }
        

        }return count;
    }
}    