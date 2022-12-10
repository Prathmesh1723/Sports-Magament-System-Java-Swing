/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.Physician;

import java.util.ArrayList;

/**
 *
 * @author vidis
 */
public class PhysicianDirectory {
    private ArrayList<Physician> hospitaldirectory;
    
    public PhysicianDirectory() {
    hospitaldirectory= new ArrayList();
    }

    public ArrayList<Physician> getHospitaldirectory() {
        return hospitaldirectory;
    }

    public void setHospitaldirectory(ArrayList<Physician> hospitaldirectory) {
        this.hospitaldirectory = hospitaldirectory;
    }
    //add a new doctor
    public Physician addHospital(){
        Physician h =new Physician();
        hospitaldirectory.add(h);
        return h;
    }
    //remove a doctor
    public void removeHospital(Physician hospital){
        hospitaldirectory.remove(hospital);   
    }
    
}
