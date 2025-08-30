// Class variable is also known as static variable
package oops.variables.classvariable;
public class ClassVariable
{
    static int x=10; // Static(Class) variable
    public static void main(String args[])
    {
        System.out.println(x); // Directly access
        System.out.println(ClassVariable.x); //By using class name
        System.out.println(new ClassVariable().x); //By using object
        ClassVariable d=new ClassVariable();
        System.out.println(d.x); //By using object reference
    }
}
