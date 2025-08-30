package collectionsframework.list.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample
{
    public static void main(String[] args) {
        ArrayList<Integer> ai = new ArrayList<>();
        ai.add(83);
        ai.add(73);
        ai.add(70);
        ai.add(53);
        ai.add(80);
        System.out.println(ai);
        Iterator<Integer> i = ai.iterator();
        while (i.hasNext())
        {
            int x = i.next();
            System.out.println(x+5);
        }
    }
}
