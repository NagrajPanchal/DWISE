package inheritance;
class A
{
    int x=5;
    void show()
    {
        System.out.println("A class\t"+ x);
    }
}
public class SingleLevelInheritance extends A
{
    int y=10;
    void print()
    {
        System.out.println("B class\t"+y);
    }
    public static void main(String[] args)
    {
        SingleLevelInheritance ob=new SingleLevelInheritance();
        ob.show();
        ob.print();
    }
}
