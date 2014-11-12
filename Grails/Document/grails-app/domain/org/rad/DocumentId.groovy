 package org.rad

class DocumentId {
	
	String documentsId
    static constraints = {
		documentsId  blank: false,nullable: false
    }
	
	String toString(){return documentsId}
}
