package commonPrefix;

public class Solution {
    public String longestCommonPrefix(String[] strs) {

        int n = strs.length;
        System.out.println("valor de n: " + n);
        char[] prefix = new char[n];
        for (int i = 0; i < strs.length; i++) {
            String word = strs[i];
            char[] letters = word.toCharArray();
            prefix[i] = letters[i];
            System.out.println("valor de i: " + i + "  letters[i] " + letters[i] + "  prefix[i] " + prefix[i]);

            Evaluation words = new Evaluation();
            int answer = words.evaluationEachWord(strs, prefix[i], i);
            if (answer == 1) {
                prefix[i] = ' ';
                break;
            }
        }
        for (int i = 0; i < prefix.length; i++) {
            System.out.println("Prefix: " + i + "  es:  " + prefix[i]);
        }
        String commonPrefix = new String(prefix);
        commonPrefix.replaceAll("\\s{2,}", " ");
        return commonPrefix;
    }
}
