/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Doctor;

import Business.Role.CustomerRole;
import Business.Role.DoctorRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author raksh
 */
public class Doctor extends UserAccount{
    String firstname;
    String lastname;
    String userid;
    String password;
    String phonenumber;
    String spealization;
    
    public Doctor(String firstname, String lastname,String Spealization, String userid, String password, String phonenumber) {
        setUsername(userid);
        setPassword(password);
        setRole(new DoctorRole());
        this.firstname = firstname;
        this.lastname = lastname;
        this.phonenumber = phonenumber;
        this.spealization=Spealization;
        
        
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
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

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getSpealization() {
        return spealization;
    }

    public void setSpealization(String spealization) {
        this.spealization = spealization;
    }
    
}
