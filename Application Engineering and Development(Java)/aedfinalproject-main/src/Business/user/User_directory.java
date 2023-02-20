/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.user;


import Business.DeliveryMan.DeliveryMan;
import java.util.ArrayList;

/**
 *
 * @author raksh
 */
public class User_directory {
    ArrayList<User> us = new ArrayList<User>();

    public ArrayList<User> getUser() {
        return us;
    }

    public void setUser(ArrayList<User> user) {
        this.us = user;
    }
    
    public void addUser(User user){
        us.add(user);
    }
    
    public void removeUser(User user){
        us.remove(user);
    }
    
    
    
    
    
}
