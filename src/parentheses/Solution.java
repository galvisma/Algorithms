package parentheses;

import java.util.Stack;

public class Solution {
    public boolean isValid(String parentheses) {

        char[] arrayParentheses = parentheses.toCharArray();
        Stack<Character> stack = new Stack<>();
        boolean allOk = true;
        for (int i = 0; i < arrayParentheses.length; i++) {
            char character = arrayParentheses[i];
            boolean isOpencharacter = character == '[' || character == '{' || character == '(';

            if (isOpencharacter) {
                stack.push(character);
                System.out.println("stack: " + stack);
            } else {
                switch (character) {
                    case ')':
                        allOk = checkCloseParentheses(stack, '(');
                        break;
                    case '}':
                        allOk = checkCloseParentheses(stack, '{');
                        break;
                    case ']':
                        allOk = checkCloseParentheses(stack, '[');
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + arrayParentheses[i]);
                }
            }
        }
        return allOk;
    }

    private boolean checkCloseParentheses(Stack<Character> stack, char openCharacter) {
        boolean bug = true;
        if (stack.isEmpty()) {
            bug = false;
        } else {
            if (stack.pop() != openCharacter) {
                bug = false;
            }
        }
        return bug;
    }
}


