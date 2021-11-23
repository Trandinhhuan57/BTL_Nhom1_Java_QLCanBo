/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Connection.Conn;
import DTO.Congnhan;
import DTO.NhanVien;
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
public class nhanviendao {
     public List<NhanVien> hienthi(String name) throws Exception
    {
       
        String sql= "select IDCanBo, HoTen, NgaySinh ,GioiTinh, DiaChi,  CongViec from CanBo where HoTen like N'%"+name+"%' and  IDChucVu = 3";
        try(
            Connection con = Conn.OpenConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
                   
                )
        {try(ResultSet rs = pstmt.executeQuery();)
        {
            List<NhanVien> list = new ArrayList<>();
            while(rs.next())
            {
                NhanVien cb = new NhanVien();
                cb.setId(rs.getString("IDCanBo"));
                cb.setHoten(rs.getString("HoTen"));
                cb.setNgaysinh(rs.getDate("NgaySinh"));
                cb.setGioitinh(rs.getInt("GioiTinh"));
                cb.setDiachi(rs.getString("DiaChi"));
                cb.setCongviec(rs.getString("CongViec"));  
                list.add(cb);
            }
            return list;
        }
            
        }
        
        
    }
     public boolean  them(NhanVien cn) throws Exception
    {
        String sql = "insert into CanBo (HoTen, NgaySinh, GioiTinh, DiaChi, CongViec, IDChucvu)  values(?,?,?,?,?,?)";
               
        
        try(Connection con = Conn.OpenConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
                )
        {
           pstmt.setString(1, cn.getHoten());
           pstmt.setDate(2, new Date( cn.getNgaysinh().getTime()));
           pstmt.setInt(3, cn.getGioitinh());
           pstmt.setString(4, cn.getDiachi());
           pstmt.setString(5, cn.getCongviec());
           pstmt.setInt(6, cn.getIdchucvu());
                  
           return pstmt.executeUpdate()>0;
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return false;
        
    }
      public boolean  Sua(NhanVien cn) throws Exception
    {
        String sql = "update CanBo SET HoTen=?, NgaySinh = ?, GioiTinh = ?, DiaChi = ?, CongViec = ? ,IDChucvu = ? where IDCanBo = ?";
               
        
        try(Connection con = Conn.OpenConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
                )
        {
           pstmt.setString(7, cn.getId());
           pstmt.setString(1, cn.getHoten());
           pstmt.setDate(2, new Date( cn.getNgaysinh().getTime()));
           pstmt.setInt(3, cn.getGioitinh());
           pstmt.setString(4, cn.getDiachi());
           pstmt.setString(5, cn.getCongviec());
           pstmt.setInt(6, cn.getIdchucvu());
                  
           return pstmt.executeUpdate()>0;
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return false;
        
    }
    public boolean  xoa(String id) throws Exception
    {
        String sql = "delete from CanBo where IDCanBo=?";
               
        
        try(Connection con = Conn.OpenConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
                )
        {
            
           pstmt.setString(1, id);
          
                  
           return pstmt.executeUpdate()>0;
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return false;
    }
    public NhanVien findbyid(String id)throws Exception
    {
        String sql= "select IDCanBo, HoTen, NgaySinh ,GioiTinh, DiaChi,  CongViec from CanBo where IDCanBo = ? and IDChucVu=3";
        try(
            Connection con = Conn.OpenConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
                   
                )
        {
             pstmt.setString(1,id);
            try(ResultSet rs = pstmt.executeQuery();)
        {
            
            while(rs.next())
            {
                NhanVien cb = new NhanVien();
                cb.setId(rs.getString("IDCanBo"));
                cb.setHoten(rs.getString("HoTen"));
                cb.setNgaysinh(rs.getDate("NgaySinh"));
                cb.setGioitinh(rs.getInt("GioiTinh"));
                cb.setDiachi(rs.getString("DiaChi"));
                cb.setCongviec(rs.getString("CongViec"));  
                return cb;
            }
            
        }
           return null; 
        }
        
    }
    
}
