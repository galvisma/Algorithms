package Parentheses;

public class Main {
    public static void main(String[] args) {

        String elements = "[}";
        // String elements = "()";
        // String elements = "[{()}]";
        Solution answer = new Solution();
        boolean result = answer.isValid(elements);
        System.out.println("The result is: " + result);
    }
}
