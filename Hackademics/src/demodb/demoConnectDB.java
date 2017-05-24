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

/**
 *
 * @author admin
 */
public class demoConnectDB {

    public static void main(String[] args) {
        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName("org.sqlite.JDBC");
            try {
                c = DriverManager.getConnection("jdbc:sqlite:test.db");
                stmt = c.createStatement();
                String sql_create_tb = "CREATE TABLE SinhVien("//tạo bảng trog database
                        + " _id INTEGER PRIMARY KEY AUTOINCREMENT,"
                        + " mssv CHAR(6) NOT NULL, "
                        + " ho_ten TEXT NOT NULL,"
                        + " gioi_tinh INTEGER NOT NULL)";
                //stmt.execute(sql_create_tb);
                String sql_insert_data = "INSERT INTO "
                        + "SinhVien(mssv, ho_ten, gioi_tinh)"
                        + " VALUES ('1501040153', 'Do Thanh Phuc', 0)";
                //stmt.execute(sql_insert_data);

                sql_insert_data = "INSERT INTO "
                        + "SinhVien(mssv, ho_ten, gioi_tinh)"
                        + " VALUES ('1501040154', 'Nguyen Hoai Anh Hiep', 0)";
                //stmt.execute(sql_insert_data);

                sql_insert_data = "INSERT INTO "
                        + "SinhVien(mssv, ho_ten, gioi_tinh)"
                        + " VALUES ('1501040155', 'Pham Huy Hoai Anh Hiep', 1)";
                //stmt.execute(sql_insert_data);

                String sql_update = "UPDATE SinhVien set ho_ten = 'Phạm Hoài Anh'" + ", gioi_tinh = 1 WHERE _id = 2";
                //stmt.executeUpdate(sql_update); //update thông tin id =2
                
                String sql_delete = "DELETE FROM SinhVien WHERE _id = 3 ";
                //stmt.execute(sql_delete);
                ResultSet rs = stmt.executeQuery("SELECT * FROM SinhVien");

                while (rs.next()) {
                    System.out.println("ID: " + rs.getInt("_id"));
                    System.out.println("Mã số sinh viên: " + rs.getString("mssv"));
                    System.out.println("Họ tên: " + rs.getString("ho_ten"));
                    System.out.println("Giới tính: " + ((rs.getInt("gioi_tinh") == 0) ? "nam" : "nữ"));
                    System.out.println();
                }

                stmt.close();
                c.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        } catch (ClassNotFoundException ex) {

        }

    }
}
