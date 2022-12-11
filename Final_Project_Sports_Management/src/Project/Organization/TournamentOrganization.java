/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.Organization;

import Project.Player.PlayerDirectory;
import Project.Role.ScheduleManagerRole;
import Project.Role.Role;
import java.util.HashSet;

/**
 *
 * @author vidis
 */
public class TournamentOrganization extends Organization{
    PlayerDirectory ngoList;
    //constructor to add NGO list to NGO directory
    public TournamentOrganization()
    {
        super(Organization.Type.NGO.getValue());
        ngoList=new PlayerDirectory();
    }

    public PlayerDirectory getNgoList() {
        return ngoList;
    }

    public void setNgoList(PlayerDirectory ngolist) {
        this.ngoList = ngolist;
    }
    //hashmap to support NGO role
    @Override
    public HashSet<Role> getSupportedRole(){
       role.add(new ScheduleManagerRole());
       return role;
       
    }
}
