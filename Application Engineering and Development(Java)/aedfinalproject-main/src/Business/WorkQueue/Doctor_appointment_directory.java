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
public class Doctor_appointment_directory {
    
    ArrayList<Doctor_appointment> us = new ArrayList<Doctor_appointment>();

    public ArrayList<Doctor_appointment> getarray() {
        return us;
    }

    public void setarray(ArrayList<Doctor_appointment> user) {
        this.us = user;
    }
    
    public void addrequest(Doctor_appointment user){
        us.add(user);
    }
    
    public void removerequest(Doctor_appointment user){
        us.remove(user);
    }
    
}
