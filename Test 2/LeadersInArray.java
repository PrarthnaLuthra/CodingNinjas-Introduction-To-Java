public class LeadersInArray {
    public static void leaders(int[] input) {
        int n = input.length;

        for (int i = 0; i < n; i++) {
            int j;
            for (j = i + 1; j < n; j++) {
                if (input[i] < input[j])
                    break;
            }
            if (j == n) {
                System.out.print(input[i] + " ");
            }
        }

    }
}