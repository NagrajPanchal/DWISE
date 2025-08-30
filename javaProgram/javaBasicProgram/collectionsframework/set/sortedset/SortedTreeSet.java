package collectionsframework.set.sortedset;

import java.util.TreeSet;

public class SortedTreeSet
{
    public static void main(String[] args) {
        java.util.SortedSet<String> set = new TreeSet<String>();
        set.add("Milk");
        set.add("Butter");
        set.add("Curd");
        set.add("clarified Butter");
        set.add("Butter Milk");
        System.out.println("Sorted Set :"+set);
        }
}
