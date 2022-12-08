/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project.Person;

import java.util.ArrayList;

/**
 *
 * @author vidis
 */
public class PersonDirectory {
    
    private ArrayList<Person> personList;
    
    public PersonDirectory(){
        personList=new ArrayList<>();
    }

    public ArrayList<Person> getPersonList() {
        return personList;
    }
    //create a new employee using this method
    public Person createPerson(String name){
        Person p= new Person();
        p.setPersonName(name);
        personList.add(p);
        return p;
    }
    
}
