package romanToInteger;

public class Converts {
    public int evaluation(char[] romans, char beforeRoman, int i, int letterValue, int descuento) {

        char previousLetter = ' ';
        int digit = 0;
        int j = 0;

        if (i == 0) {
            digit = letterValue;
        } else {
            j = i - 1;
            previousLetter = romans[j];
            if (previousLetter == beforeRoman) {
                digit += letterValue - descuento;
            } else {
                digit = letterValue;
            }
        }
        return digit;
    }
}
