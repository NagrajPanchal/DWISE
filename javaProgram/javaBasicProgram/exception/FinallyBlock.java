package exception;
import java.io.FileInputStream;
public class FinallyBlock
{
    public static void main(String args[])
    {
        FileInputStream fis=null;
        try{
            fis=new FileInputStream(args[0]);
            int n=fis.available();
            byte[] b=new byte[n];
            fis.read(b);
            String s =new String(b);
            System.out.println(s);
        }catch(Exception e)
        {
            System.err.println(e);
        }
        finally
        {
            try{
                fis.close();
            }catch(Exception e)
            {
                System.err.println(e);
            }
        }
    }
}
