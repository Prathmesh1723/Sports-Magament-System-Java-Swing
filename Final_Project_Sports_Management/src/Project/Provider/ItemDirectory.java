/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.Provider;

import java.util.ArrayList;

/**
 *
 * @author vedant
 */
public class ItemDirectory {

	private ArrayList<Item> itemList;
    
    public ItemDirectory() {
        itemList=new ArrayList<>();
    }

    public ArrayList<Item> getSupplyList() {
        return itemList;
    }

    public void setSupplyList(ArrayList<Item> itemList) {
        this.itemList = itemList;
    }

    //add a new item
    public Item addItem(){
        Item s = new Item();
        itemList.add(s);
        return s;
    }
    //remove item
    public void removeItem(Item item){
        itemList.remove(item);
    }
    
}
