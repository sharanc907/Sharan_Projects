/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.firedepartment;

import Business.pharmacy.Pharmacy;
import java.util.ArrayList;

/**
 *
 * @author raksh
 */
public class FireDepartmentDirectory {
    ArrayList<FireDepartment> a =new ArrayList<FireDepartment>();
    
    public void addpharmacy(FireDepartment c)
    {        
       a.add(c);
    }

    public ArrayList<FireDepartment> getA() {
        return a;
    }

    public void setA(ArrayList<FireDepartment> a) {
        this.a = a;
    }

    
    
    public void removepharmacy(FireDepartment customer){
        a.remove(customer);
    }
    
}
