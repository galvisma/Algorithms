package parentheses;

import java.util.Stack;

public class Solution {
    public boolean isValid(String parentheses) {

        char[] arrayParentheses = parentheses.toCharArray();
        Stack<Character> stack = new Stack<>();
        boolean areValidParentheses = true;
        for (int i = 0; i < arrayParentheses.length; i++) {
            char character = arrayParentheses[i];
            boolean isOpencharacter = character == '[' || character == '{' || character == '(';

            if (isOpencharacter) {
                stack.push(character);
                System.out.println("stack: " + stack);
            } else {
                switch (character) {
                    case ')':
                        areValidParentheses = areParenthesesBalanced(stack, '(');
                        break;
                    case '}':
                        areValidParentheses = areParenthesesBalanced(stack, '{');
                        break;
                    case ']':
                        areValidParentheses = areParenthesesBalanced(stack, '[');
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + character);
                }
            }
        }
        return areValidParentheses;
    }

    private boolean areParenthesesBalanced(Stack<Character> stack, char openCharacter) {
        boolean isCloseParenthesesCorrect = true;
        if (stack.isEmpty() || stack.pop() != openCharacter) {
            isCloseParenthesesCorrect = false;
        }
        return isCloseParenthesesCorrect;
    }
}


