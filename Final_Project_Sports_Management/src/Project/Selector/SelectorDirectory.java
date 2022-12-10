/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.Selector;

import java.util.ArrayList;

/**
 *
 *  @author vidis
 */
public class SelectorDirectory {
    private ArrayList<Selector> fireManList;

    public SelectorDirectory() {
        fireManList=new ArrayList();
        
    }

    public ArrayList<Selector> getFireManList() {
        return fireManList;
    }

    public void setPoliceList(ArrayList<Selector> fireManList) {
        this.fireManList = fireManList;
    }
    
    //add new fire man
    public Selector addFireMan(){
        Selector l= new Selector();
        fireManList.add(l);
        return l;
    }
    //remove a fire man
    public void removeFireMan(Selector l){
        fireManList.remove(l);
    }
}
