/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author raksh
 */
public class Order {
    int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    String restaurant;
    String customer;
    Map<String,String> orderlist=new HashMap<String,String>();
    String delivaryman;
    String status;
    String message;

    public String getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(String restaurant) {
        this.restaurant = restaurant;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public Map<String, String> getOrderlist() {
        return orderlist;
    }

    public void setOrderlist(Map<String, String> orderlist) {
        this.orderlist = orderlist;
    }

    public String getDelivaryman() {
        return delivaryman;
    }

    public void setDelivaryman(String delivaryman) {
        this.delivaryman = delivaryman;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    
    
}
