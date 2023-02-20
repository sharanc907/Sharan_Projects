/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Doctor;

import Business.Customer.Customer;
import java.util.ArrayList;

/**
 *
 * @author raksh
 */
public class Doctor_Directory {
    ArrayList<Doctor> a =new ArrayList<Doctor>();
    
    public void adddoctor(Doctor c)
    {        
       a.add(c);
    }

    public ArrayList<Doctor> getA() {
        return a;
    }

    public void setA(ArrayList<Doctor> a) {
        this.a = a;
    }

    
    
    public void removedoctor(Doctor customer){
        a.remove(customer);
    }
}
