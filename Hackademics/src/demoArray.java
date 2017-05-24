
import java.util.Scanner;

public class demoArray {
    public static void main(String[] args){
        int[] a = new int[100];
        int n = 0;
        System.out.print("Nhap so luong phan tu cua mang:");
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        
        for(int i = 0; i <n; i++){
            System.out.println("Nhap phan tu thu "+ (i+1) + ":");
             
        }
        /*int min = a[0];
        for (int i = 0; i<n; i++){  
            if (a[i] < min ){
                min = a[i];
            }
        }
        System.out.println("Gia tri nhp nhat cua mang la :"+min);*/
        
        /*int sum = 0;   
        for (int i = 0; i <n; i++){
            sum += a[i];
        }
        System.out.println("Tong cua mang la: "+ sum );*/
        
        /*System.out.print("In ra mang :");
        
        for (int i = 0; i<n; i++){
            System.out.print("["+a[i]+"]");
        }*/
        
        /*int temp = 0;
        for (int i = 0; i <n-1; i++){// thuat toan sap xep cac ptu cua mang
            for (int j=i+1; j<n ; j++){
                if(a[i] > a[j]){
                    temp = a[j];
                    a[j] = a[i];
                    a[i] = temp; 
                }
            }
        }
        for (int i = 0; i<n; i++){
            System.out.print("["+a[i]+"]");
        }*/
        
        
    }
}
