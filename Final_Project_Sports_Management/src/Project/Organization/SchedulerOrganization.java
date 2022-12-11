/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.Organization;

import Project.Selector.SelectorDirectory;
import Project.Role.PlayerStatRole;
import Project.Role.Role;
import java.util.HashSet;

/**
 *
 * @author vidis
 */
public class SchedulerOrganization extends Organization{
    SelectorDirectory policeList;
    //constructor to add police list to police directory
    public SchedulerOrganization(String name)
    {
        super(Organization.Type.Police.getValue());
        policeList=new SelectorDirectory();
    }


    public SelectorDirectory getPoliceList() {
        return policeList;
    }

    public void setPoliceList(SelectorDirectory policelist) {
        this.policeList = policelist;
    }
    //hasmap to support police role
    @Override
    public HashSet<Role> getSupportedRole(){
       role.add(new PlayerStatRole());
       return role;
       
    } 
}
