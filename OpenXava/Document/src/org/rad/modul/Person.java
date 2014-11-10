package org.rad.modul;

import java.util.*;
import javax.persistence.*;

@Entity
public class Person {
    @Id@Column
    private String persid;
    @Column
    private String firstname;
    @Column
    private String middleName;
    @Column
    private String lastName;
    @Column
    private String jobtitle;
	@Column
    private String prefix;
    @Column
    private String suffix;
    @Column@Enumerated(EnumType.STRING)    	
    private Gender gender;
    @OneToOne
    private ElectronicAddress electronicAddress;
    @OneToOne
    private PostalAddress postalAddress;
    @OneToOne
    private TelephoneNumber telephoneNumbers;
    @OneToOne
    private TelephoneNumber fax;
    @OneToOne
    private TelephoneNumber landlinePhone;	
    @OneToMany
	private Collection<Document> document;

	public Collection<Document> getDocument() {
		return document;
	}

	public void setDocument(Collection<Document> document) {
		this.document = document;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getJobtitle() {
		return jobtitle;
	}

	public void setJobtitle(String jobtitle) {
		this.jobtitle = jobtitle;
	}

	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public String getSuffix() {
		return suffix;
	}

	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public ElectronicAddress getElectronicAddress() {
		return electronicAddress;
	}

	public void setElectronicAddress(ElectronicAddress electronicAddress) {
		this.electronicAddress = electronicAddress;
	}

	public PostalAddress getPostalAddress() {
		return postalAddress;
	}

	public void setPostalAddress(PostalAddress postalAddress) {
		this.postalAddress = postalAddress;
	}

	public TelephoneNumber getTelephoneNumbers() {
		return telephoneNumbers;
	}

	public void setTelephoneNumbers(TelephoneNumber telephoneNumbers) {
		this.telephoneNumbers = telephoneNumbers;
	}

	public TelephoneNumber getFax() {
		return fax;
	}

	public void setFax(TelephoneNumber fax) {
		this.fax = fax;
	}

	public TelephoneNumber getLandlinePhone() {
		return landlinePhone;
	}

	public void setLandlinePhone(TelephoneNumber landlinePhone) {
		this.landlinePhone = landlinePhone;
	}

	public String toString(){return firstname.toString();}

	public String getPersid() {
		return persid;
	}

	public void setPersid(String persid) {
		this.persid = persid;
	}
}
