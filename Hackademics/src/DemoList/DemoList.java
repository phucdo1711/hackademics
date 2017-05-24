/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DemoList;

import java.util.HashMap;

/**
 *
 * @author HP
 */
public class DemoList {
    public static void main(String[] args) {
        HashMap<Integer, String> myHashMap = new HashMap<>();
        myHashMap.put(1, "Chu Nhat");
        myHashMap.put(2, "Thu Hai");
        myHashMap.put(3, "Thu Ba");
        myHashMap.put(4, "Thu Tu");
        
        System.out.println(myHashMap.get(2));
    }
}
