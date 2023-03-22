package commonPrefix;

public class Main {
    public static void main(String[] args) {

        String[] strs = {"flower", "flight", "flights"};
        // String[] strs = {"dog", "racecar", "car"};
        // String[] strs = {"house","housekeeper","housewife", "car"};

        Solution longPrefix = new Solution();
        String commonPrefix = longPrefix.longestCommonPrefix(strs);
        System.out.println("The prefix is: " + commonPrefix);
    }
}
