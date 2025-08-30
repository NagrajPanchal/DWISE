package oops.constructor;
class Light
{
    public Light()
    {
        System.out.println("*** Constructor Overloading ***");
        System.out.println("Default Constructor without Arguments");
    }
    int size;
    public Light(int size)
    {
        this.size =size;
        System.out.println("Parameterized Constructor Single Arguments");
        System.out.println("Size : \t"+size);
    }
    int capacity;
    public Light(int size,int capacity)
    {
        this.size =size;
        this.capacity = capacity;
        System.out.println("Parameterized Constructor Double Arguments");
        System.out.println("Size : \t"+size+"\tCapacity :\t"+capacity);
    }
    String color;
    public Light(int size,int capacity,String color)
    {
        this.size =size;
        this.capacity = capacity;
        this.color = color;
        System.out.println("Parameterized Constructor Triple Arguments");
        System.out.println("Size : \t"+size+"\tCapacity :\t"+capacity+"\tColor :\t"+color);
    }
}
class ConstructorOverloading
{
    public static void main(String[] args) {
        Light lt = new Light();
        new Light();
        new Light(2);
        new Light(2,3);
        new Light(4,8,"Blue");
    }
}
