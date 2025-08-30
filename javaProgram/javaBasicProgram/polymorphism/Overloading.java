package polymorphism;

public class Overloading
{
    void methodSameNameDifferentArguments()
    {
        System.out.println("Without Arguments");
    }
    void methodSameNameDifferentArguments(int a)
    {
        System.out.println("Single Integer Arguments :"+a);
    }
    void methodSameNameDifferentArguments(int a,String b)
    {
        System.out.println("Two arguments Integer & String:" +a +" "+b);
    }
    void methodSameNameDifferentArguments(char c)
    {
        System.out.println("Single Charter : "+c);
    }
    public static void main(String[] args) {
        Overloading ol = new Overloading();
        ol.methodSameNameDifferentArguments();
        ol.methodSameNameDifferentArguments(1);
        ol.methodSameNameDifferentArguments('N');
        ol.methodSameNameDifferentArguments(2,"Nagraj");
    }
}
