/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demodb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


/**
 *
 * @author admin
 */
public class QlsvDB {
    Connection c = null;
    Statement stmt = null;
    
    //Tên của file DB
    String DB_Name = "qlsv.db";
    
    public QlsvDB(){
        initDB();
    }
    
    private void initDB(){
        try{
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:"+DB_Name);
                stmt = c.createStatement();
                String sql_create_tb = "CREATE TABLE IF NOT EXISTS SinhVien("//tạo bảng trog database
                        + " id INTEGER PRIMARY KEY AUTOINCREMENT,"
                        + " mssv CHAR(6) NOT NULL, "
                        + " ho_ten TEXT NOT NULL,"
                        + " gioi_tinh INTEGER NOT NULL)";
                stmt.execute(sql_create_tb);
        } catch(Exception e) {
            System.err.print("Lỗi: "+ e.getMessage());
            e.printStackTrace();
        }
    }
    
    public void insertSinhVien(SinhVien sv){
        if(c != null){
            try {
                stmt.execute("INSERT INTO SinhVien "
                        + "(mssv, ho_ten, gioi_tinh) "
                        + "VALUES('"+ sv.getMssv()+ "', "
                        + "'" + sv.getHoTen()+"', "
                        + sv.getGioiTinh() + ")");
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
     
    public ArrayList<SinhVien> getAllSinhVien(){
        ArrayList listSinhVien = new ArrayList();
        try {
            ResultSet rs = stmt.executeQuery("SELECT * FROM SinhVien");
            while(rs.next()){
                SinhVien sv = new SinhVien();
                sv.setId(rs.getInt("id"));
                sv.setMssv(rs.getString("mssv"));
                sv.setHoTen(rs.getString("ho_ten"));
                sv.setGioiTinh(rs.getInt("gioi_tinh"));
                
                listSinhVien.add(sv);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
                
        return listSinhVien;
    }
}
