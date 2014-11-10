package org.rad.modul;

import javax.persistence.*;

@Entity
public class TelephoneNumber {
	@Id@Column
	private String areaCode;
	@Column
	private String cityCode;
	@Column
	private String countryCode;
	@Column
	private String extension;
	@Column
	private String localNumber;
			
	public String getAreaCode() {
		return areaCode;
	}

	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public String getCityCode() {
		return cityCode;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public String getLocalNumber() {
		return localNumber;
	}

	public void setLocalNumber(String localNumber) {
		this.localNumber = localNumber;
	}

	public String toString(){return localNumber.toString();}
}
