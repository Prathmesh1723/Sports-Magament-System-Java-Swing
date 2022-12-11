/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.EventMaker;

import Project.WorkQueue.WorkRequestQueue;

/**
 *
 * @author vedant 
 */
public class EventMaker {
    private String eventMakerName;
    private String eventMakerId;
    private WorkRequestQueue eventMakerWorkQueue;
    
    private static int count=1;
    //Event maker class constructor
     public EventMaker(){
         
        eventMakerId= "EM"+(++count);
        eventMakerWorkQueue=new WorkRequestQueue();
    }

    public WorkRequestQueue getEventMakerWorkQueue() {
        return eventMakerWorkQueue;
    }

    public void setEventMakerWorkQueue(WorkRequestQueue workQueue) {
        this.eventMakerWorkQueue = workQueue;
    }
    
    public String getEventMakerId() {
        return eventMakerId;
    }

    public void setEventMakerId(String id) {
        this.eventMakerId = id;
    }
     
    public String getEventMakerName() {
        return eventMakerName;
    }

    public void setEventMakerName(String name) {
        this.eventMakerName = name;
    }

     @Override
     public String toString(){
         return eventMakerName;
     }
    
}

