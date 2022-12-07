/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project.Enterprise;


import Project.Organization.Organization;
import Project.Organization.OrganizationDirectory;


/**
 *
 * @author vidis
 */ 

public abstract class Enterprise extends Organization{
    private EnterpriseType enterpriseType;
    private OrgDirectory orgDirectory;


public Enterprise(String enterpriseName, EnterpriseType type)
    {
      super(enterpriseName);
      this.enterpriseType= type;
      orgDirectory = new OrgDirectory();
    }

public enum EnterpriseType
     {
        Football("Football"),
        Cricket("Cricket"),
        Tennis("Tennis"),
        Badminton("Badminton");
        
        private String enterpriseTypeValue;
        
        private EnterpriseType(String value)
        {
            this.enterpriseTypeValue = value;
        }

        public String getEnterpriseTypeValue() {
            return enterpriseTypeValue;
        }
        
        @Override
        public String toString()
        {
            return enterpriseTypeValue;
        }
     }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }
}


