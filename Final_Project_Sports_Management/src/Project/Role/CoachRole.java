/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.Role;

import Project.MainSystem;
import Project.Enterprise.Enterprise;
import Project.Organization.Organization;
import Project.Organization.CoachOrganization;
import Project.UserAccount.UserAccount;
import UI.CoachWorkArea.CoachWorkArea;
import javax.swing.JPanel;

/**
 *
 * @author vidis
 */
public class CoachRole extends Role{
    //overriding main panel with police work area whenever police role is called
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer,UserAccount account,Organization organization,Enterprise enterprise,MainSystem system){
        return new CoachWorkArea(userProcessContainer,account,(CoachOrganization)organization,enterprise,system);
    }
        @Override
        public String toString()
{
   return Role.RoleType.CoachRole.getValue();
}

}
