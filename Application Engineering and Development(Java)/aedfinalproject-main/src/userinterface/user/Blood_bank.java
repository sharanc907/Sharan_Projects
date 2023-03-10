/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.user;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Lab.BloodBank;
import Business.Lab.bloodbank_directory;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.Donate_blood;
import Business.WorkQueue.Donate_blood_Directory;
import Business.WorkQueue.report_emergency;
import Business.WorkQueue.report_emergency_directory;
import Business.policedepartment.PoliceDepartment;
import Business.user.User;
import java.awt.CardLayout;
import java.awt.Component;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import java.text.ParseException;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import userinterface.loginpage;

/**
 *
 * @author raksh
 */
public class Blood_bank extends javax.swing.JPanel {

    private final JPanel container;
    private final EcoSystem ecosystem;
    private final UserAccount userAccount;

    /**
     * Creates new form Blood_bank
     */
    public Blood_bank(JPanel container,EcoSystem ecosystem,UserAccount userAccount) {
        initComponents();
        this.container=container;
        this.ecosystem=ecosystem;
        this.userAccount=userAccount;
        User a =(User)(userAccount);
        jTextField1.setText(a.getFirst_name());
        jTextField2.setText(a.getLast_name());
        bloodbank_directory bd=ecosystem.getBloodbankdirectory();
        ArrayList<BloodBank> ol=bd.getA();
        int u=ol.size();
        for(int i=0;i<u;i++)
        {
            BloodBank o=ol.get(i);
            jComboBox2.addItem(o.getName());
        }
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

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(26, 39, 68));

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("First Name :");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Last Name :");

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Blood Bank :");

        jLabel4.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Appointment Date :");

        jLabel5.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Appointment Time :");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "09:00 - 10:00", "10:00 - 11:00", "11:00 - 12:00", "12:00 - 13:00", "13:00 - 14:00", "14:00 - 15:00", "15:00 - 16:00", "16:00 - 17:00", "17:00 - 18:00", "19:00 - 20:00", " ", " " }));

        jScrollPane1.setBackground(new java.awt.Color(0, 255, 255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Center", "Status", "Date", "Time"
            }
        ));
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(1).setResizable(false);
        }

        jButton1.setBackground(new java.awt.Color(195, 233, 245));
        jButton1.setText("Book Appointment ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(195, 233, 245));
        jButton2.setText("View Result");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(195, 233, 245));
        jButton3.setText("Cancel Appointment ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Donate Blood");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5))
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.LEADING, 0, 161, Short.MAX_VALUE)
                                .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jButton3)
                        .addGap(67, 67, 67)
                        .addComponent(jButton1)
                        .addGap(62, 62, 62)
                        .addComponent(jButton2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 641, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(341, 341, 341))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton1, jButton2, jButton3});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(108, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
            // TODO add your handling code here:
            if(jDateChooser1.getDate()!=null)
            {
            Donate_blood db=new Donate_blood();
            int x = 1 + (int) (Math.random() * 100);
            db.setId(x);
            db.setFirst_name(jTextField1.getText());
            db.setBlood_bank_name(jComboBox2.getSelectedItem().toString());
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String d1 = sdf.format(jDateChooser1.getDate());
            db.setStatus("Appoinment Booked");
            User a=(User)(userAccount);
            System.out.println(a.getUser_id());
            db.setUser_id(a.getUser_id());
            db.setAppoinment_date(d1);            
            db.setAppoinment_time(jComboBox1.getSelectedItem().toString());
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");  
            LocalDateTime d2 = LocalDateTime.now();  
            System.out.println(dtf.format(d2));
            if(d1.compareTo(d2.toString()) >= 0) {
                Donate_blood_Directory dbd=ecosystem.getDbd();    
                dbd.addrequest(db);
                jTable1.setModel(new DefaultTableModel(null,new String[]{"ID","Center","Status","Date","Time"}));
                populate_table();
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Appointment Available from Tomorrow");
            }
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Pick A Date!!");
            }
            
            
       
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void backAction() {
        container.remove(this);
        Component[] componentArray = container.getComponents();
        Component component = componentArray[componentArray.length - 1];
        loginpage manageSuppliersJPanel = (loginpage) component;        
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel  t2 = (DefaultTableModel) jTable1.getModel();
        int selectedRow=jTable1.getSelectedRow();
        if(selectedRow>=0)
        {
        int s=Integer.parseInt(t2.getValueAt(selectedRow, 0).toString());
        System.out.println("id"+s);
        Donate_blood_Directory red=ecosystem.getDbd();
        ArrayList<Donate_blood> ol=red.getarray();
        int u=ol.size();
        User bb=(User)(userAccount);
        for(int i=0;i<u;i++)
        {
            Donate_blood o=ol.get(i);
            if(s==o.getId())
            {
                if(o.getStatus().matches("Done"))
                {
                JOptionPane.showMessageDialog(null,"WBC :"+o.getWBC()+" "+"RBC :"+o.getRBC()+" "+"Cholesterol :"+o.getCholesterol()+" "+"Platelets :"+o.getPlatelets());
                }
                else
                {
                  JOptionPane.showMessageDialog(null,"Results not Available!!");  
                }
            }
        }
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Select a Row!!");
        }
    
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel  t2 = (DefaultTableModel) jTable1.getModel();
        int selectedRow=jTable1.getSelectedRow();
        if(selectedRow>=0)
        {
        int s=Integer.parseInt(t2.getValueAt(selectedRow, 0).toString());
        System.out.println("id"+s);
        Donate_blood_Directory red=ecosystem.getDbd();
        ArrayList<Donate_blood> ol=red.getarray();
        int u=ol.size();
        User bb=(User)(userAccount);
        for(int i=0;i<u;i++)
        {
            Donate_blood o=ol.get(i);
            if(s==o.getId()/*&&o.getStatus().matches("Deliver Man Assigned")*/)
            {
                if(o.getStatus().matches("Appoinment Booked"))
                {
                     o.setStatus("Cancled");
                }
                else
                        {
                            JOptionPane.showMessageDialog(null,"wrong move!!");
                        }
               
            }
            }
        jTable1.setModel(new DefaultTableModel(null,new String[]{"ID","Center","Status","Date","Time"}));
        populate_table();
    }//GEN-LAST:event_jButton3ActionPerformed
else
        {
            JOptionPane.showMessageDialog(null,"Select a Row!!");
        }
    }
    public void populate_table()
    {
        Donate_blood_Directory red=ecosystem.getDbd();
        ArrayList<Donate_blood> ol=red.getarray();
        int u=ol.size();
        System.out.println(u);
        for(int i=0;i<u;i++)
        {
            Donate_blood o=ol.get(i);
            System.out.println(userAccount.getUsername());
            System.out.println(o.getUser_id());
            if(userAccount.getUsername().matches(o.getUser_id()))
            {
                DefaultTableModel t2 = (DefaultTableModel) jTable1.getModel();
                String s1=String.valueOf(o.getId());    
                String s[]={s1,o.getBlood_bank_name(),o.getStatus(),o.getAppoinment_date(),o.getAppoinment_time()};
                t2.addRow(s);
            }
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
