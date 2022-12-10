/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.Selector;

import Project.WorkQueue.WorkRequestQueue;

/**
 *
 * @author vidis
 */
public class Selector {
    private String fireManName;
    private static int Count=1;
    private String fireManId;
    private WorkRequestQueue fireManWorkQueue;
    //Fire man constructor which automatically generates id
    public Selector() {
        
        fireManId = "FireMan"+(++Count);
        fireManWorkQueue= new WorkRequestQueue();
    }
    
    public static int getCount() {
        return Count;
    }

    public static void setCount(int Count) {
        Selector.Count = Count;
    }

    public String getFireManName() {
        return fireManName;
    }

    public void setFireManName(String Name) {
        this.fireManName = Name;
    }

    public String getFireManId() {
        return fireManId;
    }

    public void setFireManId(String FireManId) {
        this.fireManId = FireManId;
    }

    public WorkRequestQueue getFireManWorkQueue() {
        return fireManWorkQueue;
    }

    public void setFireManWorkQueue(WorkRequestQueue workQueue) {
        this.fireManWorkQueue = workQueue;
    }
       
    
        @Override
    public String toString(){
        return fireManName;
    }
}
