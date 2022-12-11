/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.Provider;

import Project.WorkQueue.WorkRequestQueue;

/**
 *
 * @author vedant
 */
public class Provider {
    private String supplierName;
    private static int supplierCount=1;
    private String supplierId;
    private WorkRequestQueue supplierWorkQueue;
    private ItemDirectory itemDirectory;
    private Item item;
    //provider class constructor to update ids, work queue and item directory
    public Provider() {
        
        supplierId = "SUP"+(++supplierCount);
        supplierWorkQueue= new WorkRequestQueue();
        itemDirectory = new ItemDirectory();
        item = new Item();
    }
    
    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
    
    public ItemDirectory getItemDirectory() {
        return itemDirectory;
    }

    public void setItemDirectory(ItemDirectory itemDirectory) {
        this.itemDirectory = itemDirectory;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String sName) {
        this.supplierName = sName;
    }
    
    public WorkRequestQueue getSupplierWorkQueue() {
        return supplierWorkQueue;
    }

    public void setSupplierWorkQueue(WorkRequestQueue workQueue) {
        this.supplierWorkQueue = workQueue;
    }
    
    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }

    @Override
    public String toString(){
        return supplierName;
    }
}
