package Parentheses;

import java.util.Stack;

public class Solution {

    public boolean isValid(String parentheses) {

        char[] arrayParentheses = parentheses.toCharArray();
        int allOk = 0;

        Stack<Character> pila = new Stack<>();
        for (int i = 0; i < arrayParentheses.length; i++) {
            char character = arrayParentheses[i];

            if (character == '[' ||
                    character == '{' ||
                    character == '(') {
                pila.push(character);
                System.out.println("pila: " + pila);
            } else {

                switch (character) {
                    case ')':
                        if (pila.isEmpty()) {
                            allOk = 1;
                        } else {
                            char openCharacter = '(';
                            if (pila.pop() != openCharacter) {
                                allOk = 1;
                            }
                            System.out.println("pila: " + i + " " + pila);
                        }
                        break;

                    case '}':
                        if (pila.isEmpty()) {
                            allOk = 1;
                        } else {
                            char openCharacter = '{';
                            if (pila.pop() != openCharacter) {
                                allOk = 1;
                            }
                            System.out.println("pila: " + i + " " + pila);
                        }
                        break;

                    case ']':
                        if (pila.isEmpty()) {
                            allOk = 1;
                        } else {
                            char openCharacter = '[';
                            if (pila.pop() != openCharacter) {
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
        if (pila.isEmpty() && allOk == 0) {
            return true;
        } else {
            return false;
        }
    }
}
