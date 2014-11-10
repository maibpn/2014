package org.rad.modul;

import java.util.*;
import javax.persistence.*;

@Entity
public class DocumentRelationship {
	@Id@Column
	private String description;
	@Column@Enumerated(EnumType.STRING)	   
	private DocumentRelationshipType documentRelationshipType;
	@OneToMany
	private Collection<Document> document;
	@OneToMany
	private Collection<Document> relations;

	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public DocumentRelationshipType getDocumentRelationshipType() {
		return documentRelationshipType;
	}
	public void setDocumentRelationshipType(
			DocumentRelationshipType documentRelationshipType) {
		this.documentRelationshipType = documentRelationshipType;
	}
	public Collection<Document> getDocument() {
		return document;
	}
	public void setDocument(Collection<Document> document) {
		this.document = document;
	}
	public Collection<Document> getRelations() {
		return relations;
	}
	public void setRelations(Collection<Document> relations) {
		this.relations = relations;
	}
	public String toString(){return description.toString();}
	
}
