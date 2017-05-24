/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DemoFile;
import java.io.*;
/**
 *
 * @author HP
 */
public class DemoFile2 {
    public static void main(String[] args) throws IOException {
        RandomAccessFile rdFile = new RandomAccessFile("random.txt","rw");
        rdFile.writeBoolean(true);
        rdFile.writeInt(1234);
        rdFile.writeDouble(2345.56);
        rdFile.writeBytes("Do Thanh Phuc");
        
        rdFile.seek(0);
        System.out.println(rdFile.readBoolean());
        System.out.println(rdFile.readInt());
        System.out.println(rdFile.readDouble());
        byte[] s = new byte[13];
        rdFile.read(s);
        System.out.println(new String(s, "UTF-8"));
    }
}
