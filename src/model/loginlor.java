/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import penyilihan.loginx;

/**
 *
 * @author X
 */
public class loginlor {

    private Connection con;
    private String status;
    public static String username;
    public static String password;

    public loginlor() throws SQLException {
        con = new koneksipbo().connect();
    }

    public void logincek(String username, String password) throws SQLException {
        String query = "select level from user "
                + "where username='" + username + "' and "
                + "password='" + password + "'";
        
        loginlor.username=username;
//        ResultSet rs = con.(query);
//        if (rs.next()){
//            this.status = rs.getString("level");
//        }
    }
    
    public String getStatus(){
        return this.status;
    }
    
    
}
