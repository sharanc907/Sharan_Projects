/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import Business.Role.AdminRole;
import Business.UserAccount.UserAccount;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author harold
 */
public class Restaurant extends UserAccount{
    private String name;
    private String address;
    private String phone;
    public Map<String,String> menu;

    public Restaurant(String name, String address,String userName, String password, String phone) {
        setUsername(userName);
        setPassword(password);
        setRole(new AdminRole());
        this.name = name;
        this.address = address;
        this.phone = phone;
        menu=new HashMap<String,String>();
        this.menu=menu;
    }

    public Map<String, String> getMenu() {
        return menu;
    }

    public void setMenu(Map<String, String> menu) {
        this.menu = menu;
    }

    public Restaurant(){
    
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    @Override
    public String toString() {
        return this.name;
    }
}
