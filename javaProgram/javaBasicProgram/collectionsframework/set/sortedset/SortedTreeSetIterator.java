package collectionsframework.set.sortedset;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedTreeSetIterator
{
    public static void main(String[] args) {
        SortedSet<String> set = new TreeSet<String>();
        set.add("Milk");
        set.add("Butter");
        set.add("Curd");
        set.add("clarified Butter");
        set.add("Butter Milk");
        System.out.println("Iterator :");
        Iterator<String> i = set.iterator();
        while (i.hasNext())
            System.out.println(i.next());
    }
}
