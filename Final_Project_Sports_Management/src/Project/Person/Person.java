/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project.Person;

/**
 *
 * @author vidis
 */
public class Person {
    
    private String personName;
    private int personID;
    private static int count=1;
    
    public Person(){
        personID=count;
        count++;
    }

    public int gePersonID() {
        return personID;
    }

    public void setPersonID(int id) {
        this.personID = id;
    }
    
    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String name) {
        this.personName = name;
    }
    @Override
    public String toString(){
        return personName;
    }
    
}
