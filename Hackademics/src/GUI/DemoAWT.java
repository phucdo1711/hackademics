/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author admin
 */
public class DemoAWT extends Frame{
    public DemoAWT(String title) {
        this.setTitle(title);
        this.setBounds(100,150,500,300); 
        this.setVisible(true);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e){
                dispose();
            }
    });
    }
    
    public static void main(String[] args) {
        DemoAWT demoAWT = new DemoAWT("First Frame Demo");
    }
}
