package collectionsframework.set.hashset.linkedhashset;

import java.util.LinkedHashSet;

public class LinkedHashSetForEachLoop
{
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<String>();
        lhs.add("Tomato");
        lhs.add("Cabbage");
        lhs.add("Brinjal");
        lhs.add("Green Chilli");
        lhs.add("Onion");
        for (String veg : lhs)
            System.out.println(veg);
    }
}
