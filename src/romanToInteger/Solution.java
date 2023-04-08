package romanToInteger;

public class Solution {
    public int romanToInt(String letters) {

        char[] romans = letters.toCharArray();
        int number = 0;
        int j = 0;
        char beforeRoman = ' ';
        int letterValue = 0;
        int discount = 0;

        for (int i = 0; i < romans.length; i++) {
            System.out.println(romans[i]);
            String character = String.valueOf(romans[i]);

            switch (character) {
                case "I":
                    number = number + 1;
                    break;

                case "V":
                    letterValue = 5;
                    discount = 2;
                    beforeRoman = 'I';
                    Converts valueLetterV = new Converts();
                    int finalValueLetterV = valueLetterV.evaluation(romans, beforeRoman, i, letterValue, discount);
                    number = number + finalValueLetterV;
                    break;


                case "X":
                    letterValue = 10;
                    discount = 2;
                    beforeRoman = 'I';
                    Converts valueLetterX = new Converts();
                    int finalValueLetterX = valueLetterX.evaluation(romans, beforeRoman, i, letterValue, discount);
                    number = number + finalValueLetterX;
                    break;

                case "L":
                    letterValue = 50;
                    discount = 20;
                    beforeRoman = 'X';
                    Converts valueLetterL = new Converts();
                    int finalValueLetterL = valueLetterL.evaluation(romans, beforeRoman, i, letterValue, discount);
                    number = number + finalValueLetterL;
                    break;

                case "C":
                    letterValue = 100;
                    discount = 20;
                    beforeRoman = 'X';
                    Converts valueLetterC = new Converts();
                    int finalValueLetterC = valueLetterC.evaluation(romans, beforeRoman, i, letterValue, discount);
                    number = number + finalValueLetterC;
                    break;

                case "D":
                    letterValue = 500;
                    discount = 200;
                    beforeRoman = 'C';
                    Converts valueLetterD = new Converts();
                    int finalValueLetterD = valueLetterD.evaluation(romans, beforeRoman, i, letterValue, discount);
                    number = number + finalValueLetterD;
                    break;

                case "M":
                    letterValue = 1000;
                    discount = 200;
                    beforeRoman = 'C';
                    Converts valueLetterM = new Converts();
                    int finalValueLetterM = valueLetterM.evaluation(romans, beforeRoman, i, letterValue, discount);
                    number = number + finalValueLetterM;
                    break;
            }
        }
        return number;
    }
}
