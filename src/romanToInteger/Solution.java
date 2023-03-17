package romanToInteger;

public class Solution {
    public int romanToInt(String s) {

        char[] romans = s.toCharArray();
        int number = 0;
        int j = 0;
        char anteriorRoman = ' ';
        int nrobase = 0;
        int descuento = 0;

        for (int i = 0; i < romans.length; i++) {
            System.out.println(romans[i]);
            String character = String.valueOf(romans[i]);

            switch (character) {
                case "I":
                    number = number + 1;
                    break;

                case "V":
                    nrobase = 5;
                    descuento = 2;
                    anteriorRoman = 'I';
                    Converts valueV = new Converts();
                    int digitV = valueV.evaluation(romans, anteriorRoman, i, nrobase, descuento);
                    number = number + digitV;
                    break;


                case "X":
                    nrobase = 10;
                    descuento = 2;
                    anteriorRoman = 'I';
                    Converts valueX = new Converts();
                    int digitX = valueX.evaluation(romans, anteriorRoman, i, nrobase, descuento);
                    number = number + digitX;
                    break;

                case "L":
                    nrobase = 50;
                    descuento = 20;
                    anteriorRoman = 'X';
                    Converts valueL = new Converts();
                    int digitL = valueL.evaluation(romans, anteriorRoman, i, nrobase, descuento);
                    number = number + digitL;
                    break;

                case "C":
                    nrobase = 100;
                    descuento = 20;
                    anteriorRoman = 'X';
                    Converts valueC = new Converts();
                    int digitC = valueC.evaluation(romans, anteriorRoman, i, nrobase, descuento);
                    number = number + digitC;
                    break;

                case "D":
                    nrobase = 500;
                    descuento = 200;
                    anteriorRoman = 'C';
                    Converts valueD = new Converts();
                    int digitD = valueD.evaluation(romans, anteriorRoman, i, nrobase, descuento);
                    number = number + digitD;
                    break;

                case "M":
                    nrobase = 1000;
                    descuento = 200;
                    anteriorRoman = 'C';
                    Converts valueM = new Converts();
                    int digitM = valueM.evaluation(romans, anteriorRoman, i, nrobase, descuento);
                    number = number + digitM;
                    break;
            }
        }
        return number;
    }
}
