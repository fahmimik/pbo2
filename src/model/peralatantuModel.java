/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author X
 */
public class peralatantuModel {
    
    koneksipbo con = new koneksipbo();
    private PreparedStatement statement;
    
    public boolean insert (peralatanTu p, PreparedStatement PreparedStatement) throws SQLException {
        String query = "INSERT INTO peralatanTu VALUES (DEFAULT, ?, ?);";
        try {
            PreparedStatement  statement = con.connect().prepareStatement(query);
            statement.setString(1, p.getBarang());
            statement.setString(2, p.getJumlah());
            
            int row = statement.executeUpdate();
            if (row > 0){
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(peralatantuModel.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public List<peralatanTu> getData() {
       List<peralatanTu> allperalatanTu = new ArrayList<>();
       String query = "select * from peralatanTu";
       try {
           PreparedStatement statement = con.connect().prepareStatement(query);
           ResultSet rs = statement.executeQuery();
           while (rs.next()){
              peralatanTu p = new peralatanTu(
                      rs.getString(1),
                      rs.getString(2),
                      rs.getString(3)
              );
              allperalatanTu.add(p);
           }
           statement.close();
       } catch (SQLException ex){
           Logger.getLogger(peralatantuModel.class.getName()).log(Level.SEVERE, null, ex);
       }
        return allperalatanTu;
    }
    
    
}
    