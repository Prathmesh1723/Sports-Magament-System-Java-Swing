/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.Role;

import Project.MainSystem;
import Project.Enterprise.Enterprise;
import Project.Organization.NGOOrganization;
import Project.Organization.Organization;
import Project.UserAccount.UserAccount;
import UI.NGOManager.NGOManagerWorkArea;
import javax.swing.JPanel;

/**
 *
 * @author prath
 */
public class NGOManagerRole extends Role{
    //overriding main panel with NGO Manager work area whenever NGO Manager role is called
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer,UserAccount account,Organization organization,Enterprise enterprise,MainSystem system){
        return new NGOManagerWorkArea(userProcessContainer,account,(NGOOrganization)organization,enterprise,system);
    }
        @Override
        public String toString()
{
   return Role.RoleType.NGOManagerRole.getValue();
}

}
