/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.Police;

import java.util.ArrayList;

/**
 *
 * @author jan
 */
public class PoliceDirectory {
    private ArrayList<Police> policeList;

    public PoliceDirectory() {
        policeList = new ArrayList<>();
        
    }

    public ArrayList<Police> getPoliceList() {
        return policeList;
    }

    public void setPoliceList(ArrayList<Police> policeList) {
        this.policeList = policeList;
    }
    
    //add a new police 
    public Police addPolice(){
        Police l= new Police();
        policeList.add(l);
        return l;
    }
    //remove police
    public void removePolice(Police l){
        policeList.remove(l);
    }
}
