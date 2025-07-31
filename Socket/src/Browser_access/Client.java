package Browser_access;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost",8080)){
            System.out.println("已经连接上了");
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
