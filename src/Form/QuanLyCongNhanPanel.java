/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Form;

import DTO.Congnhan;
import DTO.Kisu;
import Dao.CongNhanDao;
import Dao.KisuDao;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Hoang Pham
 */
public class QuanLyCongNhanPanel extends javax.swing.JPanel {
  private DefaultTableModel tblmodel;
  String strFile = "";
  
    /**
     * Creates new form QuanLyCongNhanPanel
     */
    public QuanLyCongNhanPanel() {
       initComponents();
            
       initTable();
       loadTable();
    }
    private void initTable()
    {
        tblmodel = new DefaultTableModel();
        tblmodel.setColumnIdentifiers(new String[] {"ID","Họ tên", "Năm sinh", "Giới tính", "Địa chỉ","Bậc"});
        jTable1.setModel(tblmodel);
    }
    
    private void loadTable()
    {
        try
        {
            CongNhanDao dao = new CongNhanDao();
            List<Congnhan> list = dao.hienthi(txthoten.getText());            
            tblmodel.setRowCount(0);
            for(Congnhan cn : list)
            {
                tblmodel.addRow(new Object[]{cn.getId(),cn.getHoten(), cn.getNgaysinh(),
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
        txttimkiem = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txthoten = new javax.swing.JTextField();
        txtngaysinh = new javax.swing.JTextField();
        txtdiachi = new javax.swing.JTextField();
        rbdnam = new javax.swing.JRadioButton();
        rbdnu = new javax.swing.JRadioButton();
        txtbac = new javax.swing.JTextField();
        btntimkiem = new javax.swing.JButton();
        btnthem = new javax.swing.JButton();
        btnsua = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtidchucvu = new javax.swing.JTextField();
        btnclearform = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Quản lý công nhân");

        jLabel2.setText("ID:");

        txttimkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttimkiemActionPerformed(evt);
            }
        });

        jLabel3.setText("Họ tên:");

        jLabel4.setText("Ngày sinh:");

        jLabel5.setText("Giới tính:");

        jLabel6.setText("Địa chỉ:");

        jLabel7.setText("Bậc:");

        buttonGroup1.add(rbdnam);
        rbdnam.setText("Nam");

        buttonGroup1.add(rbdnu);
        rbdnu.setText("Nữ");

        btntimkiem.setIcon(new javax.swing.ImageIcon("E:\\JAVA1\\QuanLyCanBo\\src\\icon\\magnifying-glass.png")); // NOI18N
        btntimkiem.setText("Tìm kiếm");
        btntimkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntimkiemActionPerformed(evt);
            }
        });

        btnthem.setIcon(new javax.swing.ImageIcon("E:\\JAVA1\\QuanLyCanBo\\src\\icon\\insert.png")); // NOI18N
        btnthem.setText("Thêm");
        btnthem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthemActionPerformed(evt);
            }
        });

        btnsua.setIcon(new javax.swing.ImageIcon("E:\\JAVA1\\QuanLyCanBo\\src\\icon\\updated.png")); // NOI18N
        btnsua.setText("Sửa");
        btnsua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsuaActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon("E:\\JAVA1\\QuanLyCanBo\\src\\icon\\trash.png")); // NOI18N
        jButton4.setText("Xóa");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        txtidchucvu.setText("1");

        btnclearform.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/eraser.png"))); // NOI18N
        btnclearform.setText("Tạo mới");
        btnclearform.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearformActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnthem)
                                .addGap(26, 26, 26)
                                .addComponent(btnsua)
                                .addGap(24, 24, 24)
                                .addComponent(jButton4))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(85, 85, 85)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txthoten)
                                    .addComponent(txtngaysinh)
                                    .addComponent(txtdiachi)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rbdnam)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rbdnu))
                                    .addComponent(txtbac, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtidchucvu, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 545, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator2)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(145, 145, 145)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnclearform)
                                    .addGroup(layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabel2)
                                        .addGap(117, 117, 117)
                                        .addComponent(txttimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(111, 111, 111)))
                                .addGap(18, 18, 18)
                                .addComponent(btntimkiem)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txttimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txthoten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtngaysinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(rbdnam)
                    .addComponent(rbdnu)
                    .addComponent(txtidchucvu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtdiachi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtbac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnthem)
                    .addComponent(btnsua)
                    .addComponent(jButton4)
                    .addComponent(btnclearform)
                    .addComponent(btntimkiem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
private void clearform()
{
    txttimkiem.setText("");
    txthoten.setText("");
    txtngaysinh.setText("");
    buttonGroup1.clearSelection();
    txtdiachi.setText("");
    txtbac.setText("");
}
    private void txttimkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttimkiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttimkiemActionPerformed

    private void btnthemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthemActionPerformed
        StringBuilder sb = new StringBuilder();
        if(txthoten.getText().equals("")){
             sb.append("Ho ten không được để trống \n");
        txthoten.setBackground(Color.red);
        }else
        {
            txthoten.setBackground(Color.white);
        }
        if(txtngaysinh.getText().equals("")){
             sb.append("Ngày sinh không được để trống \n");
        txtngaysinh.setBackground(Color.red);
        }else
        {
            txtngaysinh.setBackground(Color.white);
        }
        if(sb.length()>0){
            JOptionPane.showMessageDialog(this, sb.toString(), "Error" , JOptionPane.ERROR_MESSAGE);
        return;
        }
         int choice = JOptionPane.showConfirmDialog(this, "Bạn có muốn thêm không?","Hỏi",
        JOptionPane.YES_OPTION );
        if(choice == JOptionPane.NO_OPTION)
            return;
        
        Congnhan cn = new Congnhan();
        
            
            cn.setHoten(txthoten.getText());
            try{
            cn.setNgaysinh(new SimpleDateFormat("yyyy-MM-dd").parse(txtngaysinh.getText())); 
            
            }catch(Exception e)
            {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Định dạng ngày phải nập đúng theo mẫu yyyy-MM-dd!");
            }
            cn.setGioitinh(rbdnam.isSelected()?1 : 0);
            cn.setDiachi(txtdiachi.getText());
            cn.setBac(txtbac.getText());
            
            cn.setIdchucvu(Integer.parseInt(txtidchucvu.getText()));
//            cn.setIdchucvu(txtidchucvu);
           
         CongNhanDao dao = new CongNhanDao();
        try {
            if(dao.them(cn))
            {
                JOptionPane.showMessageDialog(this, "Thêm thành công!");
                clearform();
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Thêm thất bại!");
            }
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(QuanLyCongNhanPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        loadTable();
    }//GEN-LAST:event_btnthemActionPerformed

    private void btnsuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsuaActionPerformed
       StringBuilder sb = new StringBuilder();
        if(txttimkiem.getText().equals("")){
             sb.append("id không được để trống \n");
        
        }else
        {
            txttimkiem.setBackground(Color.white);
        }
      if(txthoten.getText().equals("")){
             sb.append("Ho ten không được để trống \n");
        txthoten.setBackground(Color.red);
        }else
        {
            txthoten.setBackground(Color.white);
        }
        if(txtngaysinh.getText().equals("")){
             sb.append("Ngày sinh không được để trống \n");
        txtngaysinh.setBackground(Color.red);
        }else
        {
            txtngaysinh.setBackground(Color.white);
        }
        if(sb.length()>0){
            JOptionPane.showMessageDialog(this, sb.toString(), "Error" , JOptionPane.ERROR_MESSAGE);
        return;
        }
         int choice = JOptionPane.showConfirmDialog(this, "Bạn có muốn Sửa không?","Hỏi",
        JOptionPane.YES_OPTION );
        if(choice == JOptionPane.NO_OPTION)
            return;
        
        Congnhan cn = new Congnhan();
        
            cn.setId(txttimkiem.getText());
            cn.setHoten(txthoten.getText()); 
            try{
            cn.setNgaysinh(new SimpleDateFormat("yyyy-MM-dd").parse(txtngaysinh.getText())); 
             
            }catch(Exception e)
            {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Định dạng ngày phải nập đúng theo mẫu yyyy-MM-dd!");
            }
            cn.setGioitinh(rbdnam.isSelected()?1 : 0);
            cn.setDiachi(txtdiachi.getText());
            cn.setBac(txtbac.getText());            
            cn.setIdchucvu(Integer.parseInt(txtidchucvu.getText()));
//            cn.setIdchucvu(txtidchucvu);
           
         CongNhanDao dao = new CongNhanDao();
        try {
            if(dao.Sua(cn))
            {
                JOptionPane.showMessageDialog(this, "Sửa thành công!");
                clearform();
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Sửa thất bại!");
            }
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(QuanLyCongNhanPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        loadTable();
    }//GEN-LAST:event_btnsuaActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        StringBuilder sb = new StringBuilder();
        if(txttimkiem.getText().equals("")){
             sb.append("id không được để trống \n");
        
        }else
        {
            txttimkiem.setBackground(Color.white);
        } 
        if(sb.length()>0){
            JOptionPane.showMessageDialog(this, sb.toString(), "Error" , JOptionPane.ERROR_MESSAGE);
        return;
        }
        int choice = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa hay không?","Hỏi",
        JOptionPane.YES_OPTION );
        if(choice == JOptionPane.NO_OPTION)
            return;
        CongNhanDao dao = new CongNhanDao();
      try {
          if(dao.xoa(txttimkiem.getText()))
          {
              loadTable();
              JOptionPane.showMessageDialog(this, "xóa thành công!");
              clearform();
          }
          else
          {
              JOptionPane.showMessageDialog(this, "xóa thất bại!");
          }
      } catch (Exception ex) {
          Logger.getLogger(QuanLyCongNhanPanel.class.getName()).log(Level.SEVERE, null, ex);
      }
      
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btntimkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntimkiemActionPerformed
        loadTable();
      try{
         CongNhanDao dao = new CongNhanDao();
         Congnhan cn = dao.findbyid(txttimkiem.getText());   
          if(cn!=null)
          {
              
                   txthoten.setText(cn.getHoten());
                   txtngaysinh.setText(String.valueOf(cn.getNgaysinh()));
                   rbdnam.setSelected(cn.getGioitinh()==1?true:false);   
                   rbdnu.setSelected(cn.getGioitinh()==0?true:false); 
                   txtdiachi.setText(cn.getDiachi());
                   txtbac.setText(cn.getBac());
          }
//          else
//              JOptionPane.showMessageDialog(this, "không tìm thấy kĩ sư nào có id là:"+ txttimkiem.getText());
            
            
            
     }catch(Exception e)
     {
         e.printStackTrace();
     }
     
       
     
    }//GEN-LAST:event_btntimkiemActionPerformed

    private void btnclearformActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearformActionPerformed
        
        clearform();
        loadTable();
    }//GEN-LAST:event_btnclearformActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
