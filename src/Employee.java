import java.io.ObjectOutputStream;

public class Employee implements java.io.Serializable
{/*
  引用类型(对象)保留数据+类型
  反序列化 输入流 ObjectInputStream
  序列化 输出流 ObjectOutputStream
  注意：
  1）、先序列化后反序列化；反序列化顺序必须与序列化一致
  2）、不是所有的对象都可以序列化，必须实现java.io.Serializable
       不是所有的属性都需要序列化，transient
  */
    private transient String name; //不需要序列化
    private double salary;

    public Employee()
    {
    }

    public Employee(String name, double salary)
    {
        this.name = name;
        this.salary = salary;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double getSalary()
    {
        return salary;
    }

    public void setSalary(double salary)
    {
        this.salary = salary;
    }
}
