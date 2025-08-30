package oops.thiskeyword;
public class ThisKeywordDemo1
{
    int x=10;
    void display()
    {
        System.out.println(x); //here implicitly this.x
    }
    public static void main(String[] args)
    {
        ThisKeywordDemo1 tkd1 = new ThisKeywordDemo1();
        tkd1.display();
    }
}
