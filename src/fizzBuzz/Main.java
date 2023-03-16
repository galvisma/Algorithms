package fizzBuzz;

import java.util.List;

public class Main {

    /*
    Given an integer n, return a string array answer (1-indexed) where:
    answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
    answer[i] == "Fizz" if i is divisible by 3.
    answer[i] == "Buzz" if i is divisible by 5.
    answer[i] == i (as a string) if none of the above conditions are true.
    */
    public static void main(String[] args) {
        int number = 15;

        Solution array = new Solution();
        List<String> answer = array.fizzBuzz(number);
        for (String numbers : answer) {
            System.out.println(numbers);
        }
    }
}
