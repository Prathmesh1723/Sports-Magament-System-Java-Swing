/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.Tournament;

import java.util.ArrayList;

/**
 *
 * @author prath
 */
public class TournamentDirectory {
    private ArrayList<Tournament> hospitaldirectory;
    
    public TournamentDirectory() {
    hospitaldirectory= new ArrayList();
    }

    public ArrayList<Tournament> getHospitaldirectory() {
        return hospitaldirectory;
    }

    public void setHospitaldirectory(ArrayList<Tournament> hospitaldirectory) {
        this.hospitaldirectory = hospitaldirectory;
    }
    //add a new doctor
    public Tournament addHospital(){
        Tournament h =new Tournament();
        hospitaldirectory.add(h);
        return h;
    }
    //remove a doctor
    public void removeHospital(Tournament hospital){
        hospitaldirectory.remove(hospital);   
    }
    
}
