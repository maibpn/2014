package org.rad.modul;

import javax.persistence.*;
@Entity
public class PostalAddress {
	@Id@Column
	private String poBox;
	@Column
	private String postalCode;
    @OneToOne
    private StreetDetail streetDeatils;
    @OneToOne
    private TownDetail townDetails;
	
	public String getPoBox() {
		return poBox;
	}

	public void setPoBox(String poBox) {
		this.poBox = poBox;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public StreetDetail getStreetDeatils() {
		return streetDeatils;
	}

	public void setStreetDeatils(StreetDetail streetDeatils) {
		this.streetDeatils = streetDeatils;
	}

	public TownDetail getTownDetails() {
		return townDetails;
	}

	public void setTownDetails(TownDetail townDetails) {
		this.townDetails = townDetails;
	}

	public String toString(){return poBox.toString();}
}
