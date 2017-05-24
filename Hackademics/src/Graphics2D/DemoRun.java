/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graphics2D;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;


/**
 *
 * @author admin
 */
public class DemoRun extends Frame{
    //tọa độ ban đầu
    int x = 0 , y = 100;
    int vy = 1;
    int vx = 2;
    //Image image;
    
    public DemoRun(){
        super("run");
        setBounds(400,120,500,500);
        setVisible(true);
        //image = Toolkit.getDefaultToolkit().getImage("ca.gif");
    }
    
    @Override
    
    public void paint(Graphics g){
        super.paint(g);
        
        //g.drawLine(x, y, x + 20 , y );
        
        g.setColor(Color.red);
        
        g.fillOval(x, y + 50, 20, 20 );
        
        
        g.setColor(Color.green);
        
        g.fillOval(500-x, y + 100, 20, 20 );
        //g.drawImage(image, x, y,100,50, this);
    }
    
    public void move(){
        (new Thread(new Runnable() {
            @Override
            public void run() {
                
                while(true){
                    x = x +vx;
                    y = y +vy;
                    if (x == 480 || x ==0){
                        vx = -vx;
                    }
                    if (y == 480 || y ==0){
                        vy = -vy;
                    }
                    repaint();
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                    
                }
            }
        })).start();
    }
    
    public static void main(String[] args) {
        new DemoRun().move();
        
    }
}
