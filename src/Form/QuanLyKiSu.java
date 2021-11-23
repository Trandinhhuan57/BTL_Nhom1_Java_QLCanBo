/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Form;

import DTO.Congnhan;
import DTO.Kisu;
import Dao.CongNhanDao;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultComboBoxModel;
import Dao.KisuDao;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Hoang Pham
 */
public class QuanLyKiSu extends javax.swing.JPanel {
 private DefaultTableModel tblmodel;
    /**
     * Creates new form QuanLyKiSu
     */
    public QuanLyKiSu() {
        initComponents();
        initTable();
       loadTable();
       nganh();
       loaibang();
    }

    private void initTable()
    {
        tblmodel = new DefaultTableModel();
        tblmodel.setColumnIdentifiers(new String[] {"ID","Họ tên", "Năm sinh", "Giới tính", "Địa chỉ","Ngành","Loại bằng"});
        jTable1.setModel(tblmodel);
    }
    private void loadTable()
    {
        try
        {
            KisuDao dao = new KisuDao();
            List<Kisu> list = dao.hienthi(txthoten.getText());            
            tblmodel.setRowCount(0);
            for(Kisu cn : list)
            {
                tblmodel.addRow(new Object[]{cn.getId(),cn.getHoten(), cn.getNgaysinh(),
                    cn.getGioitinh()==1?"Nam":"Nữ", cn.getDiachi(), cn.getNganh(),cn.getLoaibang()});
            }
            tblmodel.fireTableDataChanged();
        }catch(Exception e)
        {
            e.printStackTrace();
           
        }
    }
    private void nganh()
    {
        String[] nganh = new String[]{"CNTT","KTLT","KHMT","QTM"};
        
        DefaultComboBoxModel<String> cbxmodel = new DefaultComboBoxModel<>(nganh);
        
        jComboBox1.setModel(cbxmodel);
    }
    private void loaibang()
    {
        String[] loaibang = new String[]{"Trung bình","Khá","Giỏi"};
        
        DefaultComboBoxModel<String> cbxmodel = new DefaultComboBoxModel<>(loaibang);
        
        jComboBox2.setModel(cbxmodel);
    }
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
        jLabel7 = new javax.swing.JLabel();
        txthoten = new javax.swing.JTextField();
        txtngaysinh = new javax.swing.JTextField();
        txtdiachi = new javax.swing.JTextField();
        rbdnam = new javax.swing.JRadioButton();
        rbdnu = new javax.swing.JRadioButton();
        txtidchucvu = new javax.swing.JTextField();
        btnthem = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        txttimkiem = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        btntimkiem = new javax.swing.JButton();
        btnsua = new javax.swing.JButton();
        btnxoa = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Quản lý kĩ sư");

        jLabel2.setText("Họ tên:");

        jLabel3.setText("Ngày sinh:");

        jLabel4.setText("Giới tính:");

        jLabel5.setText("Địa chỉ:");

        jLabel6.setText("Ngành:");

        jLabel7.setText("Loại bằng:");

        txtngaysinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtngaysinhActionPerformed(evt);
            }
        });

        txtdiachi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdiachiActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbdnam);
        rbdnam.setText("nam");

        buttonGroup1.add(rbdnu);
        rbdnu.setText("nữ");

        txtidchucvu.setText("2");

        btnthem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/insert.png"))); // NOI18N
        btnthem.setText("thêm");
        btnthem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthemActionPerformed(evt);
            }
        });

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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel8.setText("ID:");

        btntimkiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/magnifying-glass.png"))); // NOI18N
        btntimkiem.setText("Tìm kiếm");
        btntimkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntimkiemActionPerformed(evt);
            }
        });

        btnsua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/updated.png"))); // NOI18N
        btnsua.setText("Sửa");
        btnsua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsuaActionPerformed(evt);
            }
        });

        btnxoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/trash.png"))); // NOI18N
        btnxoa.setText("xóa");
        btnxoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxoaActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/eraser.png"))); // NOI18N
        jButton3.setText("Tạo mới");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addComponent(jSeparator2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(39, 39, 39)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel7)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(44, 44, 44)
                                        .addComponent(jLabel8)))
                                .addGap(59, 59, 59)
                                .addComponent(txttimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(223, 223, 223)
                                .addComponent(jLabel1)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 675, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txthoten, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnthem)
                                .addGap(38, 38, 38)
                                .addComponent(btnsua)
                                .addGap(36, 36, 36)
                                .addComponent(btnxoa))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(rbdnam)
                                    .addGap(18, 18, 18)
                                    .addComponent(rbdnu))
                                .addComponent(txtngaysinh, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtdiachi, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(jButton3)
                                .addGap(28, 28, 28)
                                .addComponent(btntimkiem)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtidchucvu, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(361, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txttimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txthoten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtngaysinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(rbdnam)
                    .addComponent(rbdnu))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtdiachi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtidchucvu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnthem)
                    .addComponent(btnsua)
                    .addComponent(btnxoa)
                    .addComponent(jButton3)
                    .addComponent(btntimkiem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void clearform()
    {
        txttimkiem.setText("");
        txthoten.setText("");
        txtngaysinh.setText("");
        buttonGroup1.clearSelection();
        txtdiachi.setText("");
        jComboBox1.setSelectedIndex(0);
        jComboBox2.setSelectedIndex(0);
        
    }
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
        
        Kisu cn = new Kisu();
        
            
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
            cn.setNganh(jComboBox1.getSelectedItem().toString());
             cn.setLoaibang(jComboBox2.getSelectedItem().toString());
            cn.setIdchucvu(Integer.parseInt(txtidchucvu.getText()));
//            cn.setIdchucvu(txtidchucvu);
            
           
         KisuDao dao = new KisuDao();
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
            java.util.logging.Logger.getLogger(QuanLyKiSu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        loadTable();
    }//GEN-LAST:event_btnthemActionPerformed

    private void txtdiachiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdiachiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdiachiActionPerformed

    private void txtngaysinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtngaysinhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtngaysinhActionPerformed

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
        
        Kisu cn = new Kisu();
        
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
            cn.setNganh(jComboBox1.getSelectedItem().toString());
             cn.setLoaibang(jComboBox2.getSelectedItem().toString());          
            cn.setIdchucvu(Integer.parseInt(txtidchucvu.getText()));
//            cn.setIdchucvu(txtidchucvu);
           
         KisuDao dao = new KisuDao();
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
            java.util.logging.Logger.getLogger(QuanLyKiSu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        loadTable();
        
    }//GEN-LAST:event_btnsuaActionPerformed

    private void btnxoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxoaActionPerformed
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
        KisuDao dao = new KisuDao();
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
          Logger.getLogger(QuanLyKiSu.class.getName()).log(Level.SEVERE, null, ex);
      }
      
    }//GEN-LAST:event_btnxoaActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       clearform();
       loadTable();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btntimkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntimkiemActionPerformed
          loadTable();
        try{
         KisuDao dao = new KisuDao();
         Kisu cn = dao.findbyid(txttimkiem.getText());   
          if(cn!=null)
          {
              
                   txthoten.setText(cn.getHoten());
                   txtngaysinh.setText(String.valueOf(cn.getNgaysinh()));
                   rbdnam.setSelected(cn.getGioitinh()==1?true:false);   
                   rbdnu.setSelected(cn.getGioitinh()==0?true:false); 
                   txtdiachi.setText(cn.getDiachi());
                   jComboBox1.setSelectedItem(cn.getNganh());
                
                   jComboBox2.setSelectedItem(cn.getLoaibang());
          }
//          else
//              JOptionPane.showMessageDialog(this, "không tìm thấy kĩ sư nào có id là:"+ txttimkiem.getText());
            
            
            
     }catch(Exception e)
     {
         e.printStackTrace();
     }
       
      
    }//GEN-LAST:event_btntimkiemActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        try {
            int row = jTable1.getSelectedRow();
            if (row >= 0) {
                String id = (String) jTable1.getValueAt(row, 0);
                KisuDao dao = new KisuDao();
                Kisu cn = dao.findbyid(id);

                if (cn != null) {

                    txttimkiem.setText(String.valueOf(cn.getId()));
                    txthoten.setText(cn.getHoten());
                    txtngaysinh.setText(String.valueOf(cn.getNgaysinh()));
                    rbdnam.setSelected(cn.getGioitinh() == 1 ? true : false);
                    rbdnu.setSelected(cn.getGioitinh() == 0 ? true : false);
                    txtdiachi.setText(cn.getDiachi());
                    jComboBox1.setSelectedItem(cn.getNganh());
                    jComboBox2.setSelectedItem(cn.getLoaibang());

                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnsua;
    private javax.swing.JButton btnthem;
    private javax.swing.JButton btntimkiem;
    private javax.swing.JButton btnxoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton rbdnam;
    private javax.swing.JRadioButton rbdnu;
    private javax.swing.JTextField txtdiachi;
    private javax.swing.JTextField txthoten;
    private javax.swing.JTextField txtidchucvu;
    private javax.swing.JTextField txtngaysinh;
    private javax.swing.JTextField txttimkiem;
    // End of variables declaration//GEN-END:variables
}
