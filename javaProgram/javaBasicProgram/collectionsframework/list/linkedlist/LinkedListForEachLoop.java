package collectionsframework.list.linkedlist;

import java.util.LinkedList;

public class LinkedListForEachLoop
{
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Carrot");
        list.add("Radish");
        list.add("Beetroot");
        list.add("Potato");
        list.add("Yam");
        for (String i : list)
            System.out.println(i);
    }
}
