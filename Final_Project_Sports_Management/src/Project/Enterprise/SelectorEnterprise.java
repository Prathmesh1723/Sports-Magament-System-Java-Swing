/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.Enterprise;

import Project.Role.SelectorRole;
import Project.Role.Role;
import java.util.HashSet;

/**
 *
 * @author vedant
 */
public class SelectorEnterprise extends Enterprise{
    
	public SelectorEnterprise(String fireManName){
        super(fireManName,Enterprise.EnterpriseType.Selector);
    }
  
	//hash map to for Fire Man role addition
    @Override
    public HashSet<Role> getSupportedRole(){
        role.add(new SelectorRole());
        return role;
    }
}
