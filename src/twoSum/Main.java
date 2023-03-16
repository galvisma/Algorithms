package twoSum;

public class Main {

    /* Given an array of integers nums and an integer target.
    Return indices of the two numbers such that they add up to target.
    You may assume that each input would have exactly one solution,
    and you may not use the same element twice.
    You can return the answer in any order.
    */

    public static void main(String[] args) {
        int[] array = {1, 2, 7, 6, 5};
        int target = 9;

        Solution numbers = new Solution();
        int[] index = numbers.findTarget(array,target);
        System.out.println("Los indices son: " + index[0] + " , " + index[1]);
    }

}
