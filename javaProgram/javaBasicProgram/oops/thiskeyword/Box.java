package oops.thiskeyword;
public class Box
{
    int length;
    int width;

    public Box(int length, int width)
    {
        this.length = length;
        this.width = width;
    }
    public void displayDimension()
    {
        System.out.println("Length :" +this.length +"Width : "+ this.width);
    }
    public static void main(String[] args)
    {
        Box b = new Box(10,5);
        b.displayDimension();
    }
}
