package inheritance;
public class SubClass extends SuperClass
{
    int x=10;
    void print()
    {
        int x=15;
        System.out.println("This is local Variable\t"+x);
        System.out.println("This is Class Variable\t"+this.x);
        System.out.println("This is inherit super class Variable\t"+super.x);
    }
    public static void main(String[] args)
    {
        SubClass sc = new SubClass();
        sc.print();
    }
}
