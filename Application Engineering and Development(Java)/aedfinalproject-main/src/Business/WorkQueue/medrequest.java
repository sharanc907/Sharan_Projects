/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author raksh
 */
public class medrequest {
    int id;
    String status;
    String patientid;
    String pharmacyname;
    String Docname;

    public String getDocname() {
        return Docname;
    }

    public void setDocname(String Docname) {
        this.Docname = Docname;
    }
    Map<String,String> orderlist=new HashMap<String,String>();
    Map<String,String> costlist=new HashMap<String,String>();

    public Map<String, String> getCostlist() {
        return costlist;
    }

    public void setCostlist(Map<String, String> costlist) {
        this.costlist = costlist;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPatientid() {
        return patientid;
    }

    public void setPatientid(String patientid) {
        this.patientid = patientid;
    }

    public String getPharmacyname() {
        return pharmacyname;
    }

    public void setPharmacyname(String pharmacyname) {
        this.pharmacyname = pharmacyname;
    }

    public Map<String, String> getOrderlist() {
        return orderlist;
    }

    public void setOrderlist(Map<String, String> orderlist) {
        this.orderlist = orderlist;
    }
    
    
}
