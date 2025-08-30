package newfeatures;
import static java.lang.Integer.parseInt;
import static java.lang.System.out;
public class StaticImports
{
    public static void main(String[] args) {
        int x=parseInt(args[0]);
        int y=parseInt(args[1]);
        out.println(x+y);
    }
}
