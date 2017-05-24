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
public class NhanVien {
      private String HoTen ;
      private double heSoLuong;
      private int soNgayCong;
      public double luongCoBan = 2200;
      
      public void setHoTen(String HoTen){
          this.HoTen = HoTen;
      }
      
      public String getHoTen(){
          return this.HoTen;
      }
      
      public void setHeSoLuong(double heSoLuong){
          this.heSoLuong = heSoLuong;
      }
      
      public double getHeSoLuong(){
          return this.heSoLuong;
      }
      
      public void setSoNgayCong(int soNgayCong){
          this.soNgayCong = soNgayCong;
      }
      
      public int getSoNgayCong(){
          return this.soNgayCong;
      }
      
      
      public NhanVien(){
          this.HoTen = "Do Thanh Phuc";
          this.heSoLuong = 2.5;
          this.soNgayCong = 30;
      }
      public double tinhLuong(){
          return (heSoLuong* luongCoBan * soNgayCong)/27;
      }
      
      
      
      public static void main(String[] args){
          NhanVien NhanVien = new NhanVien();
         
          System.out.println("Ho va Ten: "+NhanVien.getHoTen());
          System.out.println("Luong: "+ NhanVien.tinhLuong());
      }
}
