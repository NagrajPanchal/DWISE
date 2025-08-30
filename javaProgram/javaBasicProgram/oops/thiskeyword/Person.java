package oops.thiskeyword;

public class Person
{
    String name;
    int age;
    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    public void introduce()
    {
        System.out.println("My name is "+ name + " and i am "+age+" years of old.");
    }
    public static void main(String[] args)
    {
        Person p = new Person("Nagraj",32);
        p.introduce();
    }
}
