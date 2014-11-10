package org.rad.modul;

import javax.persistence.*;

import org.openxava.annotations.*;

@Entity
public class DocumentClassification {
	@Id@Column
	private String classId;
	@Column
	private String className;
	@Column
	private String classificationSystem;
	@ManyToOne @DescriptionsList(descriptionProperties="docid")
	private Document document;
	
    public Document getDocument() {
		return document;
	}

	public void setDocument(Document document) {
		this.document = document;
	}

	public String getClassId() {
		return classId;
	}

	public void setClassId(String classId) {
		this.classId = classId;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getClassificationSystem() {
		return classificationSystem;
	}

	public void setClassificationSystem(String classificationSystem) {
		this.classificationSystem = classificationSystem;
	}

	public String toString(){return classId.toString();}
}
