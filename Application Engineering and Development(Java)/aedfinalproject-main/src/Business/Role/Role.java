/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;

import Business.Organization;
import Business.Restaurant.Restaurant;
import Business.user.*;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public abstract class Role {
    
    public enum RoleType{
        
        
        RestaurantAdmin("RestaurantAdmin"),
        PharmacyAdmin("PharmacyAdmin"),
        FireDepartmentAdmin("FireDepartmentAdmin"),
        PoliceRole("PoilceAdmin"),
        Customer("Customer"),
        User("user"),
        Vaccination_admin("Vaccination_admin"),
        Doctor("Doctor"),
        bloodbank("bloodbankadmin"),
        DeliveryMan("Delivery"),
        covidtestingadmin("covidtestingadmin"),
        SysAdmin("Sysadmin");
        
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account,  
            EcoSystem business);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
    
}