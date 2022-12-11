/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.Enterprise;

import Project.Role.TournmtEventAdminRole;
import Project.Role.Role;
import Project.Role.VolunteerAdminRole;
import java.util.HashSet;
import Project.Role.SelectorAdminRole;

/**
 *
 * @author vedant
 */
public class CommunityEnterprise extends Enterprise{
    public CommunityEnterprise(String name){
        super(name,Enterprise.EnterpriseType.Community);
    }
    //Hash map to add rolesss
    @Override
    public HashSet<Role> getSupportedRole(){
       
        role.add(new TournmtEventAdminRole());
              
        role.add(new SelectorAdminRole());
        
        role.add(new VolunteerAdminRole());
       
        return role;
        
    }
}
