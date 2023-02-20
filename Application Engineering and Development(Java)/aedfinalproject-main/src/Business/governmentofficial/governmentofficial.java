/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.governmentofficial;

import Business.Role.UserRole;
import Business.Role.governmantOfficial;
import Business.UserAccount.UserAccount;

/**
 *
 * @author raksh
 */
public class governmentofficial extends UserAccount {
    String first_name;
    String last_name;
    String phone_number;
    String user_id;
    String password;
    
    public governmentofficial(String firstname, String lastname, String phonenumber, String userid, String password) {
        setUsername(userid);
        setPassword(password);
        setRole(new governmantOfficial());
        this.first_name = firstname;
        this.last_name = lastname;
        this.user_id=userid;
        this.password=password;        
        this.phone_number = phonenumber;
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
