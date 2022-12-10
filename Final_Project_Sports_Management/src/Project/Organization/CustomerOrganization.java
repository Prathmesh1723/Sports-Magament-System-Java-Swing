/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.Organization;

import Project.Role.Role;
import Project.Role.CustomerRole;
import Project.Customer.CustomerDirectory;
import java.util.HashSet;

/**
 @author prath
 */
public class CustomerOrganization extends Organization{

	CustomerDirectory volunteerList;

	//constructor to add volunteer list to volunteer directory
    public CustomerOrganization(String name) {
        super(Organization.Type.Customer.getValue());
        volunteerList= new CustomerDirectory();
    }

    public CustomerDirectory getVolunteerList() {
        return volunteerList;
    }

    public void setVolunteerList(CustomerDirectory volunteerList) {
        this.volunteerList = volunteerList;
    }

    //hashmap to support volunteer role
    @Override
    public HashSet<Role> getSupportedRole(){
        role.add(new CustomerRole());
       return role;
    }
}
