package org.rad

class Person {

	String id
	String firstName
	String middleName
	String lastName
	String jobtitle
	String prefix
	String suffix	
	Gender gender
	ElectronicAddress electronicAddress
	PostalAddress postalAddress
	TelephoneNumber telephoneNumbers	
	TelephoneNumber fax
	TelephoneNumber landlinePhone	
	
	static constraints = {
		
		id blank: false,nullable: false
		firstName nullable: true
		middleName nullable: true
		lastName nullable: true
		fax nullable: true
		landlinePhone nullable: true 			
		electronicAddress nullable: true
		jobtitle nullable: true		
		prefix nullable: true
		suffix nullable: true
	}
	static hasMany = [document: Document]
	
	String toString(){return firstName +" "+ middleName + " " + lastName}

}
