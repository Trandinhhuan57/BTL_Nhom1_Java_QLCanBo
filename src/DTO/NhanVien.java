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
public class NhanVien extends CanBo{
    String congviec;

    public void setCongviec(String congviec) {
        this.congviec = congviec;
    }

    public String getCongviec() {
        return congviec;
    }
    public NhanVien()
    {
        
    }
    public NhanVien(String id, String hoten, Date ngaysinh, int gioitinh, String diachi, int idchưcvu,String congviec)
    {
        super();
        this.congviec = congviec;
    }
}
