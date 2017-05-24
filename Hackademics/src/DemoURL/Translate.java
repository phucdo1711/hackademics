/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DemoURL;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mungnd-pc
 */
public class Translate {

    public static void main(String[] args) throws UnsupportedEncodingException {
        String tl = "vi";
        String sl = "en";

        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.print("Nhập từ cần dịch: ");
            String text = scan.nextLine();

            String output = getTranslatedContents(tl, sl, text);

            System.out.println("=> " + output);
        }
    }

    private static String getTranslatedContents(String tl, String sl, String text) {
        String data = "";
        try {
            data = "tl=" + tl + "&sl=" + sl;
            data += "&text=" + URLEncoder.encode(text, "UTF-8");
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(Translate.class.getName()).log(Level.SEVERE, null, ex);
        }

        StringBuilder content = new StringBuilder();
        try {
            URL url = new URL("http://bkitsoftware.com/translate.php");

            URLConnection urlConnection = url.openConnection();
            urlConnection.setDoOutput(true);
            OutputStreamWriter wr = new OutputStreamWriter(urlConnection.getOutputStream());
            wr.write(data);
            wr.flush();
            
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));

            String line;

            while ((line = bufferedReader.readLine()) != null) {
                content.append(line);
            }
            bufferedReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return content.toString();
    }
}
