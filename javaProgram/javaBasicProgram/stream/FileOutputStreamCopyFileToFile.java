package stream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
public class FileOutputStreamCopyFileToFile
{
    public static void main(String args[])
    {
        try{
            FileInputStream fis=new FileInputStream(args[0]);
            int n=fis.available();
            byte[] b=new byte[n];
            fis.read(b);
            FileOutputStream fos=new FileOutputStream(args[1]);
            fos.write(b);
        }catch(Exception e)
        {
            System.err.println(e);
        }
    }
}
