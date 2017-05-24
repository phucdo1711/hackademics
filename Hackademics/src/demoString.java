
import java.util.Scanner;

public class demoString {
    public static void main(String[] args){
        String n1,n2; 
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        n1 = scan.nextLine();
        n1 = n1.trim();
        n1= n1.toLowerCase();
        n2 = "";

        for(int i = 0; i < n1.length(); i++) {
            if(n1.charAt(i) == ' ') {
                if(n1.charAt(i - 1) == ' '){
                  
                }else{
                
                    n2  = n2 + n1.charAt(i);
                }
            } else {
                n2  = n2 + n1.charAt(i);
            }
        }
        String  s = n2.substring(0,1);
        n2 = s.toUpperCase() + n2.substring(1);
        char s1;
       
        for(int i = 1; i < n2.length(); i ++){
            s1 = n2.charAt(i);
            if(n2.charAt(i-1)== ' '){
                s1 = Character.toUpperCase(s1);
                n2 = n2.replace(n2.charAt(i), s1);
            }  
        }
        System.out.println("Hello " + n2);
    }
    
}
