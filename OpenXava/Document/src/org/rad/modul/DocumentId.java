 package org.rad.modul;


import javax.persistence.*;

import org.openxava.annotations.*;
 
@Entity
public class DocumentId {
	@Id@Column@Required
	private String documentId;
	
	@ManyToOne @DescriptionsList(descriptionProperties="docid")
	private Document document;
	
	
	public Document getDocument() {
		return document;
	}

	public void setDocument(Document document) {
		this.document = document;
	}

	public String getDocumentId() {
		return documentId;
	}

	public void setDocumentId(String documentId) {
		this.documentId = documentId;
	}

	public String toString(){return documentId.toString();}
}
