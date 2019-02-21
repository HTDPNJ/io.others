import java.io.Closeable;

public class FileUtil
{
    /*工具类关闭流
    可变参数：...形参,只能放在最后一个位置，处理方式只能与数组一致
    * */
    public static void close(Closeable... io){
        for(Closeable temp: io){
            try {
                if (null != temp) {
                    temp.close();
                }
            }catch(Exception e){

            }
        }
    }

    /*
    * 使用泛型*/
    public static<T extends  Closeable> void closeAll(T... io){
        for(Closeable temp: io){
            try {
                if (null != temp) {
                    temp.close();
                }
            }catch(Exception e){

            }
        }
    }
}
