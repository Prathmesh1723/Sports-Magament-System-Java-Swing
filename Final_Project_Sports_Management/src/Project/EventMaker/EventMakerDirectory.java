/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.EventMaker;

import java.util.ArrayList;

/**
 *
 * @author rajen
 */
public class EventMakerDirectory {
    
private ArrayList<EventMaker> eventMakerDirectory;

    public EventMakerDirectory() {
        eventMakerDirectory= new ArrayList<>();
    }

    public ArrayList<EventMaker> getChangeMakerDirectory() {
        return eventMakerDirectory;
    }

    public void setChangeMakerDirectory(ArrayList<EventMaker> changeMakerDirectory) {
        this.eventMakerDirectory = changeMakerDirectory;
    }
    
    //add an event maker
    public EventMaker addChangeMaker(){
        EventMaker cm = new EventMaker();
        eventMakerDirectory.add(cm);
        return cm;
    }
    //remove an event maker
    public void removeChangeMaker(EventMaker cm){
        eventMakerDirectory.remove(cm);
    }
    
}

