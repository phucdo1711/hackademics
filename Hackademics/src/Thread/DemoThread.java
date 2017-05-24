/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Thread;

/**
 *
 * @author HP
 */
public class DemoThread {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {  
                int i = 0;
                while(i<20){
                    System.out.println(i);
                    i++;
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException ex){
                        
                    }
                }
            }
        });
        thread.start();
        System.out.println("Da in xong");
    }
    
    
}
