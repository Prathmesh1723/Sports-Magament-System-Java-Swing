/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.Hospital;

import java.util.ArrayList;

/**
 *
 * @author prath
 */
public class HospitalDirectory {
    private ArrayList<Hospital> hospitaldirectory;
    
    public HospitalDirectory() {
    hospitaldirectory= new ArrayList();
    }

    public ArrayList<Hospital> getHospitaldirectory() {
        return hospitaldirectory;
    }

    public void setHospitaldirectory(ArrayList<Hospital> hospitaldirectory) {
        this.hospitaldirectory = hospitaldirectory;
    }
    //add a new doctor
    public Hospital addHospital(){
        Hospital h =new Hospital();
        hospitaldirectory.add(h);
        return h;
    }
    //remove a doctor
    public void removeHospital(Hospital hospital){
        hospitaldirectory.remove(hospital);   
    }
    
}
