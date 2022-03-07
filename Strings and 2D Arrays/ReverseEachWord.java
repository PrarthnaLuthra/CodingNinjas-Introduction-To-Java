public class ReverseEachWord {
    public static String reverseEachWord(String str) {
        // String output="";
        // int prev=0;
        // for(int i=0;i<str.length();i++){
        // if(str.charAt(i)==' '){
        // for(int j=i-1;j>=prev;j--){
        // output = output + str.charAt(j);
        // }
        // output = output + " ";
        // prev = i+1;
        // }
        // }

        // String lastWord="";
        // int k=str.length()-1;
        // while(str.charAt(k)!=' '){
        // lastWord = lastWord + str.charAt(k--);
        // }

        // return output+lastWord;

        // }
        // }
        String reverseWord = "", result = "";
        int start = 0, j, end;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                end = i - 1;
                reverseWord = "";
                for (j = end; j >= start; j--) {
                    reverseWord += str.charAt(j);
                }
                start = i + 1;
                result = result + reverseWord + " ";
            }
        }
        reverseWord = "";
        for (j = str.length() - 1; j >= start; j--) {
            reverseWord += str.charAt(j);
        }
        result = result + reverseWord + " ";
        return result;
    }
}