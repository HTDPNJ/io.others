import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class BufferedIn
{
    /*封装输入*/
    public static void main(String[] args)throws IOException
    {
        InputStream is=System.in;
        BufferedReader br=new BufferedReader(new InputStreamReader(is));
        System.out.println("请输入：");
        String msg=br.readLine();
        System.out.println(msg);
    }
}
