/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author X
 */
public class koneksipbo {
    private static Connection connection = null;
    private final String url = "jdbc:postgresql://localhost:5432/peminjaman_PBO";
    private final String user = "postgres";
    private final String password = "admin";

    public Connection connect() throws SQLException{
        try{
            connection=DriverManager.getConnection(url,user,password);
            System.out.println("koneksi berhasil");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        return connection;
    }
}
