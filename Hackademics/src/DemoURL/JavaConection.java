/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DemoURL;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

/**
 *
 * @author admin
 */
public class JavaConection {
    public static void main(String[] args) {
        try {
            URL u = new URL("http://www.kenh14.vn/");
             URLConnection uc = u.openConnection();
             uc.connect();
            String key=null;
        for (int n = 1; 
            (key=uc.getHeaderFieldKey(n)) != null; 
            n++) {
            System.out.println(key + ": " + uc.getHeaderField(key));
         }
}
catch (IOException e) {
  System.err.println(e);
}

    }

}
