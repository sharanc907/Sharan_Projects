/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.government;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.WorkQueue.vaccination_request;
import Business.WorkQueue.vaccination_request_directory;
import Business.pharmacy.Pharmacy;
import Business.pharmacy.Pharmacy_directory;
import Business.vaccination_org.vaccination_org;
import Business.vaccination_org.vaccination_org_directory;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author raksh
 */
public class vaccination_request1 extends javax.swing.JPanel {

    private final JPanel container;
    private final EcoSystem ecosystem;

    /**
     * Creates new form vaccination_request1
     */
    public vaccination_request1(JPanel container,EcoSystem system) {
        
        initComponents();
        this.container=container;
        this.ecosystem=system;
        populate_table();
        Pharmacy_directory bd=ecosystem.getPharmacy_directory();
        ArrayList<Pharmacy> ol=bd.getA();
        int u=ol.size();
        for(int i=0;i<u;i++)
        {
            Pharmacy o=ol.get(i);
            jComboBox1.addItem(o.getName());
        }
        
        
        vaccination_org_directory bd1=ecosystem.getVacc_org();
        ArrayList<vaccination_org> ol1=bd1.getA();
        int u1=ol1.size();
        for(int i=0;i<u1;i++)
        {
            vaccination_org o=ol1.get(i);
            jComboBox2.addItem(o.getName());
        }
    }
    
    public void populate_table()
    {
        vaccination_request_directory vrd=ecosystem.getVrd();
        ArrayList<vaccination_request> ol=vrd.getarray();
        int u=ol.size();
        System.out.println(u);
        for(int i=0;i<u;i++)
        {
            vaccination_request o=ol.get(i);
                DefaultTableModel t2 = (DefaultTableModel) jTable1.getModel();
                String s1=String.valueOf(o.getId());    
                String s[]={s1,o.getFirst_name(),o.getCovid_19(),o.getDiabetese(),o.getMedication(),o.getBlood_thinner(),o.getStatus()};
                t2.addRow(s);
            
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jComboBox3 = new javax.swing.JComboBox<>();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(26, 39, 68));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Covid -19", "Diabetes", "Medication", "Blood Tinner", "Status"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jButton1.setText("Approve Request");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancel Request");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "09:00 - 10:00", "10:00 - 11:00", "11:00 - 12:00", "12:00 - 13:00", "13:00 - 14:00", "14:00 - 15:00", "15:00 - 16:00", "16:00 - 17:00", "17:00 - 18:00" }));

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Pharmacy:");

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Vaccination :");

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Date :");

        jLabel4.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Time :");

        jLabel5.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Vaccination Portal");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(292, 292, 292))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(168, 168, 168))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 608, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(315, 315, 315)
                        .addComponent(jLabel5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton1, jButton2});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jComboBox1, jComboBox2});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(32, 32, 32)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(172, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jComboBox1, jComboBox2, jComboBox3, jDateChooser1});

    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel t2 = (DefaultTableModel) jTable1.getModel();
        int selectedRow=jTable1.getSelectedRow();
        if(selectedRow>=0)
        {
            if(jDateChooser1.getDate()!=null)
            {
        int s=Integer.parseInt(t2.getValueAt(selectedRow, 0).toString());
        System.out.println("id"+s);
         vaccination_request_directory vrd=ecosystem.getVrd();
        ArrayList<vaccination_request> ol=vrd.getarray();
        int u=ol.size();
        for(int i=0;i<u;i++)
        {
            vaccination_request o=ol.get(i);
            if(s==o.getId()/*&&o.getStatus().matches("Deliver Man Assigned")*/)
            {
                if(o.getStatus().equals("Cancel")||o.getStatus().equals("Done")||o.getStatus().equals("Approved"))
                {
                    JOptionPane.showMessageDialog(null,"wrong move");
                }
                else
                {
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                    String d1 = sdf.format(jDateChooser1.getDate());
                    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");  
                    LocalDateTime d2 = LocalDateTime.now();
                    if(d1.compareTo(d2.toString()) >= 0) {
                    o.setPharmacy(jComboBox1.getSelectedItem().toString());
                o.setVaccination(jComboBox2.getSelectedItem().toString());
                 
                o.setDate(d1);
                o.setTime(jComboBox3.getSelectedItem().toString());
                o.setStatus("Approved");
                 JOptionPane.showMessageDialog(null, "Request Approved!!");
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"Appointment Available from Tomorrow");
                    }
                }
                
            }
        }
        jTable1.setModel(new DefaultTableModel(null,new String[]{"ID","Name","Covid-19","Diabetese","Medication","Blood Thinner","Status"}));
        populate_table();
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Pick A date");
            }
        
    }//GEN-LAST:event_jButton1ActionPerformed
else
        {
            JOptionPane.showMessageDialog(null,"Select a Row");
        }
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel t2 = (DefaultTableModel) jTable1.getModel();
        int selectedRow=jTable1.getSelectedRow();
        if(selectedRow>=0)
        {
        int s=Integer.parseInt(t2.getValueAt(selectedRow, 0).toString());
        System.out.println("id"+s);
         vaccination_request_directory vrd=ecosystem.getVrd();
        ArrayList<vaccination_request> ol=vrd.getarray();
        int u=ol.size();
        for(int i=0;i<u;i++)
        {
            vaccination_request o=ol.get(i);
            if(s==o.getId()/*&&o.getStatus().matches("Deliver Man Assigned")*/)
            {
                if(o.getStatus().equals("Cancel")||o.getStatus().equals("Done"))
                {
                    JOptionPane.showMessageDialog(null,"wrong move");
                }
                else
                {                
                o.setStatus("Cancel");
                }
                
            }
        }
        jTable1.setModel(new DefaultTableModel(null,new String[]{"ID","Name","Covid-19","Diabetese","Medication","Blood Thinner","Status"}));
        populate_table();
        
    }//GEN-LAST:event_jButton2ActionPerformed
else
        {
            JOptionPane.showMessageDialog(null,"Select a Row");
        }
    }
    
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
