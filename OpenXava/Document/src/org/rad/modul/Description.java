package org.rad.modul;
import java.util.*;

import javax.persistence.*;
import org.openxava.annotations.*;

@Entity
public class Description {
	@Id@Column
	private Integer desid;	
	@Column
	private Integer numberOfPages;
	@Column
	private Integer size;
	@Column
	private String comment;
	@OneToOne
	private Title title;
	@OneToOne
	private Summary summary;	
	@OneToMany
	private Collection<KeyWord> keyword;

	@ManyToOne @DescriptionsList(descriptionProperties="docid")
	private Document document;
	public Document getDocument() {
		return document;
	}

	public void setDocument(Document document) {
		this.document = document;
	}

	public Integer getDesid() {
		return desid;
	}

	public void setDesid(Integer desid) {
		this.desid = desid;
	}

	public Collection<KeyWord> getKeyword() {
		return keyword;
	}

	public void setKeyword(Collection<KeyWord> keyword) {
		this.keyword = keyword;
	}

	public Integer getNumberOfPages() {
		return numberOfPages;
	}

	public void setNumberOfPages(Integer numberOfPages) {
		this.numberOfPages = numberOfPages;
	}

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Title getTitle() {
		return title;
	}

	public void setTitle(Title title) {
		this.title = title;
	}

	public Summary getSummary() {
		return summary;
	}

	public void setSummary(Summary summary) {
		this.summary = summary;
	}



	public String toString(){return comment.toString();}
}
