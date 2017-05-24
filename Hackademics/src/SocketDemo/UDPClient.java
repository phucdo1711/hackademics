/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SocketDemo;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

/**
 *
 * @author admin
 */
public class UDPClient {
    public static void main(String[] args) throws SocketException, UnknownHostException, IOException {
        DatagramSocket datagramSocket = new DatagramSocket();
        String sendToServer = "Nạp em 10k";
        
        DatagramPacket datagramPacket = new DatagramPacket(
                sendToServer.getBytes(),
                sendToServer.getBytes().length,
                InetAddress.getByName("localhost"),
                1234);
        
        datagramSocket.send(datagramPacket);
        
        byte[] buffer = new byte[2048];//nhận dữ liệu từ server
        
        DatagramPacket inPacket = new DatagramPacket(buffer, buffer.length);
        
        datagramSocket.receive(inPacket);//nhận dữ liệu 
        String s = new String(inPacket.getData(),0, inPacket.getData().length);
        
        System.out.println(s);
    }
}
