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
public class Congnhan extends CanBo{
    String Bac;

    public void setBac(String Bac) {
        this.Bac = Bac;
    }

    public String getBac() {
        return Bac;
    }
    public Congnhan(){
        
    }
     public Congnhan(String id, String hoten, Date ngaysinh, int gioitinh, String diachi, int idchưcvu, String bac){
        super();
        this.Bac = bac;
    }
    
    
}
