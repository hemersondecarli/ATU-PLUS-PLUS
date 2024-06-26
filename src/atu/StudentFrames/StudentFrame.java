/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atu.StudentFrames;

import atu.Class.Role;
import atu.MenuFrames.AccessBooking;
import atu.MenuFrames.Chat;
import atu.MenuFrames.Exam;
import atu.TimeTableDialog.ViewTimeTable;

/**
 *
 * @author alber
 */
public class StudentFrame extends javax.swing.JFrame {

    int idAccount;
    
    public StudentFrame(int idAccount) {
        initComponents();
        this.idAccount = idAccount;
    }
    
    public StudentFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        chatBT = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        bookingBT = new javax.swing.JButton();
        examBT = new javax.swing.JButton();
        timetableBT = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        chatBT.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        chatBT.setText("CHAT");
        chatBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chatBTActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("STUDENT OPTIONS");

        bookingBT.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        bookingBT.setText("BOOKING");
        bookingBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookingBTActionPerformed(evt);
            }
        });

        examBT.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        examBT.setText("EXAM");
        examBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                examBTActionPerformed(evt);
            }
        });

        timetableBT.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        timetableBT.setText("TIMETABLE");
        timetableBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timetableBTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(332, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(272, 272, 272))
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(examBT, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chatBT, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bookingBT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(timetableBT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chatBT, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bookingBT, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(examBT, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(timetableBT, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(97, 97, 97))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chatBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chatBTActionPerformed
        Chat chat = new Chat(Role.STUDENT.getName(), idAccount);
        chat.setVisible(true);
        dispose();
    }//GEN-LAST:event_chatBTActionPerformed

    private void bookingBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookingBTActionPerformed
        AccessBooking booking = new AccessBooking(Role.STUDENT.getName(), idAccount);
        booking.setVisible(true);
        dispose();
    }//GEN-LAST:event_bookingBTActionPerformed

    private void examBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_examBTActionPerformed
        Exam exam = new Exam(Role.STUDENT.getName(), idAccount);
        exam.setVisible(true);
        dispose();
    }//GEN-LAST:event_examBTActionPerformed

    private void timetableBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timetableBTActionPerformed
        ViewTimeTable viewTimeTable = new ViewTimeTable(idAccount);
        viewTimeTable.setVisible(true);
        dispose();
    }//GEN-LAST:event_timetableBTActionPerformed

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
            java.util.logging.Logger.getLogger(StudentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bookingBT;
    private javax.swing.JButton chatBT;
    private javax.swing.JButton examBT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton timetableBT;
    // End of variables declaration//GEN-END:variables
}
