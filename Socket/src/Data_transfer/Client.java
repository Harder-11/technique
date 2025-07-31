package Data_transfer;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

/*
使用Socket进行数据的传输
 */
public class Client {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost",8080);
             Scanner sc = new Scanner(System.in)) {
            System.out.println("已连接到服务端! ");
            //向服务端发送数据,需要利用输出流
            //并且利用转换流转换为字符流
            OutputStreamWriter writer = new OutputStreamWriter(socket.getOutputStream());
            //这里必须要加上换行符,否则ReadLine读取不了
            writer.write(sc.nextLine() + "\n");
            writer.flush();
            //还可以提前关闭单向的流
            socket.shutdownOutput();
            System.out.println("数据发送完毕! 等待服务端确认....");

            //发送完毕之后接受服务端响应;
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            System.out.println(reader.readLine());
            socket.shutdownInput();

        } catch (IOException e){
            System.out.println("服务端链接失败! ");
            e.printStackTrace();
        }
    }
}
