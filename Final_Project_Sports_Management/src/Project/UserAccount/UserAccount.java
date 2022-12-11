/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.UserAccount;

import Project.Person.Person;
import Project.Role.Role;
import Project.WorkQueue.WorkRequestQueue;

/**
 *
 * @author vedant
 */
public class UserAccount {
    private String username;
    private String password;
    private Person person;
    private Role role;
    private WorkRequestQueue workQueue;
    
    public UserAccount(){
        workQueue = new WorkRequestQueue();
    }
    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Person getEmployee() {
        return person;
    }

    public void setEmployee(Person person) {
        this.person = person;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public WorkRequestQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkRequestQueue workQueue) {
        this.workQueue = workQueue;
    }
    
    @Override
    public String toString(){
        return username;
    }
    
}
