/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.policedepartment;

import Business.pharmacy.Pharmacy;
import java.util.ArrayList;

/**
 *
 * @author raksh
 */
public class PoliceDepartment_Directory {
    ArrayList<PoliceDepartment> a =new ArrayList<PoliceDepartment>();
    
    public void addpolice(PoliceDepartment c)
    {        
       a.add(c);
    }

    public ArrayList<PoliceDepartment> getA() {
        return a;
    }

    public void setA(ArrayList<PoliceDepartment> a) {
        this.a = a;
    }
    public void removepolice(PoliceDepartment customer){
        a.remove(customer);
    }
}
