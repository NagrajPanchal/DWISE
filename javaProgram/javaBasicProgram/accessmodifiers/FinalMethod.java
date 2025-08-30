package accessmodifiers;
class Vehicle
{
    final void run()
    {
        System.out.println("Vehicle is running");
    }
}
class Car extends Vehicle
{
    /*void run()
    {
        System.out.println("Final Method already Declared");
    }*/
    void honk()
    {
        System.out.println("Car is honking");
    }
}
public class FinalMethod
{
    void run()
    {
        System.out.println("Final Method Class not inherited from Vehicle Class");
    }
    public static void main(String[] args)
    {
        Car c = new Car();
        c.run(); // Call final method
        c.honk();
        FinalMethod fm = new FinalMethod();
        fm.run();
    }
}
