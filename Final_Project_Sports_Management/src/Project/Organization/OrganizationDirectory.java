/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.Organization;

import java.util.ArrayList;

/**
 *
 * @author vidis
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
        else if (orgType.getValue().equals(Organization.Type.Victim.getValue())){
            organization = new VictimOrganization();
            organization.setOrganizationName(orgName);
            organizationList.add(organization);
        }
        else if (orgType.getValue().equals(Organization.Type.NGO.getValue())){
            organization = new NGOOrganization();
            organization.setOrganizationName(orgName);
            organizationList.add(organization);
        }
        else if (orgType.getValue().equals(Organization.Type.Provider.getValue())){
            organization = new ProviderOrganization(orgName);
            organization.setOrganizationName(orgName);
            organizationList.add(organization);
        }
        else if (orgType.getValue().equals(Organization.Type.Volunteer.getValue())){
            organization = new VolunteerOrganization(orgName);
            organization.setOrganizationName(orgName);
            organizationList.add(organization);
        }
        else if (orgType.getValue().equals(Organization.Type.Police.getValue())){
            organization = new PoliceOrganization(orgName);
            organization.setOrganizationName(orgName);
            organizationList.add(organization);
        }
        else if (orgType.getValue().equals(Organization.Type.Doctor.getValue())){
            organization = new DoctorOrganization();
            organization.setOrganizationName(orgName);
            organizationList.add(organization);
        }
        else if (orgType.getValue().equals(Organization.Type.FireMan.getValue())){
            organization = new FireManOrganization(orgName);
            organization.setOrganizationName(orgName);
            organizationList.add(organization);
        }
        
        return organization;
    }

    
}
