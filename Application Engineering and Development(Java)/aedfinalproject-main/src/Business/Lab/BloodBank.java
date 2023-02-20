/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Lab;

import Business.Role.DoctorRole;
import Business.Role.bloodbankadminrole;
import Business.UserAccount.UserAccount;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author raksh
 */
public class BloodBank extends UserAccount{
    String name;
    String Location;
    String phonenumber;
    String userid;
    String password;
    Map<String, Integer> hmap = new HashMap<String, Integer>();

    
    public BloodBank(String name,  String userid, String password, String phonenumber,String location) {
        setUsername(userid);
        setPassword(password);
        setRole(new bloodbankadminrole());
        this.name = name;
        this.phonenumber = phonenumber;
        this.Location = location;
        this.userid=userid;
        this.password=password;
        }

    public Map<String, Integer> getHmap() {
        return hmap;
    }

    public void setHmap(Map<String, Integer> hmap) {
        this.hmap = hmap;
    }

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

    public void setUser_id(String userid) {
        setUsername(userid);
        this.userid = userid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
