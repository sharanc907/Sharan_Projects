/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.covidcenter;

import Business.firedepartment.FireDepartment;
import java.util.ArrayList;

/**
 *
 * @author raksh
 */
public class covidcenter_directory {
    ArrayList<covidcenter> a =new ArrayList<covidcenter>();
    
    public void addcovidcenter(covidcenter c)
    {        
       a.add(c);
    }

    public ArrayList<covidcenter> getA() {
        return a;
    }

    public void setA(ArrayList<covidcenter> a) {
        this.a = a;
    }

    
    
    public void removecovidcenter(covidcenter customer){
        a.remove(customer);
    }
}
