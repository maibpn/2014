package org.rad.modul;

import javax.persistence.*;

@Entity
public class StreetDetail {
	@Id@Column
	private String addressGeneral;
	@Column
	private String buildingName;
	@Column
	private String code;
	@Column
	private String number;
	@Column
	private String name;
	@Column
	private String prefix;
	@Column
	private String suffix;
	@Column
	private String suiteNumber;
	@Column
	private String type;
	@Column
	private boolean withinTownLimits;
		
	public String getAddressGeneral() {
		return addressGeneral;
	}

	public void setAddressGeneral(String addressGeneral) {
		this.addressGeneral = addressGeneral;
	}

	public String getBuildingName() {
		return buildingName;
	}

	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getSuiteNumber() {
		return suiteNumber;
	}

	public void setSuiteNumber(String suiteNumber) {
		this.suiteNumber = suiteNumber;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isWithinTownLimits() {
		return withinTownLimits;
	}

	public void setWithinTownLimits(boolean withinTownLimits) {
		this.withinTownLimits = withinTownLimits;
	}

	public String toString(){return addressGeneral.toString();}
}
