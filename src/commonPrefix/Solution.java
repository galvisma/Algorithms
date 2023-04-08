package commonPrefix;

import java.util.Arrays;

public class Solution<ArrayList> {
    public String longestCommonPrefix(String[] strs) {

        StringBuilder commonPrefix = new StringBuilder();
        Arrays.sort(strs);
        int size = strs.length;

        // get the first and the last strings
        char[] first = strs[0].toCharArray();
        char[] last = strs[size - 1].toCharArray();

        // start comparing
        for (int i = 0; i < first.length; i++) {
            if (first[i] != last[i]) {
                break;
            } else {
                commonPrefix.append(first[i]);
            }
        }
        return commonPrefix.toString();
    }
}
