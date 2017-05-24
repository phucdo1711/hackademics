/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SocketDemo;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 *
 * @author admin
 */
public class UDPServer {
    public static void main(String[] args) throws SocketException, IOException {
        DatagramSocket datagramSocket = new DatagramSocket(1234);
        
        byte[] buffer = new byte[1024];
        
        DatagramPacket datagramPacket = new DatagramPacket(buffer, buffer.length);
        
        while(true){
            datagramSocket.receive(datagramPacket);
            
            //dữ liệu từ client gửi lên
            String mess = new String(datagramPacket.getData(),0, datagramPacket.getLength());
            
            System.out.println("From client: "+mess);
            mess = "Sever: ok";
            
            //Tạo packet gửi cho client
            DatagramPacket outpacket = new DatagramPacket(
                    mess.getBytes(), 
                    mess.getBytes().length,
                    datagramPacket.getAddress(),
                    datagramPacket.getPort());
            
            //gửi dữ liệu cho client
            
            datagramSocket.send(outpacket);
    
        }      
    }
}
