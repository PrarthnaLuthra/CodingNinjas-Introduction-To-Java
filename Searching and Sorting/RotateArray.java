public class RotateArray {

    public static void rotate(int[] arr, int d) {
        // int j,i ;
        // for (i = 0; i < d; i++) {
        // int temp = arr[0];
        // for(j =0;j<arr.length-1;j++){
        // arr[j]=arr[j+1];
        // }arr[arr.length-1]= temp;

        // }
        int n = arr.length;
        int temp[] = new int[d];
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }
        for (int i = 0; i < arr.length - d; i++) {
            arr[i] = arr[i + d];
        }
        for (int i = 0; i < d; i++) {
            arr[i + n - d] = temp[i];
        }

    }

}
