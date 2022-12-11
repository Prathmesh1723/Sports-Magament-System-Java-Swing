/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.Role;

import Project.MainSystem;
import Project.Enterprise.Enterprise;
import Project.Organization.Organization;
import Project.Organization.PlayerOrganization;
import Project.UserAccount.UserAccount;
import UI.EventSeekerWorkArea.EventSeekerWorkArea;
import javax.swing.JPanel;

/**
 *
 * @author prath
 */
public class RefreeRole extends Role{
    //overriding main panel with victim work area whenever victim role is called
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer,UserAccount account,Organization organization,Enterprise enterprise,MainSystem system){
        return new EventSeekerWorkArea(userProcessContainer,account,(PlayerOrganization)organization,enterprise,system);
    }
        @Override
        public String toString()
{
   return Role.RoleType.Victim.getValue();
}

}
