/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.Customer;

import java.util.ArrayList;

/**
 *
 * @author prath
 */
public class CustomerDirectory {
 
	private ArrayList<Customer> volunteerList;

    public CustomerDirectory() {
        volunteerList= new ArrayList<>();
        
    }

    public ArrayList<Customer> getVolunteerList() {
        return volunteerList;
    }

    public void setVolunteerList(ArrayList<Customer> volunteerList) {
        this.volunteerList = volunteerList;
    }
    //add a new volunteer
    public Customer addVolunteer(){
    
        Customer v = new Customer();
        volunteerList.add(v);
        return v;
    }
    //remove a volunteer
    public void removeVolunteer(Customer v){
        volunteerList.remove(v);
    }
}
