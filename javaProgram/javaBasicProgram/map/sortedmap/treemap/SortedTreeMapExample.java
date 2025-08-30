package map.sortedmap.treemap;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class SortedTreeMapExample
{
    public static void main(String[] args) {

        // --- Example 1: Default natural ordering (for Integer keys) ---
        System.out.println("--- TreeMap with default natural ordering ---");
        TreeMap<Integer, String> defaultSortedMap = new TreeMap<>();

        defaultSortedMap.put(5, "Apple");
        defaultSortedMap.put(2, "Banana");
        defaultSortedMap.put(8, "Orange");
        defaultSortedMap.put(1, "Grape");

        System.out.println("Entries in defaultSortedMap (sorted by key):");
        for (Map.Entry<Integer, String> entry : defaultSortedMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        System.out.println("\nFirst key: " + defaultSortedMap.firstKey());
        System.out.println("Last key: " + defaultSortedMap.lastKey());

        // --- Example 2: Custom sorting with a Comparator (for String keys, reverse order) ---
        System.out.println("\n--- TreeMap with custom Comparator (reverse order) ---");
        TreeMap<String, Integer> customSortedMap = new TreeMap<>(Comparator.reverseOrder());

        customSortedMap.put("Apple", 1);
        customSortedMap.put("Banana", 2);
        customSortedMap.put("Orange", 3);
        customSortedMap.put("Grape", 4);

        System.out.println("Entries in customSortedMap (sorted by key in reverse order):");
        for (Map.Entry<String, Integer> entry : customSortedMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
