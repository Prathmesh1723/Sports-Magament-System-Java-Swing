/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.Organization;

import Project.Selector.SelectorDirectory;
import Project.Role.SelectorRole;
import Project.Role.Role;
import java.util.HashSet;

/**
 *
 * @author prath
 */
public class SelectorOrganization extends Organization{
    SelectorDirectory fireManlist;
    //constructor to add fireman list to fireman directory
    public SelectorOrganization(String name)
    {
        super(Organization.Type.Selector.getValue());
        fireManlist=new SelectorDirectory();
    }


    public SelectorDirectory getFireManlist() {
        return fireManlist;
    }

    public void setFireManlist(SelectorDirectory fireManlist) {
        this.fireManlist = fireManlist;
    }
    //hasmap to support fire man role
    @Override
    public HashSet<Role> getSupportedRole(){
       role.add(new SelectorRole());
       return role;
       
    } 
}
