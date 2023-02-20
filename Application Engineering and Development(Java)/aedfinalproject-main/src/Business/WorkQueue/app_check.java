/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author raksh
 */
public class app_check {
    Map<String, List<String>> peopleByForename = new HashMap<>(); 

    public Map<String, List<String>> getPeopleByForename() {
        return peopleByForename;
    }

    public void setPeopleByForename(Map<String, List<String>> peopleByForename) {
        this.peopleByForename = peopleByForename;
    }
    
    
}
