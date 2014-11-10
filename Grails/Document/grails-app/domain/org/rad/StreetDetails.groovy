package org.rad

class StreetDetails {

	String addressGeneral
	String buildingName
	String code
	String number
	String name
	String prefix
	String suffix
	String suiteNumber
	String type
	boolean withinTownLimits
		
	static constraints = {
		addressGeneral nullable: true
		buildingName nullable: true
		code nullable: true
		name nullable: true
		prefix nullable: true
		suffix nullable: true
		suiteNumber nullable: true
		type nullable: true
		withinTownLimits nullable: true
	}
	String toString(){return addressGeneral}
}
