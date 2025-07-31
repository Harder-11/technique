package Data_transfer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try (ServerSocket server = new ServerSocket(8080)) {
            System.out.println("等待服务器连接....");
            Socket socket = server.accept();

            //我们还可以设定时间,如果超时客户端还没有发送数据,就直接抛出异常
            socket.setSoTimeout(3000);

            System.out.println("客户端已连接,IP地址为: " + socket.getInetAddress().getHostAddress());
            System.out.println("读取客户端数据:");
            //利用转换流,转化为BufferedReader,可以一行一行读取数据
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            System.out.println(reader.readLine());

            //然后接受到数据之后需要发送会客户端响应,又需要再服务端进行流输出
            OutputStreamWriter writer = new OutputStreamWriter(socket.getOutputStream());
            writer.write("已经接收到数据\n");
            writer.flush();

            socket.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
