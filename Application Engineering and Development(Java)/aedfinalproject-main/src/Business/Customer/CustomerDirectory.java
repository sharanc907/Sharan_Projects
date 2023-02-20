/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class CustomerDirectory {
    ArrayList<Customer> a =new ArrayList<Customer>();
    
    public void adddirectory(Customer c)
    {        
       a.add(c);
    }

    public ArrayList<Customer> getA() {
        return a;
    }
    
    public void setCustomerList(ArrayList<Customer> customerList) {
        this.a = customerList;
    }
    
    public void removeCustomer(Customer customer){
        a.remove(customer);
    }
    
}
