package org.rad

class TelephoneNumber {

	String areaCode
	String cityCode
	String countryCode
	String extension
	String localNumber
		
	static constraints = {
		
	}
	
	
	String toString(){return localNumber}
	
}
