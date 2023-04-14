package parentheses;

import java.util.Stack;

public class Evaluation {

    public boolean checkNextParentheses(Stack<Character> stack, char character, int i) {
        boolean allOk = true;
        switch (character) {                                        // O(1)
            case ')':                                               // O(1)
                if (stack.isEmpty()) {                               // O(1)     O(0)
                    allOk = false;                                      // O(1)
                } else {
                    char openCharacter = '(';                       // O(1)
                    if (stack.pop() != openCharacter) {              // O(1)     O(1)
                        allOk = false;                                  // O(1)
                    }
                    System.out.println("stack: " + i + " " + stack);
                }
                break;

            case '}':
                if (stack.isEmpty()) {                                   // O(1)         O(0)
                    allOk = false;
                } else {
                    char openCharacter = '{';
                    if (stack.pop() != openCharacter) {                  // O(1)         O(1)
                        allOk = false;
                    }
                    System.out.println("stack: " + i + " " + stack);
                }
                break;

            case ']':
                if (stack.isEmpty()) {                                   // O(1)     O(0)
                    allOk = false;
                } else {
                    char openCharacter = '[';
                    if (stack.pop() != openCharacter) {                  // O(1)     O(1)
                        allOk = false;
                    }
                    System.out.println("stack: " + i + " " + stack);
                }
                break;
            default:
        }
        return allOk;
    }
}


