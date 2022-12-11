/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author vedant
 */
public class EnterpriseDirectory {
    
private ArrayList<Enterprise> enterpriseList;
    
    public EnterpriseDirectory()
    {
        enterpriseList = new ArrayList<>();
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }
    //Create and add new enterprises
    public Enterprise createAndAddEnterprise(String enterpriseName, Enterprise.EnterpriseType type){
        Enterprise enterprise = null;
        if(type == Enterprise.EnterpriseType.Community){
            enterprise = new CommunityEnterprise(enterpriseName);
            enterpriseList.add(enterprise);
        }
        else if(type == Enterprise.EnterpriseType.Provider){
            enterprise= new ProviderEnterprise(enterpriseName);
            enterpriseList.add(enterprise);
        }
         else if(type == Enterprise.EnterpriseType.NGO){
            enterprise= new NGOEnterprise(enterpriseName);
            enterpriseList.add(enterprise);
         }
            else if(type == Enterprise.EnterpriseType.Police){
            enterprise= new PoliceEnterprise(enterpriseName);
            enterpriseList.add(enterprise);
         }
            else if(type == Enterprise.EnterpriseType.Hospital){
            enterprise= new HospitalEnterprise(enterpriseName);
            enterpriseList.add(enterprise);
         } 
            else if(type == Enterprise.EnterpriseType.FireMan){
            enterprise= new FireManEnterprise(enterpriseName);
            enterpriseList.add(enterprise);
         }
        return enterprise;
        
    }
   
    
}


