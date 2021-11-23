/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Connection.Conn;
import DTO.Congnhan;

import DTO.Kisu;
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
public class KisuDao {
    public List<Kisu> hienthi(String name) throws Exception
    {
       
        String sql= "select IDCanBo, HoTen, NgaySinh ,GioiTinh, DiaChi,NganhDaoTao,LoaiBang from CanBo where HoTen like N'%"+name+"%' and  IDChucVu = 2";
        try(
            Connection con = Conn.OpenConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
                   
                )
        {try(ResultSet rs = pstmt.executeQuery();)
        {
            List<Kisu> list = new ArrayList<>();
            while(rs.next())
            {
                Kisu cb = new Kisu();
                cb.setId(rs.getString("IDCanBo"));
                cb.setHoten(rs.getString("HoTen"));
                cb.setNgaysinh(rs.getDate("NgaySinh"));
                cb.setGioitinh(rs.getInt("GioiTinh"));
                cb.setDiachi(rs.getString("DiaChi"));
                cb.setNganh(rs.getString("NganhDaoTao"));  
                cb.setLoaibang(rs.getString("LoaiBang"));
                list.add(cb);
            }
            return list;
        }
            
        }
        
    }
    public boolean  them(Kisu cn) throws Exception
    {
        String sql = "insert into CanBo (HoTen, NgaySinh, GioiTinh, DiaChi, NganhDaoTao,LoaiBang, IDChucvu)"
                + "  values(?,?,?,?,?,?,?)";
               
        
        try(Connection con = Conn.OpenConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
                )
        {
           pstmt.setString(1, cn.getHoten());
           pstmt.setDate(2, new Date( cn.getNgaysinh().getTime()));
           pstmt.setInt(3, cn.getGioitinh());
           pstmt.setString(4, cn.getDiachi());
           pstmt.setString(5, cn.getNganh());
           pstmt.setString(6, cn.getLoaibang());
           pstmt.setInt(7, cn.getIdchucvu());
                  
           return pstmt.executeUpdate()>0;
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return false;
        
    }
    public boolean  Sua(Kisu cn) throws Exception
    {
        String sql = "update CanBo SET HoTen=?, NgaySinh = ?, GioiTinh = ?, DiaChi = ?, NganhDaoTao = ?, LoaiBang = ? ,IDChucvu = ? where IDCanBo = ?";
               
        
        try(Connection con = Conn.OpenConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
                )
        {
           pstmt.setString(8, cn.getId());
           pstmt.setString(1, cn.getHoten());
           pstmt.setDate(2, new Date( cn.getNgaysinh().getTime()));
           pstmt.setInt(3, cn.getGioitinh());
           pstmt.setString(4, cn.getDiachi());
           pstmt.setString(5, cn.getNganh());
            pstmt.setString(6, cn.getLoaibang());
           pstmt.setInt(7, cn.getIdchucvu());
                  
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
       public Kisu findbyid(String id)throws Exception
    {
        String sql= "select IDCanBo, HoTen, NgaySinh ,GioiTinh, DiaChi, NganhDaoTao, LoaiBang from CanBo where IDCanBo = ? and IDChucVu=2";
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
                Kisu cb = new Kisu();
                cb.setId(rs.getString("IDCanBo"));
                cb.setHoten(rs.getString("HoTen"));
                cb.setNgaysinh(rs.getDate("NgaySinh"));
                cb.setGioitinh(rs.getInt("GioiTinh"));
                cb.setDiachi(rs.getString("DiaChi"));
                cb.setNganh(rs.getString("NganhDaoTao"));
                cb.setLoaibang(rs.getString("LoaiBang"));
                return cb;
            }
            
        }
           return null; 
        }
        
    }
    
}
