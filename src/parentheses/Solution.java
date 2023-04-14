package parentheses;

import java.util.Stack;

public class Solution {
    public boolean isValid(String parentheses) {

        char[] arrayParentheses = parentheses.toCharArray();            // O(parentheses)
                                                                        // time          Space
        Stack<Character> stack = new Stack<>(); // O(1)
        boolean result = true;
        for (int i = 0; i < arrayParentheses.length; i++) {            // O(arrayParentheses.length);  O(1)
            char character = arrayParentheses[i];                      // O(1);         O(1)

            if (character == '[' ||                                    // O(1)         O(0)
                    character == '{' ||
                    character == '(') {
                stack.push(character);                                  // O(1)         O(1)
                System.out.println("stack: " + stack);
            } else {
                Evaluation answer = new Evaluation();
                result = answer.checkNextParentheses(stack, character, i);
                if (stack.isEmpty() && !result) {                                     // O(1)     O(0)
                    break;
                }
            }
        }
        return result;
    }
}




