package oops.thiskeyword;
public class ThisKeywordDemo4
{
    void show()
    {
        System.out.println("show() Method");
    }
    void display()
    {
        System.out.println("display() Method");
        show();
    }
    public static void main(String[] args)
    {
        ThisKeywordDemo4 tkd4 = new ThisKeywordDemo4();
        tkd4.display();
    }
}
