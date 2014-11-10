package org.rad

class ElectronicAddress {
	
	String emailAddress
	String web	
	static constraints = {
		
		emailAddress email:true, blank: true
		web blank: true
		
	}
	
	
	String toString(){return emailAddress}
	
}
