/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.Victim;

import java.util.ArrayList;

/**
 *
 * @author vidis
 */
public class VictimDirectory {
    private ArrayList<Victim> changeSeekerDirectory;

    public VictimDirectory() {
        changeSeekerDirectory=new ArrayList<>();
        
    }

    public ArrayList<Victim> getChangeSeekerDirectory() {
        return changeSeekerDirectory;
    }

    public void setChangeSeekerDirectory(ArrayList<Victim> changeSeekerDirectory) {
        this.changeSeekerDirectory = changeSeekerDirectory;
    }
    //add a new victim
    public Victim addChangeSeeker(){
        Victim cs= new Victim();
        changeSeekerDirectory.add(cs);
        return cs;
    }
    //remove a victim
    public void removeChangeSeeker(Victim cs){
        changeSeekerDirectory.remove(cs);
    }
    
}
