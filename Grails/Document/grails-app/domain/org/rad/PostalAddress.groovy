package org.rad

class PostalAddress {
  
	String poBox
	String postalCode
	
	StreetDetails streetDeatils
	TownDetails townDetails
	
	static constraints = {		
		poBox nullable: true
		postalCode nullable: true
	}
	
	String toString(){return poBox}
}
