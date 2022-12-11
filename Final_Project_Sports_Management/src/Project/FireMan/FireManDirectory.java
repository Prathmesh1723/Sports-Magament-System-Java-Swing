/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.FireMan;

import java.util.ArrayList;

/**
 *
 * @author vidis
 */
public class FireManDirectory {
    private ArrayList<FireMan> fireManList;

    public FireManDirectory() {
        fireManList=new ArrayList();
        
    }

    public ArrayList<FireMan> getFireManList() {
        return fireManList;
    }

    public void setPoliceList(ArrayList<FireMan> fireManList) {
        this.fireManList = fireManList;
    }
    
    //add new fire man
    public FireMan addFireMan(){
        FireMan l= new FireMan();
        fireManList.add(l);
        return l;
    }
    //remove a fire man
    public void removeFireMan(FireMan l){
        fireManList.remove(l);
    }
}
