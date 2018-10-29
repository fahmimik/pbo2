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
      this.barang = barang;
      this.jumlah = jumlah;
        this.id = id;
    }

    peralatanTu() {
        throw new UnsupportedOperationException("Not supported yet.");
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

    public void setBarang(String barang){
      this.barang = barang;
    }

    public String getBarang(){
        return barang;
    }
    public void setJumlah(String jumlah){
      this.jumlah = jumlah;
    }

    public String getJumlah(){
        return jumlah;
    }

}
