package Browser_access;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.Buffer;

/*
访问Socket服务器
我们依然要创建服务端和客户端,然后设定端口和IP地址
这样我们就可以使用浏览器来访问Socket接口,相当于浏览器就成为了客户端,在浏览器里面使用localhost:8080进行访问
就能访问到服务端去
访问之后会将HTTP协议发送给服务端,然后服务端就可以使用Input流接收,打印出来看到具体内容


 */

public class Server {
    public static void main(String[] args) {
        try (ServerSocket server = new ServerSocket(8080)) {
            System.out.println("等待客户端连接...");
            Socket socket = server.accept();
            System.out.println("客户端已经连接,IP地址为: " + socket.getInetAddress().getHostAddress());
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            System.out.println("接收到客户端信息!");
            while(reader.ready()) System.out.println(reader.readLine());

            //我们想要给客户端返回一个HTTP协议,那么还需要使用输出流给出响应
            OutputStreamWriter writer = new OutputStreamWriter(socket.getOutputStream());
            //我们需要返回HTTP/1.1 200 Accepted\r\n,表示接收请求(200是响应码)
            //\r是吧光标移动到本行行首,\n是把光标一道下一行同一列,那么\r\n就是新起一行
            writer.write("HTTP/1.1 200 Accepted\r\n");
            //在请求头写完之后还要进行一次换行,然后写入我们的响应实体(在浏览器显示的内容)
            writer.write("\r\n");
            writer.write("MSN nb!");
            writer.flush();

            //必须要加上close浏览器里面才会显示内容,因为如果没有告诉浏览器正文有多长,浏览器会以为后面还有数据
            //所以会一直等待,加上close之后就停止等待,显示内容了
            socket.close();
        } catch (IOException e){
            System.out.println("没有连接上!");
            e.printStackTrace();
        }
    }
}
