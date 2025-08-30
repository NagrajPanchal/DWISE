package inheritance;

class B extends A
{
    int y=10;
    public void print()
    {
        show();
        System.out.println("Class B\t"+y);
    }
}

public class MultiLevelInheritance extends B
{
    int see()
    {
        print();
        int c = x+y;
        System.out.println("Class C\t"+c);
        return c;
    }

    public static void main(String[] args)
    {
        MultiLevelInheritance mi = new MultiLevelInheritance();
        mi.see();
    }
}
