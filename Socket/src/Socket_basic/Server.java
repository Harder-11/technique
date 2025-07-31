package Socket_basic;

import java.io.IOException;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        //编写客户端
        //首先创建一个Socket对象,然后将地址填写为本机,也就是localhost,端口为8080(连接服务端端口)
        //这样就直接连接上服务端了
        try (Socket socket = new Socket("localhost",8080)) {
            System.out.println("已经连接到服务器!");
        } catch (IOException e) {
            System.out.println("服务器连接失败!");
            e.printStackTrace();
        }

    }
}
