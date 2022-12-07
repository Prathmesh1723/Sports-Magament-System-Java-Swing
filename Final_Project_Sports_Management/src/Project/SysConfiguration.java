/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;

import Project.Person.Person;
import Project.Role.SystemAdminRole;
import Project.UserAccount.UserAccount;

/**
 *
 * @author vedant
 */
public class SysConfiguration {
    public static MainSystem configureSystem(){
    MainSystem system= MainSystem.getInstance();
   
     Person person= system.getPersonDirectory().createEmployee("SYSTEM ADMIN");
     //making defualt username, password for application admin role
     UserAccount ua= system.getUserAccountDirectory().createUserAccount("admin","admin", employee, new SystemAdminRole());
    
    return system;
    }
}
