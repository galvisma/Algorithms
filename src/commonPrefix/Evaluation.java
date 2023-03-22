package commonPrefix;

public class Evaluation {
    public int evaluationEachWord(String[] strs, char letter, int j) {

        int error = 0;
        for (int i = 0; i < strs.length; i++) {
            String word = strs[i];
            System.out.println("contenido de word: " + word);
            char[] letters = word.toCharArray();
            if (letters[j] != letter) {
                System.out.println("valor de j:" + j + "  letters[j]: " + letters[j] + "  valor de letter:  " + letter);
                error = 1;
                break;
            }
        }
        return error;
    }
}
