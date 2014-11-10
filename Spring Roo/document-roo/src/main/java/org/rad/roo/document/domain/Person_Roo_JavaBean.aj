// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package org.rad.roo.document.domain;

import java.util.Set;
import org.rad.roo.document.domain.Document;
import org.rad.roo.document.domain.ElectronicAddress;
import org.rad.roo.document.domain.Gender;
import org.rad.roo.document.domain.Person;
import org.rad.roo.document.domain.PostalAddress;
import org.rad.roo.document.domain.TelephoneNumber;

privileged aspect Person_Roo_JavaBean {
    
    public String Person.getId() {
        return this.id;
    }
    
    public void Person.setId(String id) {
        this.id = id;
    }
    
    public Gender Person.getGender() {
        return this.gender;
    }
    
    public void Person.setGender(Gender gender) {
        this.gender = gender;
    }
    
    public String Person.getFirstName() {
        return this.firstName;
    }
    
    public void Person.setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public String Person.getMName() {
        return this.mName;
    }
    
    public void Person.setMName(String mName) {
        this.mName = mName;
    }
    
    public String Person.getLastName() {
        return this.lastName;
    }
    
    public void Person.setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public String Person.getJobTitle() {
        return this.jobTitle;
    }
    
    public void Person.setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
    
    public String Person.getPrefix() {
        return this.prefix;
    }
    
    public void Person.setPrefix(String prefix) {
        this.prefix = prefix;
    }
    
    public String Person.getSuffix() {
        return this.suffix;
    }
    
    public void Person.setSuffix(String suffix) {
        this.suffix = suffix;
    }
    
    public ElectronicAddress Person.getElectronicAddress() {
        return this.electronicAddress;
    }
    
    public void Person.setElectronicAddress(ElectronicAddress electronicAddress) {
        this.electronicAddress = electronicAddress;
    }
    
    public TelephoneNumber Person.getMobilePhone() {
        return this.mobilePhone;
    }
    
    public void Person.setMobilePhone(TelephoneNumber mobilePhone) {
        this.mobilePhone = mobilePhone;
    }
    
    public TelephoneNumber Person.getFax() {
        return this.fax;
    }
    
    public void Person.setFax(TelephoneNumber fax) {
        this.fax = fax;
    }
    
    public TelephoneNumber Person.getLandLinePhone() {
        return this.landLinePhone;
    }
    
    public void Person.setLandLinePhone(TelephoneNumber landLinePhone) {
        this.landLinePhone = landLinePhone;
    }
    
    public PostalAddress Person.getPersonalAddress() {
        return this.personalAddress;
    }
    
    public void Person.setPersonalAddress(PostalAddress personalAddress) {
        this.personalAddress = personalAddress;
    }
    
    public Set<Document> Person.getDocuments() {
        return this.documents;
    }
    
    public void Person.setDocuments(Set<Document> documents) {
        this.documents = documents;
    }
    
}
