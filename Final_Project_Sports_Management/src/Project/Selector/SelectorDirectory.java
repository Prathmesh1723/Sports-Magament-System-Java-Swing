/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.Selector;

import java.util.ArrayList;

/**
 *
 * @author prath
 */
public class SelectorDirectory {
    private ArrayList<Selector> policeList;

    public SelectorDirectory() {
        policeList = new ArrayList<>();
        
    }

    public ArrayList<Selector> getPoliceList() {
        return policeList;
    }

    public void setPoliceList(ArrayList<Selector> policeList) {
        this.policeList = policeList;
    }
    
    //add a new police 
    public Selector addPolice(){
        Selector l= new Selector();
        policeList.add(l);
        return l;
    }
    //remove police
    public void removePolice(Selector l){
        policeList.remove(l);
    }
}
