package org.rad.modul;

import javax.persistence.*;

import org.openxava.annotations.*;
@Entity
public class TownDetail {
	@Id@Column(length=40) @Required
	private	String code;
	@Column
	private	String name;
	@Column
	private	String selection;
	@Column
	private	String stateOrProvince;
	@Column@Enumerated(EnumType.STRING)
	private	Country country;
		
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSelection() {
		return selection;
	}

	public void setSelection(String selection) {
		this.selection = selection;
	}

	public String getStateOrProvince() {
		return stateOrProvince;
	}

	public void setStateOrProvince(String stateOrProvince) {
		this.stateOrProvince = stateOrProvince;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public String toString(){return name.toString();}
}
