/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DemoURL;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.Scanner;

/**
 *
 * @author mungnd-pc
 */
public class DemoPost {

    public static void main(String[] args) throws UnsupportedEncodingException, MalformedURLException, IOException {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap: ");
        String text = scan.nextLine();
        
        String data = URLEncoder.encode("tl", "UTF-8") 
                + "=" + URLEncoder.encode("en", "UTF-8");
        data += "&" + URLEncoder.encode("sl", "UTF-8") 
                + "=" + URLEncoder.encode("vi", "UTF-8");
        data += "&" + URLEncoder.encode("text", "UTF-8") 
                + "=" + URLEncoder.encode(text, "UTF-8");

        URL url = new URL("http://bkitsoftware.com/translate.php");
        URLConnection conn = url.openConnection();
        conn.setDoOutput(true);
        OutputStreamWriter wr = new OutputStreamWriter(conn.getOutputStream());
        wr.write(data);
        wr.flush();

        BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String line;
        while ((line = rd.readLine()) != null) {
            System.out.println(line);
        }
        wr.close();
        rd.close();
    }
}