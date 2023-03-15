package fizzBuzz;

import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<String> fizzBuzz(int numero) {
        String[] answer = new String[numero];

        int j = 1;
        for (int i = 0; i <= (numero - 1); i++) {
            int residueTres = j % 3;
            int residueCinco = j % 5;

            if ((residueTres != 0) && (residueCinco != 0)) {
                answer[i] = Integer.toString(j);
                j += 1;
            } else {
                if ((residueTres == 0) && (residueCinco == 0)) {
                    answer[i] = "FizzBuzz";
                    j += 1;
                } else {
                    if (residueTres == 0) {
                        answer[i] = "Fizz";
                        j += 1;
                    } else {
                        if (residueCinco == 0) {
                            answer[i] = "Buzz";
                            j += 1;
                        }
                    }
                }
            }
        }
        List<String> list = Arrays.asList(answer);
        return list;
    }
}
