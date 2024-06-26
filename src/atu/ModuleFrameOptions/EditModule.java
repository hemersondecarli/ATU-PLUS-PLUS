/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atu.ModuleFrameOptions;

import atu.Class.ConnectionDB;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author alber
 */
public class EditModule extends javax.swing.JFrame {

    private Map<Object, Object> coursesMap;
    private int idModule;
    
    
    /**
     * Creates new form EditStudent
     * @param id
     */
    public EditModule(int id) {
        idModule = id;
        initComponents();
        loadCourses();
        loadModule();
    }

    public EditModule() {
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        module = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        courses = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nameModule = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        module.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        module.setText("Course:");
        module.setOpaque(true);
        getContentPane().add(module, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 70, 40));

        courses.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        courses.setFocusable(false);
        jScrollPane1.setViewportView(courses);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 490, 130));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("EDIT MODULES");
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 290, 55));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Name:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, -1, 32));
        getContentPane().add(nameModule, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 490, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("Back");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 20, 39, 40));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton2.setText("Submit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 380, 130, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        EditDeleteModule editDeleteModulePage = new EditDeleteModule();
        editDeleteModulePage.setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            String name = nameModule.getText();
            int[] course = new int[courses.getSelectedValuesList().size()];
            List<Integer> courseNotselected = new ArrayList();
            boolean isGood = false;
            boolean allOk = true;
            if(name.isEmpty()) {
                JOptionPane.showMessageDialog(this, "All Field Required");
            }else{
                if(!courses.getSelectedValuesList().isEmpty()){
                    for (int i = 0; i < courses.getSelectedValuesList().size(); i++) {
                        course[i] = (int)coursesMap.get(courses.getSelectedValuesList().get(i));
                    }
                  
                int[] selectedIndices = courses.getSelectedIndices();
                    
                
               
                
                    // Iterar sobre todos los elementos de la lista
                for (int i = 0; i < courses.getModel().getSize(); i++) {
                    // Si el índice no está en el arreglo de seleccionados, añadirlo al modelo de no seleccionados
                    if (!isSelectedIndex(i, selectedIndices)) {
                        courseNotselected.add((int)coursesMap.get(courses.getModel().getElementAt(i)));
                    }
                }
                
                    
                    isGood = true;
                }else{
                    JOptionPane.showMessageDialog(this, "Course is Required!");
                }

                if(isGood){

                    int choice = JOptionPane.showConfirmDialog(this, "Update Module?", "Confirmation", JOptionPane.YES_NO_OPTION);
                    if (choice == JOptionPane.YES_OPTION) {
                        String sql = "UPDATE module SET name = ? WHERE id = ?";
                        Object[] parametersSQL = {name, idModule};
                        if(ConnectionDB.UpdateDeleteQueryParameters(sql, parametersSQL) == 1){

                           
                            
                            
                            String sql2 = "DELETE FROM course_module WHERE module_fk = ? AND course_fk = ?";
                            for(Integer idCourse : courseNotselected){
                                ConnectionDB.UpdateDeleteQueryParameters(sql2, new Object[]{idModule, idCourse});
                            }

                            String sql3 = "SELECT * FROM course_module WHERE course_fk = ? AND module_fk = ?";
                            String sql4 = "INSERT INTO course_module (course_fk, module_fk) VALUES(?, ?)";
                            for (int id : course) {
                                Object[] parametersSQL2 = {id, idModule};
                                ArrayList<Map<String, Object>> result = ConnectionDB.getQuery(sql3, parametersSQL2);
                                
                                if(result.isEmpty()){
                                    if(ConnectionDB.insertQueryParameters(sql4, parametersSQL2) != 1){
                                        JOptionPane.showMessageDialog(this, "Fail with Module!");
                                        allOk = false;
                                    }
                                } 
                            }
                            if(allOk)
                                JOptionPane.showMessageDialog(this, "Update Successful");  
                        }else{
                            JOptionPane.showMessageDialog(this, "Registration Fail");
                        }
                    }
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error");

        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(EditModule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditModule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditModule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditModule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditModule().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> courses;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel module;
    private javax.swing.JTextField nameModule;
    // End of variables declaration//GEN-END:variables

    private void loadCourses() {
        coursesMap = new HashMap<>();
        DefaultListModel listModel = new DefaultListModel();
        try {
            String sql = "SELECT * FROM course";     
            ArrayList<Map<String, Object>> result = ConnectionDB.getQuery(sql);
            for (Map<String, Object> map : result) {
                listModel.addElement("Name: " + map.get("name") + " - Code: " + map.get("code"));
                coursesMap.put("Name: " + map.get("name") + " - Code: " + map.get("code"), map.get("id"));
            }
            courses.setModel(listModel);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error connection to Database");
        }
    }
    
    private void loadModule() {
        try {
            String sql = "SELECT * FROM module WHERE id = ?";  
            Object[] parameters = {idModule};
            ArrayList<Map<String, Object>> result = ConnectionDB.getQuery(sql, parameters);
            for (Map<String, Object> map : result) {
                nameModule.setText((String)map.get("name"));
                String sql2 = "SELECT * FROM course_module WHERE module_fk = ?";  
                Object[] parameters2 = {idModule};
                ArrayList<Map<String, Object>> result2 = ConnectionDB.getQuery(sql2, parameters2);


                ArrayList<Integer> items = new ArrayList <>();


                for (Map<String, Object> map1 : result2) {
                    String module = (String)coursesMap.entrySet().stream()
                    .filter(entry -> (Integer)map1.get("course_fk") == (Integer)entry.getValue())
                    .map(Map.Entry::getKey)
                    .findFirst()
                    .orElse(null);

                    for(int i = 0 ; i<  courses.getModel().getSize() ; i++){
                        if(courses.getModel().getElementAt(i).equals(module)){
                            items.add(i);
                        }
                    }   
                }

                int[] intArray = new int[items.size()];
                for (int i = 0; i < items.size(); i++) {
                    intArray[i] = items.get(i);
                }

                courses.setSelectedIndices(intArray);
                
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error connection to Database");
        }
    }
    
    // Método para verificar si un índice está en el arreglo de seleccionados
            private boolean isSelectedIndex(int index, int[] selectedIndices) {
                for (int selectedIndex : selectedIndices) {
                    if (index == selectedIndex) {
                        return true;
                    }
                }
                return false;
            }
    
    
}
