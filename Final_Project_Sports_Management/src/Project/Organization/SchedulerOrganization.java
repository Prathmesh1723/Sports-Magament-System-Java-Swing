/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.Organization;

import Project.Scheduler.SchedulerDirectory;
import Project.Role.SchedulingManagerRole;
import Project.Role.Role;
import java.util.HashSet;

/**
 *
 * @author prath
 */
public class SchedulerOrganization extends Organization{
    SchedulerDirectory ngoList;
    //constructor to add NGO list to NGO directory
    public SchedulerOrganization()
    {
        super(Organization.Type.Scheduler.getValue());
        ngoList=new SchedulerDirectory();
    }

    public SchedulerDirectory getNgoList() {
        return ngoList;
    }

    public void setNgoList(SchedulerDirectory ngolist) {
        this.ngoList = ngolist;
    }
    //hashmap to support NGO role
    @Override
    public HashSet<Role> getSupportedRole(){
       role.add(new SchedulingManagerRole());
       return role;
       
    }
}
