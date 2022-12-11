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
import UI.ProviderManager.ProviderManagerWorkArea;
import javax.swing.JPanel;

/**
 *
 * @author prath
 */
public class ProviderManagerRole extends Role{
    //overriding main panel with provider manager work area whenever provider manager role is called
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer,UserAccount account,Organization organization,Enterprise enterprise,MainSystem system){
        return new ProviderManagerWorkArea(userProcessContainer,enterprise,system);
    }
        @Override
        public String toString()
{
   return Role.RoleType.ProviderManagerRole.getValue();
}
}
