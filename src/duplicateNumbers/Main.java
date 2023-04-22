package duplicateNumbers;

public class Main {

    public static void main(String[] args) {

        // The goal of this program is:
        // from an array of integers, return the total number of unique elements in the array.

        Integer[] duplicateNumbers = {0,0,1,1,1,2,2,3,3,4};
        Solution answer = new Solution();
        int uniqueNumbers = answer.removeDuplicates(duplicateNumbers);
        System.out.println("the unique numbers are: " + uniqueNumbers);
    }
}
