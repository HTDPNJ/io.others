import java.io.*;
import java.util.Arrays;

public class ObjectDemo01
{
    public static void main(String[] args)
    {
        try {
            seri("文件路径");
        }
        catch (IOException e) {
            e.printStackTrace();
        }


        try {
            read("上述路径");
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    //序列化
    public static void seri(String destPath)throws  IOException{
        Employee emp=new Employee("hfut",1000000);
        int[] arr={1,2,3,4,5};
        //创建源
        File dest=new File(destPath);
        //选择流 DataOutStream
        ObjectOutputStream dos=new ObjectOutputStream(
                new BufferedOutputStream(new FileOutputStream(dest))
        );
        //操作
        dos.writeObject(emp);
        dos.writeObject(arr);
        //释放资源
        dos.close();
    }
    //反序列化
    public static void read(String destPath)throws IOException,ClassNotFoundException{
        //创建源
        File src =new File(destPath);
        //选择流
        ObjectInputStream dis=new ObjectInputStream(new BufferedInputStream(
                new FileInputStream(src)
        ));
        Object obj=dis.readObject();
        if(obj instanceof  Employee){
            Employee emp=(Employee) obj;
            System.out.println(emp.getName());
            System.out.println(emp.getSalary());
        }

        obj=dis.readObject();
        int[] arr=(int[]) obj;
        System.out.println(Arrays.toString(arr));
        dis.close();

    }
}
