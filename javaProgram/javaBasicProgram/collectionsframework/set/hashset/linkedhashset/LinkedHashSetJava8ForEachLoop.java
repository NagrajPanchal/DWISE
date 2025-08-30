package collectionsframework.set.hashset.linkedhashset;

import java.util.LinkedHashSet;

public class LinkedHashSetJava8ForEachLoop
{
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<String>();
        lhs.add("Tomato");
        lhs.add("Cabbage");
        lhs.add("Brinjal");
        lhs.add("Green Chilli");
        lhs.add("Onion");
        lhs.stream().forEach(System.out::println); // New Type java 8 For Each Loop
    }
}
