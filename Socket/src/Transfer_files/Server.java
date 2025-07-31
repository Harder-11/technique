package Transfer_files;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try (ServerSocket server = new ServerSocket(8080)) {
            //首先都要记得建立连接
            Socket socket = server.accept();
            InputStream stream = socket.getInputStream();
            FileOutputStream fileOutputStream = new FileOutputStream("net/data.txt");
            byte[] bytes = new byte[1024];
            int i;
            while((i = stream.read(bytes)) != -1){
                fileOutputStream.write(bytes,0,i);
            }
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (IOException e){
            System.out.println("没有连接上客户端!");
            e.printStackTrace();
        }
    }
}
