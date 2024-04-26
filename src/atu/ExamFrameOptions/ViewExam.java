/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atu.ExamFrameOptions;

import atu.Class.ConnectionDB;
import atu.Class.Role;
import atu.MenuFrames.Exam;
import atu.gradeDialog.ViewReport;
import java.util.ArrayList;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alber
 */
public class ViewExam extends javax.swing.JFrame {

    
    String rol;
    int idAccount;
    
    public ViewExam() {
        initComponents();
    }
    
    public ViewExam(String rol, int idAccount) {
        initComponents();
        this.rol = rol;
        this.idAccount = idAccount;
        loadExamsAccount();
        loadComponent();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableExam = new javax.swing.JTable();
        viewReportButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("EXAMS");
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 140, 55));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("Back");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 20, 39, 40));

        tableExam.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tableExam.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane1.setViewportView(tableExam);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 150, 730, 290));

        viewReportButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        viewReportButton.setText("View Report");
        viewReportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewReportButtonActionPerformed(evt);
            }
        });
        getContentPane().add(viewReportButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 470, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        new Exam(rol, idAccount).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void viewReportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewReportButtonActionPerformed
        int rowSelected = tableExam.getSelectedRowCount();
        if (rowSelected == 1) {
            int indexRow = tableExam.getSelectedRow();
            int idExam = (int)tableExam.getModel().getValueAt(indexRow, 4);
            String statusReport = (String)tableExam.getModel().getValueAt(indexRow, 6);

            if(statusReport.equals("NO")){
                JOptionPane.showMessageDialog(this, "Not exist Report");
            }else{
                ViewReport viewReport = new ViewReport(this, true, idExam, idAccount);
                viewReport.setVisible(true);
            }

        } else {
            JOptionPane.showMessageDialog(this, "Click 1 row");
        }
    }//GEN-LAST:event_viewReportButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ViewExam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewExam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewExam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewExam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new ViewExam().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableExam;
    private javax.swing.JButton viewReportButton;
    // End of variables declaration//GEN-END:variables

    private void loadExamsAccount() {
        DefaultTableModel tableModel = new DefaultTableModel();
        String sql = "";
        Object[] parametersSQL = {idAccount};
            tableModel.addColumn("Course");
            tableModel.addColumn("Module");
            tableModel.addColumn("Exam");
            tableModel.addColumn("Exam Date");
        if(rol.equals(Role.TEACHER.getName())){
            
            sql =   "SELECT c.name as course_name, m.name as module_name, e.name as exam_name, e.exam_date FROM exam e JOIN "+
                    "course_module cm ON cm.id = e.course_module_fk JOIN "+
                    "course c ON c.id = cm.course_fk JOIN "+
                    "module m ON m.id = cm.module_fk JOIN "+
                    "account_module am ON am.module_fk = m.id "+
                    "WHERE am.account_fk = ?;";
        }else if (rol.equals(Role.STUDENT.getName())){
            
            sql =   "SELECT c.name as course_name, m.name as module_name, e.id as exam_id, e.name as exam_name, e.exam_date, g.result, r.id as report_id FROM exam e JOIN "+
                    "course_module cm ON cm.id = e.course_module_fk JOIN "+
                    "course c ON c.id = cm.course_fk JOIN "+
                    "module m ON m.id = cm.module_fk JOIN "+
                    "account a ON a.course_fk = c.id JOIN "+
                    "grade g ON g.exam_fk = e.id LEFT JOIN "+
                    "report r ON g.report_fk = r.id "+
                    "WHERE a.id = ? ";
            
            tableModel.addColumn("ID_Exam");
            tableModel.addColumn("Note");
            tableModel.addColumn("Report");
        }
        
        if(!sql.isEmpty()){
            try {   
                ArrayList<Map<String, Object>> result = ConnectionDB.getQuery(sql, parametersSQL);
                for (Map<String, Object> map : result) {
                    if(rol.equals(Role.TEACHER.getName())){
                        tableModel.addRow(new Object[]{map.get("course_name"), map.get("module_name"), map.get("exam_name"), map.get("exam_date")});
                    }else if (rol.equals(Role.STUDENT.getName())){
                        tableModel.addRow(new Object[]{map.get("course_name"), map.get("module_name"), map.get("exam_name"), map.get("exam_date"), map.get("exam_id"), map.get("result") == null ? "--" : map.get("result"), map.get("report_id") == null ? "NO" : "YES"});
                    }
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error connection to Database");
            }
             tableExam.setModel(tableModel);
        }   
    }

    private void loadComponent() {
        if(Role.TEACHER.getName().equals(rol)){
            viewReportButton.setVisible(false);
        }
    }
}