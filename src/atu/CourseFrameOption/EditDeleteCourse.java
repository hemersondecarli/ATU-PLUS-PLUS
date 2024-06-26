/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atu.CourseFrameOption;

import atu.Class.ConnectionDB;
import static atu.Class.ConnectionDB.UpdateDeleteQueryParameters;
import atu.MenuFrames.Course;
import java.util.ArrayList;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alber
 */
public class EditDeleteCourse extends javax.swing.JFrame {

    
    
    /**
     * Creates new form DeleteStudent
     */
    public EditDeleteCourse() {
        initComponents();
        loadCourses();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableAccount = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        editAccountButton = new javax.swing.JButton();
        deleteAccount = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tableAccount.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tableAccount.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane1.setViewportView(tableAccount);

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        jLabel1.setText("    COURSES");

        editAccountButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        editAccountButton.setText("EDIT");
        editAccountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editAccountButtonActionPerformed(evt);
            }
        });

        deleteAccount.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        deleteAccount.setText("DELETE");
        deleteAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteAccountActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("Back");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 671, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(editAccountButton)
                .addGap(77, 77, 77)
                .addComponent(deleteAccount)
                .addGap(246, 246, 246))
            .addGroup(layout.createSequentialGroup()
                .addGap(197, 197, 197)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editAccountButton)
                    .addComponent(deleteAccount))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void editAccountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editAccountButtonActionPerformed
    int rowSelected = tableAccount.getSelectedRowCount(); 
       if (rowSelected == 1) { 
           int indexRow = tableAccount.getSelectedRow(); 
           int idAccount = (int)tableAccount.getModel().getValueAt(indexRow, 0);
           EditCourse editCourse = new EditCourse(idAccount);
           editCourse.setVisible(true);
           dispose();
       } else { 
            JOptionPane.showMessageDialog(this, "Click 1 row");
       } 

    
    }//GEN-LAST:event_editAccountButtonActionPerformed

    private void deleteAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteAccountActionPerformed
        int rowSelected = tableAccount.getSelectedRowCount(); 
        if (rowSelected == 1) { 
            int indexRow = tableAccount.getSelectedRow(); 
            int idAccount = (int)tableAccount.getModel().getValueAt(indexRow, 0);
            String sql = "DELETE FROM course WHERE id = ?";
            Object[] parametersSQL = {idAccount};

            int choice = JOptionPane.showConfirmDialog(this, "Are you sure delete course and all reference of this course?", "Confirmation", JOptionPane.YES_NO_OPTION);
            if (choice == JOptionPane.YES_OPTION) {
               if(UpdateDeleteQueryParameters(sql, parametersSQL) == 1){
                   JOptionPane.showMessageDialog(this, "ALL OK");
                   loadCourses();
               }else{
                   JOptionPane.showMessageDialog(this, "Error Database");
               }
            }
        } else { 
             JOptionPane.showMessageDialog(this, "Click on 1 row");
        } 
    }//GEN-LAST:event_deleteAccountActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        Course course = new Course();
        course.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EditDeleteCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditDeleteCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditDeleteCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditDeleteCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditDeleteCourse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton deleteAccount;
    private javax.swing.JButton editAccountButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableAccount;
    // End of variables declaration//GEN-END:variables

 
    private void loadCourses(){
        
        DefaultTableModel tableModel = new DefaultTableModel();
        
        
        tableModel.addColumn("ID");
        tableModel.addColumn("Name");
        tableModel.addColumn("Code");

        
        try {
            String sql = "SELECT * FROM course";     
            ArrayList<Map<String, Object>> result = ConnectionDB.getQuery(sql);
            for (Map<String, Object> map : result) {
                tableModel.addRow(new Object[]{map.get("id"), map.get("name"), map.get("code")});
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error connection to Database");
        }
        
        tableAccount.setModel(tableModel);
        tableAccount.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
    }
}
