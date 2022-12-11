/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.Role;

import Project.MainSystem;
import Project.Enterprise.Enterprise;
import Project.Organization.SelectorOrganization;
import Project.Organization.Organization;
import Project.UserAccount.UserAccount;
import UI.SelectorWorkArea.SelectorWorkArea;
import javax.swing.JPanel;

/**
 *
 * @author vidis
 */
public class SelectorRole extends Role{
    //overriding main panel with fireman work area whenever fireman role is called
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer,UserAccount account,Organization organization,Enterprise enterprise,MainSystem system){
        return new SelectorWorkArea(userProcessContainer,account,(SelectorOrganization)organization,enterprise,system);
    }
        @Override
        public String toString()
{
   return Role.RoleType.SelectorRole.getValue();
}

}
