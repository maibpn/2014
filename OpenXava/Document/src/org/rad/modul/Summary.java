package org.rad.modul;

import javax.persistence.*;

import org.openxava.annotations.*;
@Entity
public class Summary {
	
    @Id@Column(length=40) @Required
    private String text;

    @Column@Enumerated(EnumType.STRING)
    private	Language language;
		
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
