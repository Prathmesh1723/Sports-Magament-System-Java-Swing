/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.Organization;

import Project.Role.Role;
import Project.Role.RefreeRole;
import Project.PlayerStat.PlayerStatDirectory;
import java.util.HashSet;

/**
 *
 * @author vidis
 */
public class PlayerOrganization extends Organization{

	PlayerStatDirectory victimList;

    //constructor to add victim list to victim directory
    public PlayerOrganization()
    {
        super(Organization.Type.Victim.getValue());
        victimList=new PlayerStatDirectory();
    }

    public PlayerStatDirectory getChangeseekerlist() {
        return victimList;
    }

    public void setChangeseekerlist(PlayerStatDirectory victimList) {
        this.victimList = victimList;
    }
 
    //hashmap to support victim list
    @Override
    public HashSet<Role> getSupportedRole(){
        role.add(new RefreeRole());
        return role;
        
    }
}
