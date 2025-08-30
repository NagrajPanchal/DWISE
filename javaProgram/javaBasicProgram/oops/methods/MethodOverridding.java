package oops.methods;
class Animals
{
    // Overridden method
    void sound()
    {
        System.out.println(" Animal make sound");
    }
}
class Dog extends Animals
{
    // Overriding method
    @Override // Recommended annotation for clarity and compile-time checks
    void sound()
    {
        System.out.println("Dog barks");
    }
}

class Cat extends Animals
{
    // Overriding method
    @Override
    void sound()
    {
        System.out.println("Cat sound meows");
    }
}
public class MethodOverridding
{
    public static void main(String[] args)
    {
        Animals animals = new Animals();
        Dog dog = new Dog(); // Animal reference, Dog object
        Cat cat = new Cat(); // Animal reference, Cat object
        animals.sound(); // Output: Animal makes a sound.
        dog.sound();  // Output: Dog barks. (Runtime polymorphism in action)
        cat.sound();  // Output: Cat meows.
    }
}
