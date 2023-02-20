/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.doctor;

import Business.DB4OUtil.DB4OUtil;
import Business.Doctor.Doctor;
import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.medrequest;
import Business.WorkQueue.medrequest_directory;
import Business.pharmacy.Pharmacy;
import Business.pharmacy.Pharmacy_directory;
import Business.user.User;
import java.util.ArrayList;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author raksh
 */
public class pharmacydoc extends javax.swing.JPanel {

    private final JPanel container;
    private final EcoSystem system;
    private final UserAccount userAccount;
    private final String patientid;

    /**
     * Creates new form pharmacydoc
     */
    public pharmacydoc(JPanel container,EcoSystem system,UserAccount userAccount,String userid) {
        initComponents();
        this.container=container;
        this.system=system;
        this.userAccount=userAccount;
        this.patientid=userid;
        Pharmacy_directory rd=system.getPharmacy_directory();
        ArrayList<Pharmacy> list=rd.getA();        
        int s=list.size();
        System.out.println(s);
        for(int i=0;i<s;i++)
        {
           Pharmacy r=list.get(i);
           String s1=r.getName();
           jComboBox1.addItem(s1);
           
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

        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(26, 39, 68));
        setMaximumSize(new java.awt.Dimension(770, 539));

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Cost", "Quantity"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        jButton1.setBackground(new java.awt.Color(195, 233, 245));
        jButton1.setText("Place Order");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Cost"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Pharmacy :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(333, 333, 333)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 15, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(165, 165, 165))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap(162, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        jTable2.setModel(new DefaultTableModel(null,new String[]{"Name","Cost"}));
        jTable3.setModel(new DefaultTableModel(null,new String[]{"Name","Cost","Quantity"}));
        Pharmacy_directory rd=system.getPharmacy_directory();
        ArrayList<Pharmacy> list=rd.getA();
        String s=jComboBox1.getSelectedItem().toString();
        System.out.println(s);
        int j=list.size();
        System.out.println(j);
        for(int i=0;i<j;i++)
        {
            Pharmacy r =list.get(i);
            

            if(s.matches(r.getName()))
            {
                System.out.println("matched");
                Map<String,String> abc=r.getMedicines();
                System.out.println(abc.size());
                DefaultTableModel model2 = (DefaultTableModel) jTable2.getModel();    
                for (String key: abc.keySet()) {
                System.out.println(key);
                System.out.println(abc.get(key));
                String s1[]={key,abc.get(key)};
                model2.addRow(s1);
            }
            }
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         DefaultTableModel t = (DefaultTableModel) jTable3.getModel();
         if(t.getRowCount()!=0)
         {
        medrequest m=new medrequest();
        int x = 1 + (int) (Math.random() * 100);
        m.setId(x);
        m.setPatientid(patientid);
        Doctor u=(Doctor)(userAccount);
        m.setDocname(u.getFirstname());
        m.setPharmacyname(jComboBox1.getSelectedItem().toString());
        m.setStatus("Order Placed");
        
        Map<String,String> f=m.getOrderlist();
        Map<String,String> f1=m.getCostlist();
        int a=t.getRowCount();
        for(int i=0;i<a;i++)
        {
            String one=t.getValueAt(i, 0).toString();
            String a1=t.getValueAt(i, 1).toString();
            String two=t.getValueAt(i, 2).toString();
            f.put(one, two);
            int q=Integer.parseInt(a1);
            int q1=Integer.parseInt(two);
            int q3=q*q1;
            f1.put(one,String.valueOf(q3));
            
            
        }
        medrequest_directory dire=system.getMedrequest_directory();
        ArrayList<medrequest> order=dire.getUser();
        order.add(m);
        DB4OUtil.dB4OUtil.storeSystem(system);
        JOptionPane.showMessageDialog(null, "Order placed");
         }
         else
         {
             JOptionPane.showMessageDialog(null, "Cart is empty!!");
         }
        
        

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // TODO add your handling code here:
        DefaultTableModel t = (DefaultTableModel) jTable2.getModel();
        int t1=jTable2.getSelectedRow();
        System.out.println(t1);
        String s=t.getValueAt(t1, 0).toString();
        String s1=t.getValueAt(t1, 1).toString();
        String response;
        do{
            response = JOptionPane.showInputDialog("Please provide Quantity");
        }while(!response.matches("[0-9][0-9]"));   
        
        DefaultTableModel t2 = (DefaultTableModel) jTable3.getModel();
        t2.addRow(new Object[]{s,s1,response});
    }//GEN-LAST:event_jTable2MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    // End of variables declaration//GEN-END:variables
}
