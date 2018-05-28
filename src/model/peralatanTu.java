/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author X
 */
public class peralatanTu {
    private String id, barang, jumlah;
    
    public peralatanTu(String id, String barang, String jumlah){
        this.id = id;
        this.barang = barang;
        this.jumlah = jumlah;
    }

    peralatanTu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    peralatanTu(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String getId(){
        return id;
    }
    
    public void setId(String id){
        this.id = id;
    }
    
    public String getBarang(){
        return barang;
    }
    
    public void setBarang(String barang){
        this.barang = barang;
    }
    
    public String getJumlah(){
        return jumlah;
    }
    
    public void setJumlah(String jumlah){
        this.jumlah = jumlah;
    }
}
