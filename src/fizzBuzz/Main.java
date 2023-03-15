package fizzBuzz;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        int number = 15;

        Solution array = new Solution();
        List<String> answer = array.fizzBuzz(number);
        for (String numbers : answer) {
            System.out.println(numbers);
        }
    }
}
