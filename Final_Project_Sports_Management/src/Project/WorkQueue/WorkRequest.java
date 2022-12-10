/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.WorkQueue;

import Project.EventMaker.EventMaker;
import Project.Selector.Selector;
import Project.Scheduler.Scheduler;
import Project.Coach.Coach;
import Project.Provider.Item;
import Project.Provider.Provider;
import Project.UserAccount.UserAccount;
import Project.Player.Player;
import Project.Customer.Customer;
import java.util.Date;

/**
 *
 * @author prath
 */
public abstract class WorkRequest {
    private String subject;
    private UserAccount sender;
    private UserAccount reciever;
    private String status;
    private Date requestDate;
    private Date resolveDate;
    private EventMaker eventMaker;
    private Player changeSeeker;
    private Scheduler ngo;
    private Provider provider;
    private Item item;
    private Customer volunteer;
    private Coach police;
    private Selector fireMan;

    public Selector getFireMan() {
        return fireMan;
    }

    public void setFireMan(Selector fireman) {
        this.fireMan = fireman;
    }
    
    public WorkRequest(){
        requestDate = new Date();
    }
    
    public Coach getPolice() {
        return police;
    }

    public void setPolice(Coach police) {
        this.police = police;
    }

    public Customer getVolunteer() {
        return volunteer;
    }

    public void setVolunteer(Customer volunteer) {
        this.volunteer = volunteer;
    }

    
    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public UserAccount getSender() {
        return sender;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

    public UserAccount getReciever() {
        return reciever;
    }

    public void setReciever(UserAccount reciever) {
        this.reciever = reciever;
    }

    public String getStatus() {
        return status;
    }

    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    
    public void setStatus(String status) {
        this.status = status;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public Date getResolveDate() {
        return resolveDate;
    }

    public void setResolveDate(Date resolveDate) {
        this.resolveDate = resolveDate;
    }

    public EventMaker getEventMaker() {
        return eventMaker;
    }

    public void setEventMaker(EventMaker eventMaker) {
        this.eventMaker = eventMaker;
    }

    public Player getChangeSeeker() {
        return changeSeeker;
    }

    public void setChangeSeeker(Player changeSeeker) {
        this.changeSeeker = changeSeeker;
    }

    public Scheduler getNgo() {
        return ngo;
    }

    public void setNgo(Scheduler ngo) {
        this.ngo = ngo;
    }

    @Override
    public String toString(){
        return status;
    }
}

