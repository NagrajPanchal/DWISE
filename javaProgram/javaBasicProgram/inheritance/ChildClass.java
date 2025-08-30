package inheritance;
public class ChildClass extends ParentClass
{
    void show()
    {
        System.out.println("Child Class ");
    }
    void print()
    {
        show();
        this.show();
        super.show();
    }
    public static void main(String[] args)
{
ChildClass cc = new ChildClass();
cc.print();
}
}
