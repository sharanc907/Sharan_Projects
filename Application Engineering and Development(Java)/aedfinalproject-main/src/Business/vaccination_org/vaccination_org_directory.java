/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.vaccination_org;

import Business.policedepartment.PoliceDepartment;
import java.util.ArrayList;

/**
 *
 * @author raksh
 */
public class vaccination_org_directory {
    ArrayList<vaccination_org> a =new ArrayList<vaccination_org>();
    
    public void addvacc_org(vaccination_org c)
    {        
       a.add(c);
    }

    public ArrayList<vaccination_org> getA() {
        return a;
    }

    public void setA(ArrayList<vaccination_org> a) {
        this.a = a;
    }
    public void removevacc_org(vaccination_org customer){
        a.remove(customer);
    }
    
}
