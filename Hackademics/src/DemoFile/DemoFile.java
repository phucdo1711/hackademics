/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DemoFile;

import java.io.File;
import java.io.IOException;

public class DemoFile {
    public static void main(String[] args) throws IOException {
        File file= new File("C:\\");
        /*if(!file.exists()){
            file.mkdirs();
        }*/
        System.out.println(file.getName());
        System.out.println(file.getAbsolutePath());
        
        File[] arrFile = file.listFiles();
        for(File f:arrFile){
            System.out.println(f.getAbsolutePath());
        }
        //file.delete();
    }
}
