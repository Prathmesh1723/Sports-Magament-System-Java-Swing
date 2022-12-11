/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.Provider;

import java.util.ArrayList;

/**
 *
 * @author vidis
 */
public class SportsPDirectory {

	private ArrayList<SportsP> itemList;
    
    public SportsPDirectory() {
        itemList=new ArrayList<>();
    }

    public ArrayList<SportsP> getSupplyList() {
        return itemList;
    }

    public void setSupplyList(ArrayList<SportsP> itemList) {
        this.itemList = itemList;
    }

    //add a new item
    public SportsP addItem(){
        SportsP s = new SportsP();
        itemList.add(s);
        return s;
    }
    //remove item
    public void removeItem(SportsP item){
        itemList.remove(item);
    }
    
}
