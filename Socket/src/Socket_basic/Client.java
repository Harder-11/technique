package Socket_basic;


import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/*
通过Socket技术(是计算机之间进行通信的一种约定或者一种方式),我们就可以实现两台计算机之间的通信
Socket也被翻译成套接字,是操作系统底层提供的一项通信技术,它支持TCP和UDP,而Java底层就对socket底层支持进行了
一套完整的封装,我们可以通过Java来实现Socket通信

要实现Socket通信,我们要创建一个数据发送者和数据接受者,也就是客户端和服务端,我们需要提前启动服务端,等待客户端的链接
而客户端只需要随时随地启动去连接服务端即可
 */
public class Client {
    public static void main(String[] args) {
        //首先编写服务器,先创建一个服务器,并且需要传入端口号
        //通常都是8080
        try {
            ServerSocket server = new ServerSocket(8080);
            System.out.println("正在等待客户端连接....");
            //使用accept会暂时将线程进行阻塞,等待客户端的连接
            //然后通过socket可以获得客户端的一些连接信息
            Socket socket = server.accept();
            System.out.println("客户端已连接,IP地址为: " + socket.getInetAddress().getHostAddress());
            //连接之后需要关闭服务器,否则端口会被一直占用
            server.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
