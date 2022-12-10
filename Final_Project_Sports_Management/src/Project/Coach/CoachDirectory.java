/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.Coach;

import java.util.ArrayList;

/**
 *
 * @author prath
 */
public class CoachDirectory {
    private ArrayList<Coach> policeList;

    public CoachDirectory() {
        policeList = new ArrayList<>();
        
    }

    public ArrayList<Coach> getPoliceList() {
        return policeList;
    }

    public void setPoliceList(ArrayList<Coach> policeList) {
        this.policeList = policeList;
    }
    
    //add a new police 
    public Coach addPolice(){
        Coach l= new Coach();
        policeList.add(l);
        return l;
    }
    //remove police
    public void removePolice(Coach l){
        policeList.remove(l);
    }
}
