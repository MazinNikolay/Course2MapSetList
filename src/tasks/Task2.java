package tasks;

import java.util.*;

public class Task2 {
    private final static List<Integer> numsList = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 12, 7, 10, 22, 14, 6));

    public static void printEvenSortedNums() {
        Set<Integer> numsSet = new HashSet<>(numsList);
        numsList.clear();
        numsList.addAll(numsSet);
        Collections.sort(numsList);
        for (Integer numsIterator : numsList) {
            if (numsIterator % 2 == 0) {
                System.out.print(numsIterator + " ");
            }
        }
    }
}
