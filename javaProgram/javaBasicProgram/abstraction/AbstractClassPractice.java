package abstraction;
interface AnimalStuff
{
    int age =10;
    String name = "puppy";
    void poop();
}
abstract class Animal implements AnimalStuff {

    public abstract void makeNoice();
    public void print()
    {
        System.out.println("My name is :"+name);
        System.out.println("My Age is :"+age);
    }
}
class Cat extends Animal implements AnimalStuff
{
    @Override
public void makeNoice()
{
    System.out.println("Meow");
}

    @Override
    public void poop() {
        System.out.println("phuruu");
    }
}
public class AbstractClassPractice
{
    public static void main(String[] args) {
        Cat c = new Cat();
                c.makeNoice();
                c.poop();
                c.print();

    }
}
