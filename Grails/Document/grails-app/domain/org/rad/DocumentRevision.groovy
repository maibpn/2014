 package org.rad

class DocumentRevision {
	
	String documentRevision
    static constraints = {
		documentRevision blank: false, nullable: false
    }
	
	
	String toString(){return documentRevision}
}
