/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DemoURL;

import java.net.*;
import java.io.*;

public class Webcat {
    public static void main(String[] args) {
       
            try {
            URL u = new URL("http://kenh14.vn");
            InputStream in = u.openStream();
            InputStreamReader isr = new InputStreamReader(in);
            BufferedReader br = new BufferedReader(isr);
            String theLine;
            while ((theLine = br.readLine()) != null) {
            System.out.println(theLine);
            }
            } catch (IOException e) { System.err.println(e);} 
        
    }
}
