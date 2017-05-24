/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

/**
 *
 * @author admin
 */
public class DemoJFrame {
    public static void main(String[] args){
        JFrame jFrame = new JFrame("My First Window Demo");
        jFrame.setSize(600,400);
        jFrame.setLocation(400,200);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);//hiện ra giữa màn hình
        jFrame.getContentPane().setBackground(Color.decode("#99CC66"));//set màu cho background
        //jFrame.setResizable(false);// Set cho Frame không chỉnh đc kích thước
        jFrame.setVisible(true);
        
        JPanel jPanel1 = new JPanel();
        jPanel1.setBounds(10,10, 200, 200);
        jPanel1.setBackground(Color.pink);
        jPanel1.setBorder(new TitledBorder(new LineBorder(Color.black, 2), "Hello"));
        
        JPanel jPanel2 = new JPanel();
        jPanel2.setBounds(10,10, 100, 100);
        jPanel2.setBackground(Color.green);
        jPanel2.setBorder(new TitledBorder(new LineBorder(Color.black, 2), "Goodbye"));
        
        
        jPanel1.add(jPanel2);
        jFrame.add(jPanel1);
        
    }
}
