/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.Enterprise;

import Project.Role.EventMakerAdminRole;
import Project.Role.Role;
import Project.Role.CustomerAdminRole;
import java.util.HashSet;
import Project.Role.PlayerAdminRole;

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
       
        role.add(new EventMakerAdminRole());
              
        role.add(new PlayerAdminRole());
        
        role.add(new CustomerAdminRole());
       
        return role;
        
    }
}
