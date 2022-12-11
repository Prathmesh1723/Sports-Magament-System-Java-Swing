/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.PlayerStat;

import java.util.ArrayList;

/**
 *
 * @author vedant
 */
public class PlayerStatDirectory {
    private ArrayList<PlayerStat> changeSeekerDirectory;

    public PlayerStatDirectory() {
        changeSeekerDirectory=new ArrayList<>();
        
    }

    public ArrayList<PlayerStat> getChangeSeekerDirectory() {
        return changeSeekerDirectory;
    }

    public void setChangeSeekerDirectory(ArrayList<PlayerStat> changeSeekerDirectory) {
        this.changeSeekerDirectory = changeSeekerDirectory;
    }
    //add a new victim
    public PlayerStat addChangeSeeker(){
        PlayerStat cs= new PlayerStat();
        changeSeekerDirectory.add(cs);
        return cs;
    }
    //remove a victim
    public void removeChangeSeeker(PlayerStat cs){
        changeSeekerDirectory.remove(cs);
    }
    
}
