/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project.Network;

import Project.Enterprise.EnterpriseDirectory;

/**
 *
 * @author vidis
 */
public class Network {
    
    private String networkName;
    private EnterpriseDirectory enterpriseDirectory;
    
    public Network()
    {
     enterpriseDirectory = new EnterpriseDirectory();
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public String getNetworkName() {
        return networkName;
    }

    public void setNetworkName(String name) {
        this.networkName = name;
    }
    
    @Override
    public String toString()
    {
        return networkName;
    }
    
}
