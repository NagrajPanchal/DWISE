package collectionsframework.set.hashset;

import java.util.HashSet;

public class HashSetExample
{
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();
        hs.add("Java");
        hs.add("Python");
        hs.add("Spring boot");
        hs.add("OOPS");
        hs.add("Micro Service");
        System.out.println(hs);
    }
}
