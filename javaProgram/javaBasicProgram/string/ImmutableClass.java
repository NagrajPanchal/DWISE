package string;

public final class ImmutableClass
{
    private final String name;
    private final int age;

    public ImmutableClass(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    public String getName()
    {
        System.out.println("My Name is : "+name);
        return name;
    }
    public int getAge()
    {
        System.out.println("My Age is : "+age);
        return age;
    }
    public static void main(String[] args) {
        ImmutableClass i =new ImmutableClass("Panchal",32);
        i.getName();
        i.getAge();
    }
}
