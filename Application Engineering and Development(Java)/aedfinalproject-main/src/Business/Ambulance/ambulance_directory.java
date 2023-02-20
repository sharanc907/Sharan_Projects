/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Ambulance;

import Business.governmentofficial.governmentofficial;
import java.util.ArrayList;

/**
 *
 * @author raksh
 */
public class ambulance_directory {
     ArrayList<Ambulance> a =new ArrayList<Ambulance>();
    
    public void addambulance(Ambulance c)
    {        
       a.add(c);
    }

    public ArrayList<Ambulance> getA() {
        return a;
    }

    public void setA(ArrayList<Ambulance> a) {
        this.a = a;
    }

    
    
    public void removeambulance(Ambulance customer){
        a.remove(customer);
    }
    
}
