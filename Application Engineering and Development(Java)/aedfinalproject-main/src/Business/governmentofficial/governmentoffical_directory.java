/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.governmentofficial;

import Business.firedepartment.FireDepartment;
import java.util.ArrayList;

/**
 *
 * @author raksh
 */
public class governmentoffical_directory {
    ArrayList<governmentofficial> a =new ArrayList<governmentofficial>();
    
    public void addgovofficers(governmentofficial c)
    {        
       a.add(c);
    }

    public ArrayList<governmentofficial> getA() {
        return a;
    }

    public void setA(ArrayList<governmentofficial> a) {
        this.a = a;
    }

    
    
    public void removegovofficers(governmentofficial customer){
        a.remove(customer);
    }
    
}
