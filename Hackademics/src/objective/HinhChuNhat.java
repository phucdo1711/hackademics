/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objective;

/**
 *
 * @author HP
 */
public class HinhChuNhat {
    private double chieuDai = 0;
    private double chieuCao = 0;
   
    public void setChieuDai(double chieuDai){
        this.chieuDai = chieuDai;
    }
    
    public double getChieuDai(){
        return this.chieuDai;
    }
    
    public void setChieuCao(double chieuCao){
        this.chieuCao = chieuCao;
    }
    
    public double getChieuCao(double chieuCao){
        return this.chieuCao;
    }
    
    public HinhChuNhat(){
        this.chieuCao = 5;
        this.chieuDai = 10;
    }
   
    public HinhChuNhat(double chieuDai, double chieuCao){
        System.out.println("dang khoi tao");
        this.chieuCao = chieuCao;
        this.chieuDai = chieuDai;
    }
   
    public double tinhDienTich(){
        return chieuDai*chieuCao;
    }
   
    public double tinhChuVi(){
        return 2 * (chieuDai + chieuCao);
    }
   
    public static void main(String[] args){ 
        HinhChuNhat hinhChuNhat = new HinhChuNhat();
        hinhChuNhat.setChieuCao(10);
        hinhChuNhat.setChieuDai(20);
        System.out.println("Chu vi: "+ hinhChuNhat.tinhChuVi());
        System.out.println("Dien tich: "+ hinhChuNhat.tinhDienTich());
    }
}
