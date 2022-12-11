/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.Enterprise;

import Project.Role.ScheduleManagerRole;
import Project.Role.Role;
import java.util.HashSet;

/**
 *
 * @author vedant
 */
public class BadmintonEnterprise extends Enterprise {

	public BadmintonEnterprise(String ngoName){
        super(ngoName,Enterprise.EnterpriseType.NGO);
    }
 
    //hash map to for NGO role addition
    @Override
    public HashSet<Role> getSupportedRole(){
        role.add(new ScheduleManagerRole());
        return role;
    }
}
