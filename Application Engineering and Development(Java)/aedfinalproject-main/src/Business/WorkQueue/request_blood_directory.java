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
public class request_blood_directory {
    ArrayList<request_blood> us = new ArrayList<request_blood>();

    public ArrayList<request_blood> getarray() {
        return us;
    }

    public void setarray(ArrayList<request_blood> user) {
        this.us = user;
    }
    
    public void addrequest(request_blood user){
        us.add(user);
    }
    
    public void removerequest(request_blood user){
        us.remove(user);
    }
    
}
