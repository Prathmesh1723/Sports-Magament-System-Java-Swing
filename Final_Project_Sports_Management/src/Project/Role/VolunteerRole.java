/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.Role;

import Project.MainSystem;
import Project.Enterprise.Enterprise;
import Project.Organization.Organization;
import Project.Organization.VolunteerOrganization;
import Project.UserAccount.UserAccount;
import UI.VolunteerOrganization.DashboardVolunteer;
import javax.swing.JPanel;

/**
 *
 * @author prath
 */
public class VolunteerRole extends Role{
    //overriding main panel with volunteer work area whenever volunteer role is called
        @Override
        public JPanel createWorkArea(JPanel userProcessContainer,UserAccount account,Organization organization,Enterprise enterprise,MainSystem system)
        {
            return new DashboardVolunteer(userProcessContainer,account,(VolunteerOrganization)organization,enterprise,system);
        }   
        @Override
        public String toString()
{
   return Role.RoleType.VolunteerRole.getValue();
}
}
