package org.rad

class TownDetails {

   	String code
	String name
	String selection
	String stateOrProvince
	Country country
	
	static constraints = {
		selection blank: true 
		stateOrProvince blank: true 
	}
	
	
	static belongsTo = PostalAddress
	String toString(){return name}
}
