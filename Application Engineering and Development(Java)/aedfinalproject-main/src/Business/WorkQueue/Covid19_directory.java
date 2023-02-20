/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;
import java.util.ArrayList;
import java.util.Date;
/**
 *
 * @author css19
 */
public class Covid19_directory {
    ArrayList<Covid19> c = new ArrayList<Covid19>();

    public ArrayList<Covid19> getarray() {
        return c;
    }

    public void setarray(ArrayList<Covid19> user) {
        this.c = c;
    }
    public void addrequest(Covid19 user){
        c.add(user);
    }
    
    public void removerequest(Covid19 user){
        c.remove(user);
    }
}
