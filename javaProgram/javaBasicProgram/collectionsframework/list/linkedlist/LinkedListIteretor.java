package collectionsframework.list.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListIteretor
{
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Carrot");
        list.add("Radish");
        list.add("Beetroot");
        list.add("Potato");
        list.add("Yam");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}
