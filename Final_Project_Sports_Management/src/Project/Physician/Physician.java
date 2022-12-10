/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.Physician;

/**
 *
 * @author vidis
 */
public class Physician {
    private String doctorName;
    private String doctorId;
    private static int count=1;
    
    //Hospital constructor to generate id automatically
    public Physician() {
        
        
        doctorId="ORG"+(++count);
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Physician.count = count;
    }
    
    
     
    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String Dname) {
        this.doctorName = Dname;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String Did) {
        this.doctorId = Did;
    }

   

    @Override
    public String toString(){
    return doctorName;
    
    }
}
