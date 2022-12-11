/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.Role;

import Project.MainSystem;
import Project.Enterprise.Enterprise;
import Project.Organization.CoachOrganization;
import Project.Organization.Organization;
import Project.UserAccount.UserAccount;
import UI.EventWorkArea.EventMakerWorkArea;
import javax.swing.JPanel;

/**
 *
 * @author prath
 */
public class CoachRole extends Role{
 
	//overriding main panel with doctore work area whenever doctor role is called
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer,UserAccount account,Organization organization,Enterprise enterprise,MainSystem system){
        return new EventMakerWorkArea(userProcessContainer,account,(CoachOrganization)organization,enterprise,system);
    }

    @Override
    public String toString()
    {
    	return Role.RoleType.Doctor.getValue();
    }
}