/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.Volunteer;

import Project.WorkQueue.WorkRequestQueue;

/**
 *
 * @author vedant
 */
public class Volunteer {
    private String volunteerName;
    private String volunteerId;
    private static int count=1;
    private WorkRequestQueue volunteerWorkQueue;
 
    //Volunteer class constructor to autogenerate volunteerId
    public Volunteer() {
        volunteerId="Vol"+(++count);
        volunteerWorkQueue= new WorkRequestQueue();
    }
    
    public String getVolunteerName() {
        return volunteerName;
    }

    public void setVolunteerName(String volunteerName) {
        this.volunteerName = volunteerName;
    }
    
    public WorkRequestQueue getVolunteerWorkQueue() {
        return volunteerWorkQueue;
    }

    public void setVolunteerWorkQueue(WorkRequestQueue workqueue) {
        this.volunteerWorkQueue = workqueue;
    }

    public String getVolunteerId() {
        return volunteerId;
    }

    public void setVolunteerId(String id) {
        this.volunteerId = id;
    }
    
    @Override
    public String toString(){
    return volunteerName;
    
    }
}
