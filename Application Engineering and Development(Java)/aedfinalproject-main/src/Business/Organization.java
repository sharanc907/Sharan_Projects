/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Ambulance.ambulance_directory;
import Business.Customer.CustomerDirectory;
import Business.Customer.OrderDirectory;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.Doctor.Doctor_Directory;
import Business.Employee.EmployeeDirectory;
import Business.Lab.bloodbank_directory;

import Business.Restaurant.RestaurantDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.Covid19_directory;
import Business.WorkQueue.Doctor_appointment_directory;
import Business.WorkQueue.Donate_blood_Directory;
import Business.WorkQueue.WorkQueue;
import Business.WorkQueue.app_check;
import Business.WorkQueue.medrequest_directory;
import Business.WorkQueue.report_emergency_directory;
import Business.WorkQueue.request_blood_directory;
import Business.WorkQueue.vaccination_request_directory;
import Business.covidcenter.covidcenter_directory;
import Business.firedepartment.FireDepartmentDirectory;
import Business.governmentofficial.governmentoffical_directory;
import Business.pharmacy.Pharmacy_directory;
import Business.policedepartment.PoliceDepartment_Directory;
import Business.user.User_directory;
import Business.vaccination_org.vaccination_org_directory;

import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public abstract class Organization {

    private String name;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private CustomerDirectory customerDirectory;
    private DeliveryManDirectory deliveryManDirectory;
    private RestaurantDirectory restaurantDirectory;
    OrderDirectory orderdirectory;
    User_directory userdirectory;
    Doctor_Directory doctordirectory;
    bloodbank_directory bloodbankdirectory;
    Pharmacy_directory pharmacy_directory;
    PoliceDepartment_Directory pd;
    FireDepartmentDirectory fd;
    governmentoffical_directory govdirectory;
    ambulance_directory ambulancedirectory ;
    report_emergency_directory report_emergency_directory;
    covidcenter_directory cd;
    Donate_blood_Directory dbd;
    request_blood_directory rbd;
    vaccination_org_directory vacc_org;
    vaccination_request_directory vrd;
    Doctor_appointment_directory Doctor_appointment_directory;
    Covid19_directory cdd;
    app_check appcheck;
    private int organizationID;
    private static int counter=0;
     medrequest_directory medrequest_directory;
    public enum Type{
        RestaurantAdmin("RestaurantAdmin"),
        Customer("Customer"),
        DeliveryMan("Delivery"),
        SysAdmin("Sysadmin");
        
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        customerDirectory = new CustomerDirectory();
        deliveryManDirectory = new DeliveryManDirectory();
        restaurantDirectory = new RestaurantDirectory();
        orderdirectory = new OrderDirectory();
        userdirectory =new User_directory();
        doctordirectory = new Doctor_Directory();
        bloodbankdirectory = new bloodbank_directory();
        pharmacy_directory = new Pharmacy_directory();
        pd=new PoliceDepartment_Directory();
        fd = new FireDepartmentDirectory();
        govdirectory = new governmentoffical_directory();
        ambulancedirectory = new ambulance_directory();
        report_emergency_directory = new report_emergency_directory();
        cd=new covidcenter_directory();
        dbd=new Donate_blood_Directory();
        rbd=new request_blood_directory();
        vacc_org =new vaccination_org_directory();
        vrd=new vaccination_request_directory();
        Doctor_appointment_directory = new Doctor_appointment_directory();
        cdd = new Covid19_directory();
        medrequest_directory = new medrequest_directory();
        appcheck = new app_check();
        
        organizationID = counter;
        ++counter;
    }
public medrequest_directory getMedrequest_directory() {
        if(medrequest_directory==null)
        {
            medrequest_directory = new medrequest_directory();        
        }
        return medrequest_directory;
    }

 

    public void setMedrequest_directory(medrequest_directory medrequest_directory) {
        this.medrequest_directory = medrequest_directory;
    }

    public app_check getAppcheck() {
        if(appcheck ==null)
        {
            appcheck = new app_check();       
        }
        return appcheck;
    }

    public void setAppcheck(app_check appcheck) {
        this.appcheck = appcheck;
    }
    
    
    public Covid19_directory getCdd() {
        if(cdd ==null)
        {
            cdd = new Covid19_directory();        
        }
        return cdd;
    }

    public void setCdd(Covid19_directory cdd) {
        this.cdd = cdd;
    }

    public covidcenter_directory getCd() {
        if(cd ==null)
        {
            cd = new covidcenter_directory();        
        }
        return cd;
    }

    public void setCd(covidcenter_directory cd) {
        this.cd = cd;
    }

    public Doctor_appointment_directory getDoctor_appointment_directory() {
        if(Doctor_appointment_directory==null)
        {
            Doctor_appointment_directory = new Doctor_appointment_directory();        
        }
        return Doctor_appointment_directory;
        
    }

    public void setDoctor_appointment_directory(Doctor_appointment_directory Doctor_appointment_directory) {
        this.Doctor_appointment_directory = Doctor_appointment_directory;
    }

   
    

    public vaccination_request_directory getVrd() {
        if(vrd==null)
        {
            vrd = new vaccination_request_directory();        
        }
        return vrd;
    }

    public void setVrd(vaccination_request_directory vrd) {
        this.vrd = vrd;
    }

    
    public vaccination_org_directory getVacc_org() {
        if(vacc_org==null)
        {
            vacc_org = new vaccination_org_directory();        
        }
        return vacc_org;
    }

    public void setVacc_org(vaccination_org_directory vacc_org) {
        this.vacc_org = vacc_org;
    }
    
    

    public request_blood_directory getRbd() {
        if(rbd==null)
        {
            rbd = new request_blood_directory();        }
        return rbd;
    }

    public void setRbd(request_blood_directory rbd) {
        this.rbd = rbd;
    }

    public Donate_blood_Directory getDbd() {
        if(dbd==null)
        {
            dbd = new Donate_blood_Directory();
        }
        return dbd;
    }

    public void setDbd(Donate_blood_Directory dbd) {
        this.dbd = dbd;
    }

  
    

    public report_emergency_directory getReport_emergency_directory() {
        if(report_emergency_directory==null)
        {
            report_emergency_directory = new report_emergency_directory();
        }
        return report_emergency_directory;
    }

    public void setReport_emergency_directory(report_emergency_directory report_emergency_directory) {
        this.report_emergency_directory = report_emergency_directory;
    }

    public ambulance_directory getAmbulancedirectory() {
        if(ambulancedirectory==null)
        {
            ambulancedirectory = new ambulance_directory();
        }
        return ambulancedirectory;
    }

    public void setAmbulancedirectory(ambulance_directory ambulancedirectory) {
        this.ambulancedirectory = ambulancedirectory;
    }

    public governmentoffical_directory getGovdirectory() {
        if(govdirectory==null)
        {
            govdirectory = new governmentoffical_directory();
        }
        return govdirectory;
    }

    public void setGovdirectory(governmentoffical_directory govdirectory) {
        this.govdirectory = govdirectory;
    }

    public FireDepartmentDirectory getFd() {
        if(fd==null)
        {
            fd = new FireDepartmentDirectory();
        }
        return fd;
    }

    public void setFd(FireDepartmentDirectory fd) {
        this.fd = fd;
    }

    public PoliceDepartment_Directory getPd() {
        if(pd==null)
        {
            pd = new PoliceDepartment_Directory();
        }
        return pd;
    }

    public void setPd(PoliceDepartment_Directory pd) {
        this.pd = pd;
    }

    public Pharmacy_directory getPharmacy_directory() {
        if(pharmacy_directory==null)
        {
            pharmacy_directory = new Pharmacy_directory();
        }
        return pharmacy_directory;
    }

    public void setPharmacy_directory(Pharmacy_directory pharmacy_directory) {
        this.pharmacy_directory = pharmacy_directory;
    }

    public Doctor_Directory getDoctordirectory() {
        if(doctordirectory==null)
        {
            doctordirectory = new Doctor_Directory();
        }
        return doctordirectory;
    }

    public void setDoctordirectory(Doctor_Directory doctordirectory) {
        this.doctordirectory = doctordirectory;
    }

    public bloodbank_directory getBloodbankdirectory() {
        if(bloodbankdirectory==null)
        {
            bloodbankdirectory =new bloodbank_directory();
        }
        return bloodbankdirectory;
    }

    public void setBloodbankdirectory(bloodbank_directory bloodbankdirectory) {
        this.bloodbankdirectory = bloodbankdirectory;
    }

    public User_directory getUserdirectory() {
        if(userdirectory==null)
        {
            userdirectory =new User_directory();
        }
            
        return userdirectory;
    }

    public void setUserdirectory(User_directory userdirectory) {
        this.userdirectory = userdirectory;
    }

    public OrderDirectory getOrderdirectory() {
        if(orderdirectory == null){
            orderdirectory = new OrderDirectory();
        }
        return orderdirectory;
        
    }

    public void setOrderdirectory(OrderDirectory orderdirectory) {
        this.orderdirectory = orderdirectory;
    }
    public Organization(){
        
    }
    public abstract ArrayList<Role> getSupportedRole();
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        if(employeeDirectory == null){
            employeeDirectory = new EmployeeDirectory();
        }
        return employeeDirectory;
    }
    
    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return name;
    }

    public CustomerDirectory getCustomerDirectory() {
        if(customerDirectory == null){
            customerDirectory = new CustomerDirectory();
        }
        return customerDirectory;
    }

    public void setCustomerDirectory(CustomerDirectory customerDirectory) {
        this.customerDirectory = customerDirectory;
    }

    public DeliveryManDirectory getDeliveryManDirectory() {
        
        if(deliveryManDirectory == null){
            deliveryManDirectory = new DeliveryManDirectory();
        }
        return deliveryManDirectory;
    }

    public void setDeliveryManDirectory(DeliveryManDirectory deliveryManDirectory) {
        this.deliveryManDirectory = deliveryManDirectory;
    }

    public RestaurantDirectory getRestaurantDirectory() {
        if(restaurantDirectory == null){
            restaurantDirectory = new RestaurantDirectory();
        }
        return restaurantDirectory;
    }

    public void setRestaurantDirectory(RestaurantDirectory restaurantDirectory) {
        this.restaurantDirectory = restaurantDirectory;
    }

    
    
    
}