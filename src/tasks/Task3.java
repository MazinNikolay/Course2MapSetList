package tasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Task3 {
    private static List<String> stringList = new ArrayList<>(List.of("один", "два", "четыре", "три", "пять", "два", "шесть", "три"));

    public static void printNonRepetitiveWords() {
        for (String listIterator : stringList) {
            if (Collections.frequency(stringList, listIterator) == 1) {
                System.out.print(listIterator + " ");
            }
        }
    }
}
