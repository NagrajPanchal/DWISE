package statement.iteration;
public class NestedLoopIterationStatement
{
    public static void fruitList()
    {
        int i=1;
        String[] fruit = {"Apple", "Mango", "Kiwi", "Banana"};
        System.out.println("'Amareshwar Fruit List'");
        while(i<= fruit.length)
        {
            for(String frt : fruit)
            {
                System.out.print(i+").\t");
                i++;
                System.out.println(frt);
            }
        }
    }
    public static void main(String[] args)
    {
        fruitList();
    }
}
