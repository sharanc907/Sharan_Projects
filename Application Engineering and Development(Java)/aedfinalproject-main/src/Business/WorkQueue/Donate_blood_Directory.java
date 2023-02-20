/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author raksh
 */
public class Donate_blood_Directory {
    ArrayList<Donate_blood> us = new ArrayList<Donate_blood>();

    public ArrayList<Donate_blood> getarray() {
        return us;
    }

    public void setarray(ArrayList<Donate_blood> user) {
        this.us = user;
    }
    
    public void addrequest(Donate_blood user){
        us.add(user);
    }
    
    public void removerequest(Donate_blood user){
        us.remove(user);
    }
    
    
    
}
