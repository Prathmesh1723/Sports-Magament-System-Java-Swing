/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.Enterprise;

import Project.Role.PoliceRole;
import Project.Role.Role;
import java.util.HashSet;

/**
 *
 * @author vedant
 */
public class PoliceEnterprise extends Enterprise{

    public PoliceEnterprise(String policeEnterpriseName){
        super(policeEnterpriseName,Enterprise.EnterpriseType.Police);
    }

    //hash map to for Police role addition
    @Override
    public HashSet<Role> getSupportedRole(){
        role.add(new PoliceRole());
        return role;
    }
}
