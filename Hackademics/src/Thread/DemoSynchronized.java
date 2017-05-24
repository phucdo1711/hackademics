/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Thread;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class DemoSynchronized {
    static int i =0, j = 0;
    static Object o = new Object();
    
    static void one(){
        synchronized (o){
            i++;
            j++;
        }
    }
    
    static void two(){
        synchronized (o){
            System.out.println("i = " + i);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException ex) {
            
            }
            System.out.println("j = " + j);
        }
    }
    
    public static void main(String[] args) {
        Thread a = new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){
                    one();
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        //Logger.getLogger(DemoSynchronized.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        
        Thread b = new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){
                    two();
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        //Logger.getLogger(DemoSynchronized.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        
        Thread demo = new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 0 ;
                while(i<10){
                    System.out.println(i);
                    i++;
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException ex) {
                        //Logger.getLogger(DemoSynchronized.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        });
        a.setPriority(1);
        b.setPriority(10);
        a.start();
        b.start();
        System.out.println("a: " + a.getPriority() + " b: "+ b.getPriority());
        
        demo.start();
        try {
            demo.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(DemoSynchronized.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Da in xong");
    }
}
