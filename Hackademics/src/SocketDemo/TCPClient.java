
package SocketDemo;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 *
 * @author admin
 */
public class TCPClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket ("Localhost",1234);
        
        BufferedReader in = new BufferedReader(new InputStreamReader(
                        socket.getInputStream()));
        DataOutputStream out = new DataOutputStream(socket.getOutputStream());
        
        out.writeBytes("Hello world\n");
        String s = in.readLine();
        System.out.println(s);
        
        socket.close();
    }
}
