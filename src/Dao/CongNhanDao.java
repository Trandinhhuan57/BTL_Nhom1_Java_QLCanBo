/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;
import Connection.Conn;
import DTO.Congnhan;
import java.sql.Connection;
import java.sql.*; 
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Hoang Pham
 */
public class CongNhanDao {
    
    public List<Congnhan> hienthi(String name) throws Exception
    {
       
        String sql= "select IDCanBo, HoTen, NgaySinh ,GioiTinh, DiaChi,  Bac from CanBo where  HoTen like N'%"+name+"%' and IDChucVu = 1  ";
        try(
            Connection con = Conn.OpenConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
                   
                )
        {try(ResultSet rs = pstmt.executeQuery();)
        {
            List<Congnhan> list = new ArrayList<>();
            while(rs.next())
            {
                Congnhan cb = new Congnhan();
                cb.setId(rs.getString("IDCanBo"));
                cb.setHoten(rs.getString("HoTen"));
                cb.setNgaysinh(rs.getDate("NgaySinh"));
                cb.setGioitinh(rs.getInt("GioiTinh"));
                cb.setDiachi(rs.getString("DiaChi"));
                cb.setBac(rs.getString("Bac"));  
                list.add(cb);
            }
            return list;
        }
            
        }
        
    }
    
    public boolean  them(Congnhan cn) throws Exception
    {
        String sql = "insert into CanBo (HoTen, NgaySinh, GioiTinh, DiaChi, Bac, IDChucvu)  values(?,?,?,?,?,?)";
               
        
        try(Connection con = Conn.OpenConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
                )
        {
           pstmt.setString(1, cn.getHoten());
           pstmt.setDate(2, new Date( cn.getNgaysinh().getTime()));
           pstmt.setInt(3, cn.getGioitinh());
           pstmt.setString(4, cn.getDiachi());
           pstmt.setString(5, cn.getBac());
           pstmt.setInt(6, cn.getIdchucvu());
                  
           return pstmt.executeUpdate()>0;
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return false;
        
    }
    public boolean  Sua(Congnhan cn) throws Exception
    {
        String sql = "update CanBo SET HoTen=?, NgaySinh = ?, GioiTinh = ?, DiaChi = ?, Bac = ? ,IDChucvu = ? where IDCanBo = ?";
               
        
        try(Connection con = Conn.OpenConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
                )
        {
           pstmt.setString(7, cn.getId());
           pstmt.setString(1, cn.getHoten());
           pstmt.setDate(2, new Date( cn.getNgaysinh().getTime()));
           pstmt.setInt(3, cn.getGioitinh());
           pstmt.setString(4, cn.getDiachi());
           pstmt.setString(5, cn.getBac());
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
    public Congnhan findbyid(String id)throws Exception
    {
        String sql= "select IDCanBo, HoTen, NgaySinh ,GioiTinh, DiaChi,  Bac from CanBo where IDCanBo = ? and IDChucVu=1";
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
                Congnhan cb = new Congnhan();
                cb.setId(rs.getString("IDCanBo"));
                cb.setHoten(rs.getString("HoTen"));
                cb.setNgaysinh(rs.getDate("NgaySinh"));
                cb.setGioitinh(rs.getInt("GioiTinh"));
                cb.setDiachi(rs.getString("DiaChi"));
                cb.setBac(rs.getString("Bac"));  
                return cb;
            }
            
        }
           return null; 
        }
        
    }
    
    public List<Congnhan> timkiembangten(String name) throws Exception
    {
        String sql= "select IDCanBo, HoTen, NgaySinh ,GioiTinh, DiaChi,  Bac from CanBo where HoTen like '"+name+"'  and IDChucVu = 1";
        try(
            Connection con = Conn.OpenConnection();
            PreparedStatement pstmt = con.prepareStatement(sql);
                   
                )
        {try(ResultSet rs = pstmt.executeQuery();)
        {
            List<Congnhan> list = new ArrayList<>();
            while(rs.next())
            {
                Congnhan cb = new Congnhan();
                cb.setId(rs.getString("IDCanBo"));
                cb.setHoten(rs.getString("HoTen"));
                cb.setNgaysinh(rs.getDate("NgaySinh"));
                cb.setGioitinh(rs.getInt("GioiTinh"));
                cb.setDiachi(rs.getString("DiaChi"));
                cb.setBac(rs.getString("Bac"));  
                list.add(cb);
            }
            return list;
        }
            
        }
        
    }

    public List<Congnhan> hienthi() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
            
}
