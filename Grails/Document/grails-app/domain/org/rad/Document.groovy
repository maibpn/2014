package org.rad

class Document {
	String docid
	Person  deliveredBy
	
	
	static constraints = {
		docid nullable:false
		documentId blank: false
		deliveredBy nullable: true
	}
	
	static hasMany =  [documentId: DocumentId,description: Description, 	
					   documentClassification: DocumentClassification, 
				       documentrevision:DocumentRevision,
					   documentRelationship: DocumentRelationship, 
					   documentClassification: DocumentClassification]
	
	String toString(){return docid}
}
