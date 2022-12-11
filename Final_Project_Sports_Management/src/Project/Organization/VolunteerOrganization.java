/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project.Organization;

import Project.Volunteer.VolunteerDirectory;
import Project.Role.VolunteerRole;
import Project.Role.Role;
import java.util.HashSet;

/**
 *
 * @author vidis
 */
public class VolunteerOrganization extends Organization{
    
    VolunteerDirectory volunteerList;
    //constructor to add NGO list to NGO directory
    public VolunteerOrganization()
    {
        super(Organization.Type.Volunteer.getValue());
        volunteerList=new VolunteerDirectory();
    }

    public VolunteerDirectory getVolunteerList() {
        return volunteerList;
    }

    public void setVolunteerList(VolunteerDirectory volunteerDirectory) {
        this.volunteerList = volunteerList;
    }
    //hashmap to support NGO role
    @Override
    public HashSet<Role> getSupportedRole(){
       role.add(new VolunteerManagerRole());
       return role;
       
    }
    
}
