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
public class vaccination_request_directory {
    ArrayList<vaccination_request> us = new ArrayList<vaccination_request>();

    public ArrayList<vaccination_request> getarray() {
        return us;
    }

    public void setarray(ArrayList<vaccination_request> user) {
        this.us = user;
    }
    
    public void addrequest(vaccination_request user){
        us.add(user);
    }
    
    public void removerequest(vaccination_request user){
        us.remove(user);
    }
    
}
