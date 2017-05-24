/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DemoFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class DemoFile1 {
    public static void main(String[] args) throws IOException {
        PrintWriter printWriter = new PrintWriter(new FileOutputStream("in.txt"));
        printWriter.println("line 1");
        printWriter.println("line 2");
        printWriter.flush();
        printWriter.close();
        
        Scanner scan = new Scanner(new FileInputStream("in.txt"));  
        while(scan.hasNext()){
            System.out.println(scan.nextLine());
        }
    }
}
