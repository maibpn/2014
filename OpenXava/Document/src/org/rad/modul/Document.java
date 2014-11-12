package org.rad.modul;

import java.util.*;

import javax.persistence.*;

import org.openxava.annotations.*;
@Entity
public class Document{
	@Id @Column
	private String docId;		
	@OneToMany
	private Collection<Description> descriptions;
	@OneToMany
	private Collection<DocumentId> documentID;
	@OneToMany
	private Collection<DocumentClassification> documentclassification;
	@OneToMany
	private Collection<DocumentRevision> documentRevision;
	@ManyToOne @DescriptionsList(descriptionProperties="description")
	private DocumentRelationship document;
	@ManyToOne @DescriptionsList(descriptionProperties="description")
	private DocumentRelationship relation;
	@ManyToOne  @DescriptionsList(descriptionProperties="persid")
	private Person deliveredBy;

	public Person getDeliveredBy() {
		return deliveredBy;
	}

	public void setDeliveredBy(Person deliveredBy) {
		this.deliveredBy = deliveredBy;
	}

	public DocumentRelationship getDocument() {
		return document;
	}
	
	public void setDocument(DocumentRelationship document) {
		this.document = document;
	}

	public DocumentRelationship getRelation() {
		return relation;
	}

	public void setRelation(DocumentRelationship relation) {
		this.relation = relation;
	}
	public Collection<DocumentClassification> getDocumentclassification() {
		return documentclassification;
	}

	public void setDocumentclassification(
			Collection<DocumentClassification> documentclassification) {
		this.documentclassification = documentclassification;
	}

	public Collection<DocumentRevision> getDocumentRevision() {
		return documentRevision;
	}

	public void setDocumentRevision(Collection<DocumentRevision> documentRevision) {
		this.documentRevision = documentRevision;
	}

	public Collection<DocumentId> getDocumentID() {
		return documentID;
	}

	public void setDocumentID(Collection<DocumentId> documentID) {
		this.documentID = documentID;
	}

	public String getDocId() {
		return docId;
	}

	public void setDocId(String docId) {
		this.docId = docId;
	}

	public Collection<Description> getDescriptions() {
		return descriptions;
	}

	public void setDescriptions(Collection<Description> descriptions) {
		this.descriptions = descriptions;
	}
	
	public String toString(){return docId.toString();}
}