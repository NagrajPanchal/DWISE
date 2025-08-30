package oops.thiskeyword;
public class ThisKeywordDemo2
{
    int x = 10;
    void display()
    {
        System.out.println(x);
    }
    public static void main(String[] args)
    {
        ThisKeywordDemo2 tkd1 = new ThisKeywordDemo2();
        ThisKeywordDemo2 tkd2 = new ThisKeywordDemo2();
        tkd1.x = tkd1.x+2;
        tkd1.display();
        tkd2.display();
    }
}
