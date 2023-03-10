/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.doctor;

import Business.Doctor.Doctor;
import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.Doctor_appointment;
import Business.WorkQueue.Doctor_appointment_directory;
import Business.WorkQueue.app_check;
import Business.WorkQueue.report_emergency;
import Business.WorkQueue.report_emergency_directory;
import Business.user.User;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author raksh
 */
public class manageopp extends javax.swing.JPanel {

    private final JPanel container;
    private final UserAccount userAccount;
    private final EcoSystem ecosystem;

    /**
     * Creates new form manageopp
     */
    public manageopp(JPanel container,EcoSystem ecosystem,UserAccount userAccount) {
        initComponents();
        this.container=container;
        this.ecosystem=ecosystem;
        this.userAccount=userAccount;
        populate_table();
    }

    public void populate_table()
    {
        Doctor_appointment_directory dad=ecosystem.getDoctor_appointment_directory();
        ArrayList<Doctor_appointment> ol=dad.getarray();
        int u=ol.size();
        System.out.println(u);
        for(int i=0;i<u;i++)
        {
            Doctor_appointment o=ol.get(i);
            Doctor d=(Doctor)userAccount;
            System.out.println("o.getDoctor_name()");
             System.out.println("d.getFirstname()");
            if(o.getDoctor_name().matches(d.getFirstname()))
            {
            
                DefaultTableModel t2 = (DefaultTableModel) jTable1.getModel();
                String s1=String.valueOf(o.getId());
                
                
                String s[]={s1,o.getUser_name(),o.getStatus(),o.getDate(),o.getTime()};
                t2.addRow(s);
            }
            
            
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(26, 39, 68));
        setPreferredSize(new java.awt.Dimension(770, 539));

        jPanel1.setLayout(new java.awt.CardLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Status", "Date", "Time"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton3.setBackground(new java.awt.Color(195, 233, 245));
        jButton3.setText("Consult");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(195, 233, 245));
        jButton4.setText("Prescription");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(195, 233, 245));
        jButton1.setText("Cancel Appointment");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/doctor (2) (1).png"))); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(100, 100));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButton3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton1)
                                    .addGap(72, 72, 72)
                                    .addComponent(jButton4)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(333, 333, 333)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(120, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton1, jButton3, jButton4});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton1)
                    .addComponent(jButton4))
                .addContainerGap(183, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel  t2 = (DefaultTableModel) jTable1.getModel();
        int selectedRow=jTable1.getSelectedRow();
        if(selectedRow>=0)
        {
        int s=Integer.parseInt(t2.getValueAt(selectedRow, 0).toString());
        System.out.println("id"+s);
        Doctor_appointment_directory dad=ecosystem.getDoctor_appointment_directory();
        ArrayList<Doctor_appointment> ol=dad.getarray();
        int u=ol.size();
        
        for(int i=0;i<u;i++)
        {
            Doctor_appointment o=ol.get(i);
            if(s==o.getId()/*&&o.getStatus().matches("Deliver Man Assigned")*/)
            {
                if(o.getStatus().matches("Done"))
                {
                    
                pharmacydoc ur=new pharmacydoc(container,ecosystem,userAccount,o.getUser_id());
                jPanel1.add(ur);
                CardLayout layout = (CardLayout) jPanel1.getLayout();
                layout.next(jPanel1);
                
            }
                else
                {
                     JOptionPane.showMessageDialog(null,"Wrong Move!!");
                }
            }
        }
           jTable1.setModel(new DefaultTableModel(null,new String[]{"ID","Name","Status","Date","Time"}));
        populate_table();     
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Select a Row!!");  
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel  t2 = (DefaultTableModel) jTable1.getModel();
        int selectedRow=jTable1.getSelectedRow();
        if(selectedRow>=0)
        {
        int s=Integer.parseInt(t2.getValueAt(selectedRow, 0).toString());
        System.out.println("id"+s);
        Doctor_appointment_directory dad=ecosystem.getDoctor_appointment_directory();
        ArrayList<Doctor_appointment> ol=dad.getarray();
        int u=ol.size();
        
        for(int i=0;i<u;i++)
        {
            Doctor_appointment o=ol.get(i);
            if(s==o.getId()/*&&o.getStatus().matches("Deliver Man Assigned")*/)
            {
                if(o.getStatus().matches("Appointment Booked"))
                {
                o.setStatus("Done");
                 JOptionPane.showMessageDialog(null, "Processed!!");
                }
                else
                {
                                JOptionPane.showMessageDialog(null,"Wrong move!!");  

                }
            }
        }
           jTable1.setModel(new DefaultTableModel(null,new String[]{"ID","Name","Status","Date","Time"}));
        populate_table();     
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Select a Row!!");  
        }
    
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel  t2 = (DefaultTableModel) jTable1.getModel();
        int selectedRow=jTable1.getSelectedRow();
        if(selectedRow>=0)
        {
        int s=Integer.parseInt(t2.getValueAt(selectedRow, 0).toString());
        System.out.println("id"+s);
        Doctor_appointment_directory dad=ecosystem.getDoctor_appointment_directory();
        ArrayList<Doctor_appointment> ol=dad.getarray();
        int u=ol.size();
        
        for(int i=0;i<u;i++)
        {
            Doctor_appointment o=ol.get(i);
            if(s==o.getId()/*&&o.getStatus().matches("Deliver Man Assigned")*/)
            {
                if(o.getStatus().matches("Appointment Booked"))
                {
                o.setStatus("Canceled");
                check(o.getDoctor_name(),o.getDate(),o.getTime());
                }
                else
                {
                                JOptionPane.showMessageDialog(null,"Appointment Canceled");  

                }
            }
        }
           jTable1.setModel(new DefaultTableModel(null,new String[]{"ID","Name","Status","Date","Time"}));
        populate_table();     
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Select a Row!!");  
        }
    
        
    }//GEN-LAST:event_jButton1ActionPerformed

public void check(String s,String d1,String date)
    {
        boolean r=false;
        app_check check= ecosystem.getAppcheck();
        Map<String,List<String>> a=check.getPeopleByForename();
        for (Map.Entry mapElement : a.entrySet()) {
            if(mapElement.getKey().toString().matches(s))
            {
                List<String>a1=(List)mapElement.getValue();
                String s1=a1.get(0);
                String s2=a1.get(1);
                if(s1.matches(d1))
                {
                    if(s2.matches(date))
                    {
                        a.remove(s);
                    }
                }
            }
           
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
