import java.io.*;
import java.util.Scanner;

public class SystemDemo01
{
    /*三个常量
    * 1、System.in  输入流
    * 2、System.out 输出流
    * 3、System.err
    *
    * ==》》重定向
    * setIn
    * setOut
    * setErr*/
    public static void main(String[] args) throws FileNotFoundException
    {
        test1();

        InputStream is=System.in;
        Scanner sc=new Scanner(is);
        System.out.println(sc.nextLine()); //从控制台输入

        is=new BufferedInputStream(new FileInputStream("文件路径"));
        Scanner sc2=new Scanner(is);
        System.out.println(sc.nextLine()); //从文件输入

        //输出重定向到文件
        System.setOut(new PrintStream(new BufferedOutputStream(new FileOutputStream("文件路径")),true));
        System.out.println("a");//不是输出到控制台而是输出到文件
        //重定向回控制台
        System.setOut(new PrintStream(new BufferedOutputStream(new FileOutputStream(FileDescriptor.out)),true));
        System.out.println("555");


    }
    public static void test1(){
        System.out.println("test");
        System.err.println("err");
    }
}
