package org.rad

class DocumentRelationship {

	String description
	DocumentRelationshipType documentRelationshipType
	
	static constrains = {
		description nullable: true, maxSize:1000
	}
	
	static hasMany =  [document:Document]
	static belongsTo = Document
	
	
	String toString(){return description }
}
