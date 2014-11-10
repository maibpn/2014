package org.rad.modul;

import javax.persistence.*;

import org.openxava.annotations.*;

@Entity
public class DocumentRevision {
	@Id@Column@Required
	private String documentRevision; 	
	
	@ManyToOne @DescriptionsList(descriptionProperties="docid")
	private Document document;
	
	public Document getDocument() {
		return document;
	}

	public void setDocument(Document document) {
		this.document = document;
	}

	public String getDocumentRevision() {
		return documentRevision;
	}

	public void setDocumentRevision(String documentRevision) {
		this.documentRevision = documentRevision;
	}

	public String toString(){return documentRevision.toString();}
}
