/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.UserAccount;

import Project.Person.Person;
import Project.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author vedant
 */
public class UserAccountDirectory {
    
    private ArrayList<UserAccount> userAccountList;
    
    public UserAccountDirectory(){
        userAccountList=new ArrayList<>();
        
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }
    
    //Authenticate a user
    public UserAccount authenticateUser(String username, String password){
        for(UserAccount ua:userAccountList){
            if(ua.getUsername().equals(username)&& ua.getPassword().equals(password)){
                return ua;
            }
        }
        return null;
    }
    //create new user 
    public UserAccount createUserAccount(String username, String password, Person person, Role role){
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setEmployee(person);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }
    
    //username unique check
    public boolean checkIfUsernameIsUnique(String username){
        for(UserAccount ua: userAccountList)
            if(ua.getUsername().equals(username)){
                return false;
            }
        return true;
    }
    
}
