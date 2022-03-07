public class CheckPermutation {
    public static boolean isPermutation(String str1, String str2) {
        int l1 = str1.length();
        int l2 = str2.length();

        int[] freq = new int[255];

        if (l1 != l2) {
            return false;
        }

        if (l1 == l2) {
            for (int i = 0; i < l1; i++) {
                int var = (int) str1.charAt(i);
                freq[var]++;
                // System.out.println(var);

            }

            for (int j = 0; j < l2; j++) {
                int var = (int) str2.charAt(j);

                if (freq[var] != 0) {
                    freq[var]--;
                } else {
                    return false;
                }

            }
        }

        return true;

    }

}