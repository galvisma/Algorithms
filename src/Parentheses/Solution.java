package Parentheses;

import java.util.Stack;

public class Solution {

    public boolean isValid(String parentheses) {

        char[] arrayParentheses = parentheses.toCharArray();            // O(parentheses)
        int allOk = 0; // O(1)
        // time          Space
        Stack<Character> pila = new Stack<>(); // O(1)
        for (int i = 0; i < arrayParentheses.length; i++) {            // O(arrayParentheseslength);  O(1)
            char character = arrayParentheses[i];                      // O(1);         O(1)

            if (character == '[' ||                                     // O(1)         O(0)
                    character == '{' ||
                    character == '(') {
                pila.push(character);                                   // O(1)         O(1)
                System.out.println("pila: " + pila);
            } else {

                switch (character) {  // O(1)
                    case ')':         // O(1)
                        if (pila.isEmpty()) {                               // O(1)     O(0)
                            allOk = 1;  // O(1)
                        } else {
                            char openCharacter = '(';     // O(1)
                            if (pila.pop() != openCharacter) {              // O(1)     O(1)
                                allOk = 1; // O(1)
                            }
                            System.out.println("pila: " + i + " " + pila);
                        }
                        break;

                    case '}':
                        if (pila.isEmpty()) {                               // O(1)         O(0)
                            allOk = 1;
                        } else {
                            char openCharacter = '{';
                            if (pila.pop() != openCharacter) {              // O(1)         O(1)
                                allOk = 1;
                            }
                            System.out.println("pila: " + i + " " + pila);
                        }
                        break;

                    case ']':
                        if (pila.isEmpty()) {                                   // O(1)     O(0)
                            allOk = 1;
                        } else {
                            char openCharacter = '[';
                            if (pila.pop() != openCharacter) {                  // O(1)     O(1)
                                allOk = 1;
                            }
                            System.out.println("pila: " + i + " " + pila);
                        }
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + arrayParentheses[i]);
                }
            }
        }
        if (pila.isEmpty() && allOk == 0) {                                     // O(1)     O(0)
            return true;
        } else {
            return false;
        }
    }
}

