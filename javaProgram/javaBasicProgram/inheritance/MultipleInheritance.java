package inheritance;

public class MultipleInheritance
{
    public static void main(String[] args)
    {
        Duck myDuck = new Duck();
        myDuck.fly();   // Calls the fly() method implemented from Flyable
        myDuck.swim();  // Calls the swim() method implemented from Swimmable
        myDuck.quack(); // Calls the specific method of the Duck class
    }
}
