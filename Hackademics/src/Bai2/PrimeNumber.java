
package Bai2;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        n = scan.nextInt();
        
        boolean prime = true ;
        for (int i=2; i<n;i++){
            if(n % i == 0){
                prime = false;
                break;
            }
        }
        
        if (prime)
            System.out.println(n+" is a prime number");
        else 
            System.out.println(n+" is Not a prime number");
       
    }
    
}
