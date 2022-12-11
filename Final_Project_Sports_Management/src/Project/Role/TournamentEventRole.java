/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.Role;

import Project.MainSystem;
import Project.Enterprise.Enterprise;
import Project.Organization.EventMakerOrganization;
import Project.Organization.Organization;
import Project.UserAccount.UserAccount;
import UI.EventMakerWorkArea.EventMakerWorkArea;
import javax.swing.JPanel;

/**
 *
 * @author prath
 */
public class TournamentEventRole extends Role{
 
	//overriding main panel with event maker work area whenever event maker role is called
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer,UserAccount account,Organization organization,Enterprise enterprise,MainSystem system){
        return new EventMakerWorkArea(userProcessContainer,account,(EventMakerOrganization)organization,enterprise,system);
    }

    @Override
    public String toString()
    {
    	return Role.RoleType.EventMaker.getValue();
    }
}