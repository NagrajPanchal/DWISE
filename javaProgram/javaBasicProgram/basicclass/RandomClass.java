package basicclass;
import java.util.Random;
public class RandomClass
{
    public static void main(String[] args) {
        Random r = new Random();
        for (int i =1; i<=10;i++)
        {
            System.out.println(r.nextInt(1000));
        }
    }
}
