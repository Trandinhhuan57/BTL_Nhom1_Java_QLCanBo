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
public class NguoiDung {

    String tendangnhap, matkhau, vaitro;
    String id;
    Date ngaytao;

    public void setNgaytao(Date ngaytao) {
        this.ngaytao = ngaytao;
    }

    public Date getNgaytao() {
        return ngaytao;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setTendangnhap(String tendangnhap) {
        this.tendangnhap = tendangnhap;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }

    public void setVaitro(String vaitro) {
        this.vaitro = vaitro;
    }

    public String getVaitro() {
        return vaitro;
    }

    public String getTendangnhap() {
        return tendangnhap;
    }

    public String getMatkhau() {
        return matkhau;
    }

    public NguoiDung() {

    }

    public NguoiDung(String id, String tendangnhap, String matkhau, String vaitro, Date ngaytao) {
        this.id = id;
        this.tendangnhap = tendangnhap;
        this.matkhau = matkhau;
        this.vaitro = vaitro;
        this.ngaytao = ngaytao;

    }
}
