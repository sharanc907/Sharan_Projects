/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.user;

import Business.Role.CustomerRole;
import Business.Role.UserRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author raksh
 */
public class User extends UserAccount{
    String first_name;
    String last_name;
    String email;
    String phone_number;
    String user_id;
    String password;
    String location;
    
    public User(String firstname, String lastname, String userid, String password, String phonenumber,String location,String email) {
        setUsername(userid);
        setPassword(password);
        setRole(new UserRole());
        this.first_name = firstname;
        this.last_name = lastname;
        this.user_id=userid;
        this.password=password;        
        this.phone_number = phonenumber;
        this.location=location;
        this.email=email;
        
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
        this.user_id = user_id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    
    
    
}
