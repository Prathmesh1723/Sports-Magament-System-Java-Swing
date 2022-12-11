/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.Provider;

import Project.WorkQueue.WorkRequestQueue;

/**
 *
 * @author vidis
 */
public class Provider {
    private String supplierName;
    private static int supplierCount=1;
    private String supplierId;
    private WorkRequestQueue supplierWorkQueue;
    private SportsPDirectory itemDirectory;
    private SportsP item;
    //provider class constructor to update ids, work queue and item directory
    public Provider() {
        
        supplierId = "SUP"+(++supplierCount);
        supplierWorkQueue= new WorkRequestQueue();
        itemDirectory = new SportsPDirectory();
        item = new SportsP();
    }
    
    public SportsP getItem() {
        return item;
    }

    public void setItem(SportsP item) {
        this.item = item;
    }
    
    public SportsPDirectory getItemDirectory() {
        return itemDirectory;
    }

    public void setItemDirectory(SportsPDirectory itemDirectory) {
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
