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
         else if(type == Enterprise.EnterpriseType.scheduler){
            enterprise= new SchedulerEnterprise(enterpriseName);
            enterpriseList.add(enterprise);
         }
            else if(type == Enterprise.EnterpriseType.Coach){
            enterprise= new CoachEnterprise(enterpriseName);
            enterpriseList.add(enterprise);
         }
            else if(type == Enterprise.EnterpriseType.Physician){
            enterprise= new Physician(enterpriseName);
            enterpriseList.add(enterprise);
         } 
            else if(type == Enterprise.EnterpriseType.Selector){
            enterprise= new SelectorEnterprise(enterpriseName);
            enterpriseList.add(enterprise);
         }
        return enterprise;
        
    }
   
    
}


