package oops.thiskeyword;
public class ThisKeywordDemo3
{
    int x = 10;
    void display()
    {
        int x = 20;
        System.out.println(x);
        System.out.println(this.x);
    }
    public static void main(String[] args)
    {
        ThisKeywordDemo3 tkd3 =new ThisKeywordDemo3();
        tkd3.display();
    }
}
