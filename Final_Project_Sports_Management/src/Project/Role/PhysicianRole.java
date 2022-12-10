/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.Role;

import Project.MainSystem;
import Project.Enterprise.Enterprise;
import Project.Organization.PhysicianOrganization;
import Project.Organization.Organization;
import Project.UserAccount.UserAccount;
import UI.PhysicianWorkArea.PhysicianWorkArea;
import javax.swing.JPanel;

/**
 *
 * @author vidis
 */
public class PhysicianRole extends Role{
 
	//overriding main panel with doctore work area whenever doctor role is called
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer,UserAccount account,Organization organization,Enterprise enterprise,MainSystem system){
        return new PhysicianWorkArea(userProcessContainer,account,(PhysicianOrganization)organization,enterprise,system);
    }

    @Override
    public String toString()
    {
    	return Role.RoleType.Physician.getValue();
    }
}