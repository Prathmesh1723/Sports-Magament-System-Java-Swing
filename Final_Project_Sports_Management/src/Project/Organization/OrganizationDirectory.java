/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.Organization;

import java.util.ArrayList;

/**
 *
 * @author prath
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;
    
    public OrganizationDirectory()
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
        if (orgType.getValue().equals(Organization.Type.EventMaker.getValue())){
            
            organization = new EventMakerOrganization();
            organization.setOrganizationName(orgName);
            organizationList.add(organization);
        }
        else if (orgType.getValue().equals(Organization.Type.Player.getValue())){
            organization = new PlayerOrganization();
            organization.setOrganizationName(orgName);
            organizationList.add(organization);
        }
        else if (orgType.getValue().equals(Organization.Type.Scheduler.getValue())){
            organization = new SchedulerOrganization();
            organization.setOrganizationName(orgName);
            organizationList.add(organization);
        }
        else if (orgType.getValue().equals(Organization.Type.Provider.getValue())){
            organization = new ProviderOrganization(orgName);
            organization.setOrganizationName(orgName);
            organizationList.add(organization);
        }
        else if (orgType.getValue().equals(Organization.Type.Customer.getValue())){
            organization = new CustomerOrganization(orgName);
            organization.setOrganizationName(orgName);
            organizationList.add(organization);
        }
        else if (orgType.getValue().equals(Organization.Type.Coach.getValue())){
            organization = new CoachOrganization(orgName);
            organization.setOrganizationName(orgName);
            organizationList.add(organization);
        }
        else if (orgType.getValue().equals(Organization.Type.Physician.getValue())){
            organization = new PhysicianOrganization();
            organization.setOrganizationName(orgName);
            organizationList.add(organization);
        }
        else if (orgType.getValue().equals(Organization.Type.Selector.getValue())){
            organization = new SelectorOrganization(orgName);
            organization.setOrganizationName(orgName);
            organizationList.add(organization);
        }
        
        return organization;
    }

    
}
