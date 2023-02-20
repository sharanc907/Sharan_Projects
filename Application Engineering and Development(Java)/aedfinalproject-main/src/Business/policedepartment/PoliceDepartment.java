/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.policedepartment;

import Business.Role.PharmacyAdmin;
import Business.Role.PoliceRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author raksh
 */
public class PoliceDepartment extends UserAccount {
    
    String name;
    String Location;
    String phonenumber;
    String userid;
    String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        setUsername(userid);
        this.userid = userid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public PoliceDepartment(String name,  String userid, String password, String phonenumber,String location) {
        setUsername(userid);
        setPassword(password);
        setRole(new PoliceRole());
        this.name = name;
        this.phonenumber = phonenumber;
        this.Location = location;
        this.userid=userid;
        this.password=password;
        
        
    }
    
}
