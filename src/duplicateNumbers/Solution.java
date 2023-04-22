package duplicateNumbers;

import java.util.*;

public class Solution {

    public int removeDuplicates(Integer[] duplicateNumbers) {

        ArrayList<Integer> duplicateList = new ArrayList<>(duplicateNumbers.length);
        for (int i : duplicateNumbers) {
            duplicateList.add(i);
            System.out.println("duplicates: " + duplicateList);
        }

        boolean firstTime = true;
        int previousNumber = 0;
        ListIterator iterator = duplicateList.listIterator();
        while (iterator.hasNext()) {
            int pointer = (int) iterator.next();
            if (firstTime) {
                previousNumber = duplicateList.get(pointer);
                firstTime = false;
            } else {
                int currentNumber = duplicateList.get(pointer);
                if (currentNumber == previousNumber) {
                    iterator.remove();
                } else {
                    previousNumber = (int) duplicateList.get(pointer);
                }
            }
        }
        return duplicateList.size();
    }
}
