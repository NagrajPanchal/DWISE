package polymorphism;
class Fruits
{
    void features()
    {
       System.out.print("'Delicious'");
    }
}
class Apple extends Fruits
{
    @Override
    void features()
    {
        Fruits f = new Fruits();
        f.features();
        System.out.println("\t Apple Sweat \t");
    }
}
class Mango extends Fruits
{
    @Override
    void features()
    {
        Fruits f = new Fruits();
        f.features();
        System.out.println("\tMango Very Good \t");
    }
}
public class MethodOverridingRuntimeDynamicPolymorphism
{
    public static void main(String[] args)
    {
        Fruits fa = new Apple();
        Fruits fm = new Mango();
        fa.features();
        fm.features();
    }
}
