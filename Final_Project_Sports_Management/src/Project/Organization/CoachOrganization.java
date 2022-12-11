/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.Organization;

import Project.Tournament.TournamentDirectory;
import Project.Role.CoachRole;
import Project.Role.Role;
import java.util.HashSet;

/**
 *
 * @author vidis
 */
public class CoachOrganization extends Organization{
    TournamentDirectory doctorList;
    //constructor to add doctor list to hospital directory
    public CoachOrganization()
    {
        super(Organization.Type.Doctor.getValue());
        doctorList= new TournamentDirectory();
    }

    public TournamentDirectory getHospitallist() {
        return doctorList;
    }

    public void setHospitallist(TournamentDirectory doctorList) {
        this.doctorList = doctorList;
    }
    
    //hashmap to support doctor role
    @Override
    public HashSet<Role> getSupportedRole(){
        role.add(new CoachRole());
       return role;
    }
    
}
