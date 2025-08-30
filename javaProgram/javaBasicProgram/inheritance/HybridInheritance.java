package inheritance;
// Parent class (Hierarchical Inheritance)
class Animal {
    void eat() {
        System.out.println("Animal is eating.");
    }
}
// Interface for flying behavior (Multiple Inheritance via interface)
interface Flyable {
    void fly();
}
// Class inheriting from Animal (Single Inheritance)
class Mammal extends Animal {
    void giveBirth() {
        System.out.println("Mammal gives birth to live young.");
    }
}
// Class inheriting from Animal and implementing Flyable (Hybrid Inheritance)
class Bird extends Animal implements Flyable {
    @Override
    public void fly() {
        System.out.println("Bird is flying.");
    }
    void layEggs() {
        System.out.println("Bird lays eggs.");
    }
}
// Class inheriting from Mammal and implementing Flyable (Hybrid Inheritance)
class Bat extends Mammal implements Flyable {
    @Override
    public void fly() {
        System.out.println("Bat is flying.");
    }
        void echolocate() {
        System.out.println("Bat uses echolocation.");
    }
}
public class HybridInheritance
{
    public static void main(String[] args) {
        Bird sparrow = new Bird();
        sparrow.eat();
        sparrow.fly();
        sparrow.layEggs();
        System.out.println();
        Bat fruitBat = new Bat();
        fruitBat.eat();
        fruitBat.giveBirth();
        fruitBat.fly();
        fruitBat.echolocate();
    }
}
