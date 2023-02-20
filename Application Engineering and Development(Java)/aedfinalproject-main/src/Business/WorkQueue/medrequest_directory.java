/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author raksh
 */
public class medrequest_directory {
    ArrayList<medrequest> us = new ArrayList<medrequest>();

    public ArrayList<medrequest> getUser() {
        return us;
    }

    public void setUser(ArrayList<medrequest> user) {
        this.us = user;
    }
    
    public void addUser(medrequest user){
        us.add(user);
    }
    
    public void removeUser(medrequest user){
        us.remove(user);
    }
    
}