//        strFile = jTextField1.getText();
//        loadTable();
        
        try{
            int row = jTable1.getSelectedRow();
            if(row>=0)
            {
               String id = (String) jTable1.getValueAt(row, 0);
               CongNhanDao dao = new CongNhanDao();
               Congnhan cn = dao.findbyid(id);
               
               if(cn !=null)
               {
                   
                   txttimkiem.setText(String.valueOf(cn.getId()));
                   txthoten.setText(cn.getHoten());
                   txtngaysinh.setText(String.valueOf(cn.getNgaysinh()));
                   rbdnam.setSelected(cn.getGioitinh()==1?true:false);   
                   rbdnu.setSelected(cn.getGioitinh()==0?true:false); 
                   txtdiachi.setText(cn.getDiachi());
                   txtbac.setText(cn.getBac());
                   
                   
                   
               }
            }
        }catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jTable1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnclearform;
    private javax.swing.JButton btnsua;
    private javax.swing.JButton btnthem;
    private javax.swing.JButton btntimkiem;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton rbdnam;
    private javax.swing.JRadioButton rbdnu;
    private javax.swing.JTextField txtbac;
    private javax.swing.JTextField txtdiachi;
    private javax.swing.JTextField txthoten;
    private javax.swing.JTextField txtidchucvu;
    private javax.swing.JTextField txtngaysinh;
    private javax.swing.JTextField txttimkiem;
    // End of variables declaration//GEN-END:variables
}
