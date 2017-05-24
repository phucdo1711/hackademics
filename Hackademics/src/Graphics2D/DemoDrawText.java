/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graphics2D;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

/**
 *
 * @author admin
 */
public class DemoDrawText extends Frame {
    public DemoDrawText(){
        super("Demo draw text");
        setBounds(100, 100, 300, 300);
        setVisible(true);
    }
    @Override
    public void paint(Graphics g){
        super.paint(g);
        //g.setColor(Color.blue);
        g.drawString("Hello", 20, 100);
        //g.setColor(Color.green);
        g.drawString("Đỗ Thành Phúc", 20, 140);
        g.drawLine(20, 120, 60, 120);
        g.drawOval(15, 120, 100, 30);
        g.fillOval(30, 160, 100, 150);
    }
    
    public static void main(String[] args) {
        new DemoDrawText();
    }
    
}
