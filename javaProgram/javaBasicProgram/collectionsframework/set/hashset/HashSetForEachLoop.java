package collectionsframework.set.hashset;

import java.util.HashSet;

public class HashSetForEachLoop
{
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();
        hs.add("Java");
        hs.add("Python");
        hs.add("Spring boot");
        hs.add("OOPS");
        hs.add("Micro Service");
        hs.forEach(System.out::println); // New Type for Each Loop
        for (String language : hs) {
            System.out.println(language);
        }
    }
}
