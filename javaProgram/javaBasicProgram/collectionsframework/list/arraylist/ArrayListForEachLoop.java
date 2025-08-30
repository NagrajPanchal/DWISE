package collectionsframework.list.arraylist;

import java.util.ArrayList;

public class ArrayListForEachLoop
{
    public void forEachLoop()
    {
        ArrayList<String> al = new ArrayList<String>();
        al.add("Apple");
        al.add("Banana");
        al.add("Cherry");
        al.add("DragonFruit");
        for (String i : al)
            System.out.println(i);
    }
    public static void main(String[] args) {
        ArrayListForEachLoop alfel = new ArrayListForEachLoop();
        alfel.forEachLoop();
    }
}
