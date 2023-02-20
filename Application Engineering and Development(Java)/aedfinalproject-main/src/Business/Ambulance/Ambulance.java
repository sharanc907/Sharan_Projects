/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Ambulance; 

import Business.Role.AmbulanceDriver;
import Business.Role.UserRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author raksh
 */
public class Ambulance extends UserAccount{
    String ambulance_name;
    String drivername;
    String phone_number;
    String user_id;
    String password;
    
    public Ambulance(String ambulance_name, String drivername, String phonenumber, String userid, String password) {
        setUsername(userid);
        setPassword(password);
        setRole(new AmbulanceDriver());
        this.ambulance_name = ambulance_name;
        this.drivername = drivername;
        this.user_id=userid;
        this.password=password;        
        this.phone_number = phonenumber;
    }

    public String getAmbulance_name() {
        return ambulance_name;
    }

    public void setAmbulance_name(String ambulance_name) {
        this.ambulance_name = ambulance_name;
    }

    public String getDrivername() {
        return drivername;
    }

    public void setDrivername(String drivername) {
        this.drivername = drivername;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        setUsername(user_id);
        this.user_id = user_id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
