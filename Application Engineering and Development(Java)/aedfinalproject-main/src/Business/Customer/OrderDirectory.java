/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import java.util.ArrayList;

/**
 *
 * @author raksh
 */
public class OrderDirectory {
    ArrayList<Order> od=new ArrayList<Order>();

    public ArrayList<Order> getOd() {
        return od;
    }

    public void setOd(ArrayList<Order> od) {
        this.od = od;
    }
    
}
