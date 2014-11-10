package org.rad.modul;

import javax.persistence.*;

import org.openxava.annotations.*;

@Entity
public class KeyWord {
	@Id @Column(length=1000) @Required	
	private String text;
	@Column@Enumerated(EnumType.STRING)
	private Language language;
	@ManyToOne @DescriptionsList(descriptionProperties="comment")
	private Description description;
	
	public Description getDescription() {
		return description;
	}
	public void setDescription(Description description) {
		this.description = description;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}

	public Language getLanguage() {
		return language;
	}

	public void setLanguage(Language language) {
		this.language = language;
	}

	public String toString(){return text.toString();}
}
