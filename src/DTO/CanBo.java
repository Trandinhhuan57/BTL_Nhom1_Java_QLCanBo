/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;
import java.util.Date;

public class CanBo {
    String id;
    String hoten;
    Date ngaysinh;
    int Gioitinh;
    String Diachi;
    int idchucvu;

    public void setIdchucvu(int idchucvu) {
        this.idchucvu = idchucvu;
    }

    public int getIdchucvu() {
        return idchucvu;
    }
    
    public CanBo(){}
    public CanBo(String id, String hoten, Date ngaysinh, int gioitinh, String diachi, int idchưcvu)
    {
        this.id = id;
        this.hoten = hoten;
        this.ngaysinh = ngaysinh;
        this.Gioitinh=gioitinh;
        this.Diachi=diachi;
        this.idchucvu=idchưcvu;
                
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public void setNgaysinh(Date ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public void setGioitinh(int Gioitinh) {
        this.Gioitinh = Gioitinh;
    }

    public void setDiachi(String Diachi) {
        this.Diachi = Diachi;
    }

    public String getId() {
        return id;
    }

    public String getHoten() {
        return hoten;
    }

    public Date getNgaysinh() {
        return ngaysinh;
    }

    public int getGioitinh() {
        return Gioitinh;
    }

    public String getDiachi() {
        return Diachi;
    }
    
}
