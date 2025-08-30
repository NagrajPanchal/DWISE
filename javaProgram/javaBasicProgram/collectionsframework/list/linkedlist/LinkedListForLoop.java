package collectionsframework.list.linkedlist;

import java.util.LinkedList;

public class LinkedListForLoop
{
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Carrot");
        list.add("Radish");
        list.add("Beetroot");
        list.add("Potato");
        list.add("Yam");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
