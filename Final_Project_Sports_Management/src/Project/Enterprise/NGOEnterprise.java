/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.Enterprise;

import Project.Role.NGOManagerRole;
import Project.Role.Role;
import java.util.HashSet;

/**
 *
 * @author vedant
 */
public class NGOEnterprise extends Enterprise {

	public NGOEnterprise(String ngoName){
        super(ngoName,Enterprise.EnterpriseType.NGO);
    }
 
    //hash map to for NGO role addition
    @Override
    public HashSet<Role> getSupportedRole(){
        role.add(new NGOManagerRole());
        return role;
    }
}
