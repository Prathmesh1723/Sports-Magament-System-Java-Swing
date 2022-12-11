/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;

import Project.Enterprise.Enterprise;
import Project.Network.Network;
import Project.Organization.Organization;
import Project.Role.Role;
import Project.Role.SystemAdminRole;
import Project.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.ArrayList;

/**
 *
 * @author prath
 */
public class MainSystem extends Organization{
    private static MainSystem mainSystem;
    private ArrayList<Network> networkList;
    
     public static MainSystem getInstance()
    {
     if(mainSystem == null)
     {
         mainSystem = new MainSystem();
     }
     return mainSystem;
    }
   
     
    private MainSystem()
    {
        super(null);
        networkList = new ArrayList<>();
        
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public static void setInstance(MainSystem system)
    {
        mainSystem = system;
    }
    //add a network
    public Network addNetwork()
    {
      Network  network = new Network();
      networkList.add(network);
      return network;
    }
    
    @Override
    public HashSet<Role> getSupportedRole(){
        role.add(new SystemAdminRole());
        
        return role;
    }
    
    public static boolean checkUsernameIsUnique(String username)
    {
        for(Network net : mainSystem.getNetworkList())
        {
            for(Enterprise ent : net.getEnterpriseDirectory().getEnterpriseList())
            {
                for(UserAccount user : ent.getUserAccountDirectory().getUserAccountList())
                {
                    if(user.getUsername().equals(username))
                    {
                        return false;
                    }
                }
                
                for(Organization org : ent.getOrganizationDirectory().getOrganizationList())
                {
                    for(UserAccount user : org.getUserAccountDirectory().getUserAccountList())
                    {
                        if(user.getUsername().equals(username))
                        {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }   
    
    
}
