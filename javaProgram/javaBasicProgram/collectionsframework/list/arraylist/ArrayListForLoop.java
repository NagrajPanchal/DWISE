package collectionsframework.list.arraylist;

public class ArrayListForLoop
{
    public void forLoop()
    {
        java.util.ArrayList<String> al = new java.util.ArrayList<String>();
        al.add("Apple");
        al.add("Orange");
        al.add("Kiwi");
        al.add("Papaya");
        al.add("Mango");
        for (int i=0; i<al.size(); i++)
        {
            System.out.println(al.get(i));
        }
    }
    public static void main(String[] args) {
        ArrayListForLoop alfl = new ArrayListForLoop();
        alfl.forLoop();
    }
}
