/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import DTO.NguoiDung;
import Connection.Conn;
import DTO.Congnhan;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hoang Pham
 */
public class NguoiDungDao {

    public NguoiDung checklogin(String tendangnhap, String matkhau) throws Exception {
        String sql = "Select TenDangNhap, MatKhau, Vaitro from NguoiDung where TenDangNhap = ? and MatKhau = ?";

        try (Connection con = Conn.OpenConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);) {
            pstmt.setString(1, tendangnhap);
            pstmt.setString(2, matkhau);

            try (ResultSet rs = pstmt.executeQuery();) {
                if (rs.next()) {
                    NguoiDung nd = new NguoiDung();
                    nd.setTendangnhap(tendangnhap);
                    nd.setVaitro(rs.getString("vaitro"));
                    return nd;
                }

            }
        }
        return null;
    }

    public List<NguoiDung> hienthi(String name) throws Exception {

        String sql = "select IDNguoiDung, TenDangNhap, MatKhau, Vaitro,NgayTao from NguoiDung where TenDangNhap like '%"+name+"%'";
        try (
                Connection con = Conn.OpenConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);) {
            try (ResultSet rs = pstmt.executeQuery();) {
                List<NguoiDung> list = new ArrayList<>();
                while (rs.next()) {
                    NguoiDung nd = new NguoiDung();
                    nd.setId(rs.getString("IDNguoiDung"));
                    nd.setTendangnhap(rs.getString("TenDangNhap"));
                    nd.setMatkhau(rs.getString("MatKhau"));
                    nd.setVaitro(rs.getString("Vaitro"));
                    nd.setNgaytao(rs.getDate("NgayTao"));
                    list.add(nd);
                }
                return list;
            }

        }

    }

    public boolean them(NguoiDung nd) throws Exception {
        String sql = "insert into NguoiDung (TenDangNhap, MatKhau, vaitro)  values(?,?,?)";

        try (Connection con = Conn.OpenConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);) {
            pstmt.setString(1, nd.getTendangnhap());

            pstmt.setString(2, nd.getMatkhau());
            pstmt.setString(3, nd.getVaitro());

            return pstmt.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;

    }

    public boolean Sua(NguoiDung nd) throws Exception {
        String sql = "update  NguoiDung set  MatKhau=?, vaitro=? where TenDangNhap=?";

        try (Connection con = Conn.OpenConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);) {
 
            pstmt.setString(3, nd.getTendangnhap());
//                       pstmt.setString(1, nd.getId());
            pstmt.setString(1, nd.getMatkhau());
            pstmt.setString(2, nd.getVaitro());
            

            return pstmt.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;

    }

    public boolean xoa(String name) throws Exception {
        String sql = "delete from NguoiDung where TenDangNhap=?";

        try (Connection con = Conn.OpenConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);) {

            pstmt.setString(1, name);

            return pstmt.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public NguoiDung findbyid(String id) throws Exception {
        String sql = "select IDNguoiDung, TenDangNhap, MatKhau, Vaitro from NguoiDung where IDNguoiDung = ?";
        try (
                Connection con = Conn.OpenConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);) {
            pstmt.setString(1, id);
            try (ResultSet rs = pstmt.executeQuery();) {

                while (rs.next()) {
                    NguoiDung nd = new NguoiDung();
                    nd.setId(rs.getString("IDNguoiDung"));
                    nd.setTendangnhap(rs.getString("TenDangNhap"));
                    nd.setMatkhau(rs.getString("MatKhau"));
                    nd.setVaitro(rs.getString("Vaitro"));

                    return nd;
                }

            }
            return null;
        }

    }
     public NguoiDung findbytentk(String name) throws Exception {
        String sql = "select TenDangNhap from NguoiDung where TenDangNhap = ?";
        try (
                Connection con = Conn.OpenConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);) {
            pstmt.setString(1, name);
            try (ResultSet rs = pstmt.executeQuery();) {

                while (rs.next()) {
                    NguoiDung nd = new NguoiDung();                   
                    nd.setTendangnhap(rs.getString("TenDangNhap"));                    
                    return nd;
                }

            }
            return null;
        }

    }
}
