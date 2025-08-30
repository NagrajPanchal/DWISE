package map.sortedmap;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapExample
{
    public static void main(String[] args) {
        // Create a SortedMap using TreeMap
        SortedMap<String, Integer> studentScores = new TreeMap<>();

        // Add elements to the SortedMap
        studentScores.put("Alice", 95);
        studentScores.put("Bob", 88);
        studentScores.put("Charlie", 72);
        studentScores.put("David", 91);
        studentScores.put("Eve", 85);

        System.out.println("Original SortedMap (sorted by key): " + studentScores);

        // Access elements
        System.out.println("Score of Alice: " + studentScores.get("Alice"));

        // Get the first and last key
        System.out.println("First student (key): " + studentScores.firstKey());
        System.out.println("Last student (key): " + studentScores.lastKey());

        // Get a sub-map (keys from "Bob" inclusive to "Eve" exclusive)
        SortedMap<String, Integer> subMap = studentScores.subMap("Bob", "Eve");
        System.out.println("Sub-map (from Bob to Eve): " + subMap);

        // Get a head map (keys strictly less than "David")
        SortedMap<String, Integer> headMap = studentScores.headMap("David");
        System.out.println("Head map (less than David): " + headMap);

        // Get a tail map (keys greater than or equal to "Charlie")
        SortedMap<String, Integer> tailMap = studentScores.tailMap("Charlie");
        System.out.println("Tail map (greater than or equal to Charlie): " + tailMap);

        // Remove an element
        studentScores.remove("Charlie");
        System.out.println("SortedMap after removing Charlie: " + studentScores);

        // Iterate through the SortedMap
        System.out.println("Iterating through the SortedMap:");
        for (Map.Entry<String, Integer> entry : studentScores.entrySet()) {
            System.out.println("Student: " + entry.getKey() + ", Score: " + entry.getValue());
        }
    }
}
