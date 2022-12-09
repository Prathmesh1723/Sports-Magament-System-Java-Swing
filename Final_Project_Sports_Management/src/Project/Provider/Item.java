/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.Provider;

/**
 *
 * @author sarvesh
 */
public class Item {
    private String itemId;
    private static int itemCount=1;
    private int itemQuantity;
    private String requirementType;
    private String requirement;

    //item class constructor to auto generate id
    public Item(){
        itemId="Item"+(+itemCount);        
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }
    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }
    
    public String getRequirement() {
        return requirement;
    }

    public void setRequirement(String requirement) {
        this.requirement = requirement;
    }
    
    public String getRequirementType() {
        return requirementType;
    }

    public void setRequirementType(String requirementType) {
        this.requirementType = requirementType;
    }
    
    @Override
    public String toString(){
        return getRequirementType();
    }
    
}
