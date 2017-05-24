/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SocketDemo;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class ServerChat {
    
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(1711);
        Socket socket = serverSocket.accept();
         
        Thread inMessage = new Thread(new Runnable() {
            @Override
            public void run() {
                String inMess = "";
                try {
                        BufferedReader in = new BufferedReader(new InputStreamReader(
                                socket.getInputStream()));
                        while(true){
                    
                         inMess = in.readLine();
                    
                        System.out.println(inMess);
                    
                    }
                } catch (IOException ex) {
                        //Logger.getLogger(ServerChat.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        });
            
            
            Thread outMessage = new Thread(new Runnable() {
            @Override
            public void run() {
                String outMess = "";
                try {
                    DataOutputStream out = new DataOutputStream(socket.getOutputStream());
                    while(true){
                    
                    
                        Scanner scan = new Scanner(System.in);
            
                        System.out.println("Enter Message: ");
                        outMess =  scan.nextLine();
                        outMess= "From Server: " + outMess + "\n";
                        out.writeBytes(outMess);
                    }
                    
                    }
                catch (IOException ex) {
                        //Logger.getLogger(ServerChat.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });  
        
        inMessage.start();
        outMessage.start();
    }
}
