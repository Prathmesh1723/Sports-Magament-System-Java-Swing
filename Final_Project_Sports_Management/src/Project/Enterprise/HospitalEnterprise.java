/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.Enterprise;

import Project.Role.DoctorRole;
import Project.Role.Role;
import java.util.HashSet;

/**
 *
 * @author vedant
 */
public class HospitalEnterprise extends Enterprise{

    public HospitalEnterprise(String hospitalName){
        super(hospitalName,Enterprise.EnterpriseType.Hospital);
    }

    //hash map to for Doctor role addition
    @Override
    public HashSet<Role> getSupportedRole(){
       
        role.add(new DoctorRole());
     
        return role;
    }
}
