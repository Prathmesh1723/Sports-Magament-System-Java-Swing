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
import javax.swing.JPanel;

/**
 *
 * @author vidis
 */
public abstract class Role {
 
	//enums for types of roles
    public enum RoleType{
        SystemAdmin("SystemAdmin"),
        PlayerAdmin("PlayerAdmin"),
        Player("Player"),
        EventMakerAdmin("EventMakerAdmin"),
        EventMaker("EventMaker"),
        EnterPriseAdmin("EnterpriseAdmin"),
        CommunityAdminRole("CommunityAdminRole"),
        SchedulerAdminRole("SchedulerAdminRole"),
        SchedulerManagerRole("SchedulerManagerRole"),
        ProviderAdminRole("ProviderAdminRole"),
        ProviderManagerRole("ProviderManagerRole"),
        CustomerAdminRole("CustomerAdminRole"),
        CustomerRole("CustomerRole"),
        ProviderRole("ProviderRole"),
        CoachRole("CoachRole"),
        CoachAdminRole("CoachAdminRole"),
        PhysicianAdminRole("PhysicianAdminRole"),
        Physician("Physician"),
        SelectorRole("SelectorRole"),
        SelectorAdminRole("SelectorAdminRole");
        
        private String value;

        private RoleType(String value){
            this.value=value;
        }

        public String getValue() {
            return value;
        }
        
        @Override
        public String toString(){
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer,UserAccount account,Organization organization,Enterprise enterprise,MainSystem system);
}
