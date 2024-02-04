package tasks;

import java.util.*;

public class Task4 {
    private static List<String> strList = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три", "четыре", "пять", "один", "четыре"));

    public static void printRepetitionCount() {
        Set<String> uniqueStrSet = new HashSet<>(strList);
        for (String listIterator : uniqueStrSet) {
            System.out.print("Слово: \"" + listIterator + "\", количество повторений-" + Collections.frequency(strList, listIterator) + "; ");
        }
    }
}
