package map.hashmap.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        // Create a LinkedHashMap to store String keys and Integer values
        LinkedHashMap<String, Integer> studentScores = new LinkedHashMap<>();

        // Add elements to the LinkedHashMap
        studentScores.put("Alice", 95);
        studentScores.put("Bob", 88);
        studentScores.put("Charlie", 72);
        studentScores.put("David", 91);

        System.out.println("LinkedHashMap elements (insertion order preserved):");
        // Iterate over the LinkedHashMap using entrySet()
        for (Map.Entry<String, Integer> entry : studentScores.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println("\nAccessing elements:");
        // Get a value using the key
        System.out.println("Score of Bob: " + studentScores.get("Bob"));

        // Check if a key exists
        System.out.println("Contains 'Charlie': " + studentScores.containsKey("Charlie"));
        System.out.println("Contains 'Eve': " + studentScores.containsKey("Eve"));

        // Remove an element
        studentScores.remove("Charlie");
        System.out.println("\nLinkedHashMap after removing Charlie:");
        for (Map.Entry<String, Integer> entry : studentScores.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
