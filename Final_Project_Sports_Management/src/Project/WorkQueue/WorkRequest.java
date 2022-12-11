/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.WorkQueue;

import Project.EventMaker.EventMaker;
import Project.Scheduler.Scheduler;
import Project.Player.Player;
import Project.Selector.Selector;
import Project.Provider.SportsP;
import Project.Provider.Provider;
import Project.UserAccount.UserAccount;
import Project.PlayerStat.PlayerStat;
import Project.Volunteer.Volunteer;
import java.util.Date;

/**
 *
 * @author vedant
 */
public abstract class WorkRequest {
    private String subject;
    private UserAccount sender;
    private UserAccount reciever;
    private String status;
    private Date requestDate;
    private Date resolveDate;
    private EventMaker eventMaker;
    private PlayerStat changeSeeker;
    private Player ngo;
    private Provider provider;
    private SportsP item;
    private Volunteer volunteer;
    private Selector police;
    private Scheduler fireMan;

    public Scheduler getFireMan() {
        return fireMan;
    }

    public void setFireMan(Scheduler fireman) {
        this.fireMan = fireman;
    }
    
    public WorkRequest(){
        requestDate = new Date();
    }
    
    public Selector getPolice() {
        return police;
    }

    public void setPolice(Selector police) {
        this.police = police;
    }

    public Volunteer getVolunteer() {
        return volunteer;
    }

    public void setVolunteer(Volunteer volunteer) {
        this.volunteer = volunteer;
    }

    
    public SportsP getItem() {
        return item;
    }

    public void setItem(SportsP item) {
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

    public PlayerStat getChangeSeeker() {
        return changeSeeker;
    }

    public void setChangeSeeker(PlayerStat changeSeeker) {
        this.changeSeeker = changeSeeker;
    }

    public Player getNgo() {
        return ngo;
    }

    public void setNgo(Player ngo) {
        this.ngo = ngo;
    }

    @Override
    public String toString(){
        return status;
    }
}

