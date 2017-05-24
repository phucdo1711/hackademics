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
import java.net.Socket;
import java.util.Scanner;


/**
 *
 * @author admin
 */
public class ClientChat {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket ("Localhost",1711);
        
        Thread inMessage = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    BufferedReader in = new BufferedReader(new InputStreamReader(
                                socket.getInputStream()));
                    while(true){
                        String inMess = in.readLine();
                        System.out.println(inMess);      
                    }
                } catch (IOException ex) {
                        //Logger.getLogger(ClientChat.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        Thread outMessage = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    DataOutputStream out = new DataOutputStream(socket.getOutputStream());
                    while(true){
                        Scanner scan = new Scanner(System.in);
                        System.out.println("Enter message: ");
                        String outMess = scan.nextLine();
                        outMess = "From Client: " + outMess ;
                        out.writeBytes(outMess+"\n");
                    
                    }
                } catch (IOException ex) {
                        //Logger.getLogger(ClientChat.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        outMessage.start();
        inMessage.start();
    }
}
