/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project.Enterprise;


import java.util.ArrayList;

/**
 *
 * @author vidis
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
        if(type == Enterprise.EnterpriseType.Football){
            enterprise = new FootballEnterprise(enterpriseName);
            enterpriseList.add(enterprise);
        }
        else if(type == Enterprise.EnterpriseType.Cricket){
            enterprise= new CricketEnterprise(enterpriseName);
            enterpriseList.add(enterprise);
        }
         else if(type == Enterprise.EnterpriseType.Badminton){
            enterprise= new BadmintonEnterprise(enterpriseName);
            enterpriseList.add(enterprise);
         }
            else if(type == Enterprise.EnterpriseType.Tennis){
            enterprise= new TennisEnterprise(enterpriseName);
            enterpriseList.add(enterprise);
         }
        return enterprise;
        
    }
   
    
}

