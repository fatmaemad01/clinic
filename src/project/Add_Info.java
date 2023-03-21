
package project;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import javax.swing.JOptionPane;


public class Add_Info extends javax.swing.JFrame {


    public Add_Info() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel15 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        phone2 = new javax.swing.JTextField();
        lastname2 = new javax.swing.JTextField();
        doctor2 = new javax.swing.JTextField();
        firstname2 = new javax.swing.JTextField();
        Button_cancle = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        Button_Save = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        male2 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        female2 = new javax.swing.JRadioButton();
        jLabel17 = new javax.swing.JLabel();
        address2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        id2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        age2 = new javax.swing.JTextField();
        password2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel15.setText("Doctor");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setText("First Name:");

        phone2.setBorder(null);
        phone2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phone2ActionPerformed(evt);
            }
        });

        lastname2.setBorder(null);
        lastname2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastname2ActionPerformed(evt);
            }
        });

        doctor2.setBorder(null);
        doctor2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctor2ActionPerformed(evt);
            }
        });

        firstname2.setBorder(null);
        firstname2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstname2ActionPerformed(evt);
            }
        });

        Button_cancle.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        Button_cancle.setForeground(new java.awt.Color(255, 0, 0));
        Button_cancle.setText("Back");
        Button_cancle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_cancleActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel19.setText("Phone :");

        Button_Save.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        Button_Save.setForeground(new java.awt.Color(26, 134, 116));
        Button_Save.setText("Save Info");
        Button_Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_SaveActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel11.setText("Age :");

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel13.setText("ID Number :");

        buttonGroup1.add(male2);
        male2.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        male2.setText("Male");
        male2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                male2ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("Gender :");

        buttonGroup1.add(female2);
        female2.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        female2.setText("Female");
        female2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                female2ActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel17.setText("Address");

        address2.setBorder(null);
        address2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                address2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(26, 134, 116));
        jLabel1.setText("Add Information");

        id2.setBorder(null);
        id2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id2ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setText("Last Name:");

        age2.setBorder(null);
        age2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                age2ActionPerformed(evt);
            }
        });

        password2.setBorder(null);
        password2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                password2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Password");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(51, 51, 51))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel9)
                                .addComponent(jLabel5)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGap(12, 12, 12))
                                .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(Button_cancle)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(password2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(phone2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(age2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(male2)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(97, 97, 97)
                                .addComponent(female2))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Button_Save)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(firstname2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lastname2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(id2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(doctor2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(address2, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE))))))
                .addGap(49, 49, 49))
            .addGroup(layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(firstname2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lastname2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(id2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(male2)
                            .addComponent(female2))
                        .addGap(18, 18, 18)
                        .addComponent(doctor2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(address2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(phone2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(age2)
                                .addGap(1, 1, 1)))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(password2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button_Save)
                    .addComponent(Button_cancle))
                .addGap(41, 41, 41))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void phone2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phone2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phone2ActionPerformed

    private void lastname2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastname2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastname2ActionPerformed

    private void doctor2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctor2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_doctor2ActionPerformed

    private void firstname2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstname2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstname2ActionPerformed

    private void Button_cancleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_cancleActionPerformed
        Client.home.setVisible(true);
        Client.add_info.setVisible(false);

    }//GEN-LAST:event_Button_cancleActionPerformed

    private void Button_SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_SaveActionPerformed
        int id = Integer.parseInt(id2.getText());
        String firstname = firstname2.getText();
        String lastname = lastname2.getText();
        String doctor = doctor2.getText();
        String address = address2.getText();
        String phone = phone2.getText();
        String age = age2.getText();
        int password = Integer.parseInt(password2.getText());

        
        try{
            Registry reg = LocateRegistry.getRegistry("localhost",Registry.REGISTRY_PORT);
            Interface server = (Interface) reg.lookup("rmi://localhost/service");

            server.AddPatient(id, firstname, lastname, phone, address, password, age, doctor);
            JOptionPane.showMessageDialog(this,"Patient Added Successfully");

        }
        catch(RemoteException | NotBoundException ex){
            System.out.println(ex.getMessage());
        }


        Client.home.setVisible(true);
        Client.add_info.setVisible(false);
    }//GEN-LAST:event_Button_SaveActionPerformed

    private void male2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_male2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_male2ActionPerformed

    private void female2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_female2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_female2ActionPerformed

    private void address2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_address2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_address2ActionPerformed

    private void id2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id2ActionPerformed

    private void age2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_age2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_age2ActionPerformed

    private void password2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_password2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_password2ActionPerformed

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
            java.util.logging.Logger.getLogger(Add_Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_Info().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_Save;
    private javax.swing.JButton Button_cancle;
    private javax.swing.JTextField address2;
    private javax.swing.JTextField age2;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField doctor2;
    private javax.swing.JRadioButton female2;
    private javax.swing.JTextField firstname2;
    private javax.swing.JTextField id2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField lastname2;
    private javax.swing.JRadioButton male2;
    private javax.swing.JTextField password2;
    private javax.swing.JTextField phone2;
    // End of variables declaration//GEN-END:variables
}
