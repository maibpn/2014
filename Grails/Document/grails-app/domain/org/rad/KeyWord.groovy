package org.rad

class KeyWord {

	String text
	Language language
	
    static constraints = {
		text maxSize:1000
    }
	
	
	String toString(){return text}
}
