package Transfer_files;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/*
Socket实现文件的传输
实际就是在Socket传输的基础上加上了文件流的内容而已,其他一模一样
整体的流程就是使用字节输入流,先从一个文件里面读取字节,然后将读取到的字节
放到bytes里面加速写入写出,然后使用Socket将bytes里面的内容以流的形式传送到服务器

服务器使用Socket进行读取,也是读入到bytes里面,然后使用输出流将bytes里面的内容写到另一个文件里面
 */

public class Client {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost",8080)) {
            //首先肯定要用户端读取文件,使用FileInputStream
            FileInputStream fileInputStream = new FileInputStream("test.txt");
            //然后输入文件,使用输出流,并且使用byte数组每1024个字节进行读取,加速读取速度
            OutputStream stream = socket.getOutputStream();
            byte[] bytes = new byte[1024];
            int i;
            while((i = fileInputStream.read(bytes)) != -1){
                //读到了之后就要往输出流里面写
                stream.write(bytes,0,i);
            }

            //记得输出时候把流关闭
            fileInputStream.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
