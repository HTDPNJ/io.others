import java.io.*;

public class PrintStreamDemo01
{
    /*PringStream 打印流--》处理流*/
    public static void main(String[] args) throws FileNotFoundException
    {
        System.out.println("test");
        PrintStream ps=System.out;
        ps.println(false);

        //输出到文件
        File src=new File("文件路径");
        ps=new PrintStream(new BufferedOutputStream(new FileOutputStream(src)));
        ps.println("it is so easy...");
        ps.close();
    }
}
