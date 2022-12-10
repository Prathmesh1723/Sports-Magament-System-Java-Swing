/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.Organization;

import Project.Coach.CoachDirectory;
import Project.Role.CoachRole;
import Project.Role.Role;
import java.util.HashSet;

/**
 *
 * @author prath
 */
public class CoachOrganization extends Organization{
    CoachDirectory policeList;
    //constructor to add police list to police directory
    public CoachOrganization(String name)
    {
        super(Organization.Type.Coach.getValue());
        policeList=new CoachDirectory();
    }


    public CoachDirectory getPoliceList() {
        return policeList;
    }

    public void setPoliceList(CoachDirectory policelist) {
        this.policeList = policelist;
    }
    //hasmap to support police role
    @Override
    public HashSet<Role> getSupportedRole(){
       role.add(new CoachRole());
       return role;
       
    } 
}
