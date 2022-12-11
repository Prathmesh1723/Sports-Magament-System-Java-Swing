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
    private ArrayList<Player> ngodirectory;

    public PlayerDirectory() {
    ngodirectory= new ArrayList<>();
    }

    public ArrayList<Player> getNgodirectory() {
        return ngodirectory;
    }

    public void setNgodirectory(ArrayList<Player> ngodirectory) {
        this.ngodirectory = ngodirectory;
    }
    //add a NGO
    public Player addNGO(){
        Player ngo =new Player();
        ngodirectory.add(ngo);
        return ngo;
    }
    //remove a NGO
    public void removeNGO(Player ngo){
        ngodirectory.remove(ngo);   
    }
}
