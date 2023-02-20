/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.covidcenter;

import Business.Role.FireDepartmentAdmin;
import Business.Role.covidtestingadmin;
import Business.UserAccount.UserAccount;

/**
 *
 * @author raksh
 */
public class covidcenter extends UserAccount {
    String name;
    String Location;
    String phonenumber;
    String userid;
    String password;
    String email;
    String result;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
    public covidcenter(String name, String location,String phonenumber,String userid, String password) {
        setUsername(userid);
        setPassword(password);
        setRole(new covidtestingadmin());
        this.name = name;
        this.phonenumber = phonenumber;
        this.Location = location;
        this.userid=userid;
        this.password=password;
        this.result = result;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
