/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.Scheduler;

import java.util.ArrayList;

/**
 *
 * @author vidis
 */
public class SchedulerDirectory {
    private ArrayList<Scheduler> fireManList;

    public SchedulerDirectory() {
        fireManList=new ArrayList();
        
    }

    public ArrayList<Scheduler> getFireManList() {
        return fireManList;
    }

    public void setPoliceList(ArrayList<Scheduler> fireManList) {
        this.fireManList = fireManList;
    }
    
    //add new fire man
    public Scheduler addFireMan(){
        Scheduler l= new Scheduler();
        fireManList.add(l);
        return l;
    }
    //remove a fire man
    public void removeFireMan(Scheduler l){
        fireManList.remove(l);
    }
}
