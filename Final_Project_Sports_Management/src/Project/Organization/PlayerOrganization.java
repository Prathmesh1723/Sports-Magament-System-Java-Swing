/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project.Organization;

import Project.Player.PlayerDirectory;
import Project.Role.PlayerRole;
import Project.Role.Role;
import java.util.HashSet;

/**
 *
 * @author vidis
 */
public class PlayerOrganization extends Organization{
    
    PlayerDirectory playerlist;
    //constructor to add event maker list to Event Maker directory
    public PlayerOrganization()
    {
        super(Organization.Type.Player.getValue());
        playerlist= new PlayerDirectory();
    }

    public PlayerDirectory getPlayerlist() {
        return playerlist;
    }

    public void setPlayerlist(PlayerDirectory playerlist) {
        this.playerlist = playerlist;
    }
    
    //hash map to support event maker role
    @Override
    public HashSet<Role> getSupportedRole(){
       role.add(new PlayerRole());
       return role;
       
    }
}
