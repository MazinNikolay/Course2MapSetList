package tasks;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    private static final List<Integer> numsList = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));

    public static void printOddNums() {
        for (Integer numsIterator : numsList) {
            if (numsIterator % 2 != 0) {
                System.out.print(numsIterator + " ");
            }
        }
    }
}
