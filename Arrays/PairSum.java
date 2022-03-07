public class PairSum {
    public static int pairSum(int arr[], int x) {
        int n = arr.length;
        int i = 0;
        int count = 0;

        for (i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == x) {
                    count++;
                }
            }
        }
        return count;

    }
}
