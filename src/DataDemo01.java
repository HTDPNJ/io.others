import java.io.*;

public class DataDemo01
{/*
    基本数据处理
  1、基本类型+String 保留数据+类型
  输入流：DataInputStream
  输出流：DataOutputStream
  新增方法不能用多态
  */

    public static void main(String[] args)
    {
        try {
            write("E:\\123.txt");
            read("E:\\123.txt");
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    /*
    * 数据+类型输出到文件*/
    public static void write(String destPath) throws IOException
    {
        double point=2.5;
        long num=100L;
        String str="数据类型";

        //创建源
        File dest=new File(destPath);
        //选择流 DataOutputStream
        DataOutputStream dos=new DataOutputStream(
                new BufferedOutputStream(new FileOutputStream(dest))
        );
        //操作 写出的顺序为读取准备
        dos.writeDouble(point);
        dos.writeLong(num);
        dos.writeUTF(str);
        dos.flush();
        dos.close();
    }

    /*从文件中读取数据+类型*/
    public static void read(String destPath) throws IOException
    {
        //创建源
        File src=new File(destPath);
        //选择流
        DataInputStream dis=new DataInputStream(new BufferedInputStream(new FileInputStream(src)));
        //操作 读取的顺序与写出一致 必须存在才能读取
        double num1=dis.readDouble();
        long num2=dis.readLong();
        String str=dis.readUTF();
    }
}
