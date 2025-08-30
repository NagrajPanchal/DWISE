package oops.thiskeyword;

public class Car
{
    String color;
    public Car setColor(String color)
    {
        this.color = color;
        return this;
    }
    public void display()
    {
        System.out.println("Car color : " +color);
    }
    public static void main(String[] args)
    {
        Car c = new Car();
        c.setColor("Red");
        c.display();
    }
}
