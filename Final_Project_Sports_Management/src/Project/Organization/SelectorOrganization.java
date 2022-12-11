/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.Organization;

import Project.Scheduler.SchedulerDirectory;
import Project.Role.PlayerRole;
import Project.Role.Role;
import java.util.HashSet;

/**
 *
 * @author vidis
 */
public class SelectorOrganization extends Organization{
    SchedulerDirectory fireManlist;
    //constructor to add fireman list to fireman directory
    public SelectorOrganization(String name)
    {
        super(Organization.Type.FireMan.getValue());
        fireManlist=new SchedulerDirectory();
    }


    public SchedulerDirectory getFireManlist() {
        return fireManlist;
    }

    public void setFireManlist(SchedulerDirectory fireManlist) {
        this.fireManlist = fireManlist;
    }
    //hasmap to support fire man role
    @Override
    public HashSet<Role> getSupportedRole(){
       role.add(new PlayerRole());
       return role;
       
    } 
}
