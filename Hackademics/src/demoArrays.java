/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
/**
 *
 * @author HP
 */
public class demoArrays {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList();
        list.add(4);
        list.add(20);
        list.add(0, 10);
        
        
        for (int item : list){
            System.out.print("["+item+"]");
        }
    }
}