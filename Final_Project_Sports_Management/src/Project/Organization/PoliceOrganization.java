/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.Organization;

import Project.Police.PoliceDirectory;
import Project.Role.PoliceRole;
import Project.Role.Role;
import java.util.HashSet;

/**
 *
 * @author vidis
 */
public class PoliceOrganization extends Organization{
    PoliceDirectory policeList;
    //constructor to add police list to police directory
    public PoliceOrganization(String name)
    {
        super(Organization.Type.Police.getValue());
        policeList=new PoliceDirectory();
    }


    public PoliceDirectory getPoliceList() {
        return policeList;
    }

    public void setPoliceList(PoliceDirectory policelist) {
        this.policeList = policelist;
    }
    //hasmap to support police role
    @Override
    public HashSet<Role> getSupportedRole(){
       role.add(new PoliceRole());
       return role;
       
    } 
}
