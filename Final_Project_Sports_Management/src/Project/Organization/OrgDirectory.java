/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project.Organization;

import java.util.ArrayList;

/**
 *
 * @author vidis
 */
public class OrgDirectory {
    
     private ArrayList<Organization> organizationList;
    
    public OrgDirectory()
    {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    //creates new organizations and adds them to directory
    public Organization createOrganization(Organization.Type orgType,String orgName)
    {
    Organization organization = null;
        if (orgType.getValue().equals(Organization.Type.Player.getValue())){
            
            organization = new PlayerOrganization();
            organization.setOrganizationName(orgName);
            organizationList.add(organization);
        }
        else if (orgType.getValue().equals(Organization.Type.Coach.getValue())){
            organization = new CoachOrganization();
            organization.setOrganizationName(orgName);
            organizationList.add(organization);
        }
        else if (orgType.getValue().equals(Organization.Type.Volunteer.getValue())){
            organization = new VolunteerOrganization();
            organization.setOrganizationName(orgName);
            organizationList.add(organization);
        }
        else if (orgType.getValue().equals(Organization.Type.SelectionCommittee.getValue())){
            organization = new SelectorOrganization(orgName);
            organization.setOrganizationName(orgName);
            organizationList.add(organization);
        }
        else if (orgType.getValue().equals(Organization.Type.ScheduleManager.getValue())){
            organization = new ScheduleManagerOrganization(orgName);
            organization.setOrganizationName(orgName);
            organizationList.add(organization);
        }
        else if (orgType.getValue().equals(Organization.Type.CommunityAdmin.getValue())){
            organization = new CommunityAdminOrganization(orgName);
            organization.setOrganizationName(orgName);
            organizationList.add(organization);
        }
        else if (orgType.getValue().equals(Organization.Type.Refree.getValue())){
            organization = new RefreeOrganization();
            organization.setOrganizationName(orgName);
            organizationList.add(organization);
        }
        else if (orgType.getValue().equals(Organization.Type.PlayerStatsAdmin.getValue())){
            organization = new PlayerStstsAdminOrganization(orgName);
            organization.setOrganizationName(orgName);
            organizationList.add(organization);
        }
        
        return organization;
    }
    
}
