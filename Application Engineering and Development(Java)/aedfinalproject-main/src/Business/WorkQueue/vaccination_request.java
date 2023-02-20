/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author raksh
 */
public class vaccination_request {
    String first_name;
    int id;
    String user_id;
    String covid_19;
    String diabetese;
    String medication;
    String blood_thinner;
    String Pharmacy;
    String vaccination;
    String Status;
    String Date;
    String Time;

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String Time) {
        this.Time = Time;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public String getPharmacy() {
        return Pharmacy;
    }

    public void setPharmacy(String Pharmacy) {
        this.Pharmacy = Pharmacy;
    }

    public String getVaccination() {
        return vaccination;
    }

    public void setVaccination(String vaccination) {
        this.vaccination = vaccination;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getCovid_19() {
        return covid_19;
    }

    public void setCovid_19(String covid_19) {
        this.covid_19 = covid_19;
    }

    public String getDiabetese() {
        return diabetese;
    }

    public void setDiabetese(String diabetese) {
        this.diabetese = diabetese;
    }

    public String getMedication() {
        return medication;
    }

    public void setMedication(String medication) {
        this.medication = medication;
    }

    public String getBlood_thinner() {
        return blood_thinner;
    }

    public void setBlood_thinner(String blood_thinner) {
        this.blood_thinner = blood_thinner;
    }
    
    
    
}
