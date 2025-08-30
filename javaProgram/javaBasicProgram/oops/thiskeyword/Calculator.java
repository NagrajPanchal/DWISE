package oops.thiskeyword;

public class Calculator
{
    public int add(int a,int b)
    {
        int sum = a+b;
        System.out.println("Sum : " + sum);
        return sum;
    }
    public void calculateAndDisplay(int x,int y)
    {
        this.add(x,y);
    }
    public static void main(String[] args)
    {
        Calculator c = new Calculator();
        c.calculateAndDisplay(5,3);
    }
}
