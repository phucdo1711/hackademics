/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Thread;

import static Thread.DemoSynchronized.o;


/**
 *
 * @author admin
 */
public class Bai1 {
    static int x=0;
    
    static Runnable  myRunnable = new Runnable(){
        @Override
        public void run() {
            int i =0;
            while (i<10){
                synchronized (o){
                x++;
                i++;
                }
//                try {
//                    Thread.sleep(10);
//                } catch (InterruptedException ex) {
//                    //ogger.getLogger(Bai1.class.getName()).log(Level.SEVERE, null, ex);
//                }
            }
        }
    };
    
    static Runnable check = new Runnable(){
        @Override
        public void run() {
            int i =0;
                while(true){
                    System.out.println("x= "+x);
                
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        //Logger.getLogger(Bai1.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
        }
    };
    
    public static void main(String[] args) {
        Thread a = new Thread(myRunnable);
        Thread b = new Thread(myRunnable);
        Thread c = new Thread(myRunnable);
        Thread d = new Thread(myRunnable);
        Thread e = new Thread(myRunnable);
        Thread g = new Thread(myRunnable);
        Thread h = new Thread(myRunnable);
        Thread j = new Thread(myRunnable);
        Thread k = new Thread(myRunnable); 
        Thread l = new Thread(myRunnable);
        
        Thread ck = new Thread(check);
        
        a.start();
        b.start();
        c.start();
        d.start();
        e.start();
        g.start();
        h.start();
        j.start();
        k.start();
        l.start();
        ck.start();
        
        System.out.println("done");
    }
    
}
