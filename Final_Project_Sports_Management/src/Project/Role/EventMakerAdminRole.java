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
import UI.EventMaker.EventMakerAdminWorkArea;
import javax.swing.JPanel;

/**
 *
 * @author prath
 */
public class EventMakerAdminRole extends Role{
 
	//overriding main panel with event maker admin work area whenever event maker admin role is called
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer,UserAccount account,Organization organization,Enterprise enterprise,MainSystem system){
        return new EventMakerAdminWorkArea(userProcessContainer,/*account,(ChangeMakerOrganization)organization,*/enterprise/*,system*/);
    }
 
    @Override
    public String toString()
    {
    	return Role.RoleType.EventMakerAdmin.getValue();
    }
}