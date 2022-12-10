/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.Player;

import java.util.ArrayList;

/**
 *
 * @author prath
 */
public class PlayerDirectory {
    private ArrayList<Player> changeSeekerDirectory;

    public PlayerDirectory() {
        changeSeekerDirectory=new ArrayList<>();
        
    }

    public ArrayList<Player> getChangeSeekerDirectory() {
        return changeSeekerDirectory;
    }

    public void setChangeSeekerDirectory(ArrayList<Player> changeSeekerDirectory) {
        this.changeSeekerDirectory = changeSeekerDirectory;
    }
    //add a new victim
    public Player addChangeSeeker(){
        Player cs= new Player();
        changeSeekerDirectory.add(cs);
        return cs;
    }
    //remove a victim
    public void removeChangeSeeker(Player cs){
        changeSeekerDirectory.remove(cs);
    }
    
}
