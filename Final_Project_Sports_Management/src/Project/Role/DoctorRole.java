/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.Role;

import Project.MainSystem;
import Project.Enterprise.Enterprise;
import Project.Organization.DoctorOrganization;
import Project.Organization.Organization;
import Project.UserAccount.UserAccount;
import UI.DoctorWorkArea.DoctorWorkArea;
import javax.swing.JPanel;

/**
 *
 * @author prath
 */
public class DoctorRole extends Role{
 
	//overriding main panel with doctore work area whenever doctor role is called
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer,UserAccount account,Organization organization,Enterprise enterprise,MainSystem system){
        return new DoctorWorkArea(userProcessContainer,account,(DoctorOrganization)organization,enterprise,system);
    }

    @Override
    public String toString()
    {
    	return Role.RoleType.Doctor.getValue();
    }
}