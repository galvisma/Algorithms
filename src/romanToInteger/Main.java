package romanToInteger;

public class Main {
    public static void main(String[] args) {

        String s = "MMMCMXCIX";
        Solution intNumber = new Solution();
        int number = intNumber.romanToInt(s);
        System.out.println("numero romano: " + s + " igual a:  " + number);
    }
}
