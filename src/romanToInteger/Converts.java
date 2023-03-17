package romanToInteger;

public class Converts {
    public int evaluation(char[] romans, char anteriorRoman, int i, int nrobase, int descuento) {

        char letterAnterior = ' ';
        int digit = 0;
        int j = 0;

        if (i == 0) {
            digit = nrobase;
        } else {
            j = i - 1;
            letterAnterior = romans[j];
            if (letterAnterior == anteriorRoman) {
                digit += nrobase - descuento;
            } else {
                digit = nrobase;
            }
        }
        return digit;
    }
}
