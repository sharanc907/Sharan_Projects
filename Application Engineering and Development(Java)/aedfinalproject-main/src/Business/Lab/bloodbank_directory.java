/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Lab;

import Business.Doctor.Doctor;
import java.util.ArrayList;

/**
 *
 * @author raksh
 */
public class bloodbank_directory {
    ArrayList<BloodBank> a =new ArrayList<BloodBank>();
    
    public void addBloodBank(BloodBank c)
    {        
       a.add(c);
    }

    public ArrayList<BloodBank> getA() {
        return a;
    }

    public void setA(ArrayList<BloodBank> a) {
        this.a = a;
    }

    
    
    public void removeBloodBank(BloodBank customer){
        a.remove(customer);
    }
    
}
