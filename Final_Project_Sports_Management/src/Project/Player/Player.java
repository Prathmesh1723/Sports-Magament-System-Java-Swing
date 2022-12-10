/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.Player;

import Project.WorkQueue.WorkRequestQueue;

/**
 *
 * @author prath
 */
public class Player {
    private String victimName;
    private String victimId;
    private WorkRequestQueue victimWorkQueue;
    
    private static int count=1;
 
    //victim class constructor to autogenerate victimId
     public Player(){
         
        victimId= "Victim"+(++count);
    }

    public WorkRequestQueue getVictimWorkQueue() {
        return victimWorkQueue;
    }

    public void setVictimWorkQueue(WorkRequestQueue workqueue) {
        this.victimWorkQueue = workqueue;
    }
 
     
    public String getVictimName() {
        return victimName;
    }

    public void setVictimName(String name) {
        this.victimName = name;
    }

    public String getVictimId() {
        return victimId;
    }

    public void setVictimId(String id) {
        this.victimId = id;
    }
     
     @Override
     public String toString(){
         return victimName;
     }
}
