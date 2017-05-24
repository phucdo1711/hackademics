
package SocketDemo;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;


public class TCPServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(1234);
        System.out.println("Start Listening ...");
        while(true){
            Socket socket = serverSocket.accept();//nếu có luồng gửi đến thì đồng ý kết nối
            
            BufferedReader in = new BufferedReader(new InputStreamReader(
                        socket.getInputStream()));//đọc dữ liệu từ luồng nhận
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            
            String mess = in.readLine();
            
            System.out.println("From Client: "+mess);
            
            mess = "From Server: " + mess.toUpperCase() + "\n";
            
            out.writeBytes(mess);
        }
    }
}
