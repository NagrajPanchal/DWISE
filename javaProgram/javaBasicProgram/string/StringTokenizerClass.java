package string;
import java.util.StringTokenizer;
public class StringTokenizerClass
{
    public static void main(String[] args)
    {
        String s = "Welcome to Java";
        StringTokenizer st = new StringTokenizer(s);
        int n = st.countTokens();
        System.out.println(n);
    }
}
