public class Sort01 {
    public static void sortZeroesAndOne(int[] arr) {
        int n = arr.length;
        int j = 0;
        for (int i = 0; i < n; i++) {
            // for(int j=i+1;j<n;j++){
            if (arr[i] == 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
            // }
        }
    }
}