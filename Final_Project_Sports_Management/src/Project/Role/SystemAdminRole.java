/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.Role;

import Project.MainSystem;
import Project.Enterprise.Enterprise;
import Project.Organization.Organization;
import Project.UserAccount.UserAccount;
import  UI.SystemAdmin.SystemAdminWorkArea;
import javax.swing.JPanel;

/**
 *
 * @author vidis
 */
public class SystemAdminRole extends Role {
    //overriding main panel with system admin work area whenever system admin role is called
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer,UserAccount account,Organization organization,Enterprise enterprise,MainSystem system){
       return new SystemAdminWorkArea(userProcessContainer,system);
    }
        @Override
        public String toString()
{
   return Role.RoleType.SystemAdmin.getValue();
}
}

