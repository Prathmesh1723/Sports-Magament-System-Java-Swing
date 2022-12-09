/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.Police;

import Project.WorkQueue.WorkRequestQueue;

/**
 *
 * @author jan
 */
public class Police {
    private String policeName;
    private static int Count=1;
    private String policeId;
    private WorkRequestQueue policeWorkQueue;

    //Police class constructor to auto generate id
    public Police() {
        
        policeId = "Police"+(++Count);
        policeWorkQueue= new WorkRequestQueue();
    }
    
    public static int getCount() {
        return Count;
    }

    public static void setCount(int Count) {
        Police.Count = Count;
    }
    
    public String getPoliceName() {
        return policeName;
    }

    public void setPoliceName(String Name) {
        this.policeName = Name;
    }

    public String getPoliceId() {
        return policeId;
    }

    public void setPoliceId(String PoliceId) {
        this.policeId = PoliceId;
    }

    public WorkRequestQueue getPoliceWorkQueue() {
        return policeWorkQueue;
    }

    public void setPoliceWorkQueue(WorkRequestQueue workQueue) {
        this.policeWorkQueue = workQueue;
    }
          
    @Override
    public String toString(){
        return policeName;
    }
}
