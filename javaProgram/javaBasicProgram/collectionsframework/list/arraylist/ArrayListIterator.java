package collectionsframework.list.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterator
{
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("Apple");
        al.add("Banana");
        al.add("Cherry");
        al.add("DragonFruits");
        Iterator<String> iterator = al.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}
