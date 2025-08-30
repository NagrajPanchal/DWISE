package newfeatures;
public class VarArgsClass
{
    void display(int... x)
    {
        for(int y : x)
        {
            System.out.println(y);
        }
    }
    public static void main(String[] args) {
        VarArgsClass va = new VarArgsClass();
        va.display(10,325,456,786);
        va.display(460,4,18,75,1000,159,357);
    }
}
