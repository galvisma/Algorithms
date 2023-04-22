package duplicateNumbersInPlace;

public class Main {
    public static void main(String[] args) {

        // The goal of this program is:
        // from an array of integers, return the total number of unique elements in the array.

        int[] duplicateNumbers = {0, 0, 0, 1, 1, 1, 2, 2, 3, 3};
        Solution answer = new Solution();
        int uniqueNumbers = answer.removeDuplicates(duplicateNumbers);
        System.out.println("the unique numbers are: " + uniqueNumbers);
        for (int i = 0; i < uniqueNumbers; i++) {
            System.out.print(duplicateNumbers[i] + " ");
        }
    }
}

