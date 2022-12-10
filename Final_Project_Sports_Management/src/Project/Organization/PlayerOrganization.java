/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.Organization;

import Project.Role.Role;
import Project.Role.PlayerRole;
import Project.Player.PlayerDirectory;
import java.util.HashSet;

/**
 *
 * @author prath
 */
public class PlayerOrganization extends Organization{

	PlayerDirectory victimList;

    //constructor to add victim list to victim directory
    public PlayerOrganization()
    {
        super(Organization.Type.Player.getValue());
        victimList=new PlayerDirectory();
    }

    public PlayerDirectory getChangeseekerlist() {
        return victimList;
    }

    public void setChangeseekerlist(PlayerDirectory victimList) {
        this.victimList = victimList;
    }
 
    //hashmap to support victim list
    @Override
    public HashSet<Role> getSupportedRole(){
        role.add(new PlayerRole());
        return role;
        
    }
}
