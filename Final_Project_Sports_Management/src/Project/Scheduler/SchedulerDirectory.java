/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.Scheduler;

import java.util.ArrayList;

/**
 *
 * @author prath
 */
public class SchedulerDirectory {
    private ArrayList<Scheduler> ngodirectory;

    public SchedulerDirectory() {
    ngodirectory= new ArrayList<>();
    }

    public ArrayList<Scheduler> getNgodirectory() {
        return ngodirectory;
    }

    public void setNgodirectory(ArrayList<Scheduler> ngodirectory) {
        this.ngodirectory = ngodirectory;
    }
    //add a NGO
    public Scheduler addNGO(){
        Scheduler ngo =new Scheduler();
        ngodirectory.add(ngo);
        return ngo;
    }
    //remove a NGO
    public void removeNGO(Scheduler ngo){
        ngodirectory.remove(ngo);   
    }
}
