/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.util.Date;

/**
 *
 * @author Hoang Pham
 */
public class Kisu extends CanBo{
    String nganh;

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public void setLoaibang(String loaibang) {
        this.loaibang = loaibang;
    }

    public String getNganh() {
        return nganh;
    }

    public String getLoaibang() {
        return loaibang;
    }
    String loaibang;
    
    public Kisu(){
        
    }
    public Kisu(String id, String hoten, Date ngaysinh, int gioitinh, String diachi, int idchưcvu, String nganh, String loaibang){
        super();
        this.nganh = nganh;
        this.loaibang= loaibang;
    }
    
}
