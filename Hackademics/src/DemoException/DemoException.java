/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DemoException;

public class DemoException {
    public static void main(String[] args) {
        int a = 8;
        int b = 0;
        try {
            System.out.println("Thuong : "+a/b);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Loi AR: "+ e.getMessage());
        } catch (Exception ee){
            System.out.println("Loi: "+ ee.getMessage());
        }
        System.out.println("Ket thuc chuong trinh");
        
    }
}
