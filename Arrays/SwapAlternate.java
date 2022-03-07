public class SwapAlternate {
    public static void swapAlternate(int arr[]) {
        int n = arr.length;
        if (n % 2 == 0) {
            for (int i = 0; i < n; i += 2) {

                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        } else {
            for (int i = 0; i < n - 1; i += 2) {

                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
    }
}