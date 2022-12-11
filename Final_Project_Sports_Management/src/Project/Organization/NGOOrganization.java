/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.Organization;

import Project.NGO.NGODirectory;
import Project.Role.NGOManagerRole;
import Project.Role.Role;
import java.util.HashSet;

/**
 *
 * @author vidis
 */
public class NGOOrganization extends Organization{
    NGODirectory ngoList;
    //constructor to add NGO list to NGO directory
    public NGOOrganization()
    {
        super(Organization.Type.NGO.getValue());
        ngoList=new NGODirectory();
    }

    public NGODirectory getNgoList() {
        return ngoList;
    }

    public void setNgoList(NGODirectory ngolist) {
        this.ngoList = ngolist;
    }
    //hashmap to support NGO role
    @Override
    public HashSet<Role> getSupportedRole(){
       role.add(new NGOManagerRole());
       return role;
       
    }
}
