package string;
import java.util.StringTokenizer;
public class StringTokenizerHasMoreTokens
{
    public static void main(String[] args)
    {
        String s = "Welcome to Java";
        StringTokenizer st = new StringTokenizer(s);
        while(st.hasMoreTokens())
        {
            System.out.println(st.nextToken());
        }
    }
}
