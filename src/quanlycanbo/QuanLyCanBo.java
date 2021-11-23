/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlycanbo;

import Connection.Conn;
import Dao.sharequyen;

/**
 *
 * @author Hoang Pham
 */
public class QuanLyCanBo {

    
    public static void main(String[] args) {
        boolean s1 = sharequyen.nguoidangnhap.getVaitro().equals("ADMIN");
        
        System.out.print(s1);
    }
    
}
