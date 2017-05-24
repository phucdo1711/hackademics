
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


public class ChatTranslator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.print("A: ");
            String textA = scan.nextLine();
            System.out.print("=> "+enToVi(textA)+"\n");
            System.out.print("B: ");
            String textB = scan.nextLine();
            System.out.print("=> "+viToEn(textB)+"\n");
            
        }
    }
    
    private static String viToEn(String text){
        String tl = "en";
        String sl = "vi";
        return getTranslatedContents(tl, sl, text);
    }
    
    private static String enToVi(String text){
        String tl = "vi";
        String sl = "en";
        return getTranslatedContents(tl, sl, text);
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
