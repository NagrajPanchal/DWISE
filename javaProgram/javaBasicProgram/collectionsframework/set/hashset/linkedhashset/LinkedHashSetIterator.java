package collectionsframework.set.hashset.linkedhashset;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetIterator
{
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<String>();
        lhs.add("Tomato");
        lhs.add("Cabbage");
        lhs.add("Brinjal");
        lhs.add("Green Chilli");
        lhs.add("Onion");
        Iterator<String> iterator = lhs.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}
