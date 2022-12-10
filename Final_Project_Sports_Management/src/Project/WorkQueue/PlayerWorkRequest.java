/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.WorkQueue;

/**
 *
 * @author prath
 */
public class PlayerWorkRequest extends WorkRequest{
    private String Country;
    private int Age;
    private String Position;

    public String getCountry() {
        return Country;
    }

    public void setCountry(String Country) {
        this.Country = Country;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String Position) {
        this.Position = Position;
    }
    private boolean add;
    
    public PlayerWorkRequest() {
        
        add = false;
    }

//    public String getDescription() {
//        return Description;
//    }
//
//    public void setDescription(String Description) {
//        this.Description = Description;
//    }
//
//    public String getLocation() {
//        return Location;
//    }
//
//    public void setLocation(String Location) {
//        this.Location = Location;
//    }

    public boolean isAdd() {
        return add;
    }

    public void setAdd(boolean add) {
        this.add = add;
    }
}
