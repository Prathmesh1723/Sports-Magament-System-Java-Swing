/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.Volunteer;

import java.util.ArrayList;

/**
 *
 * @author vedant
 */
public class VolunteerDirectory {
 
	private ArrayList<Volunteer> volunteerList;

    public VolunteerDirectory() {
        volunteerList= new ArrayList<>();
        
    }

    public ArrayList<Volunteer> getVolunteerList() {
        return volunteerList;
    }

    public void setVolunteerList(ArrayList<Volunteer> volunteerList) {
        this.volunteerList = volunteerList;
    }
    //add a new volunteer
    public Volunteer addVolunteer(){
    
        Volunteer v = new Volunteer();
        volunteerList.add(v);
        return v;
    }
    //remove a volunteer
    public void removeVolunteer(Volunteer v){
        volunteerList.remove(v);
    }
}
