package romanToInteger;

public class Solution {
    public int romanToInt(String s) {

        char[] romans = s.toCharArray();
        int number = 0;
        int j = 0;
        char anteriorRoman = ' ';

        for (int i = 0; i < romans.length; i++) {
            System.out.println(romans[i]);
            String character = String.valueOf(romans[i]);

            switch (character) {
                case "I":
                    number = number + 1;
                    break;

                case "V":
                    if (i == 0) {
                        number += 5;
                        break;
                    } else {
                        j = i - 1;
                        anteriorRoman = romans[j];
                        if (anteriorRoman == 'I') {
                            number += 5 - 2;
                            break;
                        } else {
                            number += 5;
                            break;
                        }
                    }

                case "X":
                    if (i == 0) {
                        number += 10;
                        break;
                    } else {
                        j = i - 1;
                        anteriorRoman = romans[j];
                        if (anteriorRoman == 'I') {
                            number += 10 - 2;
                            break;
                        } else {
                            number += 10;
                            break;
                        }
                    }

                case "L":
                    if (i == 0) {
                        number += 50;
                        break;
                    } else {
                        j = i - 1;
                        anteriorRoman = romans[j];
                        if (anteriorRoman == 'X') {
                            number += 50 - 20;
                            break;
                        } else {
                            number += 50;
                            break;
                        }
                    }

                case "C":
                    if (i == 0) {
                        number += 100;
                        break;
                    } else {
                        j = i - 1;
                        anteriorRoman = romans[j];
                        if (anteriorRoman == 'X') {
                            number += 100 - 20;
                            break;
                        } else {
                            number += 100;
                            break;
                        }
                    }

                case "D":
                    if (i == 0) {
                        number += 500;
                        break;
                    } else {
                        j = i - 1;
                        anteriorRoman = romans[j];
                        if (anteriorRoman == 'C') {
                            number += 500 - 200;
                            break;
                        } else {
                            number += 500;
                            break;
                        }
                    }

                case "M":
                    if (i == 0) {
                        number += 1000;
                        break;
                    } else {
                        j = i - 1;
                        anteriorRoman = romans[j];
                        if (anteriorRoman == 'C') {
                            number += 1000 - 200;
                            break;
                        } else {
                            number += 1000;
                            break;
                        }
                    }
            }
        }
        return number;
    }
}
