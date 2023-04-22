package duplicateNumbersInPlace;

public class Solution {

    public int removeDuplicates(int[] duplicateNumbers) {

        int sizeDuplicateNumbers = duplicateNumbers.length;
        int j = 1;
        for (int i = 0; i < sizeDuplicateNumbers - 1; i++) {
            if (duplicateNumbers[i] != duplicateNumbers[i + 1]) {
                duplicateNumbers[j] = duplicateNumbers[i+1];
                j++;
            }
        }
        return j;
    }
}





