/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.Role;

import Project.MainSystem;
import Project.Enterprise.Enterprise;
import Project.Organization.Organization;
import Project.Organization.CustomerOrganization;
import Project.UserAccount.UserAccount;
import UI.CustomerOrganization.DashboardCustomer;
import javax.swing.JPanel;

/**
 *
 * @author vidis
 */
public class CustomerRole extends Role{
    //overriding main panel with volunteer work area whenever volunteer role is called
        @Override
        public JPanel createWorkArea(JPanel userProcessContainer,UserAccount account,Organization organization,Enterprise enterprise,MainSystem system)
        {
            return new DashboardCustomer(userProcessContainer,account,(CustomerOrganization)organization,enterprise,system);
        }   
        @Override
        public String toString()
{
   return Role.RoleType.CustomerRole.getValue();
}
}
