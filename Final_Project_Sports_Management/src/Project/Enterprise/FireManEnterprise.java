/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.Enterprise;

import Project.Role.FireManRole;
import Project.Role.Role;
import java.util.HashSet;

/**
 *
 * @author vedant
 */
public class FireManEnterprise extends Enterprise{
    
	public FireManEnterprise(String fireManName){
        super(fireManName,Enterprise.EnterpriseType.FireMan);
    }
  
	//hash map to for Fire Man role addition
    @Override
    public HashSet<Role> getSupportedRole(){
        role.add(new FireManRole());
        return role;
    }
}
