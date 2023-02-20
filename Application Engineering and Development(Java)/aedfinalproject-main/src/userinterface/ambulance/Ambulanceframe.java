/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.ambulance;

import Business.Ambulance.Ambulance;
import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.report_emergency;
import Business.WorkQueue.report_emergency_directory;
import Business.firedepartment.FireDepartment;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.loginpage;

/**
 *
 * @author raksh
 */
public class Ambulanceframe extends javax.swing.JPanel {

    private final JPanel container;
    private final EcoSystem system;
    private final UserAccount userAccount;

    /**
     * Creates new form Ambulanceframe
     */
    public Ambulanceframe(JPanel container,EcoSystem system,UserAccount userAccount) {
        initComponents();
        this.container=container;
        this.system=system;
        this.userAccount=userAccount;
        populate_table();
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
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(26, 39, 68));

        jPanel1.setBackground(new java.awt.Color(26, 39, 68));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ambulance (1).png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, 170, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Emergency", "Location", "Status", "Response"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 794, 230));

        jButton1.setBackground(new java.awt.Color(189, 195, 199));
        jButton1.setText("Respond");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 450, -1, -1));

        jButton2.setBackground(new java.awt.Color(189, 195, 199));
        jButton2.setText("False Alaram");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 450, -1, -1));

        jButton3.setBackground(new java.awt.Color(189, 195, 199));
        jButton3.setText("Close Case");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 450, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/arrow (1).png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 20, -1, -1));

        jLabel3.setBackground(new java.awt.Color(26, 39, 68));
        jLabel3.setOpaque(true);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 540));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       DefaultTableModel  t2 = (DefaultTableModel) jTable1.getModel();
        int selectedRow=jTable1.getSelectedRow();
        if(selectedRow>=0)
        {
        int s=Integer.parseInt(t2.getValueAt(selectedRow, 0).toString());
        System.out.println("id"+s);
        report_emergency_directory red=system.getReport_emergency_directory();
        ArrayList<report_emergency> ol=red.getUser();
        int u=ol.size();
        Ambulance a=(Ambulance)userAccount;
        for(int i=0;i<u;i++)
        {
            report_emergency o=ol.get(i);
            if(s==o.getID()/*&&o.getStatus().matches("Deliver Man Assigned")*/)
            {
                if(o.getStatus().matches("Closed"))
                {
                    JOptionPane.showMessageDialog(null, "Emergency Closed");
                }
                else if(o.getStatus().matches("False Alaram"))
                {
                    JOptionPane.showMessageDialog(null, "Emergency is a false Alaram");
                }
                else if(o.getResponse().matches("No Response"))
                {
                    o.setResponse(a.getAmbulance_name()+" "+"Responded");
                }
                else
                {
                   JOptionPane.showMessageDialog(null, "Already Responded!!"); 
                }
            }

        }
        jTable1.setModel(new DefaultTableModel(null,new String[]{"ID","Name","Emergency","Location","Status","Response"}));
        populate_table();
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Select a Row!!");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel t2 = (DefaultTableModel) jTable1.getModel();
        int selectedRow=jTable1.getSelectedRow();
        if(selectedRow>=0)
        {
        int s=Integer.parseInt(t2.getValueAt(selectedRow, 0).toString());
        System.out.println("id"+s);
        report_emergency_directory red=system.getReport_emergency_directory();
        ArrayList<report_emergency> ol=red.getUser();
        int u=ol.size();
        for(int i=0;i<u;i++)
        {
            report_emergency o=ol.get(i);
            if(s==o.getID()/*&&o.getStatus().matches("Deliver Man Assigned")*/)
            {
                if(o.getStatus().matches("Closed"))
                {
                    JOptionPane.showMessageDialog(null, "Emergency Closed");
                }
                else if(o.getStatus().matches("False Alaram"))
                {
                    JOptionPane.showMessageDialog(null, "Emergency is a false Alaram");
                }
                else if(o.getResponse().matches("No Response"))
                {
                    JOptionPane.showMessageDialog(null, "respond to emergency");
                }
                else
                {
                    o.setStatus("False Alaram");
                }
                /*if(o.getStatus().matches("Closed"))
                {
                    if(o.getStatus().matches("False Alaram"))
                    {
                        if(o.getAmbulance().matches("No Response"))
                        {
                            JOptionPane.showMessageDialog(null, "Respond to the emergency");
                            break;
                        }
                        else
                        {
                            o.setStatus("False Alaram");
                            
                        }
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null, "Emergency is a false Alaram");
                        break;
                    }
                    
                }
                else
                {
                JOptionPane.showMessageDialog(null, "Emergency Closed");
                break;
                }*/
                

            }

        }
        jTable1.setModel(new DefaultTableModel(null,new String[]{"ID","Name","Emergency","Location","Status","Response"}));
        populate_table();
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Select a Row!!");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel t2 = (DefaultTableModel) jTable1.getModel();
        int selectedRow=jTable1.getSelectedRow();
        if(selectedRow>=0)
        {
        int s=Integer.parseInt(t2.getValueAt(selectedRow, 0).toString());
        System.out.println("id"+s);
        report_emergency_directory red=system.getReport_emergency_directory();
        ArrayList<report_emergency> ol=red.getUser();
        int u=ol.size();
        for(int i=0;i<u;i++)
        {
            report_emergency o=ol.get(i);
            if(s==o.getID()/*&&o.getStatus().matches("Deliver Man Assigned")*/)
            {
                if(o.getStatus().matches("Closed"))
                {
                    JOptionPane.showMessageDialog(null, "Emergency Closed");
                }
                else if(o.getStatus().matches("False Alaram"))
                {
                    JOptionPane.showMessageDialog(null, "Emergency is a false Alaram");
                }
                else if(o.getResponse().matches("No Response"))
                {
                    JOptionPane.showMessageDialog(null, "respond to emergency");
                }
                else
                {
                    o.setStatus("Closed");
                }

            }

        }
        jTable1.setModel(new DefaultTableModel(null,new String[]{"ID","Name","Emergency","Location","Status","Response"}));
        populate_table();
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Select a Row!!");
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        backAction();
        DB4OUtil.dB4OUtil.storeSystem(system);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void backAction() {
        container.remove(this);
        Component[] componentArray = container.getComponents();
        Component component = componentArray[componentArray.length - 1];
        loginpage manageSuppliersJPanel = (loginpage) component;        
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }
public void populate_table()
    {
        report_emergency_directory red=system.getReport_emergency_directory();
        ArrayList<report_emergency> ol=red.getUser();
        int u=ol.size();
        System.out.println(u);
        for(int i=0;i<u;i++)
        {
            report_emergency o=ol.get(i);
            if(o.getEmergency().matches("Medical"))
            {
                DefaultTableModel t2 = (DefaultTableModel) jTable1.getModel();
                String s1=String.valueOf(o.getID());
                
                
                String s[]={s1,o.getName(),o.getEmergency(),o.getLocation(),o.getStatus(),o.getResponse()};
                t2.addRow(s);
            
            }
            
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

}
