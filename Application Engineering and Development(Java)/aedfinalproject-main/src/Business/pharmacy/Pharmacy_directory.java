/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.pharmacy;

import Business.Lab.BloodBank;
import java.util.ArrayList;

/**
 *
 * @author raksh
 */
public class Pharmacy_directory {
    ArrayList<Pharmacy> a =new ArrayList<Pharmacy>();
    
    public void addpharmacy(Pharmacy c)
    {        
       a.add(c);
    }

    public ArrayList<Pharmacy> getA() {
        return a;
    }

    public void setA(ArrayList<Pharmacy> a) {
        this.a = a;
    }

    
    
    public void removepharmacy(Pharmacy customer){
        a.remove(customer);
    }
    
}
