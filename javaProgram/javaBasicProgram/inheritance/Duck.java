package inheritance;
interface Flyables
{
    void fly();
}
interface Swimmable
{
    void swim();
}
class Duck implements Flyables, Swimmable {
    @Override
    public void fly() {
        System.out.println("Duck is flying.");
    }

    @Override
    public void swim() {
        System.out.println("Duck is swimming.");
    }

    public void quack() {
        System.out.println("Duck says Quack!");
    }
}
