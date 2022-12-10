/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.Organization;

import Project.Person.PersonDirectory;
import Project.Role.Role;
import Project.UserAccount.UserAccountDirectory;
import Project.WorkQueue.WorkRequestQueue;
import java.util.HashSet;

/**
 *
 * @author prath
 * 
 */


public abstract class Organization {
    
    private String name;
    private String organizationName;
    private WorkRequestQueue orgWorkQueue;
    private PersonDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int organizationCode;
    private static int count=1;
    public HashSet<Role> role;
    //enums for types of organization
    public enum Type {
        Player("Player Organization"),
        EventMaker("EventMaker Organization"),
        Customer("Customer Organization"),
        Scheduler("Scheduler Organization"),
        Provider("Provider"),
        Physician("Physician"),
        Coach("Coach"),
        Selector("Selector");
        
        private String value;
        private Type(String value){
            this.value = value;
        }
        public String getValue(){
            return value;
        }
    }
    //constructor to update work queues, employee directory and user account
    public Organization (String name)
    {
      this.name = name;
      orgWorkQueue = new WorkRequestQueue();
      employeeDirectory = new PersonDirectory();
      userAccountDirectory = new UserAccountDirectory();
     
      organizationCode = count;
      role = new HashSet<>();
      ++count;        
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String orgName) {
        this.organizationName = orgName;
    }
    
    public abstract HashSet<Role> getSupportedRole();


    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }

    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }
    
     public PersonDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public void setEmployeeDirectory(PersonDirectory employeeDirectory) {
        this.employeeDirectory = employeeDirectory;
    }
    
    public int getOrganizationCode() {
        return organizationCode;
    }
    
    public WorkRequestQueue getOrgWorkQueue() {
        return orgWorkQueue;
    }

    public void setOrgWorkQueue(WorkRequestQueue orgWorkQueue) {
        this.orgWorkQueue = orgWorkQueue;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public String toString()
    {
        return name;
    }
}











