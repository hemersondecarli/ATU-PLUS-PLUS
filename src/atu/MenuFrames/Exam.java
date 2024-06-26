/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atu.MenuFrames;

import atu.Class.Role;
import atu.ExamFrameOptions.AddExam;
import atu.ExamFrameOptions.EditDeleteExam;
import atu.ExamFrameOptions.GradeExam;
import atu.ExamFrameOptions.ViewExam;
import atu.StudentFrames.StudentFrame;
import atu.TeacherFrames.TeacherFrame;

/**
 *
 * @author alber
 */
public class Exam extends javax.swing.JFrame {

    String rol;
    int idAccount;
    
    public Exam() {
        initComponents();
    }

    public Exam(String rol, int idAccount) {
        initComponents();
        this.rol = rol;
        this.idAccount = idAccount;
        visibilityComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        editDeleteBT = new javax.swing.JButton();
        viewBT = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        registerBT = new javax.swing.JButton();
        gradeBT = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        editDeleteBT.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        editDeleteBT.setText("Edit/Delete");
        editDeleteBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editDeleteBTActionPerformed(evt);
            }
        });

        viewBT.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        viewBT.setText("View");
        viewBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBTActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("EXAM");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Back");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        registerBT.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        registerBT.setText("Register");
        registerBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBTActionPerformed(evt);
            }
        });

        gradeBT.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        gradeBT.setText("Grade");
        gradeBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gradeBTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(91, 91, 91)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gradeBT, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(editDeleteBT, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(registerBT, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(viewBT, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewBT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(registerBT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(editDeleteBT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(gradeBT)
                .addContainerGap(87, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void editDeleteBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editDeleteBTActionPerformed
        EditDeleteExam editDeleteExam = new EditDeleteExam(rol, idAccount);
        editDeleteExam.setVisible(true);
        dispose();
    }//GEN-LAST:event_editDeleteBTActionPerformed

    private void viewBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBTActionPerformed
        ViewExam viewExamPage = new ViewExam(rol, idAccount);
        viewExamPage.setVisible(true);
        dispose();
    }//GEN-LAST:event_viewBTActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        
        if(rol.equals(Role.STUDENT.getName())){
            StudentFrame studentFrame = new StudentFrame(idAccount);
            studentFrame.setVisible(true);
            dispose();
        }else if(rol.equals(Role.TEACHER.getName())){
            TeacherFrame teacherFrame = new TeacherFrame(idAccount);
            teacherFrame.setVisible(true);
            dispose();
        }
        
        
       
    }//GEN-LAST:event_jLabel2MouseClicked

    private void registerBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBTActionPerformed
        AddExam addExamPage = new AddExam(rol, idAccount);
        addExamPage.setVisible(true);
        dispose();
    }//GEN-LAST:event_registerBTActionPerformed

    private void gradeBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gradeBTActionPerformed
        GradeExam gradePage = new GradeExam(rol, idAccount);
        gradePage.setVisible(true);
        dispose();
    }//GEN-LAST:event_gradeBTActionPerformed

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
            java.util.logging.Logger.getLogger(Exam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Exam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Exam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Exam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Exam().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton editDeleteBT;
    private javax.swing.JButton gradeBT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton registerBT;
    private javax.swing.JButton viewBT;
    // End of variables declaration//GEN-END:variables

    private void visibilityComponents() {
         if(rol.equals(Role.STUDENT.getName())){
            editDeleteBT.setVisible(false);
            registerBT.setVisible(false);
            gradeBT.setVisible(false);
        }
    }
}
