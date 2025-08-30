package map.concurrenchashtable;

import java.util.Enumeration;
import java.util.Hashtable;

public class ConcurrenceHashTable
{
    public static void main(String[] args) {
        // Create a Hashtable with String keys and Integer values
        Hashtable<String, Integer> studentScores = new Hashtable<>();

        // Add elements to the Hashtable using put()
        studentScores.put("Alice", 95);
        studentScores.put("Bob", 88);
        studentScores.put("Charlie", 72);
        studentScores.put("David", 91);

        // Display the Hashtable
        System.out.println("Student Scores: " + studentScores);

        // Retrieve a value using get()
        int scoreOfAlice = studentScores.get("Alice");
        System.out.println("Alice's score: " + scoreOfAlice);

        // Check if a key exists using containsKey()
        if (studentScores.containsKey("Bob")) {
            System.out.println("Bob is in the Hashtable.");
        }

        // Check if a value exists using containsValue()
        if (studentScores.containsValue(72)) {
            System.out.println("A student scored 72.");
        }

        // Remove an element using remove()
        studentScores.remove("Charlie");
        System.out.println("Student Scores after removing Charlie: " + studentScores);

        // Iterate through the Hashtable using Enumeration (legacy way)
        Enumeration<String> names = studentScores.keys();
        System.out.println("\nIterating through keys and values:");
        while (names.hasMoreElements()) {
            String studentName = names.nextElement();
            System.out.println("Key: " + studentName + ", Value: " + studentScores.get(studentName));
        }
    }
}
