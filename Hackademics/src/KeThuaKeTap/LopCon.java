/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KeThuaKeTap;

/**
 *
 * @author HP
 */
public class LopCon extends LopCha{
    public LopCon(String s){
        super(s);
        System.out.println("khoi tao o lop con:" + s);
    }
    public void printHello(){
        super.printHello();
        System.out.print("Xin chao");
    }
    
    public static void main(String[] args) {
        LopCon con = new LopCon("9");
        
        con.printHello();
    }
   
    
}
