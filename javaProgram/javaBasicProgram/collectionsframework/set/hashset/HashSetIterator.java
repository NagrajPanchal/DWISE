package collectionsframework.set.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetIterator
{
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<Integer>();
        hs.add(143);
        hs.add(25);
        hs.add(786);
        hs.add(123);
        hs.add(159);
        Iterator<Integer> i = hs.iterator();
        while (i.hasNext())
        {
            System.out.println(i.next());
        }

    }
}
