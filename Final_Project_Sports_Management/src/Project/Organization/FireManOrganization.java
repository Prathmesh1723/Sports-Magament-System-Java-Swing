/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.Organization;

import Project.FireMan.FireManDirectory;
import Project.Role.FireManRole;
import Project.Role.Role;
import java.util.HashSet;

/**
 *
 * @author jan
 */
public class FireManOrganization extends Organization{
    FireManDirectory fireManlist;
    //constructor to add fireman list to fireman directory
    public FireManOrganization(String name)
    {
        super(Organization.Type.FireMan.getValue());
        fireManlist=new FireManDirectory();
    }


    public FireManDirectory getFireManlist() {
        return fireManlist;
    }

    public void setFireManlist(FireManDirectory fireManlist) {
        this.fireManlist = fireManlist;
    }
    //hasmap to support fire man role
    @Override
    public HashSet<Role> getSupportedRole(){
       role.add(new FireManRole());
       return role;
       
    } 
}
