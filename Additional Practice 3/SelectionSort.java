public class SelectionSort {  

    public static void selectionSort(int[] arr) {
        int i = 0;
        int j = 0;
        for(i=0;i<arr.length-1;i++){
            int min = arr[i];
            int min_index= i;
            for(j=i+1;j<arr.length;j++){
                if(arr[j]<min){
                    min= arr[j];
                    min_index=j;
                }
            }if(min_index!=i){
                arr [min_index] = arr[i];
                arr[i]=min;
            }
            }
    }   

}