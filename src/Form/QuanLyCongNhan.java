/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Form;

import DTO.CanBo;
//import com.microsoft.sqlserver.jdbc.SQLServerException;
//import java.lang.System.Logger;
//import java.lang.System.Logger.Level;
import java.sql.*; 
import javax.swing.table.DefaultTableModel;
import Dao.CongNhanDao;
import DTO.Congnhan;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Hoang Pham
 */
public class QuanLyCongNhan extends javax.swing.JPanel {
    private DefaultTableModel tblmodel;
   
    
    
    public QuanLyCongNhan() {
        initComponents();
        
//        try
//        {
//        Connection conn = DriverManager.getConnection("jdbc:sqlserver://localhost;database=QuanLyCanBo","sa","123456");
//        String sql = "select cb.HoTen,cb.NamSinh , cb.GioiTinh, cb.DiaChi,  cn.Bac , cv.TenChucVu from CanBo cb inner join CongNhan cn on cb.IDCanBo= cn.IDCanBo  inner join ChucVu cv on cb.IDChucVu = cv.IDChucVu where cb.IDChucVu = 1";
//        PreparedStatement pr = conn.prepareStatement(sql);
//        ResultSet rs = pr.executeQuery();
//        DefaultTableModel model = (DefaultTableModel )jTable1.getModel();
//        while(rs.next())
//        {
//          Object objlist[] = {rs.getString("HoTen"),rs.getString("NamSinh"), rs.getString("GioiTinh"), rs.getString("DiaChi"), 
//          rs.getString("Bac"), rs.getString("TenChucVu")};
//          model.addRow(objlist);           
//        }          
//        }catch (SQLException ex)
//        {
//                   
//        }
       initTable();
       loadTable();
    }
    private void initTable()
    {
        tblmodel = new DefaultTableModel();
        tblmodel.setColumnIdentifiers(new String[] {"Họ tên", "Năm sinh", "Giới tính", "Địa chỉ","Bậc"});
        jTable1.setModel(tblmodel);
    }
    private void loadTable()
    {
        try
        {
            CongNhanDao dao = new CongNhanDao();
            List<Congnhan> list = dao.hienthi();            
            tblmodel.setRowCount(0);
            for(Congnhan cn : list)
            {
                tblmodel.addRow(new Object[]{cn.getHoten(), cn.getNgaysinh(),
                    cn.getGioitinh()==1?"Nam":"Nữ", cn.getDiachi(), cn.getBac()});
            }
            tblmodel.fireTableDataChanged();
        }catch(Exception e)
        {
            e.printStackTrace();
           
        }
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txthoten = new javax.swing.JTextField();
        txtdiachi = new javax.swing.JTextField();
        txtbac = new javax.swing.JTextField();
        rbdnam = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        txtngaysinh = new javax.swing.JFormattedTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnthem = new javax.swing.JButton();
        btnsua = new javax.swing.JButton();
        btnxoa = new javax.swing.JButton();
        btntimkiem = new javax.swing.JButton();
        txtidchucvu = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Quản lý công nhân");

        jLabel2.setText("Họ tên:");

        jLabel3.setText("Năm sinh:");

        jLabel4.setText("Giới tính: ");

        jLabel5.setText("Địa chỉ: ");

        jLabel6.setText("Bậc: ");

        buttonGroup1.add(rbdnam);
        rbdnam.setText("Nam");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Nữ");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        btnthem.setText("Thêm");
        btnthem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthemActionPerformed(evt);
            }
        });

        btnsua.setText("Sửa");

        btnxoa.setText("Xóa");

        btntimkiem.setText("Tìm kiếm");

        txtidchucvu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidchucvuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(193, 193, 193)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(txtngaysinh, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txthoten, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtdiachi, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtbac, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(rbdnam)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jRadioButton2)))
                                        .addGap(68, 68, 68)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(btnthem, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                                                    .addComponent(btnxoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(btntimkiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(btnsua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                            .addComponent(txtidchucvu, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(0, 32, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txthoten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtngaysinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(rbdnam)
                            .addComponent(jRadioButton2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtdiachi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtbac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtidchucvu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnthem)
                            .addComponent(btnsua))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnxoa)
                            .addComponent(btntimkiem))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
private void clearform()
{
    txthoten.setText("");
    txtngaysinh.setText("");
    txtdiachi.setText("");
    txtbac.setText("");
}
        
    private void btnthemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthemActionPerformed
//        StringBuilder sb = new StringBuilder();
        Congnhan cn = new Congnhan();
        try{
            
            cn.setHoten(txthoten.getText());
            
            cn.setNgaysinh(new SimpleDateFormat("dd/MM/yyyy").parse(txtngaysinh.getText())); 
           
            cn.setGioitinh(rbdnam.isSelected()?1 : 0);
            cn.setDiachi(txtdiachi.getText());
            cn.setBac(txtbac.getText());
            cn.setIdchucvu(Integer.parseInt(txtidchucvu.getText()));
//            cn.setIdchucvu(txtidchucvu);
            
            }catch(Exception e)
            {
                e.printStackTrace();
            }
        
        CongNhanDao dao = new CongNhanDao();
        try {
            dao.them(cn);
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(QuanLyCongNhan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_btnthemActionPerformed

    private void txtidchucvuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidchucvuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidchucvuActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnsua;
    private javax.swing.JButton btnthem;
    private javax.swing.JButton btntimkiem;
    private javax.swing.JButton btnxoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton rbdnam;
    private javax.swing.JTextField txtbac;
    private javax.swing.JTextField txtdiachi;
    private javax.swing.JTextField txthoten;
    private javax.swing.JTextField txtidchucvu;
    private javax.swing.JFormattedTextField txtngaysinh;
    // End of variables declaration//GEN-END:variables
}
