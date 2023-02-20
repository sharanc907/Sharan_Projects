/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.user.User;
import java.util.ArrayList;

/**
 *
 * @author raksh
 */
public class report_emergency_directory {
    ArrayList<report_emergency> us = new ArrayList<report_emergency>();

    public ArrayList<report_emergency> getUser() {
        return us;
    }

    public void setUser(ArrayList<report_emergency> user) {
        this.us = user;
    }
    
    public void addUser(report_emergency user){
        us.add(user);
    }
    
    public void removeUser(report_emergency user){
        us.remove(user);
    }
    
}
