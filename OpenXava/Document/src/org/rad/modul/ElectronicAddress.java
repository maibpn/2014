package org.rad.modul;

import javax.persistence.*;

import org.openxava.annotations.*;
@Entity
public class ElectronicAddress {

	@Id@Column @Stereotype("EMAIL")
	private String emailAddress;
	@Column
	private String web;
	
	public String getEmailAddress() {
		return emailAddress;
	}
	
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getWeb() {
		return web;
	}

	public void setWeb(String web) {
		this.web = web;
	}

	public String toString(){return emailAddress.toString();}	
}
