import java.io.*;

public class DataDemo02
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
            byte[] data=write();
            read(data);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    /*
    * 数据+类型输出到字节数组中*/
    public static byte[] write() throws IOException
    {
        //目标数组
        byte[] dest=null;

        double point=2.5;
        long num=100L;
        String str="数据类型";

        //选择流
        ByteArrayOutputStream bos=new ByteArrayOutputStream();
        DataOutputStream dos=new DataOutputStream(
                new BufferedOutputStream(bos)
        );
        //操作 写出的顺序为读取准备
        dos.writeDouble(point);
        dos.writeLong(num);
        dos.writeUTF(str);
        dos.flush();
        dos.close();

        dest=bos.toByteArray();
        return dest;
    }

    /*从文件中读取数据+类型*/
    public static void read(byte[] src) throws IOException
    {
        //选择流
        DataInputStream dis=new DataInputStream(new BufferedInputStream(new ByteArrayInputStream(src)));
        //操作 读取的顺序与写出一致 必须存在才能读取
        double num1=dis.readDouble();
        long num2=dis.readLong();
        String str=dis.readUTF();
        dis.close();
    }
}
