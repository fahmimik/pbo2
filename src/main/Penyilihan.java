/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.sql.SQLException;
import kontroler.klogin;
import model.loginlor;
import penyilihan.loginx;
import penyilihan.loginx;

/**
 *
 * @author Mik
 */
public class Penyilihan {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        
        loginx frame = new loginx();
        loginlor model = new loginlor();
        klogin kontroler  = new klogin(model,frame);
        
        //pinjem frame = new pinjem();
        frame.setVisible(true);
    }
    
}
